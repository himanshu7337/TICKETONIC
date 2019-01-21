package hello;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class adminpay extends javax.swing.JFrame {

    String adm;
    
    public adminpay() {
        initComponents();
         add.setVisible(false);
        update.setVisible(false);
        del.setVisible(false);
        search.setVisible(true);
        
        
         
        mysqlconnector msq=new mysqlconnector();
        try {
            DefaultTableModel model=(DefaultTableModel) Table.getModel();
        
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from schedule ");
           
           String date,start,end;
            int sid,mid,tid;
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                sid=rs.getInt("sch_id");
                 mid=rs.getInt("mov_id");
                  tid=rs.getInt("th_id");
                date=rs.getString("date");
                start=rs.getString("start");
                end=rs.getString("end");
                model.addRow(new Object[]{sid,tid,mid,date,start,end});
            }
           
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    

        searchradio.setSelected(true);
         if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search1.setVisible(true);

           mname.setVisible(true);
        tname.setVisible(true);
        mn.setVisible(true);
        jSeparator4.setVisible(true);
        tn.setVisible(true);
        jSeparator5.setVisible(true);
        sid.setVisible(false);
         sch_id.setVisible(false);
         jSeparator1.setVisible(false);
         mid.setVisible(false);
         mov_id.setVisible(false);
         jSeparator3.setVisible(false);
         tid.setVisible(false);
         th_id.setVisible(false);
         jSeparator2.setVisible(false);
         d.setVisible(false);
         date1.setVisible(false);
         date2.setVisible(false);
         shows.setVisible(false);
         s1.setVisible(false);
          s2.setVisible(false);
           s3.setVisible(false);
            s4.setVisible(false);
            jSeparator6.setVisible(false);
            jSeparator7.setVisible(true);
        }
        
    }

    public adminpay(String adm_nm) {
        initComponents();
        
        adm=adm_nm;
        Current_admin.setText(adm);
        
         add.setVisible(false);
        update.setVisible(false);
        del.setVisible(false);
        search.setVisible(true);
        
        
         
        mysqlconnector msq=new mysqlconnector();
        try {
            DefaultTableModel model=(DefaultTableModel) Table.getModel();
        
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from schedule ");
           
           String date,start,end;
            int sid,mid,tid;
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                sid=rs.getInt("sch_id");
                 mid=rs.getInt("mov_id");
                  tid=rs.getInt("th_id");
                date=rs.getString("date");
                start=rs.getString("start");
                end=rs.getString("end");
                model.addRow(new Object[]{sid,tid,mid,date,start,end});
            }
           
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    

        searchradio.setSelected(true);
         if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search1.setVisible(true);

           mname.setVisible(true);
        tname.setVisible(true);
        mn.setVisible(true);
        jSeparator4.setVisible(true);
        tn.setVisible(true);
        jSeparator5.setVisible(true);
        sid.setVisible(false);
         sch_id.setVisible(false);
         jSeparator1.setVisible(false);
         mid.setVisible(false);
         mov_id.setVisible(false);
         jSeparator3.setVisible(false);
         tid.setVisible(false);
         th_id.setVisible(false);
         jSeparator2.setVisible(false);
         d.setVisible(false);
         date1.setVisible(false);
         date2.setVisible(false);
         shows.setVisible(false);
         s1.setVisible(false);
          s2.setVisible(false);
           s3.setVisible(false);
            s4.setVisible(false);
            jSeparator6.setVisible(false);
            jSeparator7.setVisible(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        sid = new javax.swing.JLabel();
        tid = new javax.swing.JLabel();
        mid = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        sch_id = new javax.swing.JTextField();
        th_id = new javax.swing.JTextField();
        mov_id = new javax.swing.JTextField();
        search1 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        shows = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        s4 = new javax.swing.JRadioButton();
        updateradio = new javax.swing.JRadioButton();
        delradio = new javax.swing.JRadioButton();
        searchradio = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        mn = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        tn = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        search2 = new javax.swing.JLabel();
        addradio1 = new javax.swing.JRadioButton();
        date1 = new javax.swing.JRadioButton();
        date2 = new javax.swing.JRadioButton();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        SearchResultTable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Admin_logo = new javax.swing.JLabel();
        Current_admin = new javax.swing.JLabel();
        Logout_Lbl = new javax.swing.JLabel();
        back_lbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table5 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setOpaque(false);
        panel1.setLayout(null);

        sid.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        sid.setForeground(new java.awt.Color(255, 255, 255));
        sid.setText("Schedule ID");
        panel1.add(sid);
        sid.setBounds(50, 210, 160, 25);

        tid.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        tid.setForeground(new java.awt.Color(255, 255, 255));
        tid.setText("Theatre ID");
        panel1.add(tid);
        tid.setBounds(60, 280, 130, 25);

        mid.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        mid.setForeground(new java.awt.Color(255, 255, 255));
        mid.setText("Movie ID");
        panel1.add(mid);
        mid.setBounds(60, 350, 110, 25);

        d.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setText("Dates");
        panel1.add(d);
        d.setBounds(140, 440, 70, 25);

        sch_id.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        sch_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sch_id.setText("Enter Schedule ID");
        sch_id.setToolTipText("");
        sch_id.setAlignmentX(2.0F);
        sch_id.setBorder(null);
        sch_id.setOpaque(false);
        sch_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sch_idMouseClicked(evt);
            }
        });
        sch_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sch_idActionPerformed(evt);
            }
        });
        panel1.add(sch_id);
        sch_id.setBounds(250, 200, 224, 40);

        th_id.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        th_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        th_id.setText("Enter Theatre ID");
        th_id.setBorder(null);
        th_id.setOpaque(false);
        th_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                th_idMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                th_idMouseEntered(evt);
            }
        });
        panel1.add(th_id);
        th_id.setBounds(250, 270, 224, 40);

        mov_id.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        mov_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mov_id.setText("Enter Movie ID");
        mov_id.setBorder(null);
        mov_id.setOpaque(false);
        mov_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mov_idMouseClicked(evt);
            }
        });
        mov_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mov_idActionPerformed(evt);
            }
        });
        panel1.add(mov_id);
        mov_id.setBounds(250, 330, 224, 40);

        search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_button.png"))); // NOI18N
        search1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search1MouseClicked(evt);
            }
        });
        panel1.add(search1);
        search1.setBounds(520, 130, 112, 50);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updatebutton.png"))); // NOI18N
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        panel1.add(update);
        update.setBounds(430, 500, 100, 50);

        shows.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        shows.setForeground(new java.awt.Color(255, 255, 255));
        shows.setText("Shows");
        panel1.add(shows);
        shows.setBounds(520, 350, 80, 25);

        del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_button.png"))); // NOI18N
        del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
        });
        panel1.add(del);
        del.setBounds(580, 500, 100, 50);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_button.png"))); // NOI18N
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        panel1.add(add);
        add.setBounds(280, 500, 110, 50);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jSeparator1);
        jSeparator1.setBounds(250, 240, 240, 10);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jSeparator2);
        jSeparator2.setBounds(250, 310, 240, 10);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jSeparator3);
        jSeparator3.setBounds(250, 370, 240, 10);

        s4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup3.add(s4);
        s4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setOpaque(false);
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        panel1.add(s4);
        s4.setBounds(660, 430, 100, 30);

        updateradio.setBackground(new java.awt.Color(199, 0, 57));
        buttonGroup1.add(updateradio);
        updateradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        updateradio.setForeground(new java.awt.Color(255, 255, 255));
        updateradio.setText("UPDATE");
        updateradio.setOpaque(false);
        updateradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateradioActionPerformed(evt);
            }
        });
        panel1.add(updateradio);
        updateradio.setBounds(430, 30, 90, 23);

        delradio.setBackground(new java.awt.Color(199, 0, 57));
        buttonGroup1.add(delradio);
        delradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        delradio.setForeground(new java.awt.Color(255, 255, 255));
        delradio.setText("DELETE");
        delradio.setOpaque(false);
        delradio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delradioMouseClicked(evt);
            }
        });
        delradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delradioActionPerformed(evt);
            }
        });
        panel1.add(delradio);
        delradio.setBounds(590, 30, 80, 23);

        buttonGroup1.add(searchradio);
        searchradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        searchradio.setForeground(new java.awt.Color(255, 255, 255));
        searchradio.setText("SEARCH");
        searchradio.setOpaque(false);
        searchradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchradioActionPerformed(evt);
            }
        });
        panel1.add(searchradio);
        searchradio.setBounds(120, 30, 93, 23);

        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        panel1.add(jLabel11);
        jLabel11.setBounds(480, 200, 170, 30);

        mn.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        mn.setForeground(new java.awt.Color(255, 255, 255));
        mn.setText("Movie Name");
        panel1.add(mn);
        mn.setBounds(50, 90, 160, 25);

        mname.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mname.setText("Enter Movie Name");
        mname.setToolTipText("");
        mname.setAlignmentX(2.0F);
        mname.setBorder(null);
        mname.setOpaque(false);
        mname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnameMouseClicked(evt);
            }
        });
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        panel1.add(mname);
        mname.setBounds(250, 70, 224, 40);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jSeparator4);
        jSeparator4.setBounds(250, 110, 240, 10);

        tn.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        tn.setForeground(new java.awt.Color(255, 255, 255));
        tn.setText("Theatre Name");
        panel1.add(tn);
        tn.setBounds(50, 150, 180, 25);

        tname.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        tname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tname.setText("Enter Theatre Name");
        tname.setBorder(null);
        tname.setOpaque(false);
        tname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tnameMouseEntered(evt);
            }
        });
        panel1.add(tname);
        tname.setBounds(250, 130, 224, 40);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jSeparator5);
        jSeparator5.setBounds(250, 170, 240, 10);

        Table2.setFont(new java.awt.Font("abeatbyKai", 0, 11)); // NOI18N
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Theatre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table2.setGridColor(new java.awt.Color(255, 255, 255));
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table2);

        panel1.add(jScrollPane3);
        jScrollPane3.setBounds(650, 190, 120, 140);

        Table3.setFont(new java.awt.Font("abeatbyKai", 0, 11)); // NOI18N
        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table3.setGridColor(new java.awt.Color(255, 255, 255));
        Table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Table3);

        panel1.add(jScrollPane4);
        jScrollPane4.setBounds(520, 190, 120, 140);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_button.png"))); // NOI18N
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        panel1.add(search);
        search.setBounds(120, 500, 100, 50);

        search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_button.png"))); // NOI18N
        search2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search2MouseClicked(evt);
            }
        });
        panel1.add(search2);
        search2.setBounds(520, 70, 100, 50);

        addradio1.setBackground(new java.awt.Color(199, 0, 57));
        buttonGroup1.add(addradio1);
        addradio1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        addradio1.setForeground(new java.awt.Color(255, 255, 255));
        addradio1.setText("ADD");
        addradio1.setOpaque(false);
        addradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addradio1ActionPerformed(evt);
            }
        });
        panel1.add(addradio1);
        addradio1.setBounds(290, 30, 70, 23);

        date1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(date1);
        date1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        date1.setOpaque(false);
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });
        panel1.add(date1);
        date1.setBounds(250, 440, 100, 30);

        date2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(date2);
        date2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        date2.setOpaque(false);
        date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date2ActionPerformed(evt);
            }
        });
        panel1.add(date2);
        date2.setBounds(380, 440, 100, 30);

        s1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup3.add(s1);
        s1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s1.setOpaque(false);
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        panel1.add(s1);
        s1.setBounds(530, 390, 100, 30);

        s2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup3.add(s2);
        s2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s2.setOpaque(false);
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        panel1.add(s2);
        s2.setBounds(660, 390, 100, 30);

        s3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup3.add(s3);
        s3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s3.setOpaque(false);
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        panel1.add(s3);
        s3.setBounds(530, 430, 100, 30);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel1.add(jSeparator6);
        jSeparator6.setBounds(500, 350, 10, 130);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jSeparator7);
        jSeparator7.setBounds(510, 340, 224, 10);

        jPanel1.add(panel1);
        panel1.setBounds(10, 160, 810, 580);

        jLabel1.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Page Schedule Management");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 30, 530, 50);

        SearchResultTable.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        SearchResultTable.setForeground(new java.awt.Color(255, 255, 255));
        SearchResultTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchResultTable.setText("Schedule Table");
        jPanel1.add(SearchResultTable);
        SearchResultTable.setBounds(890, 190, 430, 46);

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Result");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(890, 500, 430, 46);

        Admin_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Admin.png"))); // NOI18N
        jPanel1.add(Admin_logo);
        Admin_logo.setBounds(1290, 70, 50, 50);

        Current_admin.setBackground(new java.awt.Color(51, 51, 51));
        Current_admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Current_admin.setForeground(new java.awt.Color(255, 255, 255));
        Current_admin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Current_admin.setMaximumSize(new java.awt.Dimension(200, 30));
        Current_admin.setMinimumSize(new java.awt.Dimension(200, 30));
        Current_admin.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(Current_admin);
        Current_admin.setBounds(1080, 80, 200, 30);

        Logout_Lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Logout_Lbl.setForeground(new java.awt.Color(255, 255, 255));
        Logout_Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutbutton.png"))); // NOI18N
        Logout_Lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout_Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_LblMouseClicked(evt);
            }
        });
        jPanel1.add(Logout_Lbl);
        Logout_Lbl.setBounds(1200, 110, 100, 50);

        back_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_button.png"))); // NOI18N
        back_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_lblMouseClicked(evt);
            }
        });
        jPanel1.add(back_lbl);
        back_lbl.setBounds(60, 50, 160, 100);

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1290, 10, 30, 20);

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1230, 10, 30, 20);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Theatre ID", "Movie ID", "Date", "Start Time", "End Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(840, 230, 510, 240);

        Table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Theatre ID", "Movie ID", "Date", "Start TIme", "end"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table5.setGridColor(new java.awt.Color(255, 255, 255));
        Table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Table5);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(840, 540, 510, 170);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1376, 387, 0, 0);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(633, 433, 0, 0);

        backgroundImage.setBackground(new java.awt.Color(255, 255, 255));
        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin backgroundlarge1.png"))); // NOI18N
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(0, -40, 1390, 850);

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
        jPanel1.add(Close);
        Close.setBounds(1290, 10, 45, 25);

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
        jPanel1.add(Minimize);
        Minimize.setBounds(1220, 10, 43, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1386, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     void showtabledata()
    {
     
        mysqlconnector msq=new mysqlconnector();
        try {
            DefaultTableModel model=(DefaultTableModel) Table.getModel();
        
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from schedule ");
           
           String date,start,end;
            int sid,mid,tid;
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                sid=rs.getInt("sch_id");
                 mid=rs.getInt("mov_id");
                  tid=rs.getInt("th_id");
                date=rs.getString("date");
                start=rs.getString("start");
                end=rs.getString("end");
                model.addRow(new Object[]{sid,tid,mid,date,start,end});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) Table.getModel();
        sch_id.setText(model.getValueAt(Table.getSelectedRow(), 0).toString());
        th_id.setText(model.getValueAt(Table.getSelectedRow(), 1).toString());
        mov_id.setText(model.getValueAt(Table.getSelectedRow(), 2).toString());
        
        //jTextField5.setText(model.getValueAt(Table.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_TableMouseClicked

    private void sch_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sch_idMouseClicked
        // TODO add your handling code here:

        sch_id.setText("");

    }//GEN-LAST:event_sch_idMouseClicked

    private void sch_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sch_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sch_idActionPerformed

    private void th_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_th_idMouseClicked
        // TODO add your handling code here:
        th_id.setText("");
    }//GEN-LAST:event_th_idMouseClicked

    private void th_idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_th_idMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_th_idMouseEntered

    private void mov_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov_idMouseClicked
        // TODO add your handling code here:
        mov_id.setText("");
    }//GEN-LAST:event_mov_idMouseClicked

    private void mov_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mov_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mov_idActionPerformed

    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked
       
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            String m_search;
            m_search=tname.getText();
            
            if(!m_search.equals("") && !m_search.equals("Enter Theatre Name"))
            {
                PreparedStatement pst=con.prepareStatement("select th_name from theatre where th_name like '"+m_search+"%';");
                //pst.setString(1, mov_id);
                DefaultTableModel model=(DefaultTableModel) Table2.getModel();
                model.setRowCount(0);
                String m;

                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {

                    m=rs.getString("th_name");

                    model.addRow(new Object[]{m});
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Enter Theatre Name !!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            
            /* while (rs.next())
            {

                mname.setText(rs.getString(1));
                descr.setText(rs.getString(2));
                rating.setText(rs.getString(3));
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //jLabel6.setText("");
        //DefaultTableModel model=(DefaultTableModel) Table1.getModel();
        //model.setRowCount(0);
        //if(!mid.getText().trim().equals("")){
            //  model.addRow(new Object[]{mid.getText(),mname.getText(),descr.getText(),rating.getText()});
            //}else{
            //   jLabel6.setText("Movie id shold not be left blank");
            //}
    }//GEN-LAST:event_search1MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
       
        mysqlconnector msq=new mysqlconnector();
        try {

            String sch=sch_id.getText();
            String th_name=tname.getText();
            String mov_name=mname.getText();
            String mmid=mov_id.getText();
            String ttid=th_id.getText();
            String da="",s="",e="";
            
            if(ttid.equals("") && mmid.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Select a schedule from the search result", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                    
                if(date1.isSelected()==true)
                    da=date1.getText();
                if(date2.isSelected()==true)
                    da=date2.getText();

                if(s1.isSelected()==true)
                {
                    s=s1.getText();
                    e="10:00:00";
                }
                if(s2.isSelected()==true)
                {
                    s=s2.getText();
                    e="14:00:00";
                }
                if(s3.isSelected()==true)
                {
                    s=s3.getText();
                    e="18:00:00";
                }
                Connection con=msq.getConnection();

                PreparedStatement p=con.prepareStatement("select sch_id from schedule where date='"+da+"' and th_id="+ttid+" and start='"+s+"';");
                ResultSet r = p.executeQuery();

                if((r.next())&& !( sch.equals(r.getString("sch_id"))))
                {
                    //if(mov_id.equals(r.getString("mov_id")));
                    JOptionPane.showMessageDialog(this, "Schedule is already Present in that theatre", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else
                {


                PreparedStatement pst=con.prepareStatement("select mov_id from movie where mov_name='"+mov_name+"';");
                ResultSet r1 = pst.executeQuery();  
                r1.next();
                int m=r1.getInt("mov_id");
                    PreparedStatement pst1=con.prepareStatement("Update schedule set date=?,start=?,mov_id=?,end=? where sch_id=?");
                    pst1.setString(1,da);
                    pst1.setString(2, s);
                   pst1.setInt(3, m);
                   pst1.setString(5,sch);
                    pst1.setString(4,e);

                    if(pst1.executeUpdate()==1)
                    {
                        JOptionPane.showMessageDialog(this, "UPDATED", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        DefaultTableModel model=(DefaultTableModel) Table.getModel();
                        model.setRowCount(0);
                        //model.setRowCount(0);
                        showtabledata();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "FAILED", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
        }

        /*   jLabel6.setText("");
        DefaultTableModel model=(DefaultTableModel) Table1.getModel();
        if(Table1.getSelectedRow()==-1){
            if(Table1.getRowCount()==0){
                jLabel6.setText("Table is empty");
            }else{
                jLabel6.setText("You must select a movie");
            }
        }else{
            model.setValueAt(mid.getText(), Table1.getSelectedRow(),0);
            model.setValueAt(mname.getText(), Table1.getSelectedRow(), 1);
            model.setValueAt(descr.getText(), Table1.getSelectedRow(), 2);
            model.setValueAt(rating.getText(), Table1.getSelectedRow(), 3);
        }

        */
    }//GEN-LAST:event_updateMouseClicked

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked

        mysqlconnector msq=new mysqlconnector();
        try {

            String sch=sch_id.getText();
            String m_name=tname.getText();
            String t_name=mname.getText();
            String mi=mov_id.getText();
            String ti=th_id.getText();

            Connection con=msq.getConnection();
                /* PreparedStatement pst=con.prepareStatement("select mov_id from movie where mov_name='"+m_name+"';");
                ResultSet r = pst.executeQuery();
                r.next();
                String m=r.getString("mov_id");
                mn.setText(m);
                
                PreparedStatement ps=con.prepareStatement("select th_id from theatre where th_name='"+t_name+"';");
                ResultSet r2 = ps.executeQuery();
                r2.next();
                String t=r2.getString("th_id");
                tn.setText(m);*/
            PreparedStatement p=con.prepareStatement("delete from schedule where sch_id="+sch+" ;");
            //ResultSet r6 = p.executeQuery();
            if(p.executeUpdate()==1 )
            {
                JOptionPane.showMessageDialog(this, "DELETED", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model=(DefaultTableModel) Table.getModel();
                model.setRowCount(0);
                showtabledata();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "FAILED", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            //printStackTrace(e);
        }

    }//GEN-LAST:event_delMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        //jLabel6.setText("");
        DefaultTableModel model=(DefaultTableModel) Table.getModel();

        mysqlconnector msq=new mysqlconnector();
        
        
        try {
            String sch=sch_id.getText();
            String mov_name=mname.getText();
            String th_name=tname.getText();
            //String rating=this.start.getText();

            if(sch.equals("") || mov_name.equals("") || th_name.equals("") || sch.equals("Enter Schedule ID") || mov_name.equals("Enter Movie Name") || th_name.equals("Enter Theatre Name") || ((s1.isSelected()==false)&&(s2.isSelected()==false)&&(s3.isSelected()==false)) || ((date1.isSelected()==false)&&(date2.isSelected()==false)))
            {
                JOptionPane.showMessageDialog(this, "Please fill all the details", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                if(sch.length()!=3)
                {
                    JOptionPane.showMessageDialog(this, "Schedule ID should be of 3 digits", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    String s="",da="",e="";
                    if((date1.isSelected()==true))
                        da=date1.getText();
                    if((date2.isSelected()==true))
                        da=date2.getText();
                    if((s1.isSelected()==true))
                   {
                    s=s1.getText();
                    e="10:00:00";
                    }

                    if((s2.isSelected()==true))
                     {
                    s=s2.getText();
                    e="10:00:00";
                    }
                    if((s3.isSelected()==true))
                    {
                    s=s3.getText();
                    e="10:00:00";
                    }
                    Connection con=msq.getConnection();
                    PreparedStatement p=con.prepareStatement("select mov_id from movie where mov_name='"+mov_name+"';");
                    ResultSet r = p.executeQuery();
                    r.next();
                    String m=r.getString("mov_id");
                    //mn.setText(m);

                    PreparedStatement ps=con.prepareStatement("select th_id from theatre where th_name='"+th_name+"';");
                    ResultSet r2 = ps.executeQuery();
                    r2.next();
                    String t=r2.getString("th_id");
                    //tn.setText(t);

                    PreparedStatement pstt=con.prepareStatement("select * from schedule where th_id="+t+" and mov_id="+m+" and date='"+da+"' and start='"+s+"';");
                    ResultSet r4 = pstt.executeQuery();
                   // r2.next();
                    if(r4.next())
                    {
                        JOptionPane.showMessageDialog(this, "Schedule already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                         PreparedStatement pst4=con.prepareStatement("select sch_id from schedule where sch_id="+sch+";");
                    ResultSet r5 = pst4.executeQuery();
                        if(r5.next()){
                             JOptionPane.showMessageDialog(this, "Schedule ID already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                             sch_id.setText("");
                        }
                            else{
                            //Connection con=msq.getConnection();
                            PreparedStatement pst1=con.prepareStatement("insert into schedule values(?,?,?,?,?,?);");
                            pst1.setString(1,sch);
                            pst1.setString(2,t);
                            pst1.setString(3,m);
                            pst1.setString(4,da);
                            pst1.setString(5,s);
                            pst1.setString(6,e);
                            //pst1.setString(4, rating);

                            if(pst1.executeUpdate()==1)
                            {
                                //model.addRow(new Object[]{mov_id,mov_name,descr,rating});
                                JOptionPane.showMessageDialog(this, "INSERTED", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                model.setRowCount(0);
                                showtabledata();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "FAILED", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_addMouseClicked

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
        if(s4.isSelected()==true)
        {
            s4.setSelected(true);
            del.setVisible(false);
            add.setVisible(true);
            update.setVisible(false);
            search1.setVisible(false);

            jSeparator1.setVisible(true);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(true);
            jSeparator4.setVisible(true);

            sch_id.setVisible(true);
            th_id.setVisible(true);
            mov_id.setVisible(true);
            

            sid.setVisible(true);
            tid.setVisible(true);
            mid.setVisible(true);
            d.setVisible(true);
        }
        sch_id.setText("");
        th_id.setText("");
        mov_id.setText("");
        
    }//GEN-LAST:event_s4ActionPerformed

    private void updateradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateradioActionPerformed
        // TODO add your handling code here:
        
        
        if(updateradio.isSelected()==true)
        {
           del.setVisible(false);
            add.setVisible(false);
            update.setVisible(true);
            search1.setVisible(true);
search.setVisible(true);
           mname.setVisible(true);
        tname.setVisible(true);
        mn.setVisible(true);
        jSeparator4.setVisible(true);
        tn.setVisible(true);
        jSeparator5.setVisible(true);
        sid.setVisible(false);
         sch_id.setVisible(false);
         jSeparator1.setVisible(false);
         mid.setVisible(true);
         mov_id.setVisible(true);
         jSeparator3.setVisible(true);
         tid.setVisible(true);
         th_id.setVisible(true);
         jSeparator2.setVisible(true);
         d.setVisible(false);
         date1.setVisible(false);
         date2.setVisible(false);
         shows.setVisible(false);
         s1.setVisible(false);
          s2.setVisible(false);
           s3.setVisible(false);
            s4.setVisible(false);
            jSeparator6.setVisible(true);
        }
        sch_id.setText("");
        th_id.setText("");
        mov_id.setText("");
        
    }//GEN-LAST:event_updateradioActionPerformed

    private void delradioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delradioMouseClicked
        // TODO add your handling code here:
        add.setVisible(false);
        update.setVisible(false);
        del.setVisible(true);
        search1.setVisible(true);
    }//GEN-LAST:event_delradioMouseClicked

    private void delradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delradioActionPerformed
        // TODO add your handling code here:
       if(delradio.isSelected()==true)
        {
            delradio.setSelected(true);
            del.setVisible(true);
            add.setVisible(false);
            update.setVisible(false);
            search1.setVisible(true);

           mname.setVisible(true);
        tname.setVisible(true);
        mn.setVisible(true);
        jSeparator4.setVisible(true);
        tn.setVisible(true);
        jSeparator5.setVisible(true);
        sid.setVisible(false);
         sch_id.setVisible(false);
         jSeparator1.setVisible(false);
         mid.setVisible(false);
         mov_id.setVisible(false);
         jSeparator3.setVisible(false);
         tid.setVisible(false);
         th_id.setVisible(false);
         jSeparator2.setVisible(false);
        }
    }//GEN-LAST:event_delradioActionPerformed

    private void searchradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchradioActionPerformed
        // TODO add your handling code here:
        if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search1.setVisible(true);
            search.setVisible(true);

           mname.setVisible(true);
        tname.setVisible(true);
        mn.setVisible(true);
        jSeparator4.setVisible(true);
        tn.setVisible(true);
        jSeparator5.setVisible(true);
        sid.setVisible(false);
         sch_id.setVisible(false);
         jSeparator1.setVisible(false);
         mid.setVisible(false);
         mov_id.setVisible(false);
         jSeparator3.setVisible(false);
         tid.setVisible(false);
         th_id.setVisible(false);
         jSeparator2.setVisible(false);
         d.setVisible(false);
         date1.setVisible(false);
         date2.setVisible(false);
         shows.setVisible(false);
         s1.setVisible(false);
          s2.setVisible(false);
           s3.setVisible(false);
            s4.setVisible(false);
        }
    }//GEN-LAST:event_searchradioActionPerformed
        
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
            
                JOptionPane.showMessageDialog(this, "Something Went Wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_CloseActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(adminhome.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void back_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_lblMouseClicked
        // TODO add your handling code here:
        new adminhome(adm).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_lblMouseClicked

    private void mnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnameMouseClicked
        // TODO add your handling code here:
        mname.setText("");
    }//GEN-LAST:event_mnameMouseClicked

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void tnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tnameMouseClicked
        // TODO add your handling code here:
        tname.setText("");
    }//GEN-LAST:event_tnameMouseClicked

    private void tnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tnameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameMouseEntered

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) Table2.getModel();
        tname.setText(model.getValueAt(Table2.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_Table2MouseClicked

    private void Table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table3MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel) Table3.getModel();
        mname.setText(model.getValueAt(Table3.getSelectedRow(), 0).toString());
       // th_id.setText(model.getValueAt(Table.getSelectedRow(), 1).toString());
       // mov_id.setText(model.getValueAt(Table.getSelectedRow(), 2).toString());
        
    }//GEN-LAST:event_Table3MouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        d.setVisible(false);
         date1.setVisible(false);
         date2.setVisible(false);
         shows.setVisible(false);
         s1.setVisible(false);
          s2.setVisible(false);
           s3.setVisible(false);
            s4.setVisible(false);
            jSeparator6.setVisible(false);
            jSeparator7.setVisible(true);
           
         
        mysqlconnector msq=new mysqlconnector();
        try {
            
            Connection con=msq.getConnection();
            String m_search,t_name,m_name;
            t_name=tname.getText();
            m_name=mname.getText();
            
            if(!t_name.equals("") && !t_name.equals("Enter Theatre Name") && !m_name.equals("") && !m_name.equals("Enter Movie Name"))
            {

                 int mid,tid;
                 
                 PreparedStatement pst1=con.prepareStatement("select mov_id from movie where mov_name='"+m_name+"';");
                 ResultSet rs1=pst1.executeQuery();
                 rs1.next();
                 mid=rs1.getInt("mov_id");
                 PreparedStatement pst2=con.prepareStatement("select th_id from theatre where th_name='"+t_name+"';");
                 ResultSet rs2=pst2.executeQuery();
                 rs2.next();
                 tid=rs2.getInt("th_id");


                PreparedStatement pst=con.prepareStatement("select * from schedule where th_id="+tid+" and mov_id="+mid+";");
                //pst.setString(1, mov_id);
                DefaultTableModel model=(DefaultTableModel) Table5.getModel();
                model.setRowCount(0);
                String date,start,end;
                int sid;
                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {
                    sid=rs.getInt("sch_id");
                     mid=rs.getInt("mov_id");
                      tid=rs.getInt("th_id");
                    date=rs.getString("date");
                    start=rs.getString("start");
                    end=rs.getString("end");
                    model.addRow(new Object[]{sid,tid,mid,date,start,end});
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Enter Theatre and Movie Names Then Search !!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            /* while (rs.next())
            {

                mname.setText(rs.getString(1));
                descr.setText(rs.getString(2));
                rating.setText(rs.getString(3));
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

          
    }//GEN-LAST:event_searchMouseClicked

    private void search2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseClicked
 
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            String m_search;
            m_search=mname.getText();
            
            if(!m_search.equals("") && !m_search.equals("Enter Movie Name"))
            {
                PreparedStatement pst=con.prepareStatement("select mov_name from movie where mov_name like '"+m_search+"%';");

                DefaultTableModel model=(DefaultTableModel) Table3.getModel();
                model.setRowCount(0);
                String m;

                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {

                    m=rs.getString("mov_name");

                    model.addRow(new Object[]{m});
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Enter Movie Name !!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
        
        
    }//GEN-LAST:event_search2MouseClicked

    private void addradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addradio1ActionPerformed
        // TODO add your handling code here:
        if(addradio1.isSelected()==true)
        {
            addradio1.setSelected(true);
           del.setVisible(false);
        add.setVisible(true);
        update.setVisible(false);
        search.setVisible(false);

           mname.setVisible(true);
        tname.setVisible(true);
        mn.setVisible(true);
        jSeparator4.setVisible(true);
        tn.setVisible(true);
        jSeparator5.setVisible(true);
        sid.setVisible(true);
         sch_id.setVisible(true);
         jSeparator1.setVisible(true);
         mid.setVisible(false);
         mov_id.setVisible(false);
         jSeparator3.setVisible(false);
         tid.setVisible(false);
         th_id.setVisible(false);
         jSeparator2.setVisible(false);
         d.setVisible(true);
         date1.setVisible(true);
         date2.setVisible(true);
         shows.setVisible(true);
         s1.setVisible(true);
          s2.setVisible(true);
           s3.setVisible(true);
            s4.setVisible(false);
            jSeparator6.setVisible(true);
            jSeparator7.setVisible(true);
        }
        
         mysqlconnector msq=new mysqlconnector();
        try {
            
           Connection con=msq.getConnection();
          Statement st5=con.createStatement();
                ResultSet r5;
                
            String ch,moo,query;
            //moo=mname.getText();
             query="select distinct date from schedule order by date asc;";
                r5=st5.executeQuery(query);
                 if(r5.next()){
                     d.setVisible(true);
                      shows.setVisible(true);
                    s1.setText("07:00");
                    s2.setText("11:00");
                    s3.setText("15:00");
                    s1.setVisible(true);
                    s2.setVisible(true);
                    s3.setVisible(true);
               
                     d.setText("Dates");
                     
                      ch=r5.getString("date");
                date1.setText(ch);
                    date1.setVisible(true);
                     date1.setOpaque(true);
                    
                    
                 }
                if(r5.next()){
                     ch=r5.getString("date");
                     date2.setText(ch);
                date2.setVisible(true);
                date2.setOpaque(true);
                //date2.setBackground(java.awt.Color.white);
                }
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_addradio1ActionPerformed
    
    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date1ActionPerformed

    private void date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date2ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void Table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table5MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel) Table5.getModel();
        sch_id.setText(model.getValueAt(Table5.getSelectedRow(), 0).toString());
        th_id.setText(model.getValueAt(Table5.getSelectedRow(), 1).toString());
        mov_id.setText(model.getValueAt(Table5.getSelectedRow(), 2).toString());
        //da.concat(model.getValueAt(Table1.getSelectedRow(), 3).toString());
        //da.concat(model.getValueAt(Table1.getSelectedRow(), 4).toString());
        //if(da.equals(date1.getText()))
                //   date1.setSelected(true);
                //if(da.equals(date2.getText()))
                 //  date2.setSelected(true);
        if(updateradio.isSelected()==true)
        {
            
         mysqlconnector msq=new mysqlconnector();
        try {
            
           Connection con=msq.getConnection();
          Statement st5=con.createStatement();
                ResultSet r5;
                
            String ch,moo,query;
            moo=mname.getText();
             query="select distinct date from schedule order by date asc;";
                r5=st5.executeQuery(query);
                 if(r5.next()){
                     d.setVisible(true);
                    
                     d.setText("Dates");
                     
                      ch=r5.getString("date");
                date1.setText(ch);
                    date1.setVisible(true);
                     date1.setOpaque(true);
                    
                    
                 }
                if(r5.next()){
                     ch=r5.getString("date");
                     date2.setText(ch);
                date2.setVisible(true);
                date2.setOpaque(true);
                //date2.setBackground(java.awt.Color.white);
                }
                
                
                  String sch,s,da;
                  
                   sch=sch_id.getText();
                query="select * from schedule where sch_id="+sch+";";
                r5=st5.executeQuery(query);
                   if( r5.next())
                   {
 
                da=r5.getString("date");
                  if(da.equals(date1.getText()))
                   date1.setSelected(true);
                if(da.equals(date2.getText()))
                   date2.setSelected(true);
                   
                   shows.setVisible(true);
                   
                   
                   }
                   
                   
                   
                   sch=sch_id.getText();
                query="select * from schedule where sch_id="+sch+";";
                r5=st5.executeQuery(query);
                   if( r5.next())
                   {
                    shows.setVisible(true);
                    s1.setText("07:00");
                    s2.setText("11:00");
                    s3.setText("15:00");
                    s1.setVisible(true);
                    s2.setVisible(true);
                    s3.setVisible(true);
                da=r5.getString("start");
                  if(da.equals(s1.getText()+":00")) 
                   s1.setSelected(true);
                    
               
                  if(da.equals(s2.getText()+":00")) 
                  s2.setSelected(true);
                  
                  if(da.equals(s3.getText()+":00")) 
                  s3.setSelected(true);
                
                   
                  
                   }
                   
                   
        
                
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         
        }
        
        
          if(delradio.isSelected()==true)
        {
             sid.setVisible(true);
         sch_id.setVisible(true);
         jSeparator1.setVisible(true);
         mid.setVisible(true);
         mov_id.setVisible(true);
         jSeparator3.setVisible(true);
         tid.setVisible(true);
         th_id.setVisible(true);
         jSeparator2.setVisible(true);
         mysqlconnector msq=new mysqlconnector();
        try {
            
           Connection con=msq.getConnection();
          Statement st5=con.createStatement();
                ResultSet r5;
                
            String ch,moo,query;
            moo=mname.getText();
             query="select distinct date from schedule order by date asc;";
                r5=st5.executeQuery(query);
                 if(r5.next()){
                     d.setVisible(true);
                    
                     d.setText("Dates");
                     
                      ch=r5.getString("date");
                date1.setText(ch);
                    date1.setVisible(true);
                     date1.setOpaque(true);
                    
                    
                 }
                if(r5.next()){
                     ch=r5.getString("date");
                     date2.setText(ch);
                date2.setVisible(true);
                date2.setOpaque(true);
                //date2.setBackground(java.awt.Color.white);
                }
                
                
                  String sch,s,da;
                  
                   sch=sch_id.getText();
                query="select * from schedule where sch_id="+sch+";";
                r5=st5.executeQuery(query);
                   if( r5.next())
                   {
 
                da=r5.getString("date");
                  if(da.equals(date1.getText()))
                   date1.setSelected(true);
                if(da.equals(date2.getText()))
                   date2.setSelected(true);
                   
                   shows.setVisible(true);
                   
                   
                   }
                   
                   
                   
                   sch=sch_id.getText();
                query="select * from schedule where sch_id="+sch+";";
                r5=st5.executeQuery(query);
                   if( r5.next())
                   {
                    shows.setVisible(true);
                    s1.setText("07:00");
                    s2.setText("11:00");
                    s3.setText("15:00");
                    s1.setVisible(true);
                    s2.setVisible(true);
                    s3.setVisible(true);
                da=r5.getString("start");
                  if(da.equals(s1.getText()+":00")) 
                   s1.setSelected(true);
                    
               
                  if(da.equals(s2.getText()+":00")) 
                  s2.setSelected(true);
                  
                  if(da.equals(s3.getText()+":00")) 
                  s3.setSelected(true);
                
                   
                  
                   }
                   
                   
        
                
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_Table5MouseClicked

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
            JOptionPane.showMessageDialog(this, "Something Went Wrong...", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(adminpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin_logo;
    private javax.swing.JButton Close;
    private javax.swing.JLabel Current_admin;
    private javax.swing.JLabel Logout_Lbl;
    private javax.swing.JButton Minimize;
    private javax.swing.JLabel SearchResultTable;
    private javax.swing.JTable Table;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table3;
    private javax.swing.JTable Table5;
    private javax.swing.JLabel add;
    private javax.swing.JRadioButton addradio1;
    private javax.swing.JLabel back_lbl;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel d;
    private javax.swing.JRadioButton date1;
    private javax.swing.JRadioButton date2;
    private javax.swing.JLabel del;
    private javax.swing.JRadioButton delradio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel mid;
    private javax.swing.JLabel mn;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mov_id;
    private javax.swing.JPanel panel1;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    private javax.swing.JTextField sch_id;
    private javax.swing.JLabel search;
    private javax.swing.JLabel search1;
    private javax.swing.JLabel search2;
    private javax.swing.JRadioButton searchradio;
    private javax.swing.JLabel shows;
    private javax.swing.JLabel sid;
    private javax.swing.JTextField th_id;
    private javax.swing.JLabel tid;
    private javax.swing.JLabel tn;
    private javax.swing.JTextField tname;
    private javax.swing.JLabel update;
    private javax.swing.JRadioButton updateradio;
    // End of variables declaration//GEN-END:variables
}
