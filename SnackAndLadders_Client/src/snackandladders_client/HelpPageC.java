
package snackandladders_client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpPageC extends JFrame{
    
   JFrame f=new JFrame();
   
   Font font=new Font("Monaco",Font.BOLD,40);
    Font font1=new Font("Monaco",Font.BOLD,20);
    
    //JLabel.....
  JLabel l=new JLabel(" HOW TO PLAY GAME ");
  JLabel l1=new JLabel("-----------------------------------------");
  JLabel l2=new JLabel(" 1. Each player puts their counter on the space that says 'start here'.");
  JLabel l3=new JLabel(" 2. Take it in turns to roll the dice. ...");
  JLabel l4=new JLabel(" 3. If your counter lands at the bottom of a ladder, you can move up to the top of the ladder.");
  JLabel l5=new JLabel(" 4. If your counter lands on the head of a snake, you must slide down to the bottom of the snake.");
  JLabel l6=new JLabel(new ImageIcon("Image\\Shamim.png"));
  
  
  //JButton....
  JButton b=new JButton(new ImageIcon("Image\\BackButton.png"));

  
  
  
  ///JScrollPanel
  
  JScrollPane sp;
  JScrollPane sp1=new JScrollPane();
  
  
  
  ///JPanel......
 // Panel p=new Panel();
  Panel p1=new Panel();
  Panel p2=new Panel();
  Panel p3=new Panel();
  Panel p4=new Panel();

   ///Border....
  
   Border bor = BorderFactory.createLineBorder(Color.GREEN);
    
    public HelpPageC()
    {
        
        super("Help Page");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,635);
        setLocationRelativeTo(null);
        setResizable(false);
        
        p1.setBounds(0,0,1000,635);
        p1.setBackground(Color.GREEN);
        p1.setFont(font);
        add(p1);
        
        p1.setLayout(null);
        l.setBounds(380,5,300,40);
        l.setForeground(Color.red);
        l.setFont(font1);
        p1.add(l);
        l1.setBounds(350,25,500,50);
        l1.setForeground(Color.BLUE);
        l1.setFont(font1);
        p1.add(l1);
        
        
        l2.setBounds(20,100,1000,50);
        l2.setForeground(Color.YELLOW);
        l2.setFont(font1);
        p1.add(l2);
        
        l3.setBounds(20,150,1000,50);
        l3.setForeground(Color.YELLOW);
        l3.setFont(font1);
        p1.add(l3);
        
        l4.setBounds(20,200,1000,50);
        l4.setForeground(Color.YELLOW);
        l4.setFont(font1);
        p1.add(l4);
        
        l5.setBounds(20,250,1000,50);
        l5.setForeground(Color.YELLOW);
        l5.setFont(font1);
        p1.add(l5);
        
        
        
        b.setBounds(10,500,100,50);
        p1.add(b);
       b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
           {
              new myframe().setVisible(true);
              setVisible(false);
           }
       });
        
        
        
   
    }
    
        
   
    
}
