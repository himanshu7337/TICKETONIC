package hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class adminhome extends javax.swing.JFrame {

    String adm;
    
    public adminhome() {
        initComponents();
        
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from Movie;");

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField1.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from Theatre;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField2.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from User;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField3.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public adminhome(String adm_nm) {
        initComponents();
        adm=adm_nm;
        
        Current_admin.setText(adm);
        
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from Movie;");

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField1.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from Theatre;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField2.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from User;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField3.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Current_admin = new javax.swing.JLabel();
        Admin_logo = new javax.swing.JLabel();
        Logout_Lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        backgroundImage = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(199, 0, 57));
        setForeground(new java.awt.Color(199, 0, 57));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("abeatbyKai", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME ADMIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 100, 300, 40);

        Current_admin.setBackground(new java.awt.Color(51, 51, 51));
        Current_admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Current_admin.setForeground(new java.awt.Color(255, 255, 255));
        Current_admin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Current_admin.setMaximumSize(new java.awt.Dimension(200, 30));
        Current_admin.setMinimumSize(new java.awt.Dimension(200, 30));
        Current_admin.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(Current_admin);
        Current_admin.setBounds(1080, 80, 200, 30);

        Admin_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Admin.png"))); // NOI18N
        getContentPane().add(Admin_logo);
        Admin_logo.setBounds(1290, 70, 50, 50);

        Logout_Lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Logout_Lbl.setForeground(new java.awt.Color(255, 255, 255));
        Logout_Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutbutton.png"))); // NOI18N
        Logout_Lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout_Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_LblMouseClicked(evt);
            }
        });
        getContentPane().add(Logout_Lbl);
        Logout_Lbl.setBounds(1200, 110, 100, 50);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1220, 10, 30, 20);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1280, 10, 30, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Manage Movies");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(260, 240, 169, 50);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Manage Theatre");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(520, 240, 173, 50);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Proceed");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 310, 127, 50);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Manage Schedules");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(770, 240, 220, 50);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("This is where we stand...");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 450, 249, 60);

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. of movies running :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 530, 250, 40);

        jLabel3.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. of Theatres we have tie ups with :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 600, 420, 40);

        jLabel4.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. of certified and Happy users :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 670, 360, 40);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(720, 520, 79, 60);

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(720, 590, 78, 60);

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(720, 660, 78, 60);

        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin backgroundlarge1.png"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(-10, 0, 1366, 768);

        Close.setBackground(new java.awt.Color(0, 0, 0));
        Close.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(153, 153, 153));
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.setFocusPainted(false);
        Close.setOpaque(false);
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(1280, 10, 45, 25);

        Minimize.setBackground(new java.awt.Color(0, 0, 0));
        Minimize.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Minimize.setForeground(new java.awt.Color(153, 153, 153));
        Minimize.setText("_");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.setFocusPainted(false);
        Minimize.setOpaque(false);
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(1210, 10, 43, 25);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jRadioButton1.isSelected()){
            new adminmovie(adm).setVisible(true);
                        this.dispose();
        }
         if(jRadioButton2.isSelected()){
            new admintheatre(adm).setVisible(true);
                        this.dispose();
        }
         if(jRadioButton3.isSelected()){
            new adminpay(adm).setVisible(true);
                        this.dispose();
        }
                        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from Movie;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField1.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from Theatre;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField2.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select count(*) from User;");
           

            ResultSet rs=pst.executeQuery();
            if (rs.next())
            {
                jTextField3.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        mysqlconnector msq=new mysqlconnector();
        try
        {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("update admin set admin_status=0 where admin_status=1;");

            //ResultSet rs=pst.executeQuery();
            if (pst.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Logging Out...", "Info", JOptionPane.INFORMATION_MESSAGE);
                new admin().setVisible(true);
                        this.dispose();
            }
            //else
            //JOptionPane.showMessageDialog(this, "Something Went Wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_CloseActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(adminhome.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void Logout_LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_LblMouseClicked
        mysqlconnector msq=new mysqlconnector();
        try
        {
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("update admin set admin_status=0 where admin_status=1;");
           
            //ResultSet rs=pst.executeQuery();
            if (pst.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Logging Out...", "Info", JOptionPane.INFORMATION_MESSAGE);
                new admin().setVisible(true);
                        this.dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Something Went Wrong... ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_Logout_LblMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin_logo;
    private javax.swing.JButton Close;
    private javax.swing.JLabel Current_admin;
    private javax.swing.JLabel Logout_Lbl;
    private javax.swing.JButton Minimize;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
