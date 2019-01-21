package hello;

import AppPackage.AnimationClass;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import hello.LoginTest;
import hello.SignupTest;
import hello.mysqlconnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public final class frontpage extends javax.swing.JFrame
{
    AnimationClass AC = new AnimationClass();
   
    public frontpage() 
    {
        initComponents();
        Slideshow();        
    }
    
    public void Slideshow()
    {
        new Thread()
        {
            int count ;
            @Override
            public void run()
            {
                try
                {
                    while(true)
                    {
                            switch(count)
                            {
                                case 0:
                                                                        
                                    Thread.sleep(8400);
                                    
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide1);                              
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide2);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide3);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide4);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide5); 
                                    AC.jLabelXLeft(6830, 5464, 2, 2, Slide6); 
                                    AC.jLabelXLeft(8196, 6830, 2, 2, Slide7); 
                                    AC.jLabelXLeft(9562, 8196, 2, 2, Slide8); 
                                    AC.jLabelXLeft(10928, 9562, 2, 2, Slide9); 
                                    AC.jLabelXLeft(12294, 10928, 2, 2, Slide10); 
                                    AC.jLabelXLeft(13660, 12294, 2, 2, Slide11);
                                    
                                    count=1;
                                    break;
      
                                case 1:
                                   
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide1);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide2);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide3);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide4);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide5);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide6); 
                                    AC.jLabelXLeft(6830, 5464, 2, 2, Slide7); 
                                    AC.jLabelXLeft(8196, 6830, 2, 2, Slide8);
                                    AC.jLabelXLeft(9562, 8196, 2, 2, Slide9); 
                                    AC.jLabelXLeft(10928, 9562, 2, 2, Slide10); 
                                    AC.jLabelXLeft(12294, 10928, 2, 2, Slide11);
                                    
                                    count=2;
                                    break;
                                    
                                case 2:
                                    
                                    Thread.sleep(600);

                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide1);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide2);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide3);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide4);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide5);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide6);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide7); 
                                    AC.jLabelXLeft(6830, 5464, 2, 2, Slide8);
                                    AC.jLabelXLeft(8196, 6830, 2, 2, Slide9);
                                    AC.jLabelXLeft(9562, 8196, 2, 2, Slide10); 
                                    AC.jLabelXLeft(10928, 9562, 2, 2, Slide11);
                                    
                                    
                                    count=3;
                                    break;
                                    
                                case 3:
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide1);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide2);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide3);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide4);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide5);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide6);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide7);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide8);
                                    AC.jLabelXLeft(6830, 5464, 2, 2, Slide9);
                                    AC.jLabelXLeft(8196, 6830, 2, 2, Slide10);
                                    AC.jLabelXLeft(9562, 8196, 2, 2, Slide11);
                                   
                                    
                                    count=4;
                                    break;
                                    
                                case 4:
                                    
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-5464, -6830, 2, 2, Slide1);
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide2);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide3);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide4);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide5);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide6);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide7);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide8);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide9);
                                    AC.jLabelXLeft(6830, 5464, 2, 2, Slide10);
                                    AC.jLabelXLeft(8196, 6830, 2, 2, Slide11);
   
                                    count=5;
                                    break;
                                    
                                case 5:
                                    
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-6830, -8196, 2, 2, Slide1);
                                    AC.jLabelXLeft(-5464, -6830, 2, 2, Slide2);
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide3);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide4);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide5);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide6);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide7);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide8);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide9);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide10);
                                    AC.jLabelXLeft(6830, 5464, 2, 2, Slide11);
   
                                    count=6;
                                    break;
                                    
                                case 6:
                                    
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-8196, -9562, 2, 2, Slide1);
                                    AC.jLabelXLeft(-6830, -8196, 2, 2, Slide2);
                                    AC.jLabelXLeft(-5464, -6830, 2, 2, Slide3);
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide4);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide5);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide6);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide7);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide8);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide9);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide10);
                                    AC.jLabelXLeft(5464, 4098, 2, 2, Slide11);
                                       
                                    count=7;
                                    break;
                                    
                                case 7:
                                    
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-9562, -10928, 2, 2, Slide1); 
                                    AC.jLabelXLeft(-8196, -9562, 2, 2, Slide2);
                                    AC.jLabelXLeft(-6830, -8196, 2, 2, Slide3);
                                    AC.jLabelXLeft(-5464, -6830, 2, 2, Slide4);
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide5);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide6);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide7);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide8);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide9);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide10);
                                    AC.jLabelXLeft(4098, 2732, 2, 2, Slide11);
                                                                           
                                    count=8;
                                    break; 
                                    
                                case 8:
                                    
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-10928, -12294, 2, 2, Slide1);
                                    AC.jLabelXLeft(-9562, -10928, 2, 2, Slide2); 
                                    AC.jLabelXLeft(-8196, -9562, 2, 2, Slide3);
                                    AC.jLabelXLeft(-6830, -8196, 2, 2, Slide4);
                                    AC.jLabelXLeft(-5464, -6830, 2, 2, Slide5);
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide6);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide7);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide8);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide9);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide10);
                                    AC.jLabelXLeft(2732, 1366, 2, 2, Slide11);
                                                                                                               
                                    count=9;
                                    break; 
                                    
                                case 9:
                                    
                                    Thread.sleep(600);
                                    
                                    AC.jLabelXLeft(-12294, -13660, 2, 2, Slide1); 
                                    AC.jLabelXLeft(-10928, -12294, 2, 2, Slide2);
                                    AC.jLabelXLeft(-9562, -10928, 2, 2, Slide3); 
                                    AC.jLabelXLeft(-8196, -9562, 2, 2, Slide4);
                                    AC.jLabelXLeft(-6830, -8196, 2, 2, Slide5);
                                    AC.jLabelXLeft(-5464, -6830, 2, 2, Slide6);
                                    AC.jLabelXLeft(-4098, -5464, 2, 2, Slide7);
                                    AC.jLabelXLeft(-2732, -4098, 2, 2, Slide8);
                                    AC.jLabelXLeft(-1366, -2732, 2, 2, Slide9);
                                    AC.jLabelXLeft(0, -1366, 2, 2, Slide10);
                                    AC.jLabelXLeft(1366, 0, 2, 2, Slide11);
                                                                                                                                                   
                                    count=0;
                                    break;
                                    
                            }//switch
                    }//while
                }
                catch(Exception e)
                {
            
                }
            }
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSignup = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();
        AdminBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Movies_Btn = new javax.swing.JButton();
        Slide1 = new javax.swing.JLabel();
        Slide2 = new javax.swing.JLabel();
        Slide3 = new javax.swing.JLabel();
        Slide4 = new javax.swing.JLabel();
        Slide5 = new javax.swing.JLabel();
        Slide6 = new javax.swing.JLabel();
        Slide7 = new javax.swing.JLabel();
        Slide8 = new javax.swing.JLabel();
        Slide9 = new javax.swing.JLabel();
        Slide10 = new javax.swing.JLabel();
        Slide11 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 128));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 128));
        jPanel1.setLayout(null);

        btnSignup.setBackground(new java.awt.Color(200, 0, 50));
        btnSignup.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignup);
        btnSignup.setBounds(1180, 80, 75, 27);

        btnSignin.setBackground(new java.awt.Color(200, 0, 50));
        btnSignin.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Sign In");
        btnSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignin);
        btnSignin.setBounds(1110, 80, 73, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoticketonic.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 100, 100);

        Close.setBackground(new java.awt.Color(0, 0, 0));
        Close.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(153, 153, 153));
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.setFocusPainted(false);
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close);
        Close.setBounds(1321, 0, 45, 25);

        Minimize.setBackground(new java.awt.Color(0, 0, 0));
        Minimize.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Minimize.setForeground(new java.awt.Color(153, 153, 153));
        Minimize.setText("_");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.setFocusPainted(false);
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });
        jPanel1.add(Minimize);
        Minimize.setBounds(1280, 0, 43, 25);

        AdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Admin.png"))); // NOI18N
        AdminBtn.setToolTipText("");
        AdminBtn.setAlignmentY(0.0F);
        AdminBtn.setBorder(null);
        AdminBtn.setBorderPainted(false);
        AdminBtn.setContentAreaFilled(false);
        AdminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminBtn.setMaximumSize(new java.awt.Dimension(50, 50));
        AdminBtn.setMinimumSize(new java.awt.Dimension(50, 50));
        AdminBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        AdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminBtnMouseClicked(evt);
            }
        });
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AdminBtn);
        AdminBtn.setBounds(1290, 60, 50, 50);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A_Ticketonic_1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 20, 430, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 120);

        Movies_Btn.setBackground(new java.awt.Color(200, 0, 50));
        Movies_Btn.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        Movies_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Movies_Btn.setText("Experience Movies >>");
        Movies_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Movies_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movies_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Movies_Btn);
        Movies_Btn.setBounds(550, 670, 320, 43);

        Slide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Deadpool 2.jpg"))); // NOI18N
        Slide1.setMaximumSize(new java.awt.Dimension(1366, 500));
        Slide1.setMinimumSize(new java.awt.Dimension(1366, 500));
        Slide1.setPreferredSize(new java.awt.Dimension(1366, 500));
        getContentPane().add(Slide1);
        Slide1.setBounds(0, 120, 1366, 500);

        Slide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Rio 2.jpg"))); // NOI18N
        getContentPane().add(Slide2);
        Slide2.setBounds(1366, 120, 1366, 500);

        Slide3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/The Boss Baby.jpg"))); // NOI18N
        getContentPane().add(Slide3);
        Slide3.setBounds(2732, 120, 1366, 500);

        Slide4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Spiderman Homecoming.jpg"))); // NOI18N
        getContentPane().add(Slide4);
        Slide4.setBounds(4098, 120, 1366, 499);

        Slide5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Beauty and the Beast.jpg"))); // NOI18N
        getContentPane().add(Slide5);
        Slide5.setBounds(5464, 120, 1366, 500);

        Slide6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Captain America.jpg"))); // NOI18N
        getContentPane().add(Slide6);
        Slide6.setBounds(6830, 120, 1366, 500);

        Slide7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Finding Dory.jpg"))); // NOI18N
        getContentPane().add(Slide7);
        Slide7.setBounds(8196, 120, 1366, 500);

        Slide8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/X-Men.jpg"))); // NOI18N
        getContentPane().add(Slide8);
        Slide8.setBounds(9562, 120, 1366, 500);

        Slide9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Deadpool.jpg"))); // NOI18N
        getContentPane().add(Slide9);
        Slide9.setBounds(10928, 120, 1366, 500);

        Slide10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Max Steel.jpg"))); // NOI18N
        getContentPane().add(Slide10);
        Slide10.setBounds(12294, 120, 1366, 500);

        Slide11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Posters/Kong Skull.jpg"))); // NOI18N
        getContentPane().add(Slide11);
        Slide11.setBounds(13660, 120, 1366, 500);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Background.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1366, 768));
        Background.setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1366, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        
        new SignupTest().setVisible(true);
        //this.dispose();
        //new LoginTest().dispose();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        new LoginTest().setVisible(true);
        //new SignupTest().dispose();
        //this.dispose();
    }//GEN-LAST:event_btnSigninActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        mysqlconnector msq1=new mysqlconnector();
        try
        {
            Connection con1= msq1.getConnection();
            PreparedStatement pst1=con1.prepareStatement("update user set user_status=0 where user_status=1;");
            pst1.executeUpdate();
        }
        catch(Exception e)
        {}
        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
       this.setState(frontpage.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        new admin().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void AdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminBtnMouseClicked

    private void Movies_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movies_BtnActionPerformed
        mysqlconnector msq1=new mysqlconnector();
        try
        {
            Connection con1= msq1.getConnection();
            PreparedStatement pst1=con1.prepareStatement("select user_status from user where user_status=1;");
            ResultSet rs1=pst1.executeQuery();
            
            if(rs1.next())
            {
                //int val=rs1.getInt("user_status");
                //if(val==1)
                    new homepage().setVisible(true);
            }
                else
            {       JOptionPane.showMessageDialog(this, "Signin First to see Movie list ", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_Movies_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Close;
    private javax.swing.JButton Minimize;
    private javax.swing.JButton Movies_Btn;
    private javax.swing.JLabel Slide1;
    private javax.swing.JLabel Slide10;
    private javax.swing.JLabel Slide11;
    private javax.swing.JLabel Slide2;
    private javax.swing.JLabel Slide3;
    private javax.swing.JLabel Slide4;
    private javax.swing.JLabel Slide5;
    private javax.swing.JLabel Slide6;
    private javax.swing.JLabel Slide7;
    private javax.swing.JLabel Slide8;
    private javax.swing.JLabel Slide9;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
