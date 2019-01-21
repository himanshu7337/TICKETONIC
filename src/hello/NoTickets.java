package hello;

import java.awt.Image;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NoTickets extends javax.swing.JFrame {

    int count=0;
    String mo;
    String sc;
    String th;
    
    
    public NoTickets() {
        initComponents();
    }

    public NoTickets(String t, String s,String m) {
        initComponents();
        th=t;
        sc=s;
        mo=m;
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Icon1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Count8 = new javax.swing.JLabel();
        Count2 = new javax.swing.JLabel();
        Count10 = new javax.swing.JLabel();
        Count3 = new javax.swing.JLabel();
        Count4 = new javax.swing.JLabel();
        Count1 = new javax.swing.JLabel();
        Count9 = new javax.swing.JLabel();
        Count5 = new javax.swing.JLabel();
        Count6 = new javax.swing.JLabel();
        Count7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 450));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 90));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 90));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 90));

        CloseLbl.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CloseLbl.setForeground(new java.awt.Color(153, 153, 153));
        CloseLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLbl.setText("X");
        CloseLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        CloseLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        CloseLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        CloseLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseLblMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 188, 156));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOW MANY SEATS ???");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CloseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(CloseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 90);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(650, 360));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 360));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 360));

        Count8.setBackground(new java.awt.Color(236, 240, 241));
        Count8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count8.setForeground(new java.awt.Color(189, 195, 199));
        Count8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count8.setText("8");
        Count8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count8MouseExited(evt);
            }
        });

        Count2.setBackground(new java.awt.Color(236, 240, 241));
        Count2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count2.setForeground(new java.awt.Color(189, 195, 199));
        Count2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count2.setText("2");
        Count2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count2MouseExited(evt);
            }
        });

        Count10.setBackground(new java.awt.Color(236, 240, 241));
        Count10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count10.setForeground(new java.awt.Color(189, 195, 199));
        Count10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count10.setText("10");
        Count10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count10MouseExited(evt);
            }
        });

        Count3.setBackground(new java.awt.Color(236, 240, 241));
        Count3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count3.setForeground(new java.awt.Color(189, 195, 199));
        Count3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count3.setText("3");
        Count3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count3MouseExited(evt);
            }
        });

        Count4.setBackground(new java.awt.Color(236, 240, 241));
        Count4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count4.setForeground(new java.awt.Color(189, 195, 199));
        Count4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count4.setText("4");
        Count4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count4MouseExited(evt);
            }
        });

        Count1.setBackground(new java.awt.Color(236, 240, 241));
        Count1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count1.setForeground(new java.awt.Color(189, 195, 199));
        Count1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count1.setText("1");
        Count1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count1MouseExited(evt);
            }
        });

        Count9.setBackground(new java.awt.Color(236, 240, 241));
        Count9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count9.setForeground(new java.awt.Color(189, 195, 199));
        Count9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count9.setText("9");
        Count9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count9MouseExited(evt);
            }
        });

        Count5.setBackground(new java.awt.Color(236, 240, 241));
        Count5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count5.setForeground(new java.awt.Color(189, 195, 199));
        Count5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count5.setText("5");
        Count5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count5MouseExited(evt);
            }
        });

        Count6.setBackground(new java.awt.Color(236, 240, 241));
        Count6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count6.setForeground(new java.awt.Color(189, 195, 199));
        Count6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count6.setText("6");
        Count6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count6MouseExited(evt);
            }
        });

        Count7.setBackground(new java.awt.Color(236, 240, 241));
        Count7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Count7.setForeground(new java.awt.Color(189, 195, 199));
        Count7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Count7.setText("7");
        Count7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Count7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Count7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Count7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Count1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Count7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Count10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Count1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 650, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Count3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count3MouseEntered
        // TODO add your handling code here:
        Count3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Count3.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/automobile.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
        
    }//GEN-LAST:event_Count3MouseEntered

    private void Count3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count3MouseExited
        // TODO add your handling code here:
        Count3.setForeground(Color.decode("#BDC3C7"));
        
    }//GEN-LAST:event_Count3MouseExited

    private void Count1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count1MouseEntered
        // TODO add your handling code here:
        Count1.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count1.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/cycle.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
        
    }//GEN-LAST:event_Count1MouseEntered

    private void Count1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count1MouseExited
        // TODO add your handling code here:
        Count1.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count1MouseExited

    private void Count4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count4MouseEntered
        // TODO add your handling code here:
        Count4.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count4.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/automobile.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count4MouseEntered

    private void Count4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count4MouseExited
        // TODO add your handling code here:
         Count4.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count4MouseExited

    private void Count5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count5MouseEntered
        // TODO add your handling code here:
        Count5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Count5.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/tourist.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count5MouseEntered

    private void Count5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count5MouseExited
        // TODO add your handling code here:
         Count5.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count5MouseExited

    private void Count2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count2MouseEntered
        // TODO add your handling code here:
        Count2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Count2.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/motor-sports.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count2MouseEntered

    private void Count2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count2MouseExited
        // TODO add your handling code here:
         Count2.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count2MouseExited

    private void Count7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count7MouseEntered
        // TODO add your handling code here:
        Count7.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count7.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/buses.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count7MouseEntered

    private void Count7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count7MouseExited
        // TODO add your handling code here:
         Count7.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count7MouseExited

    private void Count8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count8MouseEntered
        // TODO add your handling code here:
        Count8.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count8.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/buses.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count8MouseEntered

    private void Count8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count8MouseExited
        // TODO add your handling code here:
         Count8.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count8MouseExited

    private void Count10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count10MouseEntered
        // TODO add your handling code here:
        Count10.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count10.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/airplanes.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count10MouseEntered

    private void Count10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count10MouseExited
        // TODO add your handling code here:
         Count10.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count10MouseExited

    private void Count6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count6MouseEntered
        // TODO add your handling code here:
        Count6.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count6.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/tourist.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count6MouseEntered

    private void Count6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count6MouseExited
        // TODO add your handling code here:
         Count6.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count6MouseExited

    private void Count9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count9MouseEntered
        // TODO add your handling code here:
        Count9.setCursor(new Cursor(Cursor.HAND_CURSOR));
         Count9.setForeground(Color.decode("#1ABC9C"));
        Image II = new ImageIcon(getClass().getResource("/Pics/airplanes.png")).getImage();
        Icon1.setIcon(new ImageIcon(II));
    }//GEN-LAST:event_Count9MouseEntered

    private void Count9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count9MouseExited
        // TODO add your handling code here:
         Count9.setForeground(Color.decode("#BDC3C7"));
    }//GEN-LAST:event_Count9MouseExited

    private void Count1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count1MouseClicked
        // TODO add your handling code here:
        count=1;
        //CountLabel.setText("Count : "+count);
        Count1.setForeground(Color.DARK_GRAY);
        new Seat(mo,sc,count,th).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Count1MouseClicked

    private void Count2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count2MouseClicked
        // TODO add your handling code here:
        count=2;
        //CountLabel.setText("Count : "+count);
        Count2.setForeground(Color.DARK_GRAY);
        new Seat(mo,sc,count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count2MouseClicked

    private void Count3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count3MouseClicked
        // TODO add your handling code here:
        count=3;
        //CountLabel.setText("Count : "+count);
        Count3.setForeground(Color.DARK_GRAY);
        new Seat(mo,sc,count,th).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Count3MouseClicked

    private void Count4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count4MouseClicked
        // TODO add your handling code here:
        count=4;
        //CountLabel.setText("Count : "+count);
        Count4.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count4MouseClicked

    private void Count5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count5MouseClicked
        // TODO add your handling code here:
        count=5;
        //CountLabel.setText("Count : "+count);
        Count5.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Count5MouseClicked

    private void Count6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count6MouseClicked
        // TODO add your handling code here:
        count=6;
        //CountLabel.setText("Count : "+count);
        Count6.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count6MouseClicked

    private void Count7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count7MouseClicked
        // TODO add your handling code here:
        count=7;
        //CountLabel.setText("Count : "+count);
        Count7.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count7MouseClicked

    private void Count8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count8MouseClicked
        // TODO add your handling code here:
        count=8;
        //CountLabel.setText("Count : "+count);
        Count8.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count8MouseClicked

    private void Count9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count9MouseClicked
        // TODO add your handling code here:
        count=9;
        //CountLabel.setText("Count : "+count);
        Count9.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count9MouseClicked

    private void Count10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Count10MouseClicked
        // TODO add your handling code here:
        count=10;
        //CountLabel.setText("Count : "+count);
        Count10.setForeground(Color.DARK_GRAY);
        new Seat(mo, sc, count,th).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Count10MouseClicked

    private void CloseLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseClicked
        count=0;
        this.dispose();
    }//GEN-LAST:event_CloseLblMouseClicked

    private void CloseLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseEntered
        CloseLbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_CloseLblMouseEntered

    private void CloseLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseExited
        CloseLbl.setForeground(Color.GRAY);
    }//GEN-LAST:event_CloseLblMouseExited

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
            java.util.logging.Logger.getLogger(NoTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLbl;
    private javax.swing.JLabel Count1;
    private javax.swing.JLabel Count10;
    private javax.swing.JLabel Count2;
    private javax.swing.JLabel Count3;
    private javax.swing.JLabel Count4;
    private javax.swing.JLabel Count5;
    private javax.swing.JLabel Count6;
    private javax.swing.JLabel Count7;
    private javax.swing.JLabel Count8;
    private javax.swing.JLabel Count9;
    private javax.swing.JLabel Icon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
