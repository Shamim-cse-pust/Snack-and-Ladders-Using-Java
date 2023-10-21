
package snackandladders_server;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;  



public class SnackAndLadders_Server {
    
    public static void main(String[] args) {
        new myframe();
         
           
    }
    
}


class myframe extends JFrame implements ActionListener
{
    JFrame f=new JFrame();
    Font font=new Font("Monaco",Font.BOLD,40);
    
    //JLabel.....
  JLabel l=new JLabel(new ImageIcon("Image\\frontpage.png"));
  JLabel l1=new JLabel("shamim");
  
  
  //JButton....
  JButton b=new JButton(new ImageIcon("Image\\StartButton.png"));
  JButton b1=new JButton(new ImageIcon("Image\\AboutButton.png"));
  JButton b2=new JButton(new ImageIcon("Image\\HelpButton.png"));
  JButton b3=new JButton(new ImageIcon("Image\\ExitButton.png"));
  JButton b4=new JButton("Click");

  
  
       public myframe()
       {
           
        super("Snacks and Ladders");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,635);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        
        
        
        
        l.setBounds(0,0,1000, 600);
        add(l);
        
        
        b.setBounds(850,175,100, 50);
        b1.setBounds(850,250,100, 50);
        b2.setBounds(850,325,100, 50);
        b3.setBounds(850,400,100, 50);
        l.add(b);l.add(b1);l.add(b2);l.add(b3);
        
        
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
      
       }
       
       
       public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b)
               {
                   new StartPage().setVisible(true);
                   setVisible(false);
               }
               if(e.getSource()==b1)
               {
                   new AboutPage().setVisible(true);
                   setVisible(false);
               }
               if(e.getSource()==b2)
               {
                  new HelpPage().setVisible(true);
                   setVisible(false);
               }
               if(e.getSource()==b3)
               {
                   System.exit(0);
               }
        }
       
}
