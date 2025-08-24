package com.mycompany.crossychicken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CrossyChicken {

    public static void main(String[] args) {
        new CrossyChicken();
    }

    public CrossyChicken() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Crossy Chicken");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new Obstacles());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class Obstacles extends Game {

        // Left to right obstacles
        private int[] xLeft = {50, 100, 200, 300, 400, 500};
        private int[] yLeft = {50, 100, 200, 300, 350, 120};
        private int widthLeft = 50;
        private int heightLeft = 20;
        private int speedLeft = 10;

        // Right to left obstacles
        private int[] xRight = {200, 400, 450, 300, 100, 50};
        private int[] yRight = {500, 350, 750, 400, 90, 150};
        private int widthRight = 50;
        private int heightRight = 20;
        private int speedRight = 10;

        private Character player;
        private int score;
        private boolean gameOver;
        private RestartPanel restart;

        public Obstacles() {
            player = new Character();
            score = 0;
            gameOver = false;

            // Key Listener for movement
            setFocusable(true);
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (!gameOver && e.getKeyCode() == KeyEvent.VK_SPACE) {
                        player.moveUp(); // Move character up when space is pressed
                    }
                    if (gameOver && e.getKeyCode() == KeyEvent.VK_ENTER) {
                        restartGame(); // Restart the game if Enter is pressed after game over
                    }
                }
            });

            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!gameOver) {
                        // Move obstacles (left to right)
                        for (int i = 0; i < xLeft.length; i++) {
                            xLeft[i] += speedLeft;
                            if (xLeft[i] > getWidth()) {
                                xLeft[i] = -widthLeft;
                                score++; // Increase score when an obstacle is passed
                            }
                        }

                        // Move obstacles (right to left)
                        for (int i = 0; i < xRight.length; i++) {
                            xRight[i] -= speedRight;
                            if (xRight[i] + widthRight < 0) {
                                xRight[i] = getWidth();
                                score++; // Increase score when an obstacle is passed
                            }
                        }

                        // Check for collisions with obstacles
                        for (int i = 0; i < xLeft.length; i++) {
                            if (player.getBounds().intersects(new Rectangle(xLeft[i], yLeft[i], widthLeft, heightLeft))) {
                                gameOver = true;
                                break;
                            }
                        }

                        for (int i = 0; i < xRight.length; i++) {
                            if (player.getBounds().intersects(new Rectangle(xRight[i], yRight[i], widthRight, heightRight))) {
                                gameOver = true;
                                break;
                            }
                        }
                    }

                    repaint();
                }
            });
            timer.start();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1000, 500);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);

            // Draw obstacles (left to right)
            for (int i = 0; i < xLeft.length; i++) {
                g.fillRect(xLeft[i], yLeft[i], widthLeft, heightLeft);
            }

            // Draw obstacles (right to left)
            for (int i = 0; i < xRight.length; i++) {
                g.fillRect(xRight[i], yRight[i], widthRight, heightRight);
            }

            // Draw the player character
            player.draw(g);

            // Show "You Lose" and the score if the game is over
            /*
            if (gameOver) {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 30));
                g.drawString("You Lose!", 400, 200);
                g.drawString("Score: " + score, 400, 250);
                g.drawString("Press Enter to Restart", 350, 300);
            }
*/
        }
        
        private void showRestartPanel() {
        restart = new RestartPanel(); // Create restart panel
        restart.get(score);  // Pass the score to the RestartPanel

        this.removeAll();  // Remove the current content
        this.setLayout(new BorderLayout()); 
        this.add(restart, BorderLayout.CENTER);  // Add the restart panel
        this.revalidate();  // Refresh the layout
        this.repaint();  // Repaint the panel to reflect changes
    }

        // Restart the game by resetting variables
        private void restartGame() {
            player = new Character(); // Reset the player position
            score = 0; // Reset the score
            gameOver = false; // Reset gameOver flag

            // Reset the obstacles' positions
            xLeft = new int[] {50, 100, 200, 300, 400, 500};
            yLeft = new int[] {50, 100, 200, 300, 350, 120};
            xRight = new int[] {200, 400, 450, 300, 100, 50};
            yRight = new int[] {500, 350, 750, 400, 90, 150};
        }
    }

    // Character class to represent the player
    public class Character {
        private int x;
        private int y;
        private int width = 30;
        private int height = 30;

        public Character() {
            this.x = 500; // Starting x position
            this.y = 450; // Starting y position at the bottom
        }

        // Move the character up
        public void moveUp() {
            if (y > 0) {
                y -= 20; // Move the character up by 20 pixels
            }
        }

        // Draw the player character
        public void draw(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillRect(x, y, width, height);
        }

        // Get the bounds of the character for collision detection
        public Rectangle getBounds() {
            return new Rectangle(x, y, width, height);
        }
    }
}
