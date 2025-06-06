
package com.mycompany.taskmanagementsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class Home extends javax.swing.JFrame {
    
    private int taskCounter = 0;
    private Registration register;
    public Home(Registration register) {
        this.register = register;
        initComponents();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inprogress = new javax.swing.JLabel();
        queue = new javax.swing.JLabel();
        done = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnProjects = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        btnAllTask = new javax.swing.JButton();
        btnAddTask = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        taskPanel = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 28, 126));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 10, 40));

        lblWelcome.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lblWelcome.setText("Welcome back,");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\search.png")); // NOI18N
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        btnUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\user.png")); // NOI18N
        btnUser.setBorder(null);
        btnUser.setBorderPainted(false);
        btnUser.setContentAreaFilled(false);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 50, -1));

        searchField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        searchField.setText("          Type here to search...");
        searchField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 330, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Today's Task");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 150, -1));

        lblDate.setText("Date:");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel4.setText("In progress");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel5.setText("Queue");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\queue.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\progress.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\done.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        inprogress.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        inprogress.setText("0");
        getContentPane().add(inprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));

        queue.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        queue.setText("0");
        getContentPane().add(queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, -1, -1));

        done.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        done.setText("0");
        getContentPane().add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel14.setText("Category");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel16.setText("Done");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel17.setText("Status");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel18.setText("Priority");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel19.setText("Date");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel20.setText("Task");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        btnProjects.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnProjects.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\project.png")); // NOI18N
        btnProjects.setText(" Projects");
        btnProjects.setBorder(null);
        btnProjects.setBorderPainted(false);
        btnProjects.setContentAreaFilled(false);
        btnProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectsActionPerformed(evt);
            }
        });
        getContentPane().add(btnProjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btnCalendar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnCalendar.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\calendar.png")); // NOI18N
        btnCalendar.setText(" Calendar");
        btnCalendar.setBorder(null);
        btnCalendar.setBorderPainted(false);
        btnCalendar.setContentAreaFilled(false);
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, -1));

        btnAllTask.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnAllTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\all task.png")); // NOI18N
        btnAllTask.setText(" All task");
        btnAllTask.setBorder(null);
        btnAllTask.setBorderPainted(false);
        btnAllTask.setContentAreaFilled(false);
        btnAllTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnAllTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        btnAddTask.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnAddTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\add.png")); // NOI18N
        btnAddTask.setBorder(null);
        btnAddTask.setBorderPainted(false);
        btnAddTask.setContentAreaFilled(false);
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 40, -1));
        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 320, 10, 50));

        taskPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout taskPanelLayout = new javax.swing.GroupLayout(taskPanel);
        taskPanel.setLayout(taskPanelLayout);
        taskPanelLayout.setHorizontalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        taskPanelLayout.setVerticalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(taskPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 720, 280));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\Home.png")); // NOI18N
        bg.setText("jLabel1");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 630));

        pack();
    }// </editor-fold>                        

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        AccountPage acc = new AccountPage(register);
        this.dispose();
        acc.setVisible(true);
        acc.setLocationRelativeTo(null);
        acc.setResizable(false);
    }                                       

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {                                           
        taskCounter++;

        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rowPanel.setBackground(Color.white);

        // Set fixed size
        rowPanel.setPreferredSize(new Dimension(taskPanel.getWidth(), 40));
        rowPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40)); // prevent vertical stretching

        // Create components
        JTextField txtTask = new JTextField(20);
        JComboBox<String> cbCategory = new JComboBox<>(new String[]{"Work", "Personal", "School"});
        JComboBox<String> cbStatus = new JComboBox<>(new String[]{"Not Started", "In Progress", "Done"});
        JComboBox<String> cbPriority = new JComboBox<>(new String[]{"Low", "Medium", "High"});

        // Add components with spacing
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(txtTask);
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(new JLabel("   "));
        rowPanel.add(cbCategory);
        rowPanel.add(new JLabel("   "));
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(cbStatus);
        rowPanel.add(new JLabel("   "));
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(cbPriority);

        // Add to the panel
        taskPanel.add(rowPanel);
        taskPanel.revalidate();
        taskPanel.repaint();
    }                                          
    
    private void btnAllTaskActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnProjectsActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registration register = new Registration("email", "firstname", "lastname", "username", "password");
                new Home(register).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnAllTask;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnProjects;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel done;
    private javax.swing.JLabel inprogress;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel queue;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel taskPanel;
    // End of variables declaration                   
}
