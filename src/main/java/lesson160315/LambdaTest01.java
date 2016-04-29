package lesson160315;

import javax.swing.*;
import java.awt.*;

public class LambdaTest01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 400));

        JButton button = new JButton("Click me!");

//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                doSomething();
//            }
//
//        });
        button.addActionListener(e -> doSomething());
        panel.add(button);
        frame.add(panel);
        frame.pack();

        frame.setVisible(true);
    }

    private static void doSomething() {
        System.out.println("Clicked!");
    }
}
