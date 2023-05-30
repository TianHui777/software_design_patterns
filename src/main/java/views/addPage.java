package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class addPage {
    private JPanel panel;
    private JLabel jb1;
    private JTextField jtf1;
    private JLabel jb2;
    private JTextField jtf2;
    private JLabel jb3;
    private JTextField jtf3;
    private JLabel jb4;
    private JRadioButton jtf4;
    private JRadioButton jtf5;
    private JLabel jb5;
    private JRadioButton jtf6;
    private JRadioButton jtf7;
    private JLabel jb6;
    private JLabel jb7;
    private JLabel jb8;
    private JLabel jb9;
    private JButton submitButton;

    public addPage() {
        // 设置窗口标题
        JFrame jf = new JFrame("添加订单信息");
        Font f = new Font(Font.DIALOG, Font.BOLD, 22);
        Font f1 = new Font(Font.DIALOG, Font.BOLD, 16);


        // 创建组件
        panel = new JPanel();
        jb1 = new JLabel("出发地:");
        jtf1 = new JTextField();
        jb2 = new JLabel("目的地:");
        jtf2 = new JTextField();
        jb3 = new JLabel("寄件人:");
        jtf3 = new JTextField();
        jb4 = new JLabel("加急:");
        jtf4 = new JRadioButton("是");
        jtf5 = new JRadioButton("否",true);
        ButtonGroup group1 = new ButtonGroup();
        group1.add(jtf4);
        group1.add(jtf5);
        jb5 = new JLabel("易碎:");
        jtf6 = new JRadioButton("是");
        jtf7 = new JRadioButton("否",true);
        ButtonGroup group2 = new ButtonGroup();
        group2.add(jtf6);
        group2.add(jtf7);
        submitButton = new JButton("提交");

        jtf1.setBounds(100,20,250,40);
        jtf2.setBounds(100,80,250,40);
        jtf3.setBounds(100,140,250,40);
        jtf4.setBounds(100,210,50,20);
        jtf5.setBounds(200,210,50,20);
        jtf6.setBounds(100,270,50,20);
        jtf7.setBounds(200,270,50,20);
        submitButton.setBounds(100,320,150,60);

        // 设置布局管理器
        panel.setLayout(null);
        panel.setFont(f);
        jb1.setFont(f);
        jb2.setFont(f);
        jb3.setFont(f);
        jb4.setFont(f);
        jb5.setFont(f);
        submitButton.setFont(f);
        // jtf4.setFont(f1);
        // jtf5.setFont(f1);
        // jtf6.setFont(f1);
        // jtf7.setFont(f1);


        jb1.setBounds(20, 30, 150, 20);
        jb2.setBounds(20, 90, 150, 20);
        jb3.setBounds(20, 150, 150, 20);
        jb4.setBounds(20, 210, 150, 20);
        jb5.setBounds(20, 279, 150, 20);

        // 添加组件到面板
        panel.add(jb1);
        panel.add(jtf1);
        panel.add(jb2);
        panel.add(jtf2);
        panel.add(jb3);
        panel.add(jtf3);
        panel.add(jb4);
        panel.add(jtf4);
        panel.add(jtf5);
        panel.add(jb5);
        panel.add(jtf6);
        panel.add(jtf7);
        panel.add(new JLabel());
        panel.add(submitButton);

        // 添加面板到窗口
        jf.add(panel);

        // 设置窗口大小和位置
        jf.setSize(400, 500);
        jf.setLocationRelativeTo(null);

        // 设置窗口关闭操作
        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // 显示窗口
        jf.setVisible(true);


        submitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                orderInfo info = new orderInfo();

                String inputText1 = jtf1.getText();
                System.out.println("出发地是：" + inputText1);

                String inputText2 = jtf2.getText();
                System.out.println("目的地是：" + inputText2);

                String inputText3 = jtf3.getText();
                System.out.println("寄件人是：" + inputText3);

                String selectedText1=null;
                if (jtf4.isSelected()) {
                     selectedText1 = jtf4.getText();
                } else if (jtf5.isSelected()) {
                     selectedText1 = jtf5.getText();

                } else {
                    System.out.println("没有选中的单选框");
                }
                System.out.println("是否加急：" + selectedText1);

                String selectedText2=null;
                if (jtf6.isSelected()) {
                     selectedText2 = jtf6.getText();
                } else if (jtf7.isSelected()) {
                     selectedText2 = jtf7.getText();

                } else {
                    System.out.println("没有选中的单选框");
                }
                System.out.println("是否易碎：" + selectedText2);

                info.setDeparture(inputText1);
                info.setDestination(inputText2);
                info.setPayer(inputText3);
                info.setFragile(selectedText2 == "是");
                info.setUrgent(selectedText1 == "是");

                System.out.println(info);
                //TODO
            }
        });
    }

    public static void main(String[] args) {
        new addPage();
    }
}