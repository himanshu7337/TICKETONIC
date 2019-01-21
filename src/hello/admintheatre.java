package hello;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class admintheatre extends javax.swing.JFrame {

    String adm;
    
    public admintheatre() {
        initComponents();
        
        
            add.setVisible(false);
            search.setVisible(true);
            update.setVisible(false);
            
            searchradio.setSelected(true);
        
        if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search.setVisible(true);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(false);
            

            th_id.setVisible(false);
            th_name.setVisible(true);
            area.setVisible(false);
            

            tid.setVisible(false);
            tname.setVisible(true);
            a.setVisible(false);
            
        }
        
            
            
             String n,d;
        int m;
        mysqlconnector msq=new mysqlconnector();
        try {
            DefaultTableModel model=(DefaultTableModel) Table.getModel();
        
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from theatre ");
           
           
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                m=rs.getInt("th_id");
                n=rs.getString("th_name");
                d=rs.getString("area");
                 //r=rs.getInt("rating");
               model.addRow(new Object[]{m,n,d});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public admintheatre(String adm_nm) {
        initComponents();
        
        adm=adm_nm;
        Current_admin.setText(adm);
        
            add.setVisible(false);
            search.setVisible(true);
            update.setVisible(false);
            
            searchradio.setSelected(true);
        
        if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search.setVisible(true);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(false);
            

            th_id.setVisible(false);
            th_name.setVisible(true);
            area.setVisible(false);
            

            tid.setVisible(false);
            tname.setVisible(true);
            a.setVisible(false);
            
        }
        
            
            
             String n,d;
        int m;
        mysqlconnector msq=new mysqlconnector();
        try {
            DefaultTableModel model=(DefaultTableModel) Table.getModel();
        
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from theatre ");
           
           
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                m=rs.getInt("th_id");
                n=rs.getString("th_name");
                d=rs.getString("area");
                 //r=rs.getInt("rating");
               model.addRow(new Object[]{m,n,d});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        back_lbl = new javax.swing.JLabel();
        Admin_logo = new javax.swing.JLabel();
        Current_admin = new javax.swing.JLabel();
        Logout_Lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        tname = new javax.swing.JLabel();
        tid = new javax.swing.JLabel();
        th_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        th_name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        area = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        searchradio = new javax.swing.JRadioButton();
        addradio = new javax.swing.JRadioButton();
        updateradio = new javax.swing.JRadioButton();
        delradio = new javax.swing.JRadioButton();
        SearchResultTable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        descr = new javax.swing.JTextField();
        rating = new javax.swing.JTextField();
        search1 = new javax.swing.JLabel();
        update1 = new javax.swing.JLabel();
        del1 = new javax.swing.JLabel();
        add1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        addradio1 = new javax.swing.JRadioButton();
        updateradio1 = new javax.swing.JRadioButton();
        delradio1 = new javax.swing.JRadioButton();
        searchradio1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1230, 10, 30, 20);

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1290, 10, 30, 20);

        back_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_button.png"))); // NOI18N
        back_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_lblMouseClicked(evt);
            }
        });
        jPanel1.add(back_lbl);
        back_lbl.setBounds(60, 50, 160, 100);

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
        Logout_Lbl.setBounds(1200, 110, 110, 50);

        jLabel1.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Page Theatre Management");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 30, 530, 50);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_button.png"))); // NOI18N
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(170, 580, 100, 50);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_button.png"))); // NOI18N
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(320, 580, 100, 50);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updatebutton.png"))); // NOI18N
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(470, 580, 100, 50);

        del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_button.png"))); // NOI18N
        del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
        });
        jPanel1.add(del);
        del.setBounds(610, 580, 100, 50);

        a.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Area");
        jPanel1.add(a);
        a.setBounds(220, 460, 130, 32);

        tname.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        tname.setForeground(new java.awt.Color(255, 255, 255));
        tname.setText("Theatre Name");
        jPanel1.add(tname);
        tname.setBounds(220, 390, 180, 32);

        tid.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        tid.setForeground(new java.awt.Color(255, 255, 255));
        tid.setText("Theatre ID");
        jPanel1.add(tid);
        tid.setBounds(220, 320, 150, 32);

        th_id.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        th_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        th_id.setText("Enter Theatre ID");
        th_id.setToolTipText("");
        th_id.setAlignmentX(2.0F);
        th_id.setBorder(null);
        th_id.setMaximumSize(new java.awt.Dimension(230, 30));
        th_id.setMinimumSize(new java.awt.Dimension(230, 30));
        th_id.setOpaque(false);
        th_id.setPreferredSize(new java.awt.Dimension(230, 30));
        th_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                th_idMouseClicked(evt);
            }
        });
        th_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th_idActionPerformed(evt);
            }
        });
        jPanel1.add(th_id);
        th_id.setBounds(440, 320, 230, 30);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(240, 10));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(440, 350, 240, 10);

        th_name.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        th_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        th_name.setText("Enter Theatre Name");
        th_name.setBorder(null);
        th_name.setMaximumSize(new java.awt.Dimension(230, 30));
        th_name.setMinimumSize(new java.awt.Dimension(230, 30));
        th_name.setOpaque(false);
        th_name.setPreferredSize(new java.awt.Dimension(230, 30));
        th_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                th_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                th_nameMouseEntered(evt);
            }
        });
        jPanel1.add(th_name);
        th_name.setBounds(440, 380, 230, 30);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(240, 10));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(440, 410, 240, 10);

        area.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        area.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        area.setText("Enter Area");
        area.setBorder(null);
        area.setMaximumSize(new java.awt.Dimension(230, 30));
        area.setMinimumSize(new java.awt.Dimension(230, 30));
        area.setOpaque(false);
        area.setPreferredSize(new java.awt.Dimension(230, 30));
        area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaMouseClicked(evt);
            }
        });
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        jPanel1.add(area);
        area.setBounds(440, 450, 230, 30);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(240, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(240, 10));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(440, 480, 240, 10);

        buttonGroup2.add(searchradio);
        searchradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        searchradio.setForeground(new java.awt.Color(255, 255, 255));
        searchradio.setText("SEARCH");
        searchradio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchradio.setOpaque(false);
        searchradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchradioActionPerformed(evt);
            }
        });
        jPanel1.add(searchradio);
        searchradio.setBounds(170, 220, 93, 29);

        addradio.setBackground(new java.awt.Color(199, 0, 57));
        buttonGroup2.add(addradio);
        addradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        addradio.setForeground(new java.awt.Color(255, 255, 255));
        addradio.setText("ADD");
        addradio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addradio.setOpaque(false);
        addradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addradioActionPerformed(evt);
            }
        });
        jPanel1.add(addradio);
        addradio.setBounds(340, 220, 70, 29);

        updateradio.setBackground(new java.awt.Color(199, 0, 57));
        buttonGroup2.add(updateradio);
        updateradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        updateradio.setForeground(new java.awt.Color(255, 255, 255));
        updateradio.setText("UPDATE");
        updateradio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateradio.setOpaque(false);
        updateradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateradioActionPerformed(evt);
            }
        });
        jPanel1.add(updateradio);
        updateradio.setBounds(480, 220, 90, 29);

        delradio.setBackground(new java.awt.Color(199, 0, 57));
        buttonGroup2.add(delradio);
        delradio.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        delradio.setForeground(new java.awt.Color(255, 255, 255));
        delradio.setText("DELETE");
        delradio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(delradio);
        delradio.setBounds(630, 220, 80, 29);

        SearchResultTable.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        SearchResultTable.setForeground(new java.awt.Color(255, 255, 255));
        SearchResultTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchResultTable.setText("Theatre Table");
        jPanel1.add(SearchResultTable);
        SearchResultTable.setBounds(890, 170, 430, 46);

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Result");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(890, 460, 430, 46);

        Table1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Theatre ID", "Theatre Name", "Area"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table1.setGridColor(new java.awt.Color(255, 255, 255));
        Table1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Table1.getTableHeader().setResizingAllowed(false);
        Table1.getTableHeader().setReorderingAllowed(false);
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(890, 500, 430, 130);

        Table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Theatre ID", "Theatre Name", "Area"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Table.getTableHeader().setResizingAllowed(false);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(890, 210, 430, 170);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(468, 433, 0, 0);

        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin backgroundlarge1.png"))); // NOI18N
        backgroundImage.setText("jLabel5");
        backgroundImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(0, -20, 1380, 810);

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

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie ID");

        jLabel4.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Movie Name");

        jLabel5.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description");

        jLabel9.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rating");

        mid.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mid.setText("Enter Movie ID");
        mid.setToolTipText("");
        mid.setAlignmentX(2.0F);
        mid.setBorder(null);
        mid.setMaximumSize(new java.awt.Dimension(230, 30));
        mid.setMinimumSize(new java.awt.Dimension(230, 30));
        mid.setOpaque(false);
        mid.setPreferredSize(new java.awt.Dimension(230, 30));
        mid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                midMouseClicked(evt);
            }
        });
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });

        mname.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mname.setText("Enter Movie Name");
        mname.setBorder(null);
        mname.setMaximumSize(new java.awt.Dimension(230, 30));
        mname.setMinimumSize(new java.awt.Dimension(230, 30));
        mname.setOpaque(false);
        mname.setPreferredSize(new java.awt.Dimension(230, 30));
        mname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnameMouseEntered(evt);
            }
        });

        descr.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        descr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descr.setText("Enter Description");
        descr.setBorder(null);
        descr.setMaximumSize(new java.awt.Dimension(230, 30));
        descr.setMinimumSize(new java.awt.Dimension(230, 30));
        descr.setOpaque(false);
        descr.setPreferredSize(new java.awt.Dimension(230, 30));
        descr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descrMouseClicked(evt);
            }
        });
        descr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descrActionPerformed(evt);
            }
        });

        rating.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N
        rating.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rating.setText("Enter Rating");
        rating.setBorder(null);
        rating.setMaximumSize(new java.awt.Dimension(230, 30));
        rating.setMinimumSize(new java.awt.Dimension(230, 30));
        rating.setOpaque(false);
        rating.setPreferredSize(new java.awt.Dimension(230, 30));
        rating.setVerifyInputWhenFocusTarget(false);
        rating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratingMouseClicked(evt);
            }
        });
        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });

        search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_button.png"))); // NOI18N
        search1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search1MouseClicked(evt);
            }
        });

        update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update_button.png"))); // NOI18N
        update1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
        });

        del1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_button.png"))); // NOI18N
        del1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        del1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                del1MouseClicked(evt);
            }
        });

        add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_button.png"))); // NOI18N
        add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator4.setMinimumSize(new java.awt.Dimension(240, 10));
        jSeparator4.setPreferredSize(new java.awt.Dimension(240, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator5.setMinimumSize(new java.awt.Dimension(240, 10));
        jSeparator5.setPreferredSize(new java.awt.Dimension(240, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator6.setMinimumSize(new java.awt.Dimension(240, 10));
        jSeparator6.setPreferredSize(new java.awt.Dimension(240, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setMaximumSize(new java.awt.Dimension(240, 10));
        jSeparator7.setMinimumSize(new java.awt.Dimension(240, 10));
        jSeparator7.setPreferredSize(new java.awt.Dimension(240, 10));

        addradio1.setBackground(new java.awt.Color(199, 0, 57));
        addradio1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        addradio1.setForeground(new java.awt.Color(255, 255, 255));
        addradio1.setText("ADD");
        addradio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addradio1.setOpaque(false);
        addradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addradio1ActionPerformed(evt);
            }
        });

        updateradio1.setBackground(new java.awt.Color(199, 0, 57));
        updateradio1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        updateradio1.setForeground(new java.awt.Color(255, 255, 255));
        updateradio1.setText("UPDATE");
        updateradio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateradio1.setOpaque(false);
        updateradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateradio1ActionPerformed(evt);
            }
        });

        delradio1.setBackground(new java.awt.Color(199, 0, 57));
        delradio1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        delradio1.setForeground(new java.awt.Color(255, 255, 255));
        delradio1.setText("DELETE");
        delradio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delradio1.setOpaque(false);
        delradio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delradio1MouseClicked(evt);
            }
        });
        delradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delradio1ActionPerformed(evt);
            }
        });

        searchradio1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        searchradio1.setForeground(new java.awt.Color(255, 255, 255));
        searchradio1.setText("SEARCH");
        searchradio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchradio1.setOpaque(false);
        searchradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchradio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addComponent(descr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(114, 114, 114)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(add1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update1)
                                .addGap(41, 41, 41)
                                .addComponent(del1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(searchradio1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(addradio1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(updateradio1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(delradio1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchradio1)
                            .addComponent(addradio1)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(delradio1)
                                .addComponent(updateradio1)))
                        .addGap(47, 47, 47)
                        .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search1)
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(del1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel1.add(panel1);
        panel1.setBounds(50, 190, 720, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    void showtabledata()
    {
     
        String n,d;
        int m;
        mysqlconnector msq=new mysqlconnector();
        try {
            DefaultTableModel model=(DefaultTableModel) Table.getModel();
        
            Connection con=msq.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from theatre ");
           
           
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                m=rs.getInt("th_id");
                n=rs.getString("th_name");
                d=rs.getString("area");
                 //r=rs.getInt("rating");
               model.addRow(new Object[]{m,n,d});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    
    }
    
    
    
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) Table.getModel();
       th_id.setText(model.getValueAt(Table.getSelectedRow(), 0).toString());
        th_name.setText(model.getValueAt(Table.getSelectedRow(), 1).toString());
       area.setText(model.getValueAt(Table.getSelectedRow(), 2).toString());
        
    }//GEN-LAST:event_TableMouseClicked

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
            else
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

    private void searchradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchradioActionPerformed
        // TODO add your handling code here:
        if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search.setVisible(true);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(false);
            

            th_id.setVisible(false);
            th_name.setVisible(true);
            area.setVisible(false);
            

            tid.setVisible(false);
            tname.setVisible(true);
            a.setVisible(false);
            
        }
    }//GEN-LAST:event_searchradioActionPerformed

    private void addradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addradioActionPerformed
        // TODO add your handling code here:
        if(addradio.isSelected()==true)
        {
            addradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(true);
            update.setVisible(false);
            search.setVisible(false);

            jSeparator1.setVisible(true);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(true);
            

            th_id.setVisible(true);
            th_name.setVisible(true);
            area.setVisible(true);
           

            tid.setVisible(true);
            tname.setVisible(true);
            a.setVisible(true);
            
        }
        th_id.setText("");
        th_name.setText("");
        area.setText("");
        
    }//GEN-LAST:event_addradioActionPerformed

    private void updateradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateradioActionPerformed
        // TODO add your handling code here:
        if(updateradio.isSelected()==true)
        {
            updateradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(true);
            search.setVisible(true);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(true);
            

            th_id.setVisible(false);
            th_name.setVisible(true);
            area.setVisible(true);
            

            tid.setVisible(false);
            tname.setVisible(true);
            a.setVisible(true);
            
        }
        th_id.setText("");
        th_name.setText("");
        area.setText("");
        
    }//GEN-LAST:event_updateradioActionPerformed

    private void delradioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delradioMouseClicked
        // TODO add your handling code here:
        add.setVisible(false);
        update.setVisible(false);
        del.setVisible(true);
        search.setVisible(true);
    }//GEN-LAST:event_delradioMouseClicked

    private void delradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delradioActionPerformed
        // TODO add your handling code here:
        if(delradio.isSelected()==true)
        {
            delradio.setSelected(true);
            del.setVisible(true);
            add.setVisible(false);
            update.setVisible(false);
            search.setVisible(false);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(false);
            

            th_id.setVisible(false);
            th_name.setVisible(true);
            area.setVisible(false);
            

            tid.setVisible(false);
            tname.setVisible(true);
            a.setVisible(false);
            
        }
    }//GEN-LAST:event_delradioActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:

        String mov_id=th_id.getText();
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            String m_search;
            m_search=th_name.getText();
            
            if(!m_search.equals("") && !m_search.equals("Enter Theatre Name"))
            {
                PreparedStatement pst=con.prepareStatement("select * from theatre where th_name like '"+m_search+"%';");
                //pst.setString(1, mov_id);
                DefaultTableModel model=(DefaultTableModel) Table1.getModel();
                model.setRowCount(0);
                String n,d;
                int r,m;
                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {
                    m=rs.getInt("th_id");
                    n=rs.getString("th_name");
                    d=rs.getString("area");
                    //r=rs.getInt("rating");
                    model.addRow(new Object[]{m,n,d});
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
    }//GEN-LAST:event_searchMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        //jLabel6.setText("");
        DefaultTableModel model=(DefaultTableModel) Table.getModel();

        /*
        if(!mid.getText().trim().equals("")){
            model.addRow(new Object[]{mid.getText(),mname.getText(),descr.getText(),rating.getText()});
        }else{
            JOptionPane.showMessageDialog(this, "Movie should not be left empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        */

        mysqlconnector msq=new mysqlconnector();
        try {
            String mov_id=th_id.getText();
            String mov_name=th_name.getText();
            String descr=this.area.getText();
           // String rating=this.rating.getText();

            if(mov_id.equals("") || mov_name.equals("") || descr.equals("") )
            {
                JOptionPane.showMessageDialog(this, "Please fill all the details", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {

                int mid_len=mov_id.length();
                if(mid_len==3)
                {
                    
                
                    Connection con=msq.getConnection();
                    PreparedStatement p=con.prepareStatement("select th_id,th_name from theatre where th_name='"+mov_name+"' or th_id="+mov_id+";");
                    ResultSet r = p.executeQuery();

                    if(r.next())
                    {
                        JOptionPane.showMessageDialog(this, "Theatre id/name already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Connection con=msq.getConnection();
                        PreparedStatement pst1=con.prepareStatement("insert into theatre values(?,?,?)");
                        pst1.setString(1, mov_id);
                        pst1.setString(2, mov_name);
                        pst1.setString(3, descr);
                        //pst1.setString(4, rating);

                        if(pst1.executeUpdate()==1)
                        {
                            model.addRow(new Object[]{mov_id,mov_name,descr});
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
                
                else
                {
                        JOptionPane.showMessageDialog(this, "Theatre ID should be of 3 digits", "Message", JOptionPane.INFORMATION_MESSAGE);    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        mysqlconnector msq=new mysqlconnector();
        try {

            String mov_id=th_id.getText();
            String mov_name=th_name.getText();
            String descr=this.area.getText();
            //String rating=this.rating.getText();

            Connection con=msq.getConnection();

            PreparedStatement p=con.prepareStatement("select th_name,th_id from theatre where th_name='"+mov_name+"'");
            ResultSet r = p.executeQuery();

            if((r.next())&& !( mov_id.equals(r.getString("th_id"))))
            {
                //if(mov_id.equals(r.getString("mov_id")));
                JOptionPane.showMessageDialog(this, "Theatre is already Present", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                PreparedStatement pst1=con.prepareStatement("Update theatre set th_name=?,area=? where th_id=?");
                pst1.setString(1, mov_name);
                pst1.setString(2, descr);
               // pst1.setString(3, rating);
                pst1.setString(3, mov_id);

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
        // TODO add your handling code here:
        mysqlconnector msq=new mysqlconnector();
        try {

            String mov_id=th_id.getText();
            String mov_name=th_name.getText();
            String descr=this.area.getText();
           // String rating=this.rating.getText();

            Connection con=msq.getConnection();

            PreparedStatement p=con.prepareStatement("delete from theatre where th_name='"+mov_name+"'");

            if(p.executeUpdate()==1)
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
        }

    }//GEN-LAST:event_delMouseClicked

    private void th_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_th_idMouseClicked
        // TODO add your handling code here:

        th_id.setText("");

    }//GEN-LAST:event_th_idMouseClicked

    private void th_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_th_idActionPerformed

    private void th_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_th_nameMouseClicked
        // TODO add your handling code here:
        th_name.setText("");
    }//GEN-LAST:event_th_nameMouseClicked

    private void th_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_th_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_th_nameMouseEntered

    private void areaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaMouseClicked
        // TODO add your handling code here:
        area.setText("");
    }//GEN-LAST:event_areaMouseClicked

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) Table1.getModel();
       th_id.setText(model.getValueAt(Table1.getSelectedRow(), 0).toString());
        th_name.setText(model.getValueAt(Table1.getSelectedRow(), 1).toString());
       area.setText(model.getValueAt(Table1.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_Table1MouseClicked

    private void midMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midMouseClicked
        // TODO add your handling code here:

        mid.setText("");

    }//GEN-LAST:event_midMouseClicked

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void mnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnameMouseClicked
        // TODO add your handling code here:
        mname.setText("");
    }//GEN-LAST:event_mnameMouseClicked

    private void mnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameMouseEntered

    private void descrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descrMouseClicked
        // TODO add your handling code here:
        descr.setText("");
    }//GEN-LAST:event_descrMouseClicked

    private void descrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descrActionPerformed

    private void ratingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingMouseClicked
        // TODO add your handling code here:
        rating.setText("");
    }//GEN-LAST:event_ratingMouseClicked

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingActionPerformed

    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked
        // TODO add your handling code here:

        String mov_id=mid.getText();
        mysqlconnector msq=new mysqlconnector();
        try {
            Connection con=msq.getConnection();
            String m_search;
            m_search=mname.getText();

            if(!m_search.equals("") && !m_search.equals("Enter Movie Name"))
            {
                PreparedStatement pst=con.prepareStatement("select * from Movie where mov_name like '"+m_search+"%';");
                //pst.setString(1, mov_id);
                DefaultTableModel model=(DefaultTableModel) Table1.getModel();
                model.setRowCount(0);
                String n,d;
                int r,m;
                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {
                    m=rs.getInt("mov_id");
                    n=rs.getString("mov_name");
                    d=rs.getString("descr");
                    r=rs.getInt("rating");

                    model.addRow(new Object[]{m,n,d,r});
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Enter Movie Name !!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
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

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        // TODO add your handling code here:
        mysqlconnector msq=new mysqlconnector();
        try {

            String mov_id=mid.getText();
            String mov_name=mname.getText();
            String descr=this.descr.getText();
            String rating=this.rating.getText();

            Connection con=msq.getConnection();

            PreparedStatement p=con.prepareStatement("select mov_name,mov_id from movie where mov_name='"+mov_name+"'");
            ResultSet r = p.executeQuery();

            if((r.next())&& !( mov_id.equals(r.getString("mov_id"))))
            {
                //if(mov_id.equals(r.getString("mov_id")));
                JOptionPane.showMessageDialog(this, "Movie is already Present", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                PreparedStatement pst1=con.prepareStatement("Update Movie set mov_name=?,descr=?,rating=? where mov_id=?");
                pst1.setString(1, mov_name);
                pst1.setString(2, descr);
                pst1.setString(3, rating);
                pst1.setString(4, mov_id);

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
    }//GEN-LAST:event_update1MouseClicked

    private void del1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del1MouseClicked
        // TODO add your handling code here:
        mysqlconnector msq=new mysqlconnector();
        try {

            String mov_id=mid.getText();
            String mov_name=mname.getText();
            String descr=this.descr.getText();
            String rating=this.rating.getText();

            Connection con=msq.getConnection();

            PreparedStatement p=con.prepareStatement("delete from movie where mov_name='"+mov_name+"'");

            if(p.executeUpdate()==1)
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
        }

    }//GEN-LAST:event_del1MouseClicked

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        // TODO add your handling code here:
        //jLabel6.setText("");
        DefaultTableModel model=(DefaultTableModel) Table.getModel();

        /*
        if(!mid.getText().trim().equals("")){
            model.addRow(new Object[]{mid.getText(),mname.getText(),descr.getText(),rating.getText()});
        }else{
            JOptionPane.showMessageDialog(this, "Movie should not be left empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        */

        mysqlconnector msq=new mysqlconnector();
        try {
            String mov_id=mid.getText();
            String mov_name=mname.getText();
            String descr=this.descr.getText();
            String rating=this.rating.getText();

            if(mov_id.equals("") || mov_name.equals("") || descr.equals("") || rating.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please fill all the details", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {

                Connection con=msq.getConnection();
                PreparedStatement p=con.prepareStatement("select mov_id,mov_name from movie where mov_name='"+mov_name+"' or mov_id="+mov_id+";");
                ResultSet r = p.executeQuery();

                if(r.next())
                {
                    JOptionPane.showMessageDialog(this, "Movie id/name already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Connection con=msq.getConnection();
                    PreparedStatement pst1=con.prepareStatement("insert into Movie values(?,?,?,?)");
                    pst1.setString(1, mov_id);
                    pst1.setString(2, mov_name);
                    pst1.setString(3, descr);
                    pst1.setString(4, rating);

                    if(pst1.executeUpdate()==1)
                    {
                        model.addRow(new Object[]{mov_id,mov_name,descr,rating});
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_add1MouseClicked

    private void addradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addradio1ActionPerformed
        // TODO add your handling code here:
        if(addradio.isSelected()==true)
        {
            addradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(true);
            update.setVisible(false);
            search.setVisible(false);

            jSeparator1.setVisible(true);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(true);
            jSeparator4.setVisible(true);

            mid.setVisible(true);
            mname.setVisible(true);
            descr.setVisible(true);
            rating.setVisible(true);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
        }
        mid.setText("");
        mname.setText("");
        descr.setText("");
        rating.setText("");
    }//GEN-LAST:event_addradio1ActionPerformed

    private void updateradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateradio1ActionPerformed
        // TODO add your handling code here:
        if(updateradio.isSelected()==true)
        {
            updateradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(true);
            search.setVisible(true);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(true);
            jSeparator4.setVisible(true);

            mid.setVisible(false);
            mname.setVisible(true);
            descr.setVisible(true);
            rating.setVisible(true);

            jLabel2.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
        }
        mid.setText("");
        mname.setText("");
        descr.setText("");
        rating.setText("");
    }//GEN-LAST:event_updateradio1ActionPerformed

    private void delradio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delradio1MouseClicked
        // TODO add your handling code here:
        add.setVisible(false);
        update.setVisible(false);
        del.setVisible(true);
        search.setVisible(true);
    }//GEN-LAST:event_delradio1MouseClicked

    private void delradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delradio1ActionPerformed
        // TODO add your handling code here:
        if(delradio.isSelected()==true)
        {
            delradio.setSelected(true);
            del.setVisible(true);
            add.setVisible(false);
            update.setVisible(false);
            search.setVisible(false);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(false);
            jSeparator4.setVisible(false);

            mid.setVisible(false);
            mname.setVisible(true);
            descr.setVisible(false);
            rating.setVisible(false);

            jLabel2.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_delradio1ActionPerformed

    private void searchradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchradio1ActionPerformed
        // TODO add your handling code here:
        if(searchradio.isSelected()==true)
        {
            searchradio.setSelected(true);
            del.setVisible(false);
            add.setVisible(false);
            update.setVisible(false);
            search.setVisible(true);

            jSeparator1.setVisible(false);
            jSeparator2.setVisible(true);
            jSeparator3.setVisible(false);
            jSeparator4.setVisible(false);

            mid.setVisible(false);
            mname.setVisible(true);
            descr.setVisible(false);
            rating.setVisible(false);

            jLabel2.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_searchradio1ActionPerformed

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
            java.util.logging.Logger.getLogger(admintheatre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admintheatre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admintheatre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admintheatre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admintheatre().setVisible(true);
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
    private javax.swing.JTable Table1;
    private javax.swing.JLabel a;
    private javax.swing.JLabel add;
    private javax.swing.JLabel add1;
    private javax.swing.JRadioButton addradio;
    private javax.swing.JRadioButton addradio1;
    private javax.swing.JTextField area;
    private javax.swing.JLabel back_lbl;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel del;
    private javax.swing.JLabel del1;
    private javax.swing.JRadioButton delradio;
    private javax.swing.JRadioButton delradio1;
    private javax.swing.JTextField descr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mname;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField rating;
    private javax.swing.JLabel search;
    private javax.swing.JLabel search1;
    private javax.swing.JRadioButton searchradio;
    private javax.swing.JRadioButton searchradio1;
    private javax.swing.JTextField th_id;
    private javax.swing.JTextField th_name;
    private javax.swing.JLabel tid;
    private javax.swing.JLabel tname;
    private javax.swing.JLabel update;
    private javax.swing.JLabel update1;
    private javax.swing.JRadioButton updateradio;
    private javax.swing.JRadioButton updateradio1;
    // End of variables declaration//GEN-END:variables
}
