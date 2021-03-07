package Ass6.buttons;

import javax.swing.*;

public class HTMLButton implements Button{
    JButton btn;
    JFrame fr = new JFrame("HTML");
    @Override
    public void render() {
        new JFrame("HTML");
        fr.setSize(200,150);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn = new JButton("HTML");
        btn.setVisible(true);
        btn.setLocation(12,12);
        btn.setSize(160,50);

        fr.getContentPane().add(btn);
        fr.getContentPane().add(new JLabel());
        onClick();
    }
     @Override
    public void onClick() {
         btn.addActionListener(e -> {
             fr.setVisible(false);
             System.exit(0);
         });

    }
}
