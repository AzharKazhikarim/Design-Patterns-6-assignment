package Ass6.buttons;


import javax.swing.*;
import java.awt.*;

public class WindowsButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Window");
    JButton  button = new JButton("WINDOWS ");

    @Override
    public void render() {
        frame.setSize(230, 170);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello Teacher!");

        label.setOpaque(true); //to test whether they should paint their background or whether they should not
        label.setFont(new Font("Window", Font.ITALIC, 30));

        label.setBackground(new Color(155, 213, 126));

        frame.getContentPane().add(panel);
        panel.add(label);
        panel.add(button);
        onClick();

    }
        @Override
        public void onClick() {
            button.addActionListener(e -> {
                frame.setVisible(false);
                System.exit(0);
            });

        }
}





