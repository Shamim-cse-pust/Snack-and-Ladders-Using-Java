
package snackandladders_server;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class StartPage extends JFrame implements ActionListener{
    
    JFrame f=new JFrame();
    Font font=new Font("Monaco",Font.BOLD,40);
    Font font1=new Font("Monaco",Font.BOLD,20);
    
    //JLabel.....
  JLabel l=new JLabel(new ImageIcon("Image\\HostPage.png"));
  JLabel l1=new JLabel();
  JLabel l2=new JLabel("Name : ");
  
  
  //JTextField..........
  
  JTextField tx=new JTextField();
  JTextField tx1=new JTextField();
  
  
  //JButton....
  JButton b=new JButton("HOST");
  JButton b1=new JButton("JOIN");
  JButton b2=new JButton("HOME");
  JButton b3=new JButton(new ImageIcon("Image\\ExitButton.png"));
  JButton b4=new JButton("Click");

    String s="shamim";

    public StartPage() {
        
        super("Snacks and Ladders");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,635);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        l.setBounds(0,0,1000,600);
        add(l);
        
        b.setBounds(20,530,100,50);
        b.setBorder(new LineBorder(Color.BLACK));
        b.setBackground(Color.BLUE);
        b.setForeground(Color.red);
        b.setFont(font1);
        l.add(b);
        b1.setBounds(870,530,100,50);
        b1.setBorder(new LineBorder(Color.BLACK));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.red);
        b1.setFont(font1);
        l.add(b1);
        
        
        b2.setBounds(450,530,100,50);
        b2.setBorder(new LineBorder(Color.BLACK));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.red);
        b2.setFont(font1);
        l.add(b2);
        
        l2.setBounds(600,400,100,50);
        l2.setFont(font1);
        l2.setForeground(Color.red);
        l.add(l2);
        tx.setBounds(700,400,250,50);
        tx.setForeground(Color.BLUE);
        tx.setFont(font1);
        l.add(tx);
        
        
        
        
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
        
    }
     public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b)
            {
                   
              s=tx.getText();
              if(s.isEmpty())
              {
                  JOptionPane.showMessageDialog(null,"First Enter Your name", "Message", JOptionPane.PLAIN_MESSAGE);
              }
              else
              {
                  setVisible(false);
              new ConectPage(s).setVisible(true);
              
              }
            }
               
               
               if(e.getSource()==b1)
               {
              s=tx.getText();
              if(s.isEmpty())
              {
                  JOptionPane.showMessageDialog(null,"First Enter Your name", "Message", JOptionPane.PLAIN_MESSAGE);
              }
              else
              {
                  setVisible(false);
                  
              new JoinPage(s).setVisible(true);
              
              }
               }
               if(e.getSource()==b2)
               {
              new myframe().setVisible(true);
              setVisible(false);
               }
               
       }
}