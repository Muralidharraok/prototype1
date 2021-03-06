package prototype1;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
//import java.util.*;
//import prototype1.Client2;
//import prototype1.Deal;
//import prototype1.Info1;
import java.sql.*;



public class Prototype1{
    JFrame jf;
    JTabbedPane jt; 
    
     public Prototype1() throws SQLException
    {
        
         jf=new JFrame("Demo!");
         jf.setSize(600,600);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         jf.setLayout(new BorderLayout());
         jt=new JTabbedPane();
         jf.add(new TitlePane(), BorderLayout.NORTH);
         jt.addTab("DEAL",new Deal());
         jt.addTab("CLIENT",new Client2());
         jt.addTab("INFO",new Info1());
         jf.add(jt);
        
    }
     
    public static void main(String[] args) throws SQLException{
        Prototype1 p=new Prototype1();
        
    }   
}

 class TitlePane extends JPanel {

        public TitlePane() {
            setLayout(new BorderLayout());            
            setBorder(new CompoundBorder(new EmptyBorder(20,800, 20,20), new MatteBorder(1, 1, 2, 1, Color.GREEN)));
            JLabel label = new JLabel("AGENCY DATABASE");
            label.setFont(label.getFont().deriveFont(Font.BOLD));
            label.setFont(new Font("Lucida Sans Unicode", Font.ITALIC, 50));
            label.setForeground(Color.YELLOW);
            setBackground(Color.black);
            setLayout(new BorderLayout());            
            setBorder(new CompoundBorder(new EmptyBorder(10,10, 10,10), new MatteBorder(1, 1, 2, 1, Color.GREEN)));
            add(label);
        } 
         
    }   


