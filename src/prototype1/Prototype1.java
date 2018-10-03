package prototype1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.util.*;
import prototype1.Client2;
import prototype1.Deal;



public class Prototype1{
    JFrame jf;
    JTabbedPane jt;
    

    public Prototype1() //extends JFrame
    {
        
         jf=new JFrame("Demo!");
         jf.setSize(300,300);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         jf.setLayout(new BorderLayout());
         jt=new JTabbedPane();
         jf.add(new TitlePane(), BorderLayout.NORTH);
         jt.addTab("DEAL",new Deal());
         jt.addTab("CLIENT",new Client2());
         jf.add(jt);
    }
    public static void main(String[] args) {
        new Prototype1();
    }   
}

/*class Client extends JPanel implements ActionListener 
{
    JLabel l,l1,l2,l3,l4;
    JTextField t,t1,t2,t3;
    JButton b;
   Client()
    {
        //setLayout(new MigLayout("ins 15"));
        
        l=new JLabel("NAME:");
        t=new JTextField(10);
        l1=new JLabel("DOB:");
        t1=new JTextField(10);
        l2=new JLabel("ADDRESS:");
        t2=new JTextField(10);
        l3=new JLabel("PHONE NO:");
        t3=new JTextField(10);
        b=new JButton("SUBMIT");
        b.addActionListener(this);
        l4=new JLabel();
        //l4.setLocation(50,100);
        l4.setText(" FILL ALL DETAILS CORRECTLY ");
       
        add(l);
        add(t, "pushx, growx, wrap");
        add(l1);
        add(t1, "pushx, growx, wrap");
        add(l2);
        add(t2, "pushx, growx, wrap");
        add(l3);
        add(t3, "pushx, growx, wrap");
        add(l4);
        add(b,"span 2, split 2, center, gaptop 15");
       // pack();
    }
   public void actionPerformed(ActionEvent ae)
   {
    l4.setText("SUCCESSFULLY UPLOADED TO DATABASE !!!");
   }
}*/

/*public*/ class TitlePane extends JPanel {

        public TitlePane() {
            setLayout(new BorderLayout());            
            setBorder(new CompoundBorder(new EmptyBorder(20,800, 20,20), new MatteBorder(1, 1, 2, 1, Color.GREEN)));
            JLabel label = new JLabel("AGENCY DATABASE");
            label.setFont(label.getFont().deriveFont(Font.BOLD));
            label.setFont(new Font("Lucida Sans Unicode", Font.ITALIC, 50));
            label.setForeground(Color.YELLOW);
            setBackground(Color.black);
             //Date date = new Date();
            setLayout(new BorderLayout());            
            setBorder(new CompoundBorder(new EmptyBorder(10,10, 10,10), new MatteBorder(1, 1, 2, 1, Color.GREEN)));
            //JLabel labe2 = new JLabel();
            
            
            
            //setTitlePane().setBackground(Color.black);

            //label.setFont(label.getFont().deriveFont(Font.Color='RED'));
            add(label);
        } 
         
    }   


