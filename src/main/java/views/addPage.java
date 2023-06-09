package views;

import Singleton.GlobalContext;
import adapter.adapters.insertAdapter;
import adapter.messageController;
import com.soft.entity.SOrder;
import com.soft.service.impl.SOrderServiceImpl;
import decorator.Decorator;
import decorator.FragileDecorator;
import decorator.ISpecialService;
import decorator.UrgentDecorator;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import observer.Observer;
import observer.insertObservable;
import observer.obs.ThirdPart;
import observer.obs.User;
import responsibility.EmptyHandler;
import responsibility.GlobalEventHandler;
import responsibility.Handler;
import responsibility.SpecialCharacterHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JRadioButton;


@Slf4j
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
    private JTextField jtf8;
    private JLabel jb6;
    private JTextField jtf9;
    private JLabel jb7;
    private JButton submitButton;

    messageController msg;

    public addPage() {
        // 设置窗口标题
        JFrame jf = new JFrame("添加订单信息");
        Font f = new Font(Font.DIALOG, Font.BOLD, 22);


        // 创建组件
        panel = new JPanel();
        jb1 = new JLabel("出发地:");
        jtf1 = new JTextField();
        jb2 = new JLabel("目的地:");
        jtf2 = new JTextField();
        jb3 = new JLabel("寄件人:");
        jtf3 = new JTextField();
        jb6 = new JLabel("类型:");
        jtf8 = new JTextField();
        jb7 = new JLabel("载具:");
        jtf9 = new JTextField();
        jb4 = new JLabel("加急:");
        jtf4 = new JRadioButton("是");
        jtf5 = new JRadioButton("否", true);
        ButtonGroup group1 = new ButtonGroup();
        group1.add(jtf4);
        group1.add(jtf5);
        jb5 = new JLabel("易碎:");
        jtf6 = new JRadioButton("是");
        jtf7 = new JRadioButton("否", true);
        ButtonGroup group2 = new ButtonGroup();
        group2.add(jtf6);
        group2.add(jtf7);
        submitButton = new JButton("提交");

        jtf1.setBounds(100, 20, 250, 40);
        jtf2.setBounds(100, 80, 250, 40);
        jtf3.setBounds(100, 140, 250, 40);
        jtf8.setBounds(100, 200, 250, 40);
        jtf9.setBounds(100, 260, 250, 40);

        jtf4.setBounds(100, 330, 50, 20);
        jtf5.setBounds(200, 330, 50, 20);
        jtf6.setBounds(100, 400, 50, 20);
        jtf7.setBounds(200, 400, 50, 20);
        submitButton.setBounds(100, 450, 150, 60);

        // 设置布局管理器
        panel.setLayout(null);
        panel.setFont(f);
        jb1.setFont(f);
        jb2.setFont(f);
        jb3.setFont(f);
        jb4.setFont(f);
        jb5.setFont(f);
        jb6.setFont(f);
        jb7.setFont(f);
        submitButton.setFont(f);


        jb1.setBounds(20, 30, 150, 20);
        jb2.setBounds(20, 90, 150, 20);
        jb3.setBounds(20, 150, 150, 20);
        jb6.setBounds(20, 210, 150, 20);
        jb7.setBounds(20, 270, 150, 20);
        jb4.setBounds(20, 330, 150, 20);
        jb5.setBounds(20, 390, 150, 20);

        // 添加组件到面板
        panel.add(jb1);
        panel.add(jtf1);
        panel.add(jb2);
        panel.add(jtf2);
        panel.add(jb3);
        panel.add(jtf3);
        panel.add(jb6);
        panel.add(jtf8);
        panel.add(jb7);
        panel.add(jtf9);
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
        jf.setSize(400, 550);
        jf.setLocationRelativeTo(null);

        // 设置窗口关闭操作
        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // 显示窗口
        jf.setVisible(true);


        submitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Date now = new Date();

                SOrder info = new SOrder();

                String inputText1 = jtf1.getText();
                System.out.println("出发地是：" + inputText1);

                String inputText2 = jtf2.getText();
                System.out.println("目的地是：" + inputText2);

                String inputText3 = jtf3.getText();
                System.out.println("寄件人是：" + inputText3);

                String inputText4 = jtf8.getText();
                System.out.println("寄件人是：" + inputText4);

                String inputText5 = jtf9.getText();
                System.out.println("寄件人是：" + inputText5);

                String selectedText1 = null;
                if (jtf4.isSelected()) {
                    selectedText1 = jtf4.getText();
                } else if (jtf5.isSelected()) {
                    selectedText1 = jtf5.getText();

                } else {
                    System.out.println("没有选中的单选框");
                }
                System.out.println("是否加急：" + selectedText1);

                String selectedText2 = null;
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
                info.setPayerName(inputText3);
                info.setOrderName(inputText4);
                info.setTransport(inputText5);
                info.setTime(now);
                int cost = 0;
                if (selectedText1 == "是") {
                    ISpecialService iSpecialService = new Decorator() {
                        @Override
                        public Integer getCost() {
                            return 100;
                        }
                    };
                    Decorator decorator = new FragileDecorator(iSpecialService);
                    cost = decorator.getCost();
                }
                if (selectedText2 == "是") {
                    ISpecialService iSpecialService = new Decorator() {
                        @Override
                        public Integer getCost() {
                            return 100;
                        }
                    };
                    Decorator decorator = new UrgentDecorator(iSpecialService);
                    cost = decorator.getCost();
                }
                info.setCost(cost);
                int id = 0;
                info.setOrderId(id);
                System.out.println(info);

                //职责链
                // 非空检测
                Handler emptyHandler = new EmptyHandler();
                // 特殊字符检测
                Handler specialCharacterHandler = new SpecialCharacterHandler();
                // 全局检测
                Handler globalEventHandler = new GlobalEventHandler();
                globalEventHandler.setSuccessor(emptyHandler);
                emptyHandler.setSuccessor(specialCharacterHandler);
                log.info(globalEventHandler.handleRequest(info));
                GlobalContext globalContext = GlobalContext.getInstance();
                if(!globalEventHandler.handleRequest(info).equals("success")){
                    JOptionPane.showConfirmDialog(null, specialCharacterHandler.handleRequest(info), "消息提示", JOptionPane.YES_NO_OPTION);
                }else {
                    log.info("111");
                    //以下是观察者模式的测试代码,创建订单之后调用即可
                    insertObservable iober =new insertObservable();
                    Observer user=new User(inputText3);
                    Observer thirdPart =new ThirdPart(inputText4);
                    iober.add(user);
                    iober.add(thirdPart);
                    iober.notifyObservers();

                    SOrderServiceImpl orderService = new SOrderServiceImpl();
                    int i = orderService.insert(info);
                    if (i == 1) {
                        msg = new insertAdapter();
                        String message = msg.showMeaasge();
                        JOptionPane.showConfirmDialog(null, message, "消息提示", JOptionPane.YES_NO_OPTION);
                    }else {
                        JOptionPane.showConfirmDialog(null, "新增错误");
                    }
                }


            }
        });
    }

    public static void main(String[] args) {
        new addPage();
    }
}