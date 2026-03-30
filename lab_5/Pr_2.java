package lab_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 520);
        frame.setResizable(false);
        Image[] frames = new Image[8];
        frames[0] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/5.gif").getImage();
        frames[1] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/6.gif").getImage();
        frames[2] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/frame/7.gif").getImage();
        frames[3] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/frame/8.gif").getImage();
        frames[4] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/frame/9.gif").getImage();
        frames[5] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/frame/10.gif").getImage();
        frames[6] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/frame/11.gif").getImage();
        frames[7] = new ImageIcon("C:/Users/Velensis/IdeaProjects/dzj/src/lab_5/frame/12.gif").getImage();

        final int[] currentFrame = {0};

        JPanel animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(frames[currentFrame[0]], 0, 0, this);
            }
        };

        frame.add(animationPanel);
        frame.setVisible(true);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame[0] = (currentFrame[0] + 1) % frames.length;
                animationPanel.repaint();
            }
        });

        timer.start();
    }
}

