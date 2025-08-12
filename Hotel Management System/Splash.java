package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){

        setTitle("Centered Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 780);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icon/drone.jpg"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(1280, 780, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel(scaledIcon);
        label.setBounds(0, 0, 1280, 780);

        add(label);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}