package hello;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Seat extends javax.swing.JFrame {
    int sid;
    int count=0;
    int seat_cnt=2;
    int Aflag[]={0,0,0,0,0,0,0,0,0,0};  //clicked or not
    int Areset[]={0,0,0,0,0,0,0,0,0,0}; //hover color change
    int Bflag[]={0,0,0,0,0,0,0,0,0,0};  //clicked or not
    int Breset[]={0,0,0,0,0,0,0,0,0,0}; //hover color change
    int Cflag[]={0,0,0,0,0,0,0,0,0,0};  //clicked or not
    int Creset[]={0,0,0,0,0,0,0,0,0,0}; //hover color change
    int Dflag[]={0,0,0,0,0,0,0,0,0,0};  //clicked or not
    int Dreset[]={0,0,0,0,0,0,0,0,0,0}; //hover color change
    
     public Seat() {
        initComponents();
                
        BtnConfirm.setVisible(false);
        BtnProceed.setVisible(false);
        BtnCancel.setVisible(false);
        
        mysqlconnector msq=new mysqlconnector();
        try 
        {
            Connection con = msq.getConnection();
            
            String query_A = "SELECT status FROM seat_list where row_no='A';";
            Statement st_A=con.createStatement();
            ResultSet rs_A = st_A.executeQuery(query_A);
           
            int i=0;
            while(rs_A.next())
            {
                
                    int astatus=rs_A.getInt("status");
                    if(astatus==-1)  
                        Aflag[i]=-1;
                    i++;           
            }
                        
            String query_B = "SELECT status FROM seat_list where row_no='B';";
            Statement st_B=con.createStatement();
            ResultSet rs_B = st_B.executeQuery(query_B);
           
            int j=0;
            while(rs_B.next())
            {
                    int bstatus=rs_B.getInt("status");
                    if(bstatus==-1)  
                        Bflag[j]=-1;
                    j++; 
            }
            
            String query_C = "SELECT status FROM seat_list where row_no='C';";
            Statement st_C=con.createStatement();
            ResultSet rs_C = st_C.executeQuery(query_C);
           
            int k=0;
            while(rs_C.next())
            {
                
                    int cstatus=rs_C.getInt("status");
                    if(cstatus==-1)  
                        Cflag[k]=-1;
                    k++;           
            }
            
            String query_D = "SELECT status FROM seat_list where row_no='D';";
            Statement st_D=con.createStatement();
            ResultSet rs_D = st_D.executeQuery(query_D);
           
            int l=0;
            while(rs_D.next())
            {
                
                    int dstatus=rs_D.getInt("status");
                    if(dstatus==-1)  
                        Dflag[l]=-1;
                    l++;           
            }
            
            if(Aflag[0]==-1)
            {
                A1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                A1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[1]==-1)
            {
                A2.setForeground(Color.decode("#bdc3c7"));
                A2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[2]==-1)
            {
                A3.setForeground(Color.decode("#bdc3c7"));
                A3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[3]==-1)
            {
                A4.setForeground(Color.decode("#bdc3c7"));
                A4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[4]==-1)
            {
                A5.setForeground(Color.decode("#bdc3c7"));
                A5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[5]==-1)
            {
                A6.setForeground(Color.decode("#bdc3c7"));
                A6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[6]==-1)
            {
                A7.setForeground(Color.decode("#bdc3c7"));
                A7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[7]==-1)
            {
                A8.setForeground(Color.decode("#bdc3c7"));
                A8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[8]==-1)
            {
                A9.setForeground(Color.decode("#bdc3c7"));
                A9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[9]==-1)
            {
                A10.setForeground(Color.decode("#bdc3c7"));
                A10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A10.setBackground(Color.decode("#7f8c8d"));
            }
            
            // For row 'B'
            if(Bflag[0]==-1)
            {
                B1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                B1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[1]==-1)
            {
                B2.setForeground(Color.decode("#bdc3c7"));
                B2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[2]==-1)
            {
                B3.setForeground(Color.decode("#bdc3c7"));
                B3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[3]==-1)
            {
                B4.setForeground(Color.decode("#bdc3c7"));
                B4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[4]==-1)
            {
                B5.setForeground(Color.decode("#bdc3c7"));
                B5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[5]==-1)
            {
                B6.setForeground(Color.decode("#bdc3c7"));
                B6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[6]==-1)
            {
                B7.setForeground(Color.decode("#bdc3c7"));
                B7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[7]==-1)
            {
                B8.setForeground(Color.decode("#bdc3c7"));
                B8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[8]==-1)
            {
                B9.setForeground(Color.decode("#bdc3c7"));
                B9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[9]==-1)
            {
                B10.setForeground(Color.decode("#bdc3c7"));
                B10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B10.setBackground(Color.decode("#7f8c8d"));
            }
            
            //For C
            if(Cflag[0]==-1)
            {
                C1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                C1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[1]==-1)
            {
                C2.setForeground(Color.decode("#bdc3c7"));
                C2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[2]==-1)
            {
                C3.setForeground(Color.decode("#bdc3c7"));
                C3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[3]==-1)
            {
                C4.setForeground(Color.decode("#bdc3c7"));
                C4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[4]==-1)
            {
                C5.setForeground(Color.decode("#bdc3c7"));
                C5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[5]==-1)
            {
                C6.setForeground(Color.decode("#bdc3c7"));
                C6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[6]==-1)
            {
                C7.setForeground(Color.decode("#bdc3c7"));
                C7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[7]==-1)
            {
                C8.setForeground(Color.decode("#bdc3c7"));
                C8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[8]==-1)
            {
                C9.setForeground(Color.decode("#bdc3c7"));
                C9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[9]==-1)
            {
                C10.setForeground(Color.decode("#bdc3c7"));
                C10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C10.setBackground(Color.decode("#7f8c8d"));
            }
            
            // For row 'B'
            if(Dflag[0]==-1)
            {
                D1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                D1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[1]==-1)
            {
                D2.setForeground(Color.decode("#bdc3c7"));
                D2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[2]==-1)
            {
                D3.setForeground(Color.decode("#bdc3c7"));
                D3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[3]==-1)
            {
                D4.setForeground(Color.decode("#bdc3c7"));
                D4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[4]==-1)
            {
                D5.setForeground(Color.decode("#bdc3c7"));
                D5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[5]==-1)
            {
                D6.setForeground(Color.decode("#bdc3c7"));
                D6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[6]==-1)
            {
                D7.setForeground(Color.decode("#bdc3c7"));
                D7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[7]==-1)
            {
                D8.setForeground(Color.decode("#bdc3c7"));
                D8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[8]==-1)
            {
                D9.setForeground(Color.decode("#bdc3c7"));
                D9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[9]==-1)
            {
                D10.setForeground(Color.decode("#bdc3c7"));
                D10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D10.setBackground(Color.decode("#7f8c8d"));
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
     }
    
    public Seat(String m,String s,int c,String t) {
        initComponents();
        
        Movie.setText(m);
        Theatre.setText(t);
        seat_cnt=c;
        NoTickets.setText(Integer.toString(c));
        ShowTime.setText(s+":00");
        
        mysqlconnector msq1=new mysqlconnector();
        try 
        {
            int mid,s_id;
            Connection con = msq1.getConnection();
            
            String query = "SELECT mov_id FROM movie where(mov_name='"+m+"');";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            mid=rs.getInt("mov_id");
            
         
            String query2 = "SELECT sch_id FROM schedule where((mov_id="+mid+")and(start='"+s+":00')and(select th_id from theatre where th_name='"+t+"'));";
            Statement st2=con.createStatement();
            ResultSet rs2 = st.executeQuery(query2);
            rs2.next();
            s_id=rs2.getInt("sch_id");
            sid=s_id;
            //Movie.setText(Integer.toString(sid));
            
            
            //System.out.println(""+sid+"");
        }
        catch(Exception e)
        {
        
        }
        
        BtnConfirm.setVisible(false);
        BtnProceed.setVisible(false);
        BtnCancel.setVisible(false);
        
        mysqlconnector msq=new mysqlconnector();
        try 
        {
            Connection con = msq.getConnection();
            
            String query_A = "SELECT status FROM seat_list where((row_no='A')and(sch_id="+sid+"));";
            Statement st_A=con.createStatement();
            ResultSet rs_A = st_A.executeQuery(query_A);
           
            int i=0;
            while(rs_A.next())
            {
                
                    int astatus=rs_A.getInt("status");
                    if(astatus==-1)  
                        Aflag[i]=-1;
                    i++;           
            }
                        
            String query_B = "SELECT status FROM seat_list where ((row_no='B')and(sch_id="+sid+"));";
            Statement st_B=con.createStatement();
            ResultSet rs_B = st_B.executeQuery(query_B);
           
            int j=0;
            while(rs_B.next())
            {
                    int bstatus=rs_B.getInt("status");
                    if(bstatus==-1)  
                        Bflag[j]=-1;
                    j++; 
            }
            
            String query_C = "SELECT status FROM seat_list where((row_no='C')and(sch_id="+sid+"));";
            Statement st_C=con.createStatement();
            ResultSet rs_C = st_C.executeQuery(query_C);
           
            int k=0;
            while(rs_C.next())
            {
                
                    int cstatus=rs_C.getInt("status");
                    if(cstatus==-1)  
                        Cflag[k]=-1;
                    k++;           
            }
            
            String query_D = "SELECT status FROM seat_list where((row_no='D')and(sch_id="+sid+"));";
            Statement st_D=con.createStatement();
            ResultSet rs_D = st_D.executeQuery(query_D);
           
            int l=0;
            while(rs_D.next())
            {
                
                    int dstatus=rs_D.getInt("status");
                    if(dstatus==-1)  
                        Dflag[l]=-1;
                    l++;           
            }
            
            if(Aflag[0]==-1)
            {
                A1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                A1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[1]==-1)
            {
                A2.setForeground(Color.decode("#bdc3c7"));
                A2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[2]==-1)
            {
                A3.setForeground(Color.decode("#bdc3c7"));
                A3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[3]==-1)
            {
                A4.setForeground(Color.decode("#bdc3c7"));
                A4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[4]==-1)
            {
                A5.setForeground(Color.decode("#bdc3c7"));
                A5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[5]==-1)
            {
                A6.setForeground(Color.decode("#bdc3c7"));
                A6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[6]==-1)
            {
                A7.setForeground(Color.decode("#bdc3c7"));
                A7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[7]==-1)
            {
                A8.setForeground(Color.decode("#bdc3c7"));
                A8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[8]==-1)
            {
                A9.setForeground(Color.decode("#bdc3c7"));
                A9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Aflag[9]==-1)
            {
                A10.setForeground(Color.decode("#bdc3c7"));
                A10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                A10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                A10.setBackground(Color.decode("#7f8c8d"));
            }
            
            // For row 'B'
            if(Bflag[0]==-1)
            {
                B1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                B1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[1]==-1)
            {
                B2.setForeground(Color.decode("#bdc3c7"));
                B2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[2]==-1)
            {
                B3.setForeground(Color.decode("#bdc3c7"));
                B3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[3]==-1)
            {
                B4.setForeground(Color.decode("#bdc3c7"));
                B4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[4]==-1)
            {
                B5.setForeground(Color.decode("#bdc3c7"));
                B5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[5]==-1)
            {
                B6.setForeground(Color.decode("#bdc3c7"));
                B6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[6]==-1)
            {
                B7.setForeground(Color.decode("#bdc3c7"));
                B7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[7]==-1)
            {
                B8.setForeground(Color.decode("#bdc3c7"));
                B8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[8]==-1)
            {
                B9.setForeground(Color.decode("#bdc3c7"));
                B9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Bflag[9]==-1)
            {
                B10.setForeground(Color.decode("#bdc3c7"));
                B10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                B10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                B10.setBackground(Color.decode("#7f8c8d"));
            }
            
            //For C
            if(Cflag[0]==-1)
            {
                C1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                C1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[1]==-1)
            {
                C2.setForeground(Color.decode("#bdc3c7"));
                C2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[2]==-1)
            {
                C3.setForeground(Color.decode("#bdc3c7"));
                C3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[3]==-1)
            {
                C4.setForeground(Color.decode("#bdc3c7"));
                C4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[4]==-1)
            {
                C5.setForeground(Color.decode("#bdc3c7"));
                C5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[5]==-1)
            {
                C6.setForeground(Color.decode("#bdc3c7"));
                C6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[6]==-1)
            {
                C7.setForeground(Color.decode("#bdc3c7"));
                C7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[7]==-1)
            {
                C8.setForeground(Color.decode("#bdc3c7"));
                C8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[8]==-1)
            {
                C9.setForeground(Color.decode("#bdc3c7"));
                C9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Cflag[9]==-1)
            {
                C10.setForeground(Color.decode("#bdc3c7"));
                C10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                C10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                C10.setBackground(Color.decode("#7f8c8d"));
            }
            
            // For row 'B'
            if(Dflag[0]==-1)
            {
                D1.setForeground(Color.decode("#bdc3c7"));//#bdc3c7 : silver
                D1.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D1.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D1.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[1]==-1)
            {
                D2.setForeground(Color.decode("#bdc3c7"));
                D2.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D2.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D2.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[2]==-1)
            {
                D3.setForeground(Color.decode("#bdc3c7"));
                D3.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D3.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D3.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[3]==-1)
            {
                D4.setForeground(Color.decode("#bdc3c7"));
                D4.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D4.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D4.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[4]==-1)
            {
                D5.setForeground(Color.decode("#bdc3c7"));
                D5.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D5.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D5.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[5]==-1)
            {
                D6.setForeground(Color.decode("#bdc3c7"));
                D6.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D6.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D6.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[6]==-1)
            {
                D7.setForeground(Color.decode("#bdc3c7"));
                D7.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D7.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D7.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[7]==-1)
            {
                D8.setForeground(Color.decode("#bdc3c7"));
                D8.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D8.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D8.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[8]==-1)
            {
                D9.setForeground(Color.decode("#bdc3c7"));
                D9.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D9.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D9.setBackground(Color.decode("#7f8c8d"));
            }
            if(Dflag[9]==-1)
            {
                D10.setForeground(Color.decode("#bdc3c7"));
                D10.setBackground(Color.decode("#bdc3c7"));
            }
            else
            {
                D10.setForeground(Color.decode("#7f8c8d"));//#7f8c8d : concrete
                D10.setBackground(Color.decode("#7f8c8d"));
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelA = new javax.swing.JPanel();
        A8 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A10 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        A9 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        panelB = new javax.swing.JPanel();
        B8 = new javax.swing.JLabel();
        B10 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        panelD = new javax.swing.JPanel();
        D8 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D10 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D9 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        panelC = new javax.swing.JPanel();
        C8 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Theatre = new javax.swing.JLabel();
        Movie = new javax.swing.JLabel();
        BtnConfirm = new javax.swing.JButton();
        BtnProceed = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        Movie_name = new javax.swing.JLabel();
        Theatre_name = new javax.swing.JLabel();
        Schedule2 = new javax.swing.JLabel();
        Theatre2 = new javax.swing.JLabel();
        ShowTime = new javax.swing.JLabel();
        NoTickets = new javax.swing.JLabel();
        Schedule3 = new javax.swing.JLabel();
        NoTickets1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 550));
        setMinimumSize(new java.awt.Dimension(900, 550));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

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
        jLabel1.setText("CHOOSE YOUR SEATS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(308, 308, 308)
                .addComponent(CloseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CloseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        panelA.setBackground(new java.awt.Color(255, 255, 255));

        A8.setBackground(new java.awt.Color(236, 240, 241));
        A8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A8.setForeground(new java.awt.Color(189, 195, 199));
        A8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A8.setText("8");
        A8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A8MouseExited(evt);
            }
        });

        A2.setBackground(new java.awt.Color(236, 240, 241));
        A2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A2.setForeground(new java.awt.Color(189, 195, 199));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setText("2");
        A2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });

        A10.setBackground(new java.awt.Color(236, 240, 241));
        A10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A10.setForeground(new java.awt.Color(189, 195, 199));
        A10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A10.setText("10");
        A10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A10MouseExited(evt);
            }
        });

        A3.setBackground(new java.awt.Color(236, 240, 241));
        A3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A3.setForeground(new java.awt.Color(189, 195, 199));
        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.setText("3");
        A3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A3MouseExited(evt);
            }
        });

        A4.setBackground(new java.awt.Color(236, 240, 241));
        A4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A4.setForeground(new java.awt.Color(189, 195, 199));
        A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A4.setText("4");
        A4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A4MouseExited(evt);
            }
        });

        A1.setBackground(new java.awt.Color(236, 240, 241));
        A1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A1.setForeground(new java.awt.Color(189, 195, 199));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setText("1");
        A1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A1MouseExited(evt);
            }
        });

        A9.setBackground(new java.awt.Color(236, 240, 241));
        A9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A9.setForeground(new java.awt.Color(189, 195, 199));
        A9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A9.setText("9");
        A9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A9MouseExited(evt);
            }
        });

        A5.setBackground(new java.awt.Color(236, 240, 241));
        A5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A5.setForeground(new java.awt.Color(189, 195, 199));
        A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A5.setText("5");
        A5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A5MouseExited(evt);
            }
        });

        A6.setBackground(new java.awt.Color(236, 240, 241));
        A6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A6.setForeground(new java.awt.Color(189, 195, 199));
        A6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A6.setText("6");
        A6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A6MouseExited(evt);
            }
        });

        A7.setBackground(new java.awt.Color(236, 240, 241));
        A7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A7.setForeground(new java.awt.Color(189, 195, 199));
        A7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A7.setText("7");
        A7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A10)
                .addContainerGap())
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A9)
                        .addComponent(A10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A8)
                        .addComponent(A7)
                        .addComponent(A6))
                    .addComponent(A5)
                    .addComponent(A4)
                    .addComponent(A3)))
        );

        A.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        A.setForeground(new java.awt.Color(149, 165, 166));
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("A");
        A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panelB.setBackground(new java.awt.Color(255, 255, 255));

        B8.setBackground(new java.awt.Color(236, 240, 241));
        B8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B8.setForeground(new java.awt.Color(189, 195, 199));
        B8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B8MouseExited(evt);
            }
        });

        B10.setBackground(new java.awt.Color(236, 240, 241));
        B10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B10.setForeground(new java.awt.Color(189, 195, 199));
        B10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B10.setText("10");
        B10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B10MouseExited(evt);
            }
        });

        B3.setBackground(new java.awt.Color(236, 240, 241));
        B3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(189, 195, 199));
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B3MouseExited(evt);
            }
        });

        B4.setBackground(new java.awt.Color(236, 240, 241));
        B4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(189, 195, 199));
        B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B4MouseExited(evt);
            }
        });

        B9.setBackground(new java.awt.Color(236, 240, 241));
        B9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B9.setForeground(new java.awt.Color(189, 195, 199));
        B9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B9MouseExited(evt);
            }
        });

        B5.setBackground(new java.awt.Color(236, 240, 241));
        B5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B5.setForeground(new java.awt.Color(189, 195, 199));
        B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B5MouseExited(evt);
            }
        });

        B6.setBackground(new java.awt.Color(236, 240, 241));
        B6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B6.setForeground(new java.awt.Color(189, 195, 199));
        B6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B6MouseExited(evt);
            }
        });

        B7.setBackground(new java.awt.Color(236, 240, 241));
        B7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B7.setForeground(new java.awt.Color(189, 195, 199));
        B7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B7MouseExited(evt);
            }
        });

        B2.setBackground(new java.awt.Color(236, 240, 241));
        B2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(189, 195, 199));
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B2MouseExited(evt);
            }
        });

        B1.setBackground(new java.awt.Color(236, 240, 241));
        B1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(189, 195, 199));
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBLayout = new javax.swing.GroupLayout(panelB);
        panelB.setLayout(panelBLayout);
        panelBLayout.setHorizontalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B10)
                .addContainerGap())
        );
        panelBLayout.setVerticalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B9)
                        .addComponent(B8)
                        .addComponent(B7)
                        .addComponent(B6))
                    .addComponent(B5)
                    .addComponent(B4)
                    .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B3)
                        .addComponent(B2)
                        .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        B.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        B.setForeground(new java.awt.Color(149, 165, 166));
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panelD.setBackground(new java.awt.Color(255, 255, 255));

        D8.setBackground(new java.awt.Color(236, 240, 241));
        D8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D8.setForeground(new java.awt.Color(189, 195, 199));
        D8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D8.setText("8");
        D8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D8MouseExited(evt);
            }
        });

        D2.setBackground(new java.awt.Color(236, 240, 241));
        D2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D2.setForeground(new java.awt.Color(189, 195, 199));
        D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D2.setText("2");
        D2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D2MouseExited(evt);
            }
        });

        D10.setBackground(new java.awt.Color(236, 240, 241));
        D10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D10.setForeground(new java.awt.Color(189, 195, 199));
        D10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D10.setText("10");
        D10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D10MouseExited(evt);
            }
        });

        D3.setBackground(new java.awt.Color(236, 240, 241));
        D3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D3.setForeground(new java.awt.Color(189, 195, 199));
        D3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D3.setText("3");
        D3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D3MouseExited(evt);
            }
        });

        D4.setBackground(new java.awt.Color(236, 240, 241));
        D4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D4.setForeground(new java.awt.Color(189, 195, 199));
        D4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D4.setText("4");
        D4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D4MouseExited(evt);
            }
        });

        D1.setBackground(new java.awt.Color(236, 240, 241));
        D1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D1.setForeground(new java.awt.Color(189, 195, 199));
        D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D1.setText("1");
        D1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D1MouseExited(evt);
            }
        });

        D9.setBackground(new java.awt.Color(236, 240, 241));
        D9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D9.setForeground(new java.awt.Color(189, 195, 199));
        D9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D9.setText("9");
        D9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D9MouseExited(evt);
            }
        });

        D5.setBackground(new java.awt.Color(236, 240, 241));
        D5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D5.setForeground(new java.awt.Color(189, 195, 199));
        D5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D5.setText("5");
        D5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D5MouseExited(evt);
            }
        });

        D6.setBackground(new java.awt.Color(236, 240, 241));
        D6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D6.setForeground(new java.awt.Color(189, 195, 199));
        D6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D6.setText("6");
        D6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D6MouseExited(evt);
            }
        });

        D7.setBackground(new java.awt.Color(236, 240, 241));
        D7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D7.setForeground(new java.awt.Color(189, 195, 199));
        D7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D7.setText("7");
        D7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDLayout = new javax.swing.GroupLayout(panelD);
        panelD.setLayout(panelDLayout);
        panelDLayout.setHorizontalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D10)
                .addContainerGap())
        );
        panelDLayout.setVerticalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(D10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(D9)
                        .addComponent(D8)
                        .addComponent(D7)
                        .addComponent(D6))
                    .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(D1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(D2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D5)
                            .addComponent(D4)
                            .addComponent(D3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelC.setBackground(new java.awt.Color(255, 255, 255));

        C8.setBackground(new java.awt.Color(236, 240, 241));
        C8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C8.setForeground(new java.awt.Color(189, 195, 199));
        C8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C8.setText("8");
        C8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C8MouseExited(evt);
            }
        });

        C2.setBackground(new java.awt.Color(236, 240, 241));
        C2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C2.setForeground(new java.awt.Color(189, 195, 199));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setText("2");
        C2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C2MouseExited(evt);
            }
        });

        C10.setBackground(new java.awt.Color(236, 240, 241));
        C10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C10.setForeground(new java.awt.Color(189, 195, 199));
        C10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C10.setText("10");
        C10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C10MouseExited(evt);
            }
        });

        C3.setBackground(new java.awt.Color(236, 240, 241));
        C3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C3.setForeground(new java.awt.Color(189, 195, 199));
        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.setText("3");
        C3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C3MouseExited(evt);
            }
        });

        C4.setBackground(new java.awt.Color(236, 240, 241));
        C4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C4.setForeground(new java.awt.Color(189, 195, 199));
        C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C4.setText("4");
        C4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C4MouseExited(evt);
            }
        });

        C1.setBackground(new java.awt.Color(236, 240, 241));
        C1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C1.setForeground(new java.awt.Color(189, 195, 199));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setText("1");
        C1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C1MouseExited(evt);
            }
        });

        C9.setBackground(new java.awt.Color(236, 240, 241));
        C9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C9.setForeground(new java.awt.Color(189, 195, 199));
        C9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C9.setText("9");
        C9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C9MouseExited(evt);
            }
        });

        C5.setBackground(new java.awt.Color(236, 240, 241));
        C5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C5.setForeground(new java.awt.Color(189, 195, 199));
        C5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C5.setText("5");
        C5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C5MouseExited(evt);
            }
        });

        C6.setBackground(new java.awt.Color(236, 240, 241));
        C6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C6.setForeground(new java.awt.Color(189, 195, 199));
        C6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C6.setText("6");
        C6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C6MouseExited(evt);
            }
        });

        C7.setBackground(new java.awt.Color(236, 240, 241));
        C7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C7.setForeground(new java.awt.Color(189, 195, 199));
        C7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C7.setText("7");
        C7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCLayout = new javax.swing.GroupLayout(panelC);
        panelC.setLayout(panelCLayout);
        panelCLayout.setHorizontalGroup(
            panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C10)
                .addContainerGap())
        );
        panelCLayout.setVerticalGroup(
            panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C9)
                        .addComponent(C8)
                        .addComponent(C7)
                        .addComponent(C6))
                    .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCLayout.createSequentialGroup()
                        .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C5)
                            .addComponent(C4)
                            .addComponent(C3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        C.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        C.setForeground(new java.awt.Color(149, 165, 166));
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("C");
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        D.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        D.setForeground(new java.awt.Color(149, 165, 166));
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("D");
        D.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Screen This Side");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/black-arrows.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Row No", "Column No", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setOpaque(false);
        Table.getTableHeader().setResizingAllowed(false);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        Theatre.setBackground(new java.awt.Color(255, 255, 255));
        Theatre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Theatre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Theatre.setOpaque(true);

        Movie.setBackground(new java.awt.Color(255, 255, 255));
        Movie.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Movie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Movie.setOpaque(true);

        BtnConfirm.setBackground(new java.awt.Color(200, 0, 50));
        BtnConfirm.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirm.setText("CONFIRM");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        BtnProceed.setBackground(new java.awt.Color(200, 0, 50));
        BtnProceed.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtnProceed.setForeground(new java.awt.Color(255, 255, 255));
        BtnProceed.setText("PROCEED");
        BtnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProceedActionPerformed(evt);
            }
        });

        BtnCancel.setBackground(new java.awt.Color(200, 0, 50));
        BtnCancel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancel.setText("CANCEL");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        Movie_name.setBackground(new java.awt.Color(255, 255, 255));
        Movie_name.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Movie_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Movie_name.setText("Movie ");

        Theatre_name.setBackground(new java.awt.Color(255, 255, 255));
        Theatre_name.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Theatre_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Theatre_name.setText("Theatre");

        Schedule2.setBackground(new java.awt.Color(255, 255, 255));
        Schedule2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Schedule2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Schedule2.setText("No. of Tickets");

        Theatre2.setBackground(new java.awt.Color(255, 255, 255));
        Theatre2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Theatre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Theatre2.setText("Show Time");

        ShowTime.setBackground(new java.awt.Color(255, 255, 255));
        ShowTime.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ShowTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowTime.setOpaque(true);

        NoTickets.setBackground(new java.awt.Color(255, 255, 255));
        NoTickets.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        NoTickets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoTickets.setOpaque(true);

        Schedule3.setBackground(new java.awt.Color(255, 255, 255));
        Schedule3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Schedule3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Schedule3.setText("Price of each Ticket");

        NoTickets1.setBackground(new java.awt.Color(255, 255, 255));
        NoTickets1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        NoTickets1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoTickets1.setText("120");
        NoTickets1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnProceed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Theatre_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Movie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Theatre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Schedule2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Theatre2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ShowTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NoTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Schedule3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoTickets1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Movie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Theatre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Theatre_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Theatre2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Schedule2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoTickets1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Schedule3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void A7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseExited
        // TODO add your handling code here:
        if(Aflag[6]!=-1)
        {
            if(Areset[6]==0)
            {
                A7.setForeground(Color.decode("#7f8c8d"));
                A7.setBackground(Color.decode("#7f8c8d"));
            } 
        } 
    }//GEN-LAST:event_A7MouseExited

    private void A7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseEntered
        // TODO add your handling code here:
        if(Aflag[6]!=-1)
        {
            A7.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A7.setForeground(Color.decode("#2c3e50"));// #2c3e50 : midnight blue
            A7.setBackground(Color.decode("#1ABC9C"));// #1abc9c : turquoise
        }
    }//GEN-LAST:event_A7MouseEntered

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        // TODO add your handling code here:
        if(Aflag[6]!=-1)
        {
            if(Aflag[6]==0)
           {
               if(count<seat_cnt)
                {
                    A7.setForeground(Color.decode("#2c3e50"));
                    A7.setBackground(Color.decode("#1ABC9C"));
                    Areset[6]=1;
                    Aflag[6]=1;
                    count++;
                    
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where sch_id="+sid+" and row_no='A' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    
                }
           }
           else
           {
               A7.setForeground(Color.decode("#7f8c8d"));
               A7.setBackground(Color.decode("#7f8c8d"));
               Areset[6]=0;
               Aflag[6]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where sch_id="+sid+" and  row_no='A' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }        
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }       
    }//GEN-LAST:event_A7MouseClicked

    private void A6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseExited
        // TODO add your handling code here:
        if(Aflag[5]!=-1)
        {
            if(Areset[5]==0)
            {
                A6.setForeground(Color.decode("#7f8c8d"));
                A6.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A6MouseExited

    private void A6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseEntered
        // TODO add your handling code here:
        if(Aflag[5]!=-1)
        {
            A6.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A6.setForeground(Color.decode("#2c3e50"));
            A6.setBackground(Color.decode("#1ABC9C"));
        }        
    }//GEN-LAST:event_A6MouseEntered

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        // TODO add your handling code here:
        if(Aflag[5]!=-1)
        {
        
            if(Aflag[5]==0)
            {
                if(count<seat_cnt)
                {               
                    A6.setForeground(Color.decode("#2c3e50"));
                    A6.setBackground(Color.decode("#1ABC9C"));
                    Areset[5]=1;
                    Aflag[5]=1;
                    count++;
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and row_no='A' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A6.setForeground(Color.decode("#7f8c8d"));
                A6.setBackground(Color.decode("#7f8c8d"));
                Areset[5]=0;
                Aflag[5]=0;
                count--;
                mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and row_no='A' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }           
        }
       if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A6MouseClicked

    private void A5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseExited
        // TODO add your handling code here:
        if(Aflag[4]!=-1)
        {
            if(Areset[4]==0)
             {
                 A5.setForeground(Color.decode("#7f8c8d"));
                 A5.setBackground(Color.decode("#7f8c8d"));
             } 
        }
    }//GEN-LAST:event_A5MouseExited

    private void A5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseEntered
        // TODO add your handling code here:
        if(Aflag[4]!=-1)
        {
            A5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A5.setForeground(Color.decode("#2c3e50"));
            A5.setBackground(Color.decode("#1ABC9C"));
        }
        
    }//GEN-LAST:event_A5MouseEntered

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        // TODO add your handling code here:
        if(Aflag[4]!=-1)
        {
            if(Aflag[4]==0)
            {
                if(count<seat_cnt)
                {
                    A5.setForeground(Color.decode("#2c3e50"));
                    A5.setBackground(Color.decode("#1ABC9C"));
                    Areset[4]=1;
                    Aflag[4]=1;
                    count++;
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and  row_no='A' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A5.setForeground(Color.decode("#7f8c8d"));
                A5.setBackground(Color.decode("#7f8c8d"));
                Areset[4]=0;
                Aflag[4]=0;
                count--;
                mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and  row_no='A' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A5MouseClicked

    private void A9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseExited
        // TODO add your handling code here:
        if(Aflag[8]!=-1)
        {
            if(Areset[8]==0)
            {
                A9.setForeground(Color.decode("#7f8c8d"));
                A9.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A9MouseExited

    private void A9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseEntered
        // TODO add your handling code here:
        if(Aflag[8]!=-1)
        {
            A9.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A9.setForeground(Color.decode("#2c3e50"));
            A9.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_A9MouseEntered

    private void A9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseClicked
        // TODO add your handling code here:
        if(Aflag[8]!=-1)
        {
            if(Aflag[8]==0)
             {
                 if(count<seat_cnt)
                {
                    A9.setForeground(Color.decode("#2c3e50"));
                    A9.setBackground(Color.decode("#1ABC9C"));
                    Areset[8]=1;
                    Aflag[8]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where   sch_id="+sid+" and row_no='A' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
             }
             else
             {
                 A9.setForeground(Color.decode("#7f8c8d"));
                 A9.setBackground(Color.decode("#7f8c8d"));
                 Areset[8]=0;
                 Aflag[8]=0;
                 count--;
                  mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and  row_no='A' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
             }
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A9MouseClicked

    private void A1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseExited
        // TODO add your handling code here:
        if(Aflag[0]!=-1)
        {
            if(Areset[0]==0)
            {
                A1.setForeground(Color.decode("#7f8c8d"));
                A1.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A1MouseExited

    private void A1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseEntered
        // TODO add your handling code here:
        if(Aflag[0]!=-1)
        {
            A1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A1.setForeground(Color.decode("#2c3e50"));
            A1.setBackground(Color.decode("#1ABC9C"));
        }   
    }//GEN-LAST:event_A1MouseEntered

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        // TODO add your handling code here:
        if(Aflag[0]!=-1)
        {
            if(Aflag[0]==0)
            {
                if(count<seat_cnt)
                {
                    A1.setForeground(Color.decode("#2c3e50"));
                    A1.setBackground(Color.decode("#1ABC9C"));
                    Areset[0]=1;
                    Aflag[0]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and  row_no='A' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A1.setForeground(Color.decode("#7f8c8d"));
                A1.setBackground(Color.decode("#7f8c8d"));
                Areset[0]=0;
                Aflag[0]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and  row_no='A' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A1MouseClicked

    private void A4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseExited
        // TODO add your handling code here:
        if(Aflag[3]!=-1)
        {
            if(Areset[3]==0)
            {
                A4.setForeground(Color.decode("#7f8c8d"));
                A4.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A4MouseExited

    private void A4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseEntered
        // TODO add your handling code here:
        if(Aflag[3]!=-1)
        {
            A4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A4.setForeground(Color.decode("#2c3e50"));
            A4.setBackground(Color.decode("#1ABC9C"));
        }   
    }//GEN-LAST:event_A4MouseEntered

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        // TODO add your handling code here
        if(Aflag[3]!=-1)
        {
            if(Aflag[3]==0)
            {
                if(count<seat_cnt)
                {
                    A4.setForeground(Color.decode("#2c3e50"));
                    A4.setBackground(Color.decode("#1ABC9C"));
                    Areset[3]=1;
                    Aflag[3]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and  row_no='A' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A4.setForeground(Color.decode("#7f8c8d"));
                A4.setBackground(Color.decode("#7f8c8d"));
                Areset[3]=0;
                Aflag[3]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and  row_no='A' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A4MouseClicked

    private void A3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseExited
        // TODO add your handling code here:
        if(Aflag[2]!=-1)
        {
            if(Areset[2]==0)
            {
                A3.setForeground(Color.decode("#7f8c8d"));
                A3.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A3MouseExited

    private void A3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseEntered
        // TODO add your handling code here:
        if(Aflag[2]!=-1)
        {
            A3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A3.setForeground(Color.decode("#2c3e50"));
            A3.setBackground(Color.decode("#1ABC9C"));
        }  
    }//GEN-LAST:event_A3MouseEntered

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        // TODO add your handling code here:
        if(Aflag[2]!=-1)
        {
            if(Aflag[2]==0)
            {
                if(count<seat_cnt)
                {
                    A3.setForeground(Color.decode("#2c3e50"));
                    A3.setBackground(Color.decode("#1ABC9C"));
                    Areset[2]=1;
                    Aflag[2]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and  row_no='A' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A3.setForeground(Color.decode("#7f8c8d"));
                A3.setBackground(Color.decode("#7f8c8d"));
                Areset[2]=0;
                Aflag[2]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and row_no='A' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A3MouseClicked

    private void A10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseExited
        // TODO add your handling code here:
        if(Aflag[9]!=-1)
        {
            if(Areset[9]==0)
            {
                A10.setForeground(Color.decode("#7f8c8d"));
                A10.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A10MouseExited

    private void A10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseEntered
        // TODO add your handling code here:
        if(Aflag[9]!=-1)
        {
            A10.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A10.setForeground(Color.decode("#2c3e50"));
            A10.setBackground(Color.decode("#1ABC9C"));
        } 
    }//GEN-LAST:event_A10MouseEntered

    private void A10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseClicked
        // TODO add your handling code here:
        if(Aflag[9]!=-1)
        {
            if(Aflag[9]==0)
            {
                if(count<seat_cnt)
                {
                    A10.setForeground(Color.decode("#2c3e50"));
                    A10.setBackground(Color.decode("#1ABC9C"));
                    Areset[9]=1;
                    Aflag[9]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and  row_no='A' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A10.setForeground(Color.decode("#7f8c8d"));
                A10.setBackground(Color.decode("#7f8c8d"));
                Areset[9]=0;
                Aflag[9]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and  row_no='A' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A10MouseClicked

    private void A2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseExited
        // TODO add your handling code here:
        if(Aflag[1]!=-1)
        {
            if(Areset[1]==0)
            {
                A2.setForeground(Color.decode("#7f8c8d"));
                A2.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A2MouseExited

    private void A2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseEntered
        // TODO add your handling code here:
        if(Aflag[1]!=-1)
        {
        A2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        A2.setForeground(Color.decode("#2c3e50"));
        A2.setBackground(Color.decode("#1ABC9C"));
        }
        
    }//GEN-LAST:event_A2MouseEntered

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        // TODO add your handling code here:
        if(Aflag[1]!=-1)
        {
            if(Aflag[1]==0)
            {
                if(count<seat_cnt)
                {
                    A2.setForeground(Color.decode("#2c3e50"));
                    A2.setBackground(Color.decode("#1ABC9C"));
                    Areset[1]=1;
                    Aflag[1]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and  row_no='A' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A2.setForeground(Color.decode("#7f8c8d"));
                A2.setBackground(Color.decode("#7f8c8d"));
                Areset[1]=0;
                Aflag[1]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='A' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
           
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A2MouseClicked

    private void A8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseExited
        // TODO add your handling code here:
        if(Aflag[7]!=-1)
        {
            if(Areset[7]==0)
            {
                A8.setForeground(Color.decode("#7f8c8d"));
                A8.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_A8MouseExited

    private void A8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseEntered
        // TODO add your handling code here:
        if(Aflag[7]!=-1)
        {
            A8.setCursor(new Cursor(Cursor.HAND_CURSOR));
            A8.setForeground(Color.decode("#2c3e50"));
            A8.setBackground(Color.decode("#1ABC9C"));
        }
       
    }//GEN-LAST:event_A8MouseEntered

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        // TODO add your handling code here:
        if(Aflag[7]!=-1)
        {
            if(Aflag[7]==0)
            {
                if(count<seat_cnt)
                {
                    A8.setForeground(Color.decode("#2c3e50"));
                    A8.setBackground(Color.decode("#1ABC9C"));
                    Areset[7]=1;
                    Aflag[7]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and row_no='A' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                A8.setForeground(Color.decode("#7f8c8d"));
                A8.setBackground(Color.decode("#7f8c8d"));
                Areset[7]=0;
                Aflag[7]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where  sch_id="+sid+" and row_no='A' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
        }  
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_A8MouseClicked

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        // TODO add your handling code here:
        //int i=Table.getSelectedRow();
        //TableModel model=Table.getModel();
        showTabledata();
        BtnConfirm.setVisible(false);
        BtnProceed.setVisible(true);
        BtnCancel.setVisible(true);
        
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void BtnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProceedActionPerformed
        /*
        mysqlconnector msq=new mysqlconnector();
        try 
        {
            Connection con = msq.getConnection();
            String query = "SELECT status FROM seat_list;";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {    
                int flag=rs.getInt("status");
                if(flag==1)  
                {
                    PreparedStatement pst1=con.prepareStatement("update seat_list set status=1 where  sch_id="+sid+" and status=1;");
                    pst1.executeUpdate();    
                }    
            }
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        */
        BtnCancel.setVisible(false);
        BtnProceed.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        new pay(seat_cnt).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnProceedActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        // TODO add your handling code here:
         mysqlconnector msq=new mysqlconnector();
        try 
        {
            Connection con = msq.getConnection();
            String query = "SELECT status FROM seat_list;";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {    
                int flag=rs.getInt("status");
                if(flag==1)  
                {
                    PreparedStatement pst1=con.prepareStatement("update seat_list set status=0 where sch_id="+sid+" and  status=1;");
                    pst1.executeUpdate();    
                }    
            }
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        // TODO add your handling code here:
        if(Bflag[7]!=-1)
        {
            if(Bflag[7]==0)
            {
                if(count<seat_cnt)
                {
                    B8.setForeground(Color.decode("#2c3e50"));
                    B8.setBackground(Color.decode("#1ABC9C"));
                    Breset[7]=1;
                    Bflag[7]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B8.setForeground(Color.decode("#7f8c8d"));
                B8.setBackground(Color.decode("#7f8c8d"));
                Breset[7]=0;
                Bflag[7]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
        }  
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B8MouseClicked

    private void B8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseEntered
        // TODO add your handling code here:
        if(Bflag[7]!=-1)
        {
            B8.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B8.setForeground(Color.decode("#2c3e50"));
            B8.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B8MouseEntered

    private void B8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseExited
        // TODO add your handling code here:
        if(Bflag[7]!=-1)
        {
            if(Breset[7]==0)
            {
                B8.setForeground(Color.decode("#7f8c8d"));
                B8.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B8MouseExited

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        // TODO add your handling code here:
        if(Bflag[1]!=-1)
        {
            if(Bflag[1]==0)
            {
                if(count<seat_cnt)
                {
                    B2.setForeground(Color.decode("#2c3e50"));
                    B2.setBackground(Color.decode("#1ABC9C"));
                    Breset[1]=1;
                    Bflag[1]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B2.setForeground(Color.decode("#7f8c8d"));
                B2.setBackground(Color.decode("#7f8c8d"));
                Breset[1]=0;
                Bflag[1]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
           
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B2MouseClicked

    private void B2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseEntered
        // TODO add your handling code here:
        if(Bflag[1]!=-1)
        {
            B2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B2.setForeground(Color.decode("#2c3e50"));
            B2.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B2MouseEntered

    private void B2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseExited
        // TODO add your handling code here:
        if(Bflag[1]!=-1)
        {
            if(Breset[1]==0)
            {
                B2.setForeground(Color.decode("#7f8c8d"));
                B2.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B2MouseExited

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        // TODO add your handling code here:
        if(Bflag[9]!=-1)
        {
            if(Bflag[9]==0)
            {
                if(count<seat_cnt)
                {
                    B10.setForeground(Color.decode("#2c3e50"));
                    B10.setBackground(Color.decode("#1ABC9C"));
                    Breset[9]=1;
                    Bflag[9]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B10.setForeground(Color.decode("#7f8c8d"));
                B10.setBackground(Color.decode("#7f8c8d"));
                Breset[9]=0;
                Bflag[9]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }

    }//GEN-LAST:event_B10MouseClicked

    private void B10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseEntered
        // TODO add your handling code here:
        if(Bflag[9]!=-1)
        {
            B10.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B10.setForeground(Color.decode("#2c3e50"));
            B10.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B10MouseEntered

    private void B10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseExited
        // TODO add your handling code here:
        if(Bflag[9]!=-1)
        {
            if(Breset[9]==0)
            {
                B10.setForeground(Color.decode("#7f8c8d"));
                B10.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B10MouseExited

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        // TODO add your handling code here:
        if(Bflag[2]!=-1)
        {
            if(Bflag[2]==0)
            {
                if(count<seat_cnt)
                {
                    B3.setForeground(Color.decode("#2c3e50"));
                    B3.setBackground(Color.decode("#1ABC9C"));
                    Breset[2]=1;
                    Bflag[2]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B3.setForeground(Color.decode("#7f8c8d"));
                B3.setBackground(Color.decode("#7f8c8d"));
                Breset[2]=0;
                Bflag[2]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B3MouseClicked

    private void B3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseEntered
        // TODO add your handling code here:
        if(Bflag[2]!=-1)
        {
            B3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B3.setForeground(Color.decode("#2c3e50"));
            B3.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B3MouseEntered

    private void B3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseExited
        // TODO add your handling code here:
        if(Bflag[2]!=-1)
        {
            if(Breset[2]==0)
            {
                B3.setForeground(Color.decode("#7f8c8d"));
                B3.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B3MouseExited

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        // TODO add your handling code here:
        if(Bflag[3]!=-1)
        {
            if(Bflag[3]==0)
            {
                if(count<seat_cnt)
                {
                    B4.setForeground(Color.decode("#2c3e50"));
                    B4.setBackground(Color.decode("#1ABC9C"));
                    Breset[3]=1;
                    Bflag[3]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B4.setForeground(Color.decode("#7f8c8d"));
                B4.setBackground(Color.decode("#7f8c8d"));
                Breset[3]=0;
                Bflag[3]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B4MouseClicked

    private void B4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseEntered
        // TODO add your handling code here:
        if(Bflag[3]!=-1)
        {
            B4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B4.setForeground(Color.decode("#2c3e50"));
            B4.setBackground(Color.decode("#1ABC9C"));
        } 
    }//GEN-LAST:event_B4MouseEntered

    private void B4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseExited
        // TODO add your handling code here:
        if(Bflag[3]!=-1)
        {
            if(Breset[3]==0)
            {
                B4.setForeground(Color.decode("#7f8c8d"));
                B4.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B4MouseExited

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        // TODO add your handling code here:
        if(Bflag[0]!=-1)
        {
            if(Bflag[0]==0)
            {
                if(count<seat_cnt)
                {
                    B1.setForeground(Color.decode("#2c3e50"));
                    B1.setBackground(Color.decode("#1ABC9C"));
                    Breset[0]=1;
                    Bflag[0]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B1.setForeground(Color.decode("#7f8c8d"));
                B1.setBackground(Color.decode("#7f8c8d"));
                Breset[0]=0;
                Bflag[0]=0;
                count--;
                 mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B1MouseClicked

    private void B1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseEntered
        // TODO add your handling code here:
        if(Bflag[0]!=-1)
        {
            B1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B1.setForeground(Color.decode("#2c3e50"));
            B1.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B1MouseEntered

    private void B1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseExited
        // TODO add your handling code here:
        if(Bflag[0]!=-1)
        {
            if(Breset[0]==0)
            {
                B1.setForeground(Color.decode("#7f8c8d"));
                B1.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B1MouseExited

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        // TODO add your handling code here:
         if(Bflag[8]!=-1)
        {
            if(Bflag[8]==0)
             {
                 if(count<seat_cnt)
                {
                    B9.setForeground(Color.decode("#2c3e50"));
                    B9.setBackground(Color.decode("#1ABC9C"));
                    Breset[8]=1;
                    Bflag[8]=1;
                    count++;
                     mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
             }
             else
             {
                 B9.setForeground(Color.decode("#7f8c8d"));
                 B9.setBackground(Color.decode("#7f8c8d"));
                 Breset[8]=0;
                 Bflag[8]=0;
                 count--;
                  mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
             }
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B9MouseClicked

    private void B9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseEntered
        // TODO add your handling code here:
        if(Bflag[8]!=-1)
        {
            B9.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B9.setForeground(Color.decode("#2c3e50"));
            B9.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B9MouseEntered

    private void B9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseExited
        // TODO add your handling code here:
        if(Bflag[8]!=-1)
        {
            if(Breset[8]==0)
            {
                B9.setForeground(Color.decode("#7f8c8d"));
                B9.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B9MouseExited

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        // TODO add your handling code here:
        if(Bflag[4]!=-1)
        {
            if(Bflag[4]==0)
            {
                if(count<seat_cnt)
                {
                    B5.setForeground(Color.decode("#2c3e50"));
                    B5.setBackground(Color.decode("#1ABC9C"));
                    Breset[4]=1;
                    Bflag[4]=1;
                    count++;
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B5.setForeground(Color.decode("#7f8c8d"));
                B5.setBackground(Color.decode("#7f8c8d"));
                Breset[4]=0;
                Bflag[4]=0;
                count--;
                mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }
            
        }
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B5MouseClicked

    private void B5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseEntered
        // TODO add your handling code here:
        if(Bflag[4]!=-1)
        {
            B5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B5.setForeground(Color.decode("#2c3e50"));
            B5.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B5MouseEntered

    private void B5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseExited
        // TODO add your handling code here:
        if(Bflag[4]!=-1)
        {
            if(Breset[4]==0)
             {
                 B5.setForeground(Color.decode("#7f8c8d"));
                 B5.setBackground(Color.decode("#7f8c8d"));
             } 
        }
    }//GEN-LAST:event_B5MouseExited

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        // TODO add your handling code here:
        if(Bflag[5]!=-1)
        {    
            if(Bflag[5]==0)
            {
                if(count<seat_cnt)
                {               
                    B6.setForeground(Color.decode("#2c3e50"));
                    B6.setBackground(Color.decode("#1ABC9C"));
                    Breset[5]=1;
                    Bflag[5]=1;
                    count++;
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                B6.setForeground(Color.decode("#7f8c8d"));
                B6.setBackground(Color.decode("#7f8c8d"));
                Breset[5]=0;
                Bflag[5]=0;
                count--;
                mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
            }       
        }
       if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B6MouseClicked

    private void B6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseEntered
        // TODO add your handling code here:
        if(Bflag[5]!=-1)
        {
            B6.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B6.setForeground(Color.decode("#2c3e50"));
            B6.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B6MouseEntered

    private void B6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseExited
        // TODO add your handling code here:
        if(Bflag[5]!=-1)
        {
            if(Breset[5]==0)
            {
                B6.setForeground(Color.decode("#7f8c8d"));
                B6.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B6MouseExited

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        // TODO add your handling code here:
        if(Bflag[6]!=-1)
        {
            if(Bflag[6]==0)
           {
               if(count<seat_cnt)
                {
                    B7.setForeground(Color.decode("#2c3e50"));
                    B7.setBackground(Color.decode("#1ABC9C"));
                    Breset[6]=1;
                    Bflag[6]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='B' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               B7.setForeground(Color.decode("#7f8c8d"));
               B7.setBackground(Color.decode("#7f8c8d"));
               Breset[6]=0;
               Bflag[6]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='B' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_B7MouseClicked

    private void B7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseEntered
        // TODO add your handling code here:
        if(Bflag[6]!=-1)
        {
            B7.setCursor(new Cursor(Cursor.HAND_CURSOR));
            B7.setForeground(Color.decode("#2c3e50"));
            B7.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_B7MouseEntered

    private void B7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseExited
        // TODO add your handling code here:
        if(Bflag[6]!=-1)
        {
            if(Breset[6]==0)
            {
                B7.setForeground(Color.decode("#7f8c8d"));
                B7.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_B7MouseExited

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        // TODO add your handling code here:
        if(Dflag[7]!=-1)
        {
            if(Dflag[7]==0)
           {
               if(count<seat_cnt)
                {
                    D8.setForeground(Color.decode("#2c3e50"));
                    D8.setBackground(Color.decode("#1ABC9C"));
                    Dreset[7]=1;
                    Dflag[7]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D8.setForeground(Color.decode("#7f8c8d"));
               D8.setBackground(Color.decode("#7f8c8d"));
               Dreset[7]=0;
               Dflag[7]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D8MouseClicked

    private void D8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseEntered
        // TODO add your handling code here:
        if(Dflag[7]!=-1)
        {
            D8.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D8.setForeground(Color.decode("#2c3e50"));
            D8.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D8MouseEntered

    private void D8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseExited
        // TODO add your handling code here:
        if(Dflag[7]!=-1)
        {
            if(Dreset[7]==0)
            {
                D8.setForeground(Color.decode("#7f8c8d"));
                D8.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D8MouseExited

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        // TODO add your handling code here:
        if(Dflag[1]!=-1)
        {
            if(Dflag[1]==0)
           {
               if(count<seat_cnt)
                {
                    D2.setForeground(Color.decode("#2c3e50"));
                    D2.setBackground(Color.decode("#1ABC9C"));
                    Dreset[1]=1;
                    Dflag[1]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D2.setForeground(Color.decode("#7f8c8d"));
               D2.setBackground(Color.decode("#7f8c8d"));
               Dreset[1]=0;
               Dflag[1]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D2MouseClicked

    private void D2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseEntered
        // TODO add your handling code here:
        if(Dflag[1]!=-1)
        {
            D2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D2.setForeground(Color.decode("#2c3e50"));
            D2.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D2MouseEntered

    private void D2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseExited
        // TODO add your handling code here:
        if(Dflag[1]!=-1)
        {
            if(Dreset[1]==0)
            {
                D2.setForeground(Color.decode("#7f8c8d"));
                D2.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D2MouseExited

    private void D10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D10MouseClicked
        // TODO add your handling code here:
        if(Dflag[9]!=-1)
        {
            if(Dflag[9]==0)
           {
               if(count<seat_cnt)
                {
                    D10.setForeground(Color.decode("#2c3e50"));
                    D10.setBackground(Color.decode("#1ABC9C"));
                    Dreset[9]=1;
                    Dflag[9]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D10.setForeground(Color.decode("#7f8c8d"));
               D10.setBackground(Color.decode("#7f8c8d"));
               Dreset[9]=0;
               Dflag[9]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D10MouseClicked

    private void D10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D10MouseEntered
        // TODO add your handling code here:
        if(Dflag[9]!=-1)
        {
            D10.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D10.setForeground(Color.decode("#2c3e50"));
            D10.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D10MouseEntered

    private void D10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D10MouseExited
        // TODO add your handling code here:
        if(Dflag[9]!=-1)
        {
            if(Dreset[9]==0)
            {
                D10.setForeground(Color.decode("#7f8c8d"));
                D10.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D10MouseExited

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        // TODO add your handling code here:
        if(Dflag[2]!=-1)
        {
            if(Dflag[2]==0)
           {
               if(count<seat_cnt)
                {
                    D3.setForeground(Color.decode("#2c3e50"));
                    D3.setBackground(Color.decode("#1ABC9C"));
                    Dreset[2]=1;
                    Dflag[2]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D3.setForeground(Color.decode("#7f8c8d"));
               D3.setBackground(Color.decode("#7f8c8d"));
               Dreset[2]=0;
               Dflag[2]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D3MouseClicked

    private void D3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseEntered
        // TODO add your handling code here:
        if(Dflag[2]!=-1)
        {
            D3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D3.setForeground(Color.decode("#2c3e50"));
            D3.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D3MouseEntered

    private void D3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseExited
        // TODO add your handling code here:
        if(Dflag[2]!=-1)
        {
            if(Dreset[2]==0)
            {
                D3.setForeground(Color.decode("#7f8c8d"));
                D3.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D3MouseExited

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        // TODO add your handling code here:
        if(Dflag[3]!=-1)
        {
            if(Dflag[3]==0)
           {
               if(count<seat_cnt)
                {
                    D4.setForeground(Color.decode("#2c3e50"));
                    D4.setBackground(Color.decode("#1ABC9C"));
                    Dreset[3]=1;
                    Dflag[3]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D4.setForeground(Color.decode("#7f8c8d"));
               D4.setBackground(Color.decode("#7f8c8d"));
               Dreset[3]=0;
               Dflag[3]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D4MouseClicked

    private void D4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseEntered
        // TODO add your handling code here:
        if(Dflag[3]!=-1)
        {
            D4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D4.setForeground(Color.decode("#2c3e50"));
            D4.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D4MouseEntered

    private void D4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseExited
        // TODO add your handling code here:
        if(Dflag[3]!=-1)
        {
            if(Dreset[3]==0)
            {
                D4.setForeground(Color.decode("#7f8c8d"));
                D4.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D4MouseExited

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        // TODO add your handling code here:
        if(Dflag[0]!=-1)
        {
            if(Dflag[0]==0)
           {
               if(count<seat_cnt)
                {
                    D1.setForeground(Color.decode("#2c3e50"));
                    D1.setBackground(Color.decode("#1ABC9C"));
                    Dreset[0]=1;
                    Dflag[0]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D1.setForeground(Color.decode("#7f8c8d"));
               D1.setBackground(Color.decode("#7f8c8d"));
               Dreset[0]=0;
               Dflag[0]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D1MouseClicked

    private void D1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseEntered
        // TODO add your handling code here:
        if(Dflag[0]!=-1)
        {
            D1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D1.setForeground(Color.decode("#2c3e50"));
            D1.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D1MouseEntered

    private void D1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseExited
        // TODO add your handling code here:
        if(Dflag[0]!=-1)
        {
            if(Dreset[0]==0)
            {
                D1.setForeground(Color.decode("#7f8c8d"));
                D1.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D1MouseExited

    private void D9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D9MouseClicked
        // TODO add your handling code here:
        if(Dflag[8]!=-1)
        {
            if(Dflag[8]==0)
           {
               if(count<seat_cnt)
                {
                    D9.setForeground(Color.decode("#2c3e50"));
                    D9.setBackground(Color.decode("#1ABC9C"));
                    Dreset[8]=1;
                    Dflag[8]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D9.setForeground(Color.decode("#7f8c8d"));
               D9.setBackground(Color.decode("#7f8c8d"));
               Dreset[8]=0;
               Dflag[8]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D9MouseClicked

    private void D9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D9MouseEntered
        // TODO add your handling code here:
        if(Dflag[8]!=-1)
        {
            D9.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D9.setForeground(Color.decode("#2c3e50"));
            D9.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D9MouseEntered

    private void D9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D9MouseExited
        // TODO add your handling code here:
        if(Dflag[8]!=-1)
        {
            if(Dreset[8]==0)
            {
                D9.setForeground(Color.decode("#7f8c8d"));
                D9.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D9MouseExited

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        // TODO add your handling code here:
        if(Dflag[4]!=-1)
        {
            if(Dflag[4]==0)
           {
               if(count<seat_cnt)
                {
                    D5.setForeground(Color.decode("#2c3e50"));
                    D5.setBackground(Color.decode("#1ABC9C"));
                    Dreset[4]=1;
                    Dflag[4]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D5.setForeground(Color.decode("#7f8c8d"));
               D5.setBackground(Color.decode("#7f8c8d"));
               Dreset[4]=0;
               Dflag[4]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D5MouseClicked

    private void D5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseEntered
        // TODO add your handling code here:
        if(Dflag[4]!=-1)
        {
            D5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D5.setForeground(Color.decode("#2c3e50"));
            D5.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D5MouseEntered

    private void D5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseExited
        // TODO add your handling code here:
        if(Dflag[4]!=-1)
        {
            if(Dreset[4]==0)
            {
                D5.setForeground(Color.decode("#7f8c8d"));
                D5.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D5MouseExited

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        // TODO add your handling code here:
        if(Dflag[5]!=-1)
        {
            if(Dflag[5]==0)
           {
               if(count<seat_cnt)
                {
                    D6.setForeground(Color.decode("#2c3e50"));
                    D6.setBackground(Color.decode("#1ABC9C"));
                    Dreset[5]=1;
                    Dflag[5]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D6.setForeground(Color.decode("#7f8c8d"));
               D6.setBackground(Color.decode("#7f8c8d"));
               Dreset[5]=0;
               Dflag[5]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D6MouseClicked

    private void D6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseEntered
        // TODO add your handling code here:
        if(Dflag[5]!=-1)
        {
            D6.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D6.setForeground(Color.decode("#2c3e50"));
            D6.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D6MouseEntered

    private void D6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseExited
        // TODO add your handling code here:
        if(Dflag[5]!=-1)
        {
            if(Dreset[5]==0)
            {
                D6.setForeground(Color.decode("#7f8c8d"));
                D6.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D6MouseExited

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        // TODO add your handling code here:
        if(Dflag[6]!=-1)
        {
            if(Dflag[6]==0)
           {
               if(count<seat_cnt)
                {
                    D7.setForeground(Color.decode("#2c3e50"));
                    D7.setBackground(Color.decode("#1ABC9C"));
                    Dreset[6]=1;
                    Dflag[6]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='D' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               D7.setForeground(Color.decode("#7f8c8d"));
               D7.setBackground(Color.decode("#7f8c8d"));
               Dreset[6]=0;
               Dflag[6]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='D' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_D7MouseClicked

    private void D7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseEntered
        // TODO add your handling code here:
        if(Dflag[6]!=-1)
        {
            D7.setCursor(new Cursor(Cursor.HAND_CURSOR));
            D7.setForeground(Color.decode("#2c3e50"));
            D7.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_D7MouseEntered

    private void D7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseExited
        // TODO add your handling code here:
        if(Dflag[6]!=-1)
        {
            if(Dreset[6]==0)
            {
                D7.setForeground(Color.decode("#7f8c8d"));
                D7.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_D7MouseExited

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        // TODO add your handling code here:
        if(Cflag[7]!=-1)
        {
            if(Cflag[7]==0)
           {
               if(count<seat_cnt)
                {
                    C8.setForeground(Color.decode("#2c3e50"));
                    C8.setBackground(Color.decode("#1ABC9C"));
                    Creset[7]=1;
                    Cflag[7]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C8.setForeground(Color.decode("#7f8c8d"));
               C8.setBackground(Color.decode("#7f8c8d"));
               Creset[7]=0;
               Cflag[7]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=8;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C8MouseClicked

    private void C8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseEntered
        // TODO add your handling code here:
        if(Cflag[7]!=-1)
        {
            C8.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C8.setForeground(Color.decode("#2c3e50"));
            C8.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C8MouseEntered

    private void C8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseExited
        // TODO add your handling code here:
        if(Cflag[7]!=-1)
        {
            if(Creset[7]==0)
            {
                C8.setForeground(Color.decode("#7f8c8d"));
                C8.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C8MouseExited

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        // TODO add your handling code here:
        if(Cflag[1]!=-1)
        {
            if(Cflag[1]==0)
           {
               if(count<seat_cnt)
                {
                    C2.setForeground(Color.decode("#2c3e50"));
                    C2.setBackground(Color.decode("#1ABC9C"));
                    Creset[1]=1;
                    Cflag[1]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C2.setForeground(Color.decode("#7f8c8d"));
               C2.setBackground(Color.decode("#7f8c8d"));
               Creset[1]=0;
               Cflag[1]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=2;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C2MouseClicked

    private void C2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseEntered
        // TODO add your handling code here:
        if(Cflag[1]!=-1)
        {
            C2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C2.setForeground(Color.decode("#2c3e50"));
            C2.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C2MouseEntered

    private void C2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseExited
        // TODO add your handling code here:
        if(Cflag[1]!=-1)
        {
            if(Creset[1]==0)
            {
                C2.setForeground(Color.decode("#7f8c8d"));
                C2.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C2MouseExited

    private void C10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseClicked
        // TODO add your handling code here:
        if(Cflag[9]!=-1)
        {
            if(Cflag[9]==0)
            {
               if(count<seat_cnt)
                {
                    C10.setForeground(Color.decode("#2c3e50"));
                    C10.setBackground(Color.decode("#1ABC9C"));
                    Creset[9]=1;
                    Cflag[9]=1;
                    count++;
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C10.setForeground(Color.decode("#7f8c8d"));
               C10.setBackground(Color.decode("#7f8c8d"));
               Creset[9]=0;
               Cflag[9]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=10;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C10MouseClicked

    private void C10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseEntered
        // TODO add your handling code here:
        if(Cflag[9]!=-1)
        {
            C10.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C10.setForeground(Color.decode("#2c3e50"));
            C10.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C10MouseEntered

    private void C10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseExited
        // TODO add your handling code here:
        if(Cflag[9]!=-1)
        {
            if(Creset[9]==0)
            {
                C10.setForeground(Color.decode("#7f8c8d"));
                C10.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C10MouseExited

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        // TODO add your handling code here:
        if(Cflag[2]!=-1)
        {
            if(Cflag[2]==0)
           {
               if(count<seat_cnt)
                {
                    C3.setForeground(Color.decode("#2c3e50"));
                    C3.setBackground(Color.decode("#1ABC9C"));
                    Creset[2]=1;
                    Cflag[2]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C3.setForeground(Color.decode("#7f8c8d"));
               C3.setBackground(Color.decode("#7f8c8d"));
               Creset[2]=0;
               Cflag[2]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=3;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C3MouseClicked

    private void C3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseEntered
        // TODO add your handling code here:
        if(Cflag[2]!=-1)
        {
            C3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C3.setForeground(Color.decode("#2c3e50"));
            C3.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C3MouseEntered

    private void C3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseExited
        // TODO add your handling code here:
        if(Cflag[2]!=-1)
        {
            if(Creset[2]==0)
            {
                C3.setForeground(Color.decode("#7f8c8d"));
                C3.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C3MouseExited

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        // TODO add your handling code here:
        if(Cflag[3]!=-1)
        {
            if(Cflag[3]==0)
           {
               if(count<seat_cnt)
                {
                    C4.setForeground(Color.decode("#2c3e50"));
                    C4.setBackground(Color.decode("#1ABC9C"));
                    Creset[3]=1;
                    Cflag[3]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C4.setForeground(Color.decode("#7f8c8d"));
               C4.setBackground(Color.decode("#7f8c8d"));
               Creset[3]=0;
               Cflag[3]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=4;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C4MouseClicked

    private void C4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseEntered
        // TODO add your handling code here:
        if(Cflag[3]!=-1)
        {
            C4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C4.setForeground(Color.decode("#2c3e50"));
            C4.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C4MouseEntered

    private void C4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseExited
        // TODO add your handling code here:
        if(Cflag[3]!=-1)
        {
            if(Creset[3]==0)
            {
                C4.setForeground(Color.decode("#7f8c8d"));
                C4.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C4MouseExited

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        // TODO add your handling code here:
        if(Cflag[0]!=-1)
        {
            if(Cflag[0]==0)
           {
               if(count<seat_cnt)
                {
                    C1.setForeground(Color.decode("#2c3e50"));
                    C1.setBackground(Color.decode("#1ABC9C"));
                    Creset[0]=1;
                    Cflag[0]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C1.setForeground(Color.decode("#7f8c8d"));
               C1.setBackground(Color.decode("#7f8c8d"));
               Creset[0]=0;
               Cflag[0]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=1;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
        if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C1MouseClicked

    private void C1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseEntered
        // TODO add your handling code here:
        if(Cflag[0]!=-1)
        {
            C1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C1.setForeground(Color.decode("#2c3e50"));
            C1.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C1MouseEntered

    private void C1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseExited
        // TODO add your handling code here:
        if(Cflag[0]!=-1)
        {
            if(Creset[0]==0)
            {
                C1.setForeground(Color.decode("#7f8c8d"));
                C1.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C1MouseExited

    private void C9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseClicked
        // TODO add your handling code here:
        if(Cflag[8]!=-1)
        {
            if(Cflag[8]==0)
           {
               if(count<seat_cnt)
                {
                    C9.setForeground(Color.decode("#2c3e50"));
                    C9.setBackground(Color.decode("#1ABC9C"));
                    Creset[8]=1;
                    Cflag[8]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C9.setForeground(Color.decode("#7f8c8d"));
               C9.setBackground(Color.decode("#7f8c8d"));
               Creset[8]=0;
               Cflag[8]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=9;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C9MouseClicked

    private void C9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseEntered
        // TODO add your handling code here:
        if(Cflag[8]!=-1)
        {
            C9.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C9.setForeground(Color.decode("#2c3e50"));
            C9.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C9MouseEntered

    private void C9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseExited
        // TODO add your handling code here:
        if(Cflag[8]!=-1)
        {
            if(Creset[8]==0)
            {
                C9.setForeground(Color.decode("#7f8c8d"));
                C9.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C9MouseExited

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        // TODO add your handling code here:
        if(Cflag[4]!=-1)
        {
            if(Cflag[4]==0)
           {
               if(count<seat_cnt)
                {
                    C5.setForeground(Color.decode("#2c3e50"));
                    C5.setBackground(Color.decode("#1ABC9C"));
                    Creset[4]=1;
                    Cflag[4]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C5.setForeground(Color.decode("#7f8c8d"));
               C5.setBackground(Color.decode("#7f8c8d"));
               Creset[4]=0;
               Cflag[4]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=5;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C5MouseClicked

    private void C5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseEntered
        // TODO add your handling code here:
        if(Cflag[4]!=-1)
        {
            C5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C5.setForeground(Color.decode("#2c3e50"));
            C5.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C5MouseEntered

    private void C5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseExited
        // TODO add your handling code here:
        if(Cflag[4]!=-1)
        {
            if(Creset[4]==0)
            {
                C5.setForeground(Color.decode("#7f8c8d"));
                C5.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C5MouseExited

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        // TODO add your handling code here:
        if(Cflag[5]!=-1)
        {
            if(Cflag[5]==0)
           {
               if(count<seat_cnt)
                {
                    C6.setForeground(Color.decode("#2c3e50"));
                    C6.setBackground(Color.decode("#1ABC9C"));
                    Creset[5]=1;
                    Cflag[5]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C6.setForeground(Color.decode("#7f8c8d"));
               C6.setBackground(Color.decode("#7f8c8d"));
               Creset[5]=0;
               Cflag[5]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=6;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C6MouseClicked

    private void C6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseEntered
        // TODO add your handling code here:
        if(Cflag[5]!=-1)
        {
            C6.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C6.setForeground(Color.decode("#2c3e50"));
            C6.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C6MouseEntered

    private void C6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseExited
        // TODO add your handling code here:
        if(Cflag[5]!=-1)
        {
            if(Creset[5]==0)
            {
                C6.setForeground(Color.decode("#7f8c8d"));
                C6.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C6MouseExited

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        // TODO add your handling code here:
        if(Cflag[6]!=-1)
        {
            if(Cflag[6]==0)
           {
               if(count<seat_cnt)
                {
                    C7.setForeground(Color.decode("#2c3e50"));
                    C7.setBackground(Color.decode("#1ABC9C"));
                    Creset[6]=1;
                    Cflag[6]=1;
                    count++;        
                    mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=1 where row_no='C' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }       
                }
           }
           else
           {
               C7.setForeground(Color.decode("#7f8c8d"));
               C7.setBackground(Color.decode("#7f8c8d"));
               Creset[6]=0;
               Cflag[6]=0;
               count--;
               mysqlconnector msq=new mysqlconnector();
                    try 
                    {
                        Connection con = msq.getConnection();
                        PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where row_no='C' and col_no=7;");
                        pst.executeUpdate();
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
           }   
        }//if
         if(count==seat_cnt)
            {
                BtnConfirm.setVisible(true);
                BtnCancel.setVisible(true);
            }
            else
            {
                BtnConfirm.setVisible(false);
                BtnCancel.setVisible(false);
            }
    }//GEN-LAST:event_C7MouseClicked

    private void C7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseEntered
        // TODO add your handling code here:
        if(Cflag[6]!=-1)
        {
            C7.setCursor(new Cursor(Cursor.HAND_CURSOR));
            C7.setForeground(Color.decode("#2c3e50"));
            C7.setBackground(Color.decode("#1ABC9C"));
        }
    }//GEN-LAST:event_C7MouseEntered

    private void C7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseExited
        // TODO add your handling code here:
        if(Cflag[6]!=-1)
        {
            if(Creset[6]==0)
            {
                C7.setForeground(Color.decode("#7f8c8d"));
                C7.setBackground(Color.decode("#7f8c8d"));
            } 
        }
    }//GEN-LAST:event_C7MouseExited

    private void CloseLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseClicked
        
        mysqlconnector msq=new mysqlconnector();
        try 
        {
            Connection con = msq.getConnection();
            PreparedStatement pst=con.prepareStatement("update seat_list set status=0 where status=1;");
            pst.executeUpdate();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        this.dispose();
        
    }//GEN-LAST:event_CloseLblMouseClicked

    private void CloseLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseEntered
        CloseLbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_CloseLblMouseEntered

    private void CloseLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLblMouseExited
        CloseLbl.setForeground(Color.GRAY);
    }//GEN-LAST:event_CloseLblMouseExited

    public void showTabledata()
    {
        mysqlconnector msq=new mysqlconnector();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        try 
        {
            Connection con = msq.getConnection();
            
            String query = "SELECT row_no,col_no FROM seat_list where sch_id="+sid+" and status=1;";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            int i = 0;
            while(rs.next())
            {
                i++;
                model.addRow(new Object[]{ 
                    //rs.getInt(1), 
                    rs.getString(1), 
                    rs.getInt(2),
                    //rs.getInt(4)
                }); 
                Table.setModel(model);      
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    } 
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A10;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel A9;
    private javax.swing.JLabel B;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JButton BtnProceed;
    private javax.swing.JLabel C;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel CloseLbl;
    private javax.swing.JLabel D;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D10;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel D9;
    private javax.swing.JLabel Movie;
    private javax.swing.JLabel Movie_name;
    private javax.swing.JLabel NoTickets;
    private javax.swing.JLabel NoTickets1;
    private javax.swing.JLabel Schedule2;
    private javax.swing.JLabel Schedule3;
    private javax.swing.JLabel ShowTime;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Theatre;
    private javax.swing.JLabel Theatre2;
    private javax.swing.JLabel Theatre_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelA;
    private javax.swing.JPanel panelB;
    private javax.swing.JPanel panelC;
    private javax.swing.JPanel panelD;
    // End of variables declaration//GEN-END:variables
}