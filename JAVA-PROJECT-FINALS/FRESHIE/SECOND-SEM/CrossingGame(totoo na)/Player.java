package com.mycompany.crossinggame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Player {

    public int x, y;
    public boolean spacePressed;

    public Player() {
        // this.gp = gp;
        // this.keyH = keyH;
        setDefaultValues(x, y);
    }

    public void setDefaultValues(int x, int y) {
        x = 420;
        y = 400;
    }

    public void update() {
        if (spacePressed == true) {
            y -= 20;
        }
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode(); // get uni code for space bar

        if (code == KeyEvent.VK_SPACE) {
            spacePressed = true;

        }
    }

    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_SPACE) {
            spacePressed = false;

        }
    }
}
