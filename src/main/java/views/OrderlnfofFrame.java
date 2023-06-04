package views;

import adapter.adapters.deleteAdapter;
import adapter.adapters.updateAdapter;
import adapter.messageController;
import com.soft.entity.SOrder;
import com.soft.service.impl.SOrderServiceImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class OrderlnfofFrame extends JFrame{

    private JButton jbt1 = new JButton("查询");
    private JButton jbt2 = new JButton("添加");
    private JButton jbt3 = new JButton("删除");
    private JButton jbt4 = new JButton("修改");
    private JButton jbt5 = new JButton("返回");
    private JTextField jtf = new JTextField(10);
    private JLabel lbl = new JLabel("请输入寄件人姓名：");

    //窗口中添加表格
    private static JTable table = new JTable();
    private JScrollPane jsp = new JScrollPane(table);

    //把按钮放入面板
    private JPanel jp1 = new JPanel();

    private JPanel jp3 = new JPanel();

    messageController msg;
    List<SOrder> list = null;
    SOrderServiceImpl orderService = new SOrderServiceImpl();

    public void table(DefaultTableModel dtm){
        int rowCount = dtm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
        //添加数据---list--为List数组用于储存Score数据
        for (int i = 0; i < list.size(); i++) {
            Vector<Object> data = new Vector<Object>();
            data.add(list.get(i).getOrderId());
            data.add(list.get(i).getDeparture());
            data.add(list.get(i).getDestination());
            data.add(list.get(i).getPayerName());
            data.add(list.get(i).getOrderName());
            data.add(list.get(i).getTime());
            data.add(list.get(i).getCost());
            data.add(list.get(i).getTransport());
            dtm.addRow(data);
        }
        // //添加空表格
        // for (int i = 0; i < list.size(); i++) {
        //     Vector<Object> data = new Vector<Object>();
        //     data.add(null);
        //     data.add(null);
        //     data.add(null);
        //     data.add(null);
        //     dtm.addRow(data);
        // }
    }

    public OrderlnfofFrame() {
        list = orderService.queryAll();

        this.setTitle("物流管理系统");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        //上    查询面板
        jp1.add(lbl);
        jp1.add(jtf);
        jp1.add(jbt1);
//		jtf.setPreferredSize(new Dimension(10,10));设置文本框大小
        this.add(jp1, BorderLayout.NORTH);

        //中  查询表格
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("编号");
        dtm.addColumn("出发地");
        dtm.addColumn("目的地");
        dtm.addColumn("寄件人");
        dtm.addColumn("类型");
        dtm.addColumn("时间");
        dtm.addColumn("邮费");
        dtm.addColumn("载具");

        //加载数据
        table(dtm);

        //放入中部
        this.add(jsp,BorderLayout.CENTER);
        //下 增删改查面板
        jp3.add(jbt2);
        jp3.add(jbt3);
        jp3.add(jbt4);
        jp3.add(jbt5);
        this.add(jp3,BorderLayout.SOUTH);
        this.setVisible(true);


        //添加按钮---鼠标点击不在输入框方可添加
        jbt2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                new addPage();
            }
        });

        //删除按钮
        jbt3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                msg=new deleteAdapter();
                int i = table.getSelectedRow();
                SOrder s = list.get(i);
                int code = orderService.delete(s);
                orderService.queryAll();
                //加载数据
                table(dtm);
                if(code==1) {
                    JOptionPane.showConfirmDialog(null, msg.showMeaasge(), "消息提示", JOptionPane.YES_NO_OPTION);
                    return;
                }else {
                    JOptionPane.showMessageDialog(null,"删除失败");
                }
            }
        });

        //修改按钮
        jbt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int i = table.getSelectedRow();
                final SOrder[] s = {list.get(i)};
                new updatePage(s[0], (updatedObject) -> {
                    // 处理从子窗口传递回来的对象
                    s[0] = updatedObject; // 这里不能修改 s 的引用
                    System.out.println(s[0]);
                    list.set(i, s[0]);
                    table(dtm);
                });
            }
        });
        //查询按钮
        jbt1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                String name=jtf.getText();
                System.out.println(name);
                if (name.isEmpty()) {
                    list = orderService.queryAll();
                }else {
                    list.clear();
                    list.add(orderService.queryOne(name));
                }

                //加载数据
                table(dtm);
            }
        });
        //返回按钮
        jbt5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                new login();
                dispose();
            }
        });

        this.addWindowListener
                (new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        int res = JOptionPane.showConfirmDialog(null, "是否退出程序", "离开", JOptionPane.YES_NO_OPTION);
                        if (res == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                    }
                });

    }


    public static void main(String[] args) {
        new OrderlnfofFrame();
    }
}