import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MusicFrame().setVisible(true);
                Scanner scanner = new Scanner(System.in);
            }
        });
    }
}

class MusicFrame extends JFrame {
    private JButton play;
    private JPanel panel;
    JButton exit;

    public MusicFrame() {
        setSize(800, 800);
        setTitle("2405");//设置界面标题文本
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
    }

    void initUI(){
        Container container = getContentPane();
        play = new JButton("点击输出内容");
        panel = new JPanel(new FlowLayout());
        panel.setSize(new Dimension(800, 200));
        container.add(panel, BorderLayout.SOUTH);
        panel.add(play);//添加panel按钮
        exit = new JButton("点击退出");//设置按钮文本
        panel.add(exit);


        play.addActionListener(new ActionListener() {//创建点击事件
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击");
//                System.out.println(e.getClass());
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(10086);
            }
        });

    }
}