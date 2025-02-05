package com.mycompany.crossingchicken;

import com.mycompany.crossingchicken.Entity.Player;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Timer;


public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 16; //32x32 tile
    final int scale = 3;

    public final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;
    
    Player player;
    //FPS
    int FPS = 60;
    KeyHandle keyH = new KeyHandle();
    Thread gameThread; //para tuloy tuloy siyang mag-run

    //default position
    int playerX = 420;
    int playerY = 400;

    public GamePanel() {
        this.player = new Player(this,keyH);
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        this.requestFocusInWindow();
        run();
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        
         Timer gameTimer = new Timer(1000 / FPS, e -> {
            update();   // Update the game state
            repaint();  // Redraw the screen
        });
        gameTimer.start();
    }

    public void update() {
        player.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        player.draw(g2);
       
        //g2.dispose();
    }
}
