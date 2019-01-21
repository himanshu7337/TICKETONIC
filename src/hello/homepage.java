package hello;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class homepage extends javax.swing.JFrame {


    public homepage() {
        initComponents();

        p3.removeAll();
        p3.repaint();
        p3.revalidate();
        p3.add(p23);
        p3.repaint();
        p3.revalidate();
        
        mysqlconnector msq=new mysqlconnector();
        try{
            Connection con=msq.getConnection();
            Statement st=con.createStatement();
            String query="select * from movie order by rating desc;";
            ResultSet rs=st.executeQuery(query);
            int i=0;
            while(rs.next())
            {
                
                if(i==0)
                {
                String m1=rs.getString("mov_name");
                l1.setText(m1);
                hl1.setText(m1);
                 b1.setText("Book");
                b1.setBackground(java.awt.Color.red);
                jPanel5.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m1+"bg.jpg")).getImage();
             hp1.setIcon(new ImageIcon(i1));
                }
                if(i==1)
                {
                  String  m2=rs.getString("mov_name");
                l2.setText(m2);
                hl5.setText(m2);
                b5.setText("Book");
                b5.setBackground(java.awt.Color.red);
                jPanel6.setBackground(java.awt.Color.white);
             Image i1=new ImageIcon(getClass().getResource("/images/"+m2+"bg.jpg")).getImage();
             hp5.setIcon(new ImageIcon(i1));
                }
                if(i==2)
                {
                    String m3=rs.getString("mov_name");
                    l3.setText(m3);
                    hl2.setText(m3);
                     b2.setText("Book");
                b2.setBackground(java.awt.Color.red);
                jPanel3.setBackground(java.awt.Color.white);
                    Image i1=new ImageIcon(getClass().getResource("/images/"+m3+"bg.jpg")).getImage();
             hp2.setIcon(new ImageIcon(i1));
                }
                if(i==3)
                {
                    String m4=rs.getString("mov_name");
                l4.setText(m4);
                hl3.setText(m4);
                 b3.setText("Book");
                b3.setBackground(java.awt.Color.red);
                jPanel12.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp3.setIcon(new ImageIcon(i1));
                }
                if(i==4)
                {
                    String m4=rs.getString("mov_name");
                
                hl6.setText(m4);
                 b6.setText("Book");
                b6.setBackground(java.awt.Color.red);
                jPanel7.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp6.setIcon(new ImageIcon(i1));
                }
                   if(i==5)
                {
                    String m4=rs.getString("mov_name");
                
                hl4.setText(m4);
                 b4.setText("Book");
                b4.setBackground(java.awt.Color.red);
                jPanel13.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp4.setIcon(new ImageIcon(i1));
                }
                i++;
            }
        }catch(Exception e){
            
        }
        /*
         mysqlconnector msq1=new mysqlconnector();
        try{
            Connection con1=msq1.getConnection();
            Statement st1=con1.createStatement();
            String query1="select user_name from user where status=1;";
            ResultSet rs1=st1.executeQuery(query1);
            
            rs1.next();
            
            String uname=rs1.getString("user_name");
            Current_user.setText(uname);
        }
        catch(Exception e)
        {}*/
    }
    
    public homepage(String uname) {
        initComponents();

        p3.removeAll();
        p3.repaint();
        p3.revalidate();
        p3.add(p23);
        p3.repaint();
        p3.revalidate();
        
        mysqlconnector msq=new mysqlconnector();
        try{
            Connection con=msq.getConnection();
            Statement st=con.createStatement();
            String query="select * from movie order by rating desc;";
            ResultSet rs=st.executeQuery(query);
            int i=0;
            while(rs.next())
            {
                
                if(i==0)
                {
                String m1=rs.getString("mov_name");
                l1.setText(m1);
                
           
                hl1.setText(m1);
                 b1.setText("Book");
                b1.setBackground(java.awt.Color.red);
                jPanel5.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m1+"bg.jpg")).getImage();
             hp1.setIcon(new ImageIcon(i1));
                }
                if(i==1)
                {
                  String  m2=rs.getString("mov_name");
                l2.setText(m2);
                hl5.setText(m2);
                b5.setText("Book");
                b5.setBackground(java.awt.Color.red);
                jPanel6.setBackground(java.awt.Color.white);
             Image i1=new ImageIcon(getClass().getResource("/images/"+m2+"bg.jpg")).getImage();
             hp5.setIcon(new ImageIcon(i1));
                }
                if(i==2)
                {
                    String m3=rs.getString("mov_name");
                    l3.setText(m3);
                    hl2.setText(m3);
                     b2.setText("Book");
                b2.setBackground(java.awt.Color.red);
                jPanel3.setBackground(java.awt.Color.white);
                    Image i1=new ImageIcon(getClass().getResource("/images/"+m3+"bg.jpg")).getImage();
             hp2.setIcon(new ImageIcon(i1));
                }
                if(i==3)
                {
                    String m4=rs.getString("mov_name");
                l4.setText(m4);
                hl3.setText(m4);
                 b3.setText("Book");
                b3.setBackground(java.awt.Color.red);
                jPanel12.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp3.setIcon(new ImageIcon(i1));
                }
                if(i==4)
                {
                    String m4=rs.getString("mov_name");
                
                hl6.setText(m4);
                 b6.setText("Book");
                b6.setBackground(java.awt.Color.red);
                jPanel7.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp6.setIcon(new ImageIcon(i1));
                }
                   if(i==5)
                {
                    String m4=rs.getString("mov_name");
                
                hl4.setText(m4);
                 b4.setText("Book");
                b4.setBackground(java.awt.Color.red);
                jPanel13.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp4.setIcon(new ImageIcon(i1));
                }
                    if(i==6)
                {
                    
                    String m4=rs.getString("mov_name");
                
                hl7.setText(m4);
                 b7.setText("Book");
                b7.setBackground(java.awt.Color.red);
                jPanel8.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp7.setIcon(new ImageIcon(i1));
                }
                    
                if(i==7)
                {
                    String m4=rs.getString("mov_name");
                
                hl8.setText(m4);
                 b8.setText("Book");
                b8.setBackground(java.awt.Color.red);
                jPanel9.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp8.setIcon(new ImageIcon(i1));
                }
                 if(i==8)
                {
                    String m4=rs.getString("mov_name");
                
                hl9.setText(m4);
                 b9.setText("Book");
                b9.setBackground(java.awt.Color.red);
                jPanel10.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp9.setIcon(new ImageIcon(i1));
                }
                if(i==9)
                {
                String m4=rs.getString("mov_name");
                
                hl12.setText(m4);
                 b12.setText("Book");
                b12.setBackground(java.awt.Color.red);
                jPanel15.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp12.setIcon(new ImageIcon(i1));
                }
                if(i==10)
                {
                    String m4=rs.getString("mov_name");
                
                hl11.setText(m4);
                 b11.setText("Book");
                b11.setBackground(java.awt.Color.red);
                jPanel11.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp11.setIcon(new ImageIcon(i1));
                }
                if(i==11)
                {
                    String m4=rs.getString("mov_name");
                
                hl10.setText(m4);
                 b10.setText("Book");
                b10.setBackground(java.awt.Color.red);
                jPanel14.setBackground(java.awt.Color.white);
                Image i1=new ImageIcon(getClass().getResource("/images/"+m4+"bg.jpg")).getImage();
             hp10.setIcon(new ImageIcon(i1));
                }
                i++;
            }
        }catch(Exception e){
            
        }
        Current_user.setText(uname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator12 = new javax.swing.JSeparator();
        p1 = new javax.swing.JPanel();
        l0 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Minimize = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Current_user = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSignout = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        p8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        p4 = new javax.swing.JPanel();
        img2 = new javax.swing.JLabel();
        t1s2 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        t1s1 = new javax.swing.JLabel();
        t1s3 = new javax.swing.JLabel();
        t3s1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t2s1 = new javax.swing.JLabel();
        t2s2 = new javax.swing.JLabel();
        t2s3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t3s2 = new javax.swing.JLabel();
        t3s3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t4s1 = new javax.swing.JLabel();
        t4s2 = new javax.swing.JLabel();
        t4s3 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        t1s22 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        mrating = new javax.swing.JLabel();
        mdescrip = new javax.swing.JLabel();
        p8l = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();
        p23 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        p24 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        hp2 = new javax.swing.JLabel();
        hl2 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        hp3 = new javax.swing.JLabel();
        hl3 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        hp4 = new javax.swing.JLabel();
        hl4 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        hp1 = new javax.swing.JLabel();
        hl1 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        hp5 = new javax.swing.JLabel();
        hl5 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        hp6 = new javax.swing.JLabel();
        hl6 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        hp7 = new javax.swing.JLabel();
        hl7 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        hp11 = new javax.swing.JLabel();
        hl11 = new javax.swing.JLabel();
        b11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        hp8 = new javax.swing.JLabel();
        hl8 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        hp10 = new javax.swing.JLabel();
        hl10 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        hp12 = new javax.swing.JLabel();
        hl12 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        hp9 = new javax.swing.JLabel();
        hl9 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setForeground(new java.awt.Color(192, 57, 43));

        l0.setBackground(new java.awt.Color(44, 62, 80));
        l0.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        l0.setForeground(new java.awt.Color(192, 57, 43));
        l0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l0.setText("Top Movies");

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("abeatbyKai", 0, 20)); // NOI18N
        l1.setForeground(new java.awt.Color(44, 62, 80));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Movie 1");
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.setOpaque(true);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });

        l3.setBackground(new java.awt.Color(255, 255, 255));
        l3.setFont(new java.awt.Font("abeatbyKai", 0, 20)); // NOI18N
        l3.setForeground(new java.awt.Color(44, 62, 80));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("Movie 3");
        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.setOpaque(true);
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        l2.setBackground(new java.awt.Color(255, 255, 255));
        l2.setFont(new java.awt.Font("abeatbyKai", 0, 20)); // NOI18N
        l2.setForeground(new java.awt.Color(44, 62, 80));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Movie 2");
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.setOpaque(true);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        l4.setBackground(new java.awt.Color(255, 255, 255));
        l4.setFont(new java.awt.Font("abeatbyKai", 0, 20)); // NOI18N
        l4.setForeground(new java.awt.Color(44, 62, 80));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("Movie 4");
        l4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l4.setOpaque(true);
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL MOVIES");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(l0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addComponent(l3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator8)
            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setMinimumSize(new java.awt.Dimension(1366, 118));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 128));
        jPanel4.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoticketonic.png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(40, 20, 100, 100);

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
        jPanel4.add(Minimize);
        Minimize.setBounds(1280, 0, 43, 25);

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
        jPanel4.add(Close);
        Close.setBounds(1320, 0, 45, 25);

        Current_user.setBackground(new java.awt.Color(51, 51, 51));
        Current_user.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        Current_user.setForeground(new java.awt.Color(255, 255, 255));
        Current_user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Current_user.setMaximumSize(new java.awt.Dimension(200, 30));
        Current_user.setMinimumSize(new java.awt.Dimension(200, 30));
        Current_user.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel4.add(Current_user);
        Current_user.setBounds(1100, 50, 200, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/User.png"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(1310, 40, 50, 50);

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A_Ticketonic_1.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(120, 20, 430, 90);

        btnSignout.setBackground(new java.awt.Color(200, 0, 50));
        btnSignout.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSignout.setForeground(new java.awt.Color(255, 255, 255));
        btnSignout.setText("Sign Out");
        btnSignout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoutActionPerformed(evt);
            }
        });
        jPanel4.add(btnSignout);
        btnSignout.setBounds(1213, 90, 90, 27);

        p3.setBackground(new java.awt.Color(0, 0, 0));
        p3.setPreferredSize(new java.awt.Dimension(600, 1200));
        p3.setLayout(new java.awt.CardLayout());

        p8.setBackground(new java.awt.Color(102, 0, 102));
        p8.setForeground(new java.awt.Color(255, 51, 255));
        p8.setMaximumSize(new java.awt.Dimension(737, 380));
        p8.setMinimumSize(new java.awt.Dimension(737, 380));
        p8.setPreferredSize(new java.awt.Dimension(600, 1200));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setMaximumSize(new java.awt.Dimension(737, 380));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(737, 380));
        jScrollPane2.setOpaque(false);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(600, 1200));

        p4.setBackground(new java.awt.Color(0, 0, 0));
        p4.setMaximumSize(new java.awt.Dimension(737, 380));
        p4.setMinimumSize(new java.awt.Dimension(737, 380));
        p4.setPreferredSize(new java.awt.Dimension(600, 1200));
        p4.setLayout(null);

        img2.setMaximumSize(new java.awt.Dimension(540, 380));
        img2.setMinimumSize(new java.awt.Dimension(540, 380));
        img2.setPreferredSize(new java.awt.Dimension(540, 380));
        p4.add(img2);
        img2.setBounds(0, 0, 540, 380);

        t1s2.setBackground(new java.awt.Color(255, 255, 255));
        t1s2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        t1.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t1s1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t1s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t1s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1s1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t1s1MouseEntered(evt);
            }
        });

        t1s3.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t1s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1s3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t1s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1s3MouseClicked(evt);
            }
        });

        t3s1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t3s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t3s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3s1MouseClicked(evt);
            }
        });

        t2.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t2s1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t2s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t2s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2s1MouseClicked(evt);
            }
        });

        t2s2.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t2s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2s2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t2s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2s2MouseClicked(evt);
            }
        });

        t2s3.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t2s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2s3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t2s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2s3MouseClicked(evt);
            }
        });

        t3.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t3s2.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t3s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3s2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t3s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3s2MouseClicked(evt);
            }
        });

        t3s3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t3s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3s3MouseClicked(evt);
            }
        });

        t4.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t4s1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t4s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t4s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4s1MouseClicked(evt);
            }
        });

        t4s2.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t4s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4s2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t4s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4s2MouseClicked(evt);
            }
        });

        t4s3.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t4s3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t4s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4s3MouseClicked(evt);
            }
        });

        t1s22.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        t1s22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1s22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t1s22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1s22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout t1s2Layout = new javax.swing.GroupLayout(t1s2);
        t1s2.setLayout(t1s2Layout);
        t1s2Layout.setHorizontalGroup(
            t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator13)
            .addGroup(t1s2Layout.createSequentialGroup()
                .addGroup(t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9)
                    .addGroup(t1s2Layout.createSequentialGroup()
                        .addGroup(t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(t1s2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(t2s1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(t2s2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(t2s3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(t1s2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(t4s1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(t4s2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(t4s3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(t1s2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(t1s1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(t1s22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(t1s3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(t1s2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(t3s1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(t3s2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(t3s3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 383, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator11)
            .addComponent(jSeparator10)
        );
        t1s2Layout.setVerticalGroup(
            t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t1s2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1s22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1s3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2s3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t3s1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3s2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3s3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(t1s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4s3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(569, 569, 569))
        );

        p4.add(t1s2);
        t1s2.setBounds(31, 477, 964, 268);

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(197, 0, 57));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.add(date);
        date.setBounds(160, 390, 130, 50);

        date1.setBackground(new java.awt.Color(255, 255, 255));
        date1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(197, 0, 57));
        date1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        date1.setMaximumSize(new java.awt.Dimension(120, 50));
        date1.setMinimumSize(new java.awt.Dimension(120, 50));
        date1.setPreferredSize(new java.awt.Dimension(120, 50));
        date1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date1MouseClicked(evt);
            }
        });
        p4.add(date1);
        date1.setBounds(380, 390, 120, 50);

        date2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date2.setForeground(new java.awt.Color(197, 0, 57));
        date2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        date2.setMaximumSize(new java.awt.Dimension(120, 50));
        date2.setMinimumSize(new java.awt.Dimension(120, 50));
        date2.setPreferredSize(new java.awt.Dimension(120, 50));
        date2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date2MouseClicked(evt);
            }
        });
        p4.add(date2);
        date2.setBounds(600, 390, 120, 50);

        mname.setBackground(new java.awt.Color(255, 255, 255));
        mname.setFont(new java.awt.Font("abeatbyKai", 1, 36)); // NOI18N
        mname.setForeground(new java.awt.Color(199, 0, 57));
        mname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mname.setText("mname");
        p4.add(mname);
        mname.setBounds(630, 70, 330, 44);

        mrating.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        mrating.setForeground(new java.awt.Color(199, 0, 57));
        mrating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mrating.setText("rating");
        p4.add(mrating);
        mrating.setBounds(630, 190, 110, 40);

        mdescrip.setBackground(new java.awt.Color(255, 255, 255));
        mdescrip.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        mdescrip.setForeground(new java.awt.Color(199, 0, 57));
        mdescrip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mdescrip.setText("descrip");
        p4.add(mdescrip);
        mdescrip.setBounds(860, 190, 110, 44);
        p4.add(p8l);
        p8l.setBounds(0, 0, 1110, 930);

        bg1.setText("jLabel4");
        bg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4.add(bg1);
        bg1.setBounds(380, 390, 120, 50);

        bg2.setText("jLabel5");
        bg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4.add(bg2);
        bg2.setBounds(600, 390, 120, 50);

        jScrollPane2.setViewportView(p4);

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p3.add(p8, "card3");

        p23.setBackground(new java.awt.Color(102, 0, 102));
        p23.setForeground(new java.awt.Color(255, 51, 255));
        p23.setMaximumSize(new java.awt.Dimension(1100, 4000));
        p23.setMinimumSize(new java.awt.Dimension(1100, 4000));
        p23.setOpaque(false);
        p23.setPreferredSize(new java.awt.Dimension(1100, 4000));

        jScrollPane10.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane10.setMaximumSize(new java.awt.Dimension(1100, 2000));
        jScrollPane10.setMinimumSize(new java.awt.Dimension(1100, 2000));
        jScrollPane10.setOpaque(false);
        jScrollPane10.setPreferredSize(new java.awt.Dimension(1100, 2000));

        p24.setBackground(new java.awt.Color(0, 0, 0));
        p24.setForeground(new java.awt.Color(255, 255, 255));
        p24.setMaximumSize(new java.awt.Dimension(1100, 4000));
        p24.setMinimumSize(new java.awt.Dimension(1100, 4000));
        p24.setPreferredSize(new java.awt.Dimension(1100, 4000));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        hp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp2.setMaximumSize(new java.awt.Dimension(245, 390));
        hp2.setMinimumSize(new java.awt.Dimension(245, 390));
        hp2.setPreferredSize(new java.awt.Dimension(245, 390));

        hl2.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.setOpaque(true);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        hp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp3.setMaximumSize(new java.awt.Dimension(245, 390));
        hp3.setMinimumSize(new java.awt.Dimension(245, 390));
        hp3.setPreferredSize(new java.awt.Dimension(245, 390));

        hl3.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b3.setBackground(new java.awt.Color(0, 0, 0));
        b3.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.setOpaque(true);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(hp3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(hl3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        hp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp4.setMaximumSize(new java.awt.Dimension(245, 390));
        hp4.setMinimumSize(new java.awt.Dimension(245, 390));
        hp4.setPreferredSize(new java.awt.Dimension(245, 390));

        hl4.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        b4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.setOpaque(true);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hl4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        hp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp1.setMaximumSize(new java.awt.Dimension(245, 390));
        hp1.setMinimumSize(new java.awt.Dimension(245, 390));
        hp1.setPreferredSize(new java.awt.Dimension(245, 390));

        hl1.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b1.setBackground(new java.awt.Color(0, 0, 0));
        b1.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.setOpaque(true);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        hp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp5.setMaximumSize(new java.awt.Dimension(245, 390));
        hp5.setMinimumSize(new java.awt.Dimension(245, 390));
        hp5.setPreferredSize(new java.awt.Dimension(245, 390));

        hl5.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.setOpaque(true);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        hp6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp6.setMaximumSize(new java.awt.Dimension(245, 390));
        hp6.setMinimumSize(new java.awt.Dimension(245, 390));
        hp6.setPreferredSize(new java.awt.Dimension(245, 390));

        hl6.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.setOpaque(true);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp6, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        hp7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp7.setMaximumSize(new java.awt.Dimension(245, 390));
        hp7.setMinimumSize(new java.awt.Dimension(245, 390));
        hp7.setPreferredSize(new java.awt.Dimension(245, 390));

        hl7.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b7.setBackground(new java.awt.Color(0, 0, 0));
        b7.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b7.setOpaque(true);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp7, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        hp11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp11.setMaximumSize(new java.awt.Dimension(245, 390));
        hp11.setMinimumSize(new java.awt.Dimension(245, 390));
        hp11.setPreferredSize(new java.awt.Dimension(245, 390));

        hl11.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b11.setBackground(new java.awt.Color(0, 0, 0));
        b11.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b11.setOpaque(true);
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp11, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp11, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        hp8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp8.setMaximumSize(new java.awt.Dimension(245, 390));
        hp8.setMinimumSize(new java.awt.Dimension(245, 390));
        hp8.setPreferredSize(new java.awt.Dimension(245, 390));

        hl8.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b8.setOpaque(true);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp8, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        hp10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp10.setMaximumSize(new java.awt.Dimension(245, 390));
        hp10.setMinimumSize(new java.awt.Dimension(245, 390));
        hp10.setPreferredSize(new java.awt.Dimension(245, 390));

        hl10.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b10.setBackground(new java.awt.Color(0, 0, 0));
        b10.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        b10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b10.setOpaque(true);
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hl10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        hp12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp12.setMaximumSize(new java.awt.Dimension(245, 390));
        hp12.setMinimumSize(new java.awt.Dimension(245, 390));
        hp12.setPreferredSize(new java.awt.Dimension(245, 390));

        hl12.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b12.setBackground(new java.awt.Color(0, 0, 0));
        b12.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b12.setOpaque(true);
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(hp12, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(hl12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        hp9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp9.setMaximumSize(new java.awt.Dimension(245, 390));
        hp9.setMinimumSize(new java.awt.Dimension(245, 390));
        hp9.setPreferredSize(new java.awt.Dimension(245, 390));

        hl9.setFont(new java.awt.Font("abeatbyKai", 1, 14)); // NOI18N
        hl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b9.setBackground(new java.awt.Color(0, 0, 0));
        b9.setFont(new java.awt.Font("abeatbyKai", 1, 12)); // NOI18N
        b9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b9.setOpaque(true);
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hp9, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hl9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hl9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout p24Layout = new javax.swing.GroupLayout(p24);
        p24.setLayout(p24Layout);
        p24Layout.setHorizontalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p24Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p24Layout.createSequentialGroup()
                        .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p24Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p24Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p24Layout.createSequentialGroup()
                        .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p24Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p24Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        p24Layout.setVerticalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p24Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1568, 1568, 1568))
        );

        jScrollPane10.setViewportView(p24);

        javax.swing.GroupLayout p23Layout = new javax.swing.GroupLayout(p23);
        p23.setLayout(p23Layout);
        p23Layout.setHorizontalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p23Layout.setVerticalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p3.add(p23, "card3");

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Background.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1366, 768));
        Background.setMinimumSize(new java.awt.Dimension(1366, 768));
        Background.setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public homepage(JLabel jLabel4) {
        this.l1 = jLabel4;
    }

    public homepage(JButton jButton3, JLabel jLabel3, JLabel jLabel4) {
        //this.jButton3 = jButton3;
        this.l0 = jLabel3;
        this.l1 = jLabel4;
    }

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        //l1.setBackground(new Color(44, 62, 80));
        l1.setBackground(java.awt.Color.decode("#1abc9c"));
        l2.setBackground(java.awt.Color.white);
        l3.setBackground(java.awt.Color.white);
        l4.setBackground(java.awt.Color.white);
        jLabel2.setBackground(java.awt.Color.white);
        String g;
        g=l1.getText();
        p4(0,g);
        p3.removeAll();
        p3.repaint();
        p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        String g;
        l1.setBackground(java.awt.Color.white);
        l2.setBackground(java.awt.Color.decode("#1abc9c"));
        l3.setBackground(java.awt.Color.white);
        l4.setBackground(java.awt.Color.white);
        jLabel2.setBackground(java.awt.Color.white);
        
        g=l2.getText();
        p4(0,g);
        p3.removeAll();
        p3.repaint();
        p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
         String g;
         l1.setBackground(java.awt.Color.white);
        l2.setBackground(java.awt.Color.white);
        l3.setBackground(java.awt.Color.decode("#1abc9c"));
        l4.setBackground(java.awt.Color.white);
        jLabel2.setBackground(java.awt.Color.white);
        g=l3.getText();
       p4(0,g);
         p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
        
        
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // TODO add your handling code here:
         String g;
         l1.setBackground(java.awt.Color.white);
        l2.setBackground(java.awt.Color.white);
        l3.setBackground(java.awt.Color.white);
        l4.setBackground(java.awt.Color.decode("#1abc9c"));
        jLabel2.setBackground(java.awt.Color.white);
        g=l4.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_l4MouseClicked
     void p4(int i,String mo){
         
         mysqlconnector sq=new mysqlconnector();
        try{
            Connection con=sq.getConnection();
            Statement st=con.createStatement();
            String query="select * from movie where mov_name='"+mo+"';";
            ResultSet rs=st.executeQuery(query);
            
            rs.next();
              
            String d = null;
            String m1=rs.getString("mov_name");
            mname.setText(m1);
             //hl1.setText(m1);
            Image i1=new ImageIcon(getClass().getResource("/images/"+m1+".jpg")).getImage();
            img2.setIcon(new ImageIcon(i1));
             //i1=new ImageIcon(getClass().getResource("/images/"+m1+"bg.jpg")).getImage();
            // hp1.setIcon(new ImageIcon(i1));
            i1=new ImageIcon(getClass().getResource("/images/"+m1+"blur.png")).getImage();
            p8l.setIcon(new ImageIcon(i1));
            m1=rs.getString("descr");
            mdescrip.setText(m1);
            m1=rs.getString("rating");
            mrating.setText("Rating:"+m1);
            
            
            date1.setVisible(false);
            date2.setVisible(false);
            date.setVisible(false);
            t1s2.setVisible(false);
            resetp4();
               
                Statement st2=con.createStatement();
                Statement st3=con.createStatement();
                Statement st4=con.createStatement();
                Statement st5=con.createStatement();
                ResultSet r2,r3,r4,r5;
                
                String t;
                String ch,moo;
                moo=mname.getText();
                query="select distinct date from schedule where mov_id in (select mov_id from movie where mov_name='"+moo+"') order by date asc;";
                r5=st5.executeQuery(query);
                 if(r5.next()){
                     date.setVisible(true);
                     date.setOpaque(true);
                     date.setText("Select Dates");
                     
                      ch=r5.getString("date");
                date1.setText(ch);
                    date1.setVisible(true);
                     date1.setOpaque(true);
                     
                     if(i==0)
                        date1.setBackground(java.awt.Color.decode("#1abc9c"));
                 }
                if(r5.next()){
                     ch=r5.getString("date");
                     date2.setText(ch);
                date2.setVisible(true);
                date2.setOpaque(true);
                //date2.setBackground(java.awt.Color.white);
                }
                    
                 query="select distinct date from schedule where mov_id in (select mov_id from movie where mov_name='"+moo+"') order by date asc;";
                r5=st5.executeQuery(query);
                if(i==1){
                    r5.next();
                    if(r5.next()){
                d=r5.getString("date");
                    }
                }
                else{
                    
                    if(r5.next()){
                d=r5.getString("date");}
                }
            
            m1=rs.getString("mov_id");
            query="select distinct th_id from schedule where((mov_id="+m1+")and(date='"+d+"'));";
            r2=st2.executeQuery(query);
            r2.next();
            String tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t1.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
                t1s2.setVisible(true);
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t1s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t1s22.setText(tmp);}
                        
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t1s3.setText(tmp);}
                        
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t2.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t2s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t2s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t2s3.setText(tmp);}
            }
                        
                      
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t3.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t3s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t3s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t3s3.setText(tmp);}
            
            }           

            if(r2.next())
            {
                tid=r2.getString("th_id");
                query="select th_name from theatre where(th_id="+tid+");";
                r4=st4.executeQuery(query);
                r4.next();
                t=r4.getString("th_name");
                t4.setText(t);
                query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
                r3=st3.executeQuery(query);
                
                    if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t4s1.setText(tmp);
                    }

                    if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t4s2.setText(tmp);
                    }
                        
                    if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t4s3.setText(tmp);
                    }
            
            }       
                       
           }catch(Exception e){}        
     }
     
    /* void p5(int i){
     
       mysqlconnector sq=new mysqlconnector();
        try{
            Connection con=sq.getConnection();
            Statement st=con.createStatement();
            String query="select * from movie order by rating desc;";
            ResultSet rs=st.executeQuery(query);
            
            rs.next();
            rs.next();
                
              
                String d;
             String m1=rs.getString("mov_name");
             mname1.setText(m1);
             hl2.setText(m1);
              Image i1=new ImageIcon(getClass().getResource("/images/"+m1+".jpg")).getImage();
             img1.setIcon(new ImageIcon(i1));
              i1=new ImageIcon(getClass().getResource("/images/"+m1+"bg.jpg")).getImage();
             hp2.setIcon(new ImageIcon(i1));
             i1=new ImageIcon(getClass().getResource("/images/"+m1+"blur.png")).getImage();
             p9l.setIcon(new ImageIcon(i1));
             m1=rs.getString("descr");
             mdescrip1.setText(m1);
             m1=rs.getString("rating");
             mrating1.setText("Rating:"+m1);
               
               Statement st2=con.createStatement();
               Statement st3=con.createStatement();
               Statement st4=con.createStatement();
               ResultSet r2,r3,r4;
            String t;
            
            if(i==1){
            d="2017-09-27";}
            else{
            d="2017-09-28";}
            
            m1=rs.getString("mov_id");
            query="select distinct th_id from schedule where((mov_id="+m1+")and(date='"+d+"'));";
            r2=st2.executeQuery(query);
            r2.next();
            String tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t5.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t5s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t5s2.setText(tmp);}
                        
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t5s3.setText(tmp);}
            
                        
                       
                
                
                
                
                
                
           
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t6.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t6s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t6s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t6s3.setText(tmp);}
            }
                        
                      
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t7.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t7s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t7s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t7s3.setText(tmp);}
            
            }           
                       
                
       
             if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t8.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t8s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t8s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t8s3.setText(tmp);}
            
                }       
                       
           }catch(Exception e){}      
     }
     
     void p6(int i){
     
     mysqlconnector sq=new mysqlconnector();
        try{
            Connection con=sq.getConnection();
            Statement st=con.createStatement();
            String query="select * from movie order by rating desc;";
            ResultSet rs=st.executeQuery(query);
            
            rs.next();
            rs.next();
            rs.next();   
              
                String d;
             String m1=rs.getString("mov_name");
             mname2.setText(m1);
             hl3.setText(m1);
              Image i1=new ImageIcon(getClass().getResource("/images/"+m1+".jpg")).getImage();
             img3.setIcon(new ImageIcon(i1));
              i1=new ImageIcon(getClass().getResource("/images/"+m1+"bg.jpg")).getImage();
             hp3.setIcon(new ImageIcon(i1));
             i1=new ImageIcon(getClass().getResource("/images/"+m1+"blur.png")).getImage();
             p11l.setIcon(new ImageIcon(i1));
             m1=rs.getString("descr");
             mdescrip2.setText(m1);
             m1=rs.getString("rating");
             mrating2.setText("Rating:"+m1);
               
               Statement st2=con.createStatement();
               Statement st3=con.createStatement();
               Statement st4=con.createStatement();
               ResultSet r2,r3,r4;
            String t;
            
            if(i==1){
            d="2017-09-27";}
            else{
            d="2017-09-28";}
            
            m1=rs.getString("mov_id");
            query="select distinct th_id from schedule where((mov_id="+m1+")and(date='"+d+"'));";
            r2=st2.executeQuery(query);
            r2.next();
            String tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t9.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t9s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t9s2.setText(tmp);}
                        
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t9s3.setText(tmp);}
            
                        
                       
                
                
                
                
                
                
           
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t10.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t10s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t10s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t10s3.setText(tmp);}
            }
                        
                      
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t11.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t11s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t11s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t11s3.setText(tmp);}
            
            }           
                       
                
       
             if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t12.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t12s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t12s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t12s3.setText(tmp);}
            
                }       
                       
           }catch(Exception e){}      
     
     }
     
     void p13(int i){
     
      mysqlconnector sq=new mysqlconnector();
        try{
            Connection con=sq.getConnection();
            Statement st=con.createStatement();
            String query="select * from movie order by rating desc;";
            ResultSet rs=st.executeQuery(query);
            
            rs.next();
            rs.next();
            rs.next();
            rs.next();
                
              
                String d;
             String m1=rs.getString("mov_name");
             mname3.setText(m1);
             hl4.setText(m1);
              Image i1=new ImageIcon(getClass().getResource("/images/"+m1+".jpg")).getImage();
             img4.setIcon(new ImageIcon(i1));
              i1=new ImageIcon(getClass().getResource("/images/"+m1+"bg.jpg")).getImage();
             hp4.setIcon(new ImageIcon(i1));
             i1=new ImageIcon(getClass().getResource("/images/"+m1+"blur.png")).getImage();
             p13l.setIcon(new ImageIcon(i1));
             m1=rs.getString("descr");
             mdescrip3.setText(m1);
             m1=rs.getString("rating");
             mrating3.setText("Rating:"+m1);
               
               Statement st2=con.createStatement();
               Statement st3=con.createStatement();
               Statement st4=con.createStatement();
               ResultSet r2,r3,r4;
            String t;
            
            if(i==1){
            d="2017-09-27";}
            else{
            d="2017-09-28";}
            
            m1=rs.getString("mov_id");
            query="select distinct th_id from schedule where((mov_id="+m1+")and(date='"+d+"'));";
            r2=st2.executeQuery(query);
            r2.next();
            String tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t13.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t13s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t13s2.setText(tmp);}
                        
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t13s3.setText(tmp);}
            
                        
                       
                
                
                
                
                
                
           
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t14.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t14s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t14s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t14s3.setText(tmp);}
            }
                        
                      
            if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t15.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t15s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t15s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t15s3.setText(tmp);}
            
            }           
                       
                
       
             if(r2.next()){
            tid=r2.getString("th_id");
            query="select th_name from theatre where(th_id="+tid+");";
            r4=st4.executeQuery(query);
            r4.next();
            t=r4.getString("th_name");
            t16.setText(t);
            query="select * from schedule where((th_id="+tid+")and(mov_id="+m1+")and(date='"+d+"'));";
            r3=st3.executeQuery(query);
            if(r3.next()){
            t=r3.getString("start");
            String tmp = t.substring(0, 5);
            t16s1.setText(tmp);}
                
                    if(r3.next()){
                    t=r3.getString("start");
                    String tmp = t.substring(0, 5);
                    t16s2.setText(tmp);}
                        
                        if(r3.next()){
                        t=r3.getString("start");
                        String tmp = t.substring(0, 5);
                        t16s3.setText(tmp);}
            
                }       
                       
           }catch(Exception e){}    
     
     
     }*/
     
     
     void resetp4(){
         t1.setText("");
         t1s1.setText("");
        t1s22.setText("");
        t1s3.setText("");
         t2.setText("");
          t2s1.setText("");
          t2s2.setText("");
          t2s3.setText("");
          t3.setText("");
          t3s1.setText("");
          t3s2.setText("");
          t3s3.setText("");
          t4.setText("");
          t4s1.setText("");
           t4s2.setText("");
            t4s3.setText("");
     }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        l1.setBackground(java.awt.Color.white);
        l2.setBackground(java.awt.Color.white);
        l3.setBackground(java.awt.Color.white);
        l4.setBackground(java.awt.Color.white);
        jLabel2.setBackground(java.awt.Color.decode("#1abc9c"));
         p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p23);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void t1s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1s1MouseClicked
        // TODO add your handling code here:
        
        String sch,temp;
        temp=t1s1.getText();
        sch=temp.substring(0,5);
        temp=t1.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp,sch,movname).setVisible(true);
        
        
                //this.dispose();
    }//GEN-LAST:event_t1s1MouseClicked

    private void t1s22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1s22MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t1s22.getText();
        sch=temp.substring(0,5);
        temp=t1.getText();
        
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t1s22MouseClicked

    private void t1s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1s3MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t1s3.getText();
        sch=temp.substring(0,5);
        temp=t1.getText();
       String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
                
    }//GEN-LAST:event_t1s3MouseClicked

    private void t2s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2s1MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t2s1.getText();
        sch=temp.substring(0,5);
        temp=t2.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t2s1MouseClicked

    private void t2s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2s2MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t2s2.getText();
        sch=temp.substring(0,5);
        temp=t2.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t2s2MouseClicked

    private void t2s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2s3MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t2s3.getText();
        sch=temp.substring(0,5);
        temp=t2.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t2s3MouseClicked

    private void t3s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3s1MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t3s1.getText();
        sch=temp.substring(0,5);
        temp=t3.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t3s1MouseClicked

    private void t3s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3s2MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t3s2.getText();
        sch=temp.substring(0,5);
        temp=t3.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t3s2MouseClicked

    private void t3s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3s3MouseClicked
        // TODO add your handling code here:
         String sch,temp;
        temp=t3s3.getText();
        sch=temp.substring(0,5);
        temp=t3.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t3s3MouseClicked

    private void t4s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4s1MouseClicked
        // TODO add your handling code here:
         String sch,temp;
        temp=t4s1.getText();
        sch=temp.substring(0,5);
        temp=t4.getText();
       String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t4s1MouseClicked

    private void t4s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4s2MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t4s2.getText();
        sch=temp.substring(0,5);
        temp=t4.getText();
       String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t4s2MouseClicked

    private void t4s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4s3MouseClicked
        // TODO add your handling code here:
        String sch,temp;
        temp=t4s3.getText();
        sch=temp.substring(0,5);
        temp=t4.getText();
        String movname;
        movname=mname.getText();
       new NoTickets(temp, sch,movname).setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_t4s3MouseClicked

    private void t1s1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1s1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_t1s1MouseEntered

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(homepage.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

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
        JOptionPane.showMessageDialog(this, "Logging Out...", "Info", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        
        //System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl2.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl3.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl4.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b4MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl1.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
        
    }//GEN-LAST:event_b1MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl5.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl6.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b6MouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl7.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl8.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b8MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl9.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b9MouseClicked

    private void b10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl10.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b10MouseClicked

    private void b11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl11.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b11MouseClicked

    private void b12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=hl12.getText();
       p4(0,g);
        p3.removeAll();
        p3.repaint();
         p3.revalidate();
        p3.add(p8);
        p3.repaint();
        p3.revalidate();
    }//GEN-LAST:event_b12MouseClicked

    private void date1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date1MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=mname.getText();
        date1.setBackground(java.awt.Color.decode("#1abc9c"));
        date2.setBackground(java.awt.Color.white);
        //bg2.setOpaque(false);
        //bg1.setOpaque(true);
        //bg1.setText(date1.getText());
        //bg1.setBackground(java.awt.Color.decode("#1abc9c"));
        //date1.setOpaque(false);
       p4(0,g);
       
       
    }//GEN-LAST:event_date1MouseClicked

    private void date2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date2MouseClicked
        // TODO add your handling code here:
        resetp4();
         String g;
        g=mname.getText();
        date2.setBackground(java.awt.Color.decode("#1abc9c"));
        date1.setBackground(java.awt.Color.white);
        //bg1.setOpaque(false);
        //bg2.setOpaque(true);
        //bg2.setText(date1.getText());
        //bg2.setBackground(java.awt.Color.decode("#1abc9c"));
       p4(1,g);
    }//GEN-LAST:event_date2MouseClicked

    private void btnSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoutActionPerformed
        
        mysqlconnector msq1=new mysqlconnector();
        try
        {
            Connection con1= msq1.getConnection();
            PreparedStatement pst1=con1.prepareStatement("update user set user_status=0 where user_status=1;");
            pst1.executeUpdate();
        }
        catch(Exception e)
        {}
        JOptionPane.showMessageDialog(this, "Logging Out...", "Info", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        
    }//GEN-LAST:event_btnSignoutActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Close;
    private javax.swing.JLabel Current_user;
    private javax.swing.JButton Minimize;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton btnSignout;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel hl1;
    private javax.swing.JLabel hl10;
    private javax.swing.JLabel hl11;
    private javax.swing.JLabel hl12;
    private javax.swing.JLabel hl2;
    private javax.swing.JLabel hl3;
    private javax.swing.JLabel hl4;
    private javax.swing.JLabel hl5;
    private javax.swing.JLabel hl6;
    private javax.swing.JLabel hl7;
    private javax.swing.JLabel hl8;
    private javax.swing.JLabel hl9;
    private javax.swing.JLabel hp1;
    private javax.swing.JLabel hp10;
    private javax.swing.JLabel hp11;
    private javax.swing.JLabel hp12;
    private javax.swing.JLabel hp2;
    private javax.swing.JLabel hp3;
    private javax.swing.JLabel hp4;
    private javax.swing.JLabel hp5;
    private javax.swing.JLabel hp6;
    private javax.swing.JLabel hp7;
    private javax.swing.JLabel hp8;
    private javax.swing.JLabel hp9;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel mdescrip;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel mrating;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p23;
    private javax.swing.JPanel p24;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p8;
    private javax.swing.JLabel p8l;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t1s1;
    private javax.swing.JPanel t1s2;
    private javax.swing.JLabel t1s22;
    private javax.swing.JLabel t1s3;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t2s1;
    private javax.swing.JLabel t2s2;
    private javax.swing.JLabel t2s3;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t3s1;
    private javax.swing.JLabel t3s2;
    private javax.swing.JLabel t3s3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t4s1;
    private javax.swing.JLabel t4s2;
    private javax.swing.JLabel t4s3;
    // End of variables declaration//GEN-END:variables
}
