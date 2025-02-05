package com.mycompany.crossingchicken;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class CrossingChicken {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Crossy Chicken");
        GamePanel gamePanel = new GamePanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
