package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScorelnfofFrame extends JFrame{

    private JButton jbt1 = new JButton("��ѯ");
    private JButton jbt2 = new JButton("���");
    private JButton jbt3 = new JButton("ɾ��");
    private JButton jbt4 = new JButton("�޸�");
    private JButton jbt5 = new JButton("����");
    private JTextField jtf = new JTextField(10);
    private JLabel lbl = new JLabel("������ļ���������");

    //��������ӱ��
    private static JTable table = new JTable();
    private JScrollPane jsp = new JScrollPane(table);

    //�Ѱ�ť�������
    private JPanel jp1 = new JPanel();

    private JPanel jp3 = new JPanel();


    public ScorelnfofFrame() {
        this.setTitle("��������ϵͳ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        //��    ��ѯ���
        jp1.add(lbl);
        jp1.add(jtf);
        jp1.add(jbt1);
//		jtf.setPreferredSize(new Dimension(10,10));�����ı����С
        this.add(jp1, BorderLayout.NORTH);

        //��  ��ѯ���
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("���");
        dtm.addColumn("������");
        dtm.addColumn("Ŀ�ĵ�");
        dtm.addColumn("�ļ���");
        dtm.addColumn("ʱ��");
        dtm.addColumn("�Ӽ�");
        dtm.addColumn("����");


        //�������---list--ΪList�������ڴ���Score����
        // for (int i = 0; i < list.size(); i++) {
        //     Vector<Object> data = new Vector<Object>();
        //     data.add(list.get(i).getId());
        //     data.add(list.get(i).getName());
        //     data.add(list.get(i).getCourse());
        //     data.add(list.get(i).getDegree());
        //     dtm.addRow(data);
        // }
        // //��ӿձ��
        // for (int i = 0; i < list.size(); i++) {
        //     Vector<Object> data = new Vector<Object>();
        //     data.add(null);
        //     data.add(null);
        //     data.add(null);
        //     data.add(null);
        //     dtm.addRow(data);
        // }
        //�����в�
        this.add(jsp,BorderLayout.CENTER);
        //�� ��ɾ�Ĳ����
        jp3.add(jbt2);
        jp3.add(jbt3);
        jp3.add(jbt4);
        jp3.add(jbt5);
        this.add(jp3,BorderLayout.SOUTH);
        this.setVisible(true);


        //��Ӱ�ť---�������������򷽿����
        jbt2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                new addPage();
            }
        });

        //ɾ����ť
        jbt3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("222");
            }
        });

        //�޸İ�ť
        jbt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("333");
            }
        });
        //��ѯ��ť
        jbt1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                System.out.println("4444");
            }
        });
        //���ذ�ť
        jbt5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
            }
        });

        this.addWindowListener
                (new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        int res = JOptionPane.showConfirmDialog(null, "�Ƿ��˳�����", "�뿪", JOptionPane.YES_NO_OPTION);
                        if (res == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                    }
                });

    }


    public static void main(String[] args) {
        new ScorelnfofFrame();
    }
}