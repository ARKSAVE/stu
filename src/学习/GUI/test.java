package 学习.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setTitle("2405的第一个界面");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new BorderLayout());
        JButton jb = new JButton("点击播放");
        JPanel jp = new JPanel();
        jf.add(jp, BorderLayout.CENTER);
        jp.add(jb);
       JButton jb2 = new JButton("第二");
       // jb.setSize(100,200);
        JTextArea jta = new JTextArea("啊啊啊啊啊");

       jf.add(jb2, BorderLayout.CENTER);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("开始播放");
            }
        });

       // jp.add(jta);
    }
}
