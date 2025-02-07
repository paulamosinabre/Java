
package com.mycompany.lesson8;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;


public class MyFrame extends javax.swing.JFrame {
    
    int player, computer, player_score = 0, computer_score = 0;
    
    public MyFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPlayer = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnRock = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        computerScore = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        playerScore = new javax.swing.JLabel();
        lblComputer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblPlayer.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        lblPlayer.setText("PLAYER");

        label1.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        label1.setText("COMPUTER");

        lblResult.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        lblResult.setText("RESULT:");

        btnRock.setIcon(new javax.swing.ImageIcon("C:\\Users\\NUD-Student\\Downloads\\myRock.png")); // NOI18N
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        btnPaper.setIcon(new javax.swing.ImageIcon("C:\\Users\\NUD-Student\\Downloads\\paper.png")); // NOI18N
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        btnScissors.setIcon(new javax.swing.ImageIcon("C:\\Users\\NUD-Student\\Downloads\\scissor.png")); // NOI18N
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });

        computerScore.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        computerScore.setText("COMPUTER:");

        lblScore.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        lblScore.setText("SCORE");

        playerScore.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        playerScore.setText("PLAYER:");

        lblComputer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPlayer)
                        .addGap(31, 31, 31)
                        .addComponent(btnRock)
                        .addGap(24, 24, 24)
                        .addComponent(btnPaper)
                        .addGap(18, 18, 18)
                        .addComponent(btnScissors))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4))
                            .addComponent(lblResult))
                        .addGap(102, 102, 102)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerScore)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(playerScore)
                            .addGap(242, 242, 242))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblScore)
                            .addGap(146, 146, 146)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(lblComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(label1)
                    .addContainerGap(468, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResult)
                    .addComponent(lblScore))
                .addGap(18, 18, 18)
                .addComponent(computerScore)
                .addGap(18, 18, 18)
                .addComponent(playerScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayer)
                    .addComponent(btnRock)
                    .addComponent(btnPaper)
                    .addComponent(btnScissors))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(label1)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        // TODO add your handling code here:
        generateComputer();
        resetColors();
        btnRock.setBackground(Color.gray);
        player = 1;
        checkResult();
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        // TODO add your handling code here:
        generateComputer();
        resetColors();
        btnScissors.setBackground(Color.gray);
        player = 3;
        checkResult();
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        // TODO add your handling code here:
        generateComputer();
        resetColors();
        btnPaper.setBackground(Color.gray);
        player = 2;
        checkResult();
    }//GEN-LAST:event_btnPaperActionPerformed
    
    void generateComputer(){
        computer = (int)(Math.random()* 3 + 1);
        if (computer == 1){
           lblComputer.setIcon(new ImageIcon("C:/GUI/myRock.png"));
        } else if (computer == 2){
          lblComputer.setIcon(new ImageIcon("C:/GUI/paper.png"));
        } else {
           lblComputer.setIcon(new ImageIcon("C:/GUI/scissor.png"));
        }
    }
    
    void resetColors(){
        btnRock.setBackground(Color.gray);
        btnPaper.setBackground(Color.gray);
        btnScissors.setBackground(Color.gray);   
    }
    
    void checkResult(){
        if(computer == player){
            lblResult.setText("Result: Draw");
        }
        
        if(player == 1 && computer == 2){
            lblResult.setText("Result: Computer Wins!");
            computer_score++;
        }else if(player == 2 && computer == 3){
            lblResult.setText("Result: Computer Wins!");
            computer_score++;
        }else if(player == 3 && computer == 1){
            lblResult.setText("Result: Computer Wins!");
            computer_score++;
        }else if(player == 1 && computer == 3){
            lblResult.setText("Result: Player Wins!");
            player_score++;
        } else if(player == 2 && computer == 1){
            lblResult.setText("Result: Player Wins!");
            player_score++;
        }  else if(player == 3 && computer == 2){
            lblResult.setText("Result: Player Wins!");
            player_score++;
        }
        computerScore.setText("Computer: " + Integer.toString(computer_score));
        playerScore.setText("Player: " +Integer.toString(player_score));
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JLabel computerScore;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lblComputer;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel playerScore;
    // End of variables declaration//GEN-END:variables
}
