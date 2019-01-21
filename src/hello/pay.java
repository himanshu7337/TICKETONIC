package hello;

import java.awt.Color;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

public class pay extends javax.swing.JFrame {

    int c,pay_count=0;
    int res_count=0;
    int amount=0;
    
    int tckt_id_arr[]={0,0,0,0,0,0,0,0,0,0};
    int tckt_id,cnt;
    int sch_id,col_no;
    int schid;
    String mov_name,th_name,date,start,row_no;
    
    public pay() {
        initComponents();
    }
    
    public pay(int cnt) {
        initComponents();
        c=cnt;
        amount=c*120;            
        Amount_lbl.setText(Integer.toString(amount));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cardno_txt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Pay_lbl = new javax.swing.JLabel();
        CloseLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Amount_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 400));
        setMinimumSize(new java.awt.Dimension(650, 400));
        setUndecorated(true);

        jpanel1.setBackground(new java.awt.Color(44, 62, 80));
        jpanel1.setMaximumSize(new java.awt.Dimension(650, 400));
        jpanel1.setMinimumSize(new java.awt.Dimension(650, 400));
        jpanel1.setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel4.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 188, 156));
        jLabel4.setText("Credit Card/Debit Card/ATM Card");

        jLabel1.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Enter Card Number");
        jLabel1.setMaximumSize(new java.awt.Dimension(112, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(112, 15));
        jLabel1.setPreferredSize(new java.awt.Dimension(112, 15));

        Cardno_txt.setBackground(new java.awt.Color(44, 62, 80));
        Cardno_txt.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        Cardno_txt.setForeground(new java.awt.Color(236, 240, 241));
        Cardno_txt.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(26, 188, 156));
        jSeparator1.setForeground(new java.awt.Color(26, 188, 156));

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Enter CVV");
        jLabel2.setMaximumSize(new java.awt.Dimension(60, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(60, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 15));

        jPasswordField1.setBackground(new java.awt.Color(44, 62, 80));
        jPasswordField1.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(236, 240, 241));
        jPasswordField1.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(26, 188, 156));
        jSeparator2.setForeground(new java.awt.Color(26, 188, 156));

        jLabel3.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Expiry");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 15));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 15));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setMaximumSize(new java.awt.Dimension(55, 20));
        jComboBox1.setMinimumSize(new java.awt.Dimension(55, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(55, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YY", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setMaximumSize(new java.awt.Dimension(50, 20));
        jComboBox2.setMinimumSize(new java.awt.Dimension(50, 20));
        jComboBox2.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel5.setFont(new java.awt.Font("abeatbyKai", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("* Your CVV will not be stored.");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment_1.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        Pay_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay_default.png"))); // NOI18N
        Pay_lbl.setText("jLabel6");
        Pay_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pay_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pay_lblMouseClicked(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Amount : ");
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 15));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 15));

        Amount_lbl.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        Amount_lbl.setForeground(new java.awt.Color(236, 240, 241));
        Amount_lbl.setMaximumSize(new java.awt.Dimension(50, 15));
        Amount_lbl.setMinimumSize(new java.awt.Dimension(50, 15));
        Amount_lbl.setPreferredSize(new java.awt.Dimension(50, 15));

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cardno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addGroup(jpanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Amount_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 32, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Pay_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CloseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Pay_lbl))
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cardno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Amount_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Pay_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pay_lblMouseClicked
        // TODO add your handling code here:
        mysqlconnector msq=new mysqlconnector();
        try {
            String pay_id=Cardno_txt.getText();
            String cvv=(String.valueOf(jPasswordField1.getPassword()));
            
            int len_cno=pay_id.length();
            int len_cvv=cvv.length();
            
            String month=(String)jComboBox1.getSelectedItem();
            String year=(String)jComboBox2.getSelectedItem();
            
            if(len_cno==16)
            {
                if(len_cvv==3)
                {
                    if(!month.equals("MM") && !year.equals("YY"))
                    {
                        Connection con=msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("select count(*) as count from payment");
                        ResultSet rs = pst.executeQuery();
                        rs.next();
                        pay_count=rs.getInt("count");
                        pay_count+=1000;

                        PreparedStatement ps_user = con.prepareStatement("select user_name from user where user_status=1;");
                        ResultSet rs_user =ps_user.executeQuery();
                        rs_user.next();
                        String uname = rs_user.getString("user_name");

                        PreparedStatement pst1 = con.prepareStatement("insert into payment values(?,?,?,?);");
                        pst1.setInt(1,pay_count);
                        pst1.setString(2,uname);
                        pst1.setString(3,(Cardno_txt.getText()));
                        pst1.setInt(4,amount);
                        int val=pst1.executeUpdate();

                        //Connection con=msq.getConnection();
                        PreparedStatement pst_res1=con.prepareStatement("select count(*) as count from reservation");
                        ResultSet rs_res1 = pst_res1.executeQuery();
                        rs_res1.next();
                        res_count=rs_res1.getInt("count");
                        res_count+=2000;

                        PreparedStatement pst_sch=con.prepareStatement("select sch_id,row_no,col_no from seat_list where status=1");
                        ResultSet rs_sch = pst_sch.executeQuery();
                        while(rs_sch.next())
                        {
                            schid=rs_sch.getInt("sch_id");
                            String rno=rs_sch.getString("row_no");
                            int cno=rs_sch.getInt("col_no");

                            PreparedStatement pst_res = con.prepareStatement("insert into reservation values(?,?,?,?,?);");
                            pst_res.setInt(1,res_count);
                            pst_res.setInt(2,schid);
                            pst_res.setString(3,rno);
                            pst_res.setInt(4,cno);
                            pst_res.setInt(5,pay_count); 

                            pst_res.executeUpdate();
                            res_count++;
                        }
                        mysqlconnector msqs=new mysqlconnector();
                        try 
                        {
                            //Connection con = msqs.getConnection();
                            String query = "SELECT status FROM seat_list;";
                            Statement st=con.createStatement();
                            ResultSet rss = st.executeQuery(query);

                            while(rss.next())
                            {    
                                int flag=rss.getInt("status");
                                if(flag==1)  
                                {
                                    PreparedStatement psts=con.prepareStatement("update seat_list set status=-1 where  sch_id="+schid+" and status=1;");
                                    psts.executeUpdate();    
                                }    
                            }

                        } 
                        catch (Exception e) 
                        {
                            e.printStackTrace();
                        }

                        res_count=res_count-c;
                        tckt_id=res_count;
                        for(int i=0;i<c;i++)
                        {
                            tckt_id_arr[i]=tckt_id;  
                            tckt_id++;
                        }

                        if(val==1)
                        {
                            JOptionPane.showMessageDialog(this,"Payment Successful","Message", JOptionPane.INFORMATION_MESSAGE);
                            
                            JOptionPane.showMessageDialog(this,"Sending E-Ticket on registered Email ID ...","Message", JOptionPane.INFORMATION_MESSAGE);

                            ///*---------------------------------------------------------------------------------------------
                            mysqlconnector msq_m=new mysqlconnector();
                            try{


                                Connection con_m = msq_m.getConnection();
                                PreparedStatement ps_m = con_m.prepareStatement("select user_emid from user where user_status=1;");
                                ResultSet rs_m =ps_m.executeQuery();
                                rs_m.next();
                                String mail_id = rs_m.getString("user_emid");

                                String message =
                                         "\n------------------------------------------------------\n"
                                        +"                  TICKET DETAILS                      \n"
                                        +"------------------------------------------------------\n";

                                int i;
                                for(i=0;i<c;i++)
                                {

                                PreparedStatement pst11=con.prepareStatement("select sch_id,row_no,col_no from reservation where tckt_id="+tckt_id_arr[i]+";");
                                ResultSet rs11 = pst11.executeQuery();
                                rs11.next();
                                sch_id=rs11.getInt("sch_id");
                                row_no=rs11.getString("row_no");
                                col_no=rs11.getInt("col_no");

                                PreparedStatement pst12=con.prepareStatement("select th_id,mov_id,date,start from schedule where sch_id="+sch_id+";");
                                ResultSet rs12 = pst12.executeQuery();
                                rs12.next();
                                int th_id=rs12.getInt("th_id");
                                int mov_id=rs12.getInt("mov_id");
                                date=rs12.getString("date");
                                start=rs12.getString("start");

                                PreparedStatement pst2=con.prepareStatement("select mov_name from movie where mov_id="+mov_id+";");
                                ResultSet rs2 = pst2.executeQuery();
                                rs2.next();
                                mov_name=rs2.getString("mov_name");

                                PreparedStatement pst3=con.prepareStatement("select th_name from theatre where th_id="+th_id+";");
                                ResultSet rs3 = pst3.executeQuery();
                                rs3.next();
                                th_name=rs3.getString("th_name");

                                message =""+message
                                        +"\n                                                      "
                                        +"\n------------------------------------------------------"
                                        +"\n      Ticket id :           "+tckt_id_arr[i]+"                 "
                                        +"\n      Theatre :             "+th_name+"                 "
                                        +"\n      Movie :               "+mov_name+"                 "
                                        +"\n      Show Date :           "+date+"                 "
                                        +"\n      Show Time :           "+start+"                 "
                                        +"\n      Seat no. :            "+row_no+"-"+col_no+"                 "
                                        +"\n      Price :               120                 "
                                        +"\n------------------------------------------------------"
                                        +"\n                                                      ";

                                }//for



                                String host ="smtp.gmail.com" ;
                                String user = "ticketonic@gmail.com";
                                String pass = "ticketonic123";
                                String to = mail_id;
                                String from = "ticketonic@gmail.com";
                                String subject = "Ticket Booking Details";
                                String messageText = " "+message+"\n Ticket Generated !!! Thank you for booking movie ticket through TICKETONIC.";
                                boolean sessionDebug = false;

                                Properties props = System.getProperties();

                                props.put("mail.smtp.starttls.enable", "true");
                                props.put("mail.smtp.host", host);
                                props.put("mail.smtp.port", "587");
                                props.put("mail.smtp.auth", "true");
                                props.put("mail.smtp.starttls.required", "true");

                                java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                                Session mailSession = Session.getDefaultInstance(props, null);
                                mailSession.setDebug(sessionDebug);
                                Message msg = new MimeMessage(mailSession);
                                msg.setFrom(new InternetAddress(from));
                                InternetAddress[] address = {new InternetAddress(to)};
                                msg.setRecipients(Message.RecipientType.TO, address);
                                msg.setSubject(subject); msg.setSentDate(new Date());
                                msg.setText(messageText);

                               Transport transport=mailSession.getTransport("smtp");
                               transport.connect(host, user, pass);
                               transport.sendMessage(msg, msg.getAllRecipients());
                               transport.close();
                               System.out.println("Email sent !!!");
                                //JOptionPane.showMessageDialog(this, "Success", "Info", JOptionPane.INFORMATION_MESSAGE);

                            }catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(this,"Problem occured while sending Email...","Message", JOptionPane.INFORMATION_MESSAGE);
                                //System.out.println(ex);
                            }

                            //-----------------------------------------------------------------------------------------------*/

                            mysqlconnector msq2=new mysqlconnector();
                            try 
                            {
                                Connection con2 = msq2.getConnection();
                                String query = "SELECT status FROM seat_list;";
                                Statement st2=con.createStatement();
                                ResultSet rs2 = st2.executeQuery(query);

                                while(rs2.next())
                                {    
                                    int flag=rs2.getInt("status");
                                    if(flag==1)  
                                    {
                                        PreparedStatement pst2=con.prepareStatement("update seat_list set status=-1 where status=1;");
                                        pst2.executeUpdate();    
                                    }    
                                }

                            } 
                            catch (Exception e) 
                            {
                                e.printStackTrace();
                            }
                            new bill_form(res_count,c).setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "FAILED", "ERROR", JOptionPane.ERROR_MESSAGE);

                            mysqlconnector msq2=new mysqlconnector();
                            try 
                            {
                                Connection con2 = msq2.getConnection();
                                String query = "SELECT status FROM seat_list;";
                                Statement st2=con.createStatement();
                                ResultSet rs2 = st2.executeQuery(query);

                                while(rs2.next())
                                {    
                                    int flag=rs2.getInt("status");
                                    if(flag==1)  
                                    {
                                        PreparedStatement pst2=con.prepareStatement("update seat_list set status=0 where status=1;");
                                        pst2.executeUpdate();    
                                    }    
                                }

                            } 
                            catch (Exception e) 
                            {
                                e.printStackTrace();
                            }
                        }
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Select Card Expiry Date", "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Invalid CVV No.!!! (Must be 3 digits)", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid Card No.!!! (Must be 16 digits)", "ERROR", JOptionPane.ERROR_MESSAGE);
            }  
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_Pay_lblMouseClicked

    private void CloseLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseClicked
        
        
        JOptionPane.showMessageDialog(this, "Payment Cancelled !!!", "Message", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount_lbl;
    private javax.swing.JTextField Cardno_txt;
    private javax.swing.JLabel CloseLbl;
    private javax.swing.JLabel Pay_lbl;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpanel1;
    // End of variables declaration//GEN-END:variables
}
