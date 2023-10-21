
package snackandladders_client;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class WinC extends JFrame implements ActionListener {
            
               //JLabel.....
  JLabel l=new JLabel(new ImageIcon("Image\\result.png"));
  JLabel l1=new JLabel();
  JLabel l2=new JLabel(new ImageIcon("Image\\person1.png"));
  
  
  //JLabel l2=new JLabel("shamim");
  

    
 
  //JButton....
  JButton b1=new JButton(new ImageIcon("Image\\restart.png"));
  JButton b2=new JButton(new ImageIcon("HOME"));
 //JButton b5=new JButton(new ImageIcon("Image\\person1.png"));
        
        Font font=new Font("Monaco",Font.BOLD,100);
    Font font1=new Font("Monaco",Font.BOLD,15);
    Font font2=new Font("Monaco",Font.BOLD,25);
    
String name1,name2,name3;

    public WinC(String str1,String str2,String str3) {
        
        super("Snack and ladde client");
        
        name1=str1;
        name2=str2;
        name3=str3;
        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,639);
        setLocationRelativeTo(null);
        setResizable(false);
        
       l.setBounds(0,0,1000, 600);
       add(l);
       l.setLayout(null);
       b1.setBounds(70,530,120,42);
       l.add(b1);
       l1.setText(name3);
       l1.setBounds(250,250,500,150);
       l1.setForeground(Color.green);
       l1.setFont(font);
       l.add(l1);
       
        b2.setBounds(850,540,100,50);
        b2.setBorder(new LineBorder(Color.BLACK));
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.red);
        b2.setText("HOME");
        b2.setFont(font1);
        l.add(b2);
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       
       
       
        
        
    }
     public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==b1)
               {
                   setVisible(false);
                   new Cgame(name1,name2).setVisible(true);
               }
            if(e.getSource()==b2)
               {
                    new myframe().setVisible(true);
                    setVisible(false);
               }
            
        
     }
    
}
