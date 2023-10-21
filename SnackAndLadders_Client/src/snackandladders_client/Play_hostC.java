
package snackandladders_client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class Play_hostC extends JFrame implements ActionListener {
    
JFrame f=new JFrame();
    Font font=new Font("Monaco",Font.BOLD,40);
     Font font1=new Font("Monaco",Font.BOLD,20);
    
    //JLabel.....
 JLabel l=new JLabel("WELCOME TO MY GAME");
 JLabel l1=new JLabel("--------------------------------");
 JLabel l2=new JLabel("# Waiting For Client.......");
 JLabel l3=new JLabel("Conected Player : ");
 JLabel l4=new JLabel();
 JLabel l5=new JLabel();
  
  
  //JButton....
  JButton b=new JButton(new ImageIcon("Image\\BackButton.png"));
  JButton b1=new JButton(new ImageIcon("HOME"));
  JButton b2=new JButton(new ImageIcon("PLAY"));


   ///JPanel......
  Panel p=new Panel();
  Panel p1=new Panel();
  Panel p2=new Panel();
  Panel p3=new Panel();
  
  
  //variables...
 String port,userInput,s;
 int y,port1;
 String name1,name2,nmae3;
 
 ///sockets...
 
 PrintWriter out,out1 ;
  BufferedReader in,in1;
  Socket soc;
  ServerSocket ss;
  
    

    public Play_hostC(String s1,int port,String s2) {
        
        super("Snacks and Ladders_host");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,635);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
         name1=s1;
        name2=s2;
        System.out.println(name1  +  name2);
        
        p.setBounds(0,0,1000,600);
        p.setBackground(Color.BLUE);
        add(p);
        p.setLayout(null);
        
        b1.setBounds(10,540,100,50);
        b1.setBorder(new LineBorder(Color.BLACK));
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.red);
        b1.setText("HOME");
        b1.setFont(font1);
        p.add(b1);
        
        b1.addActionListener(this);
        
        l.setBounds(300,280,500,50);
        l.setForeground(Color.red);
        l.setFont(font);
        p.add(l);
        
    }
    
    
     public void actionPerformed(ActionEvent e) {
               
               if(e.getSource()==b1)
               {
                    new myframe().setVisible(true);
                    setVisible(false);
               }
               
        }
    
    
}
