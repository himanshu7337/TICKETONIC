package images;

import hello.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.FontMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class bill_form extends javax.swing.JFrame {

    int tckt_id_arr[]={0,0,0,0,0,0,0,0,0,0};
    int tckt_id,cnt;
    int sch_id,col_no;
    String mov_name,th_name,date,start,row_no;
            
    public bill_form() {
        initComponents();
    }
    
    public bill_form(int res_count, int c) {
        initComponents();
        cnt=c;
        tckt_id=res_count;
        jLabel11.setText(Integer.toString(cnt));
        jLabel12.setText(Integer.toString(tckt_id));
        for(int i=0;i<cnt;i++)
        {
            tckt_id_arr[i]=tckt_id;  
            tckt_id++;
        }
        
    }
  
    public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =50.0;  
    double headerHeight = 2.0;                  
    double footerHeight = 2.0;                  
    double width = convert_CM_To_PPI(16);      //printer know only point per inch.default value is 72ppi
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width,            
        height - convert_CM_To_PPI(1)
    );   //define boarder size    after that print area width is about 180 points
            
    pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
    pf.setPaper(paper);    

    return pf;
}
    
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
 
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}


public class BillPrintable implements Printable {
       
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
              
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            ////////// code by alqama//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        //    int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;

            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
            
            
              
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("------------------------------------------------",12,y);y+=yShift;
            g2d.drawString("                 TICKET Receipt                ",12,y);y+=yShift;
            g2d.drawString("------------------------------------------------",12,y);y+=headerRectHeight;
      
            for(int i=0;i<cnt;i++)
            {

                mysqlconnector msq=new mysqlconnector();
                try
                {
                    Connection con = msq.getConnection();
                    
                    PreparedStatement pst=con.prepareStatement("select sch_id,row_no,col_no from reservation where tckt_id="+tckt_id_arr[i]+";");
                    ResultSet rs = pst.executeQuery();
                    rs.next();
                    sch_id=rs.getInt("sch_id");
                    row_no=rs.getString("row_no");
                    col_no=rs.getInt("col_no");
                    
                    PreparedStatement pst1=con.prepareStatement("select th_id,mov_id,date,start from schedule where sch_id="+sch_id+";");
                    ResultSet rs1 = pst1.executeQuery();
                    rs1.next();
                    int th_id=rs1.getInt("th_id");
                    int mov_id=rs1.getInt("mov_id");
                    date=rs1.getString("date");
                    start=rs1.getString("start");
                    
                    PreparedStatement pst2=con.prepareStatement("select mov_name from movie where mov_id="+mov_id+";");
                    ResultSet rs2 = pst2.executeQuery();
                    rs2.next();
                    mov_name=rs2.getString("mov_name");
                    
                    PreparedStatement pst3=con.prepareStatement("select th_name from theatre where th_id="+th_id+";");
                    ResultSet rs3 = pst3.executeQuery();
                    rs3.next();
                    th_name=rs3.getString("th_name");
                    
                }
                catch (Exception e)
                {
                    // JOptionPane.showMessageDialog(null, e);
                }
                g2d.drawString("------------------------------------------------",10,y);y+=headerRectHeight;
                g2d.drawString("        Ticket ID                 "+tckt_id_arr[i]+"            ",10,y);y+=yShift;
                g2d.drawString("        Theatre                   "+th_name+"             ",10,y);y+=yShift;
                g2d.drawString("        Movie                     "+mov_name+"             ",10,y);y+=yShift;
                g2d.drawString("        Show Date                 "+date+"             ",10,y);y+=yShift;
                g2d.drawString("        Show Time                 "+start+"             ",10,y);y+=yShift;
                g2d.drawString("        Seat No.                  "+row_no+"-"+col_no+"             ",10,y);y+=yShift;
                g2d.drawString("        Price                     120           ",10,y);y+=yShift;
                g2d.drawString("------------------------------------------------",10,y);y+=yShift;
                g2d.drawString("                                                ",10,y);y+=yShift; 
            }//for
            g2d.drawString("------------------------------------------------",10,y);y+=headerRectHeight;
            g2d.drawString("************************************************",10,y);y+=yShift;
            g2d.drawString("        THANKS TO BOOKING WITH TICKETONIC        ",10,y);y+=yShift;
            g2d.drawString("************************************************",10,y);y+=yShift;
                   

    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
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

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill Receipt Printing");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setMaximumSize(new java.awt.Dimension(800, 550));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 550));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 62, 80));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enjoy watching movies and do come next time for some more amazing experience.");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 350, 700, 30);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thank You for booking ticket using TICKETONIC");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(100, 120, 620, 40);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 62, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("An E-Ticket has been successfully sent to your registered email id.");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(150, 210, 570, 40);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 62, 80));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("or print / save the ticket by clicking on the PRINT button.");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(170, 270, 520, 30);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(44, 62, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("You can use the e-ticket");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(170, 240, 520, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_print_pressed.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3);
        jLabel3.setBounds(290, 470, 90, 40);

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 188, 156));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thank You ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(210, 30, 420, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill_system/images/button_home_pressed.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(440, 470, 100, 40);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(600, 430, 130, 30);
        jPanel3.add(jLabel12);
        jLabel12.setBounds(610, 490, 130, 30);
        jPanel3.add(jLabel13);
        jLabel13.setBounds(610, 390, 130, 30);
        jPanel3.add(jLabel14);
        jLabel14.setBounds(50, 440, 130, 30);
        jPanel3.add(jLabel15);
        jLabel15.setBounds(60, 500, 130, 30);
        jPanel3.add(jLabel16);
        jLabel16.setBounds(60, 400, 130, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thank.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 80, 800, 470);

        jLabel9.setBackground(new java.awt.Color(52, 73, 94));
        jLabel9.setForeground(new java.awt.Color(52, 73, 94));
        jLabel9.setOpaque(true);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 800, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
             //System.exit(0);
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        mysqlconnector msq=new mysqlconnector();
                try
                {
                    Connection con = msq.getConnection();
                    
                    PreparedStatement pst=con.prepareStatement("select user_name from user where user_status=1;");
                    ResultSet rs = pst.executeQuery();
                    rs.next();
                    
                    String uname=rs.getString("user_name");
                    
                    new homepage(uname).setVisible(true);
                }
                catch(Exception e)
                {}
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(bill_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
