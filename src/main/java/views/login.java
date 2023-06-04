package views;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class login {

    protected static JTextField jtf1 = new JTextField();
    protected static JPasswordField jtf2 = new JPasswordField();
    protected static JTextField jtf3 = new JTextField();
    protected static JPasswordField jtf4 = new JPasswordField();


    /**
     * @param args
     */
    public static void main(String[] args) {
        new login();

    }


    public login() {

        JFrame jf = new JFrame("物流管理系统登陆界面");
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Font f = new Font(Font.DIALOG, Font.BOLD, 22);

        jf.setSize( 600, 400);
        jf.setLocationRelativeTo(null);
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        JLabel jla1 = new JLabel("管理人员登录");
        JLabel jla2 = new JLabel("帐号");
        JLabel jla3 = new JLabel("密码");
        JLabel jlb1 = new JLabel("客户登录");
        JLabel jlb2 = new JLabel("帐号");
        JLabel jlb3 = new JLabel("密码");
        JButton jb1 = new JButton("登录");
        JButton jb2 = new JButton("注册");


        jf.setLayout(null);
        j1.setLayout(null);
        j2.setLayout(null);
        jf.setBackground(Color.white);
        // j1.setBackground(Color.LIGHT_GRAY);
        j2.setBackground(Color.LIGHT_GRAY);
        j1.setBounds(2, 2, 600, 400);
        j2.setBounds(500, 2, 500, 500);
        jla1.setBounds(225, 20, 150, 20);
        jla2.setBounds(80, 90, 150, 20);
        jla3.setBounds(80, 130, 150, 20);
        jtf1.setBounds(200, 80, 250, 40);
        jtf2.setBounds(200, 120, 250, 40);
        jb1.setBounds(300, 180, 150, 40);

        jla1.setFont(f);
        jla2.setFont(f);
        jla3.setFont(f);
        jlb1.setFont(f);
        jlb2.setFont(f);
        jlb3.setFont(f);
        jtf1.setFont(f);
        jtf2.setFont(f);
        jb1.setFont(f);
        jb2.setFont(f);

        jlb1.setBounds(120, 20, 150, 20);
        jlb2.setBounds(30, 80, 150, 20);
        jlb3.setBounds(30, 120, 150, 20);
        jtf3.setBounds(150, 80, 250, 40);
        jtf4.setBounds(150, 120, 250, 40);
        jb2.setBounds(100, 180, 150, 40);


        jf.add(j1);
        // jf.add(j2);
        j1.add(jla1);
        j1.add(jla2);
        j1.add(jla3);
        j1.add(jtf1);
        j1.add(jtf2);
        j1.add(jb1);
        j1.add(jb2);


        jb1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("小马");
                new OrderlnfofFrame();
                jf.dispose();
            }
        });

        jb2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                new OrderlnfofFrame();
                jf.dispose();
            }
        });


        jf.addWindowListener
                (new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        int res = JOptionPane.showConfirmDialog(null, "是否退出程序", "离开", JOptionPane.YES_NO_OPTION);
                        if (res == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                    }
                });


        jf.setVisible(true);
        // TODO Auto-generated method stub
    }


}
