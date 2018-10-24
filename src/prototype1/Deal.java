
package prototype1;

import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.*;

public class Deal extends javax.swing.JPanel {

    static Connection con;
    static Statement stm;
    static ResultSet rs;

    public Deal() throws SQLException{
        initComponents();
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost/agency","root","rao");
             stm=con.createStatement();
         }
         catch(ClassNotFoundException e)
          {
              System.out.println("Unable to load the driver"); 
          }
         catch(SQLException e)
         {
             System.out.println("Connection not established"+e); 
         }
         String s="select * from company";
         rs= stm.executeQuery(s);
         String r;
         String d[]=new String[5];
         int i=0;
         while(rs.next())
         {
             r=rs.getInt(1)+"                              "+rs.getString(2)+"                "
                     + ""+rs.getInt(3);
             d[i]=r;
             i=i+1;
         }
        jLabel6.setText(d[0]);
        jLabel7.setText(d[1]);
        jLabel8.setText(d[2]);
        jLabel9.setText(d[3]);
        jLabel10.setText(d[4]);
        get_trans();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(175, 255, 255));

        jLabel1.setText("NO. OF STOCKS:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("COMPANY :");

        jButton1.setText("BUY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("ENTER CUSTOMER ID :");

        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("COMPANY ID             COMPANY  NAME   &   PRICE");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("jLabel8");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("jLabel9");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(84, 84, 84))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("BUY", jPanel1);

        jPanel2.setBackground(new java.awt.Color(175, 255, 255));

        jLabel3.setText("COMPANY :");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel11.setText("CLIENT ID:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel12.setText("NO. OF STOCKS:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(jTextField5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("SELL", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try{
            buy_stock();
            get_trans();
            get_trans2();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
     
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
  
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
      
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try{
            disp_client();
        }
        catch(Exception e)
        {   
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        try{
            sell_stock();
            get_trans();
            get_trans2();
        }catch(Exception e)
        {
              System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    void disp_client() throws SQLException
    {
        int idc=Integer.parseInt(jTextField4.getText());
        String s7="Select stock_no,c.comp_id,company_name from stock_details as s,company as c where s.id="+idc+" and s.comp_id=c.comp_id;";
        rs=stm.executeQuery(s7);
        String e[]=new String[25],ex;
        int i=0;
        while(rs.next())
        {
            ex=" "+rs.getInt(1)+"                                                    "+rs.getInt(2)+"                                   "+rs.getString(3)+"\n";
            e[i]=ex;
            i++;
        }
      jTextArea2.setFont(new Font("Serif", Font.BOLD, 15));
          jTextArea2.setText(" No. of Stocks                           Company ID                     Company Name\n");
      
        for(int j=0;j<i;j++)
        {
            jTextArea2.append(e[j]);
        }
    }
    void buy_stock() throws SQLException
    {
        int ide =Integer.parseInt( jTextField2.getText());
        int cid=Integer.parseInt(jTextField3.getText());
        int ns=Integer.parseInt(jTextField1.getText());
        String s2="select balance from balance_details where bank_id="+ide+";";
         rs=stm.executeQuery(s2);
        rs.next();
        int b=rs.getInt(1);
        String s3="select price from company where comp_id="+cid+";";
         rs=stm.executeQuery(s3);
        rs.next();
        int pri=rs.getInt(1);
      
        double amt=ns*pri;
        if(amt<=b)
        {
        String s="select stock_no from stock_details where id="+ide+" and comp_id="+cid+";";
        rs=stm.executeQuery(s);
        rs.next();
        int x=rs.getInt(1);
        x=x+ns;
        String s1="update stock_details set stock_no="+x+" where id="+ide+" and comp_id="+cid+";";
        stm.executeUpdate(s1);
        double n_bal=b-amt;
            String s4="update balance_details set balance="+n_bal+" where bank_id="+ide+";";
           stm.executeUpdate(s4);
          jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        JOptionPane.showMessageDialog(jTabbedPane1, "Transaction successful");
        double profit=amt*0.002;
         String s5="Insert into transaction values("+ide+","+cid+",'B',"+ns+","+profit+")";
          stm.executeUpdate(s5);
        }
        else
        {
             jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        JOptionPane.showMessageDialog(jTabbedPane1, "Transaction not successful. Insufficient Balance!");
        }
            
    }
   
    void get_trans() throws SQLException
    {
        String s6="Select * from transaction";
        rs=stm.executeQuery(s6);
        String r[]=new String[25],rx;
        int i=0;
    
        while(rs.next())
        {
            rx="  "+rs.getInt(1)+"                   "+rs.getInt(2)+"                     "+rs.getString(3)+"                     "+rs.getInt(4)+"                         "+rs.getDouble(5)+"\n";
         r[i]=rx;
             i=i+1;
         }
          jTextArea1.setFont(new Font("Serif", Font.BOLD, 17));
          jTextArea1.setText(" Client ID     Company ID      BUY/SELL        No. of Stocks       Profit\n");
      
        jTextArea1.setFont(new Font("Serif", Font.BOLD, 14));
        for(int j=0;j<i;j++)
        {
            jTextArea1.append(r[j]);
        }
    }
    
    void sell_stock() throws SQLException
    {
         int idc=Integer.parseInt(jTextField4.getText());
         int cids=Integer.parseInt(jTextField5.getText()); 
         int nss=Integer.parseInt(jTextField6.getText());
         String s2="select balance from balance_details where bank_id="+idc+";";
         rs=stm.executeQuery(s2);
         rs.next();
         int b=rs.getInt(1);
       
         String s3="select price from company where comp_id="+cids+";";
         rs=stm.executeQuery(s3);
         rs.next();
         int pri=rs.getInt(1);
         int amt=nss*pri;
                 String s9="select stock_no from stock_details where id="+idc+" and comp_id="+cids+";";
        rs=stm.executeQuery(s9);
        rs.next();
        int xs=rs.getInt(1);

        if (nss<=xs)
        {
      
            int n_xs=xs-nss;
            double n_amt=amt-(amt*0.002);
            double n_bal=b+n_amt;
            String s4="update balance_details set balance="+n_bal+" where bank_id="+idc+";";
            stm.executeUpdate(s4);
          
            String s5="update stock_details set stock_no="+n_xs+" where id="+idc+" and comp_id="+cids+";";
            stm.executeUpdate(s5);
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            JOptionPane.showMessageDialog(jTabbedPane1, "Transaction successful");
            double profit=amt*0.002;
            String s6="Insert into transaction values("+idc+","+cids+",'S',"+nss+","+profit+")";
            stm.executeUpdate(s6);
            
         }
        else
        {
                jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
              JOptionPane.showMessageDialog(jTabbedPane1, "Transaction not successful. Insufficient stocks!");
        }
        
    }
     void get_trans2() throws SQLException
    {
        String s6="Select * from transaction";
        rs=stm.executeQuery(s6);
        String r[]=new String[25],rx;
        int i=0;
        while(rs.next())
        {
            rx="  "+rs.getInt(1)+"                   "+rs.getInt(2)+"                     "+rs.getString(3)+"                     "+rs.getInt(4)+"                         "+rs.getDouble(5)+"\n";
         r[i]=rx;
             i=i+1;
         }
          jTextArea3.setFont(new Font("Serif", Font.BOLD, 17));
          jTextArea3.setText(" Client ID     Company ID      BUY/SELL        No. of Stocks       Profit\n");
      
        jTextArea3.setFont(new Font("Serif", Font.BOLD, 14));
        for(int j=0;j<i;j++)
        {
            jTextArea3.append(r[j]);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
