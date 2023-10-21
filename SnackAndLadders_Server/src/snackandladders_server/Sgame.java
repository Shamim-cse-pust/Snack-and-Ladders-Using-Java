/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snackandladders_server;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Sgame extends JFrame implements ActionListener{
    
    
   public static JFrame f=new JFrame();
   public static Font font=new Font("Monaco",Font.BOLD,40);
   public static Font font1=new Font("Monaco",Font.BOLD,15);
   public static Font font2=new Font("Monaco",Font.BOLD,25);
    
    ///image
    
    public static ImageIcon img1 =new ImageIcon("Image\\dice1.png");
    public static ImageIcon img2 =new ImageIcon("Image\\dice2.png");
    public static ImageIcon img3 =new ImageIcon("Image\\dice3.png");
    public static ImageIcon img4 =new ImageIcon("Image\\dice4.png");
    public static ImageIcon img5 =new ImageIcon("Image\\dice5.png");
    public static ImageIcon img6 =new ImageIcon("Image\\dice6.png");
    public static ImageIcon img7 =new ImageIcon("Image\\gifdice.gif");
    
    
    
  //JLabel.....
  public static JLabel l=new JLabel(new ImageIcon("Image\\bord.jpg"));
  public static JLabel l1=new JLabel(new ImageIcon("Image\\name.png"));
  public static JLabel l2=new JLabel(new ImageIcon("Image\\person1.png"));
  public static JLabel l3=new JLabel(new ImageIcon("Image\\person2.png"));
  public static JLabel l4=new JLabel(new ImageIcon("Image\\start.jpg"));
  public static JLabel l5=new JLabel(new ImageIcon("Image\\start.jpg"));
  public static JLabel l6=new JLabel(new ImageIcon("Image\\person1.png"));
  public static JLabel l7=new JLabel(new ImageIcon("Image\\person2.png"));
  public static JLabel l8=new JLabel(new ImageIcon("Image\\gifdice.gif"));
  public static JLabel l9=new JLabel(img6);
  public static JLabel l10=new JLabel(new ImageIcon("Image\\person1.png"));
  //JLabel l11=new JLabel(new ImageIcon("Image\\dice5.png"));
  
  //JLabel l2=new JLabel("shamim");
  

    
 
  //JButton....
  public static JButton b=new JButton(new ImageIcon("Image\\about.gif"));
  public static JButton b1=new JButton(new ImageIcon("Image\\restart.png"));
  public static JButton b2=new JButton(new ImageIcon("Image\\start.gif"));
  public static JButton b3=new JButton("roll");
  public static JButton b4=new JButton(new ImageIcon("Image\\ExitButton.png"));
 //JButton b5=new JButton(new ImageIcon("Image\\person1.png"));

  
  
  ///JTextField....
  public static JTextField tf= new JTextField("shamim");
  public static JTextField tf1= new JTextField("mijan");
 /// JPanel.....
  
  
  public static JPanel p=new JPanel();
  public static JPanel p1=new JPanel();
 // JPanel p2=new JPanel((LayoutManager) new ImageIcon("Image\\bord.jpg"));
    
    
   public static int x1=2,y1=530,x2=177,y2=530,v=0,v1=0,start1=0,start2=0,a1=5,a2=546,c1=45,c2=546,ra,ra1;
    
    
    public static String name1="shamim",name2="mijan";
    
    public static ServerSocket ss;
    public static Socket s;
    
    
    public Sgame(String str5,String str6)
       {
           f.setTitle("Snakes and ladders host");
           
           
           //a1=6935;
           //c1=6975;
        
        
           
           
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(1000,639);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        
        
       name1=str5;
       name2=str6;
        
        
       l.setBounds(200,0,700, 600);
       f.add(l);
       p.setBounds(0,0,200, 639);
       p.setBackground(Color.GREEN);
       f.add(p);
       p1.setBounds(900,0,100, 600);
       p1.setBackground(Color.WHITE);
       f.add(p1);
       l1.setBounds(925,0,50, 610);
       p1.add(l1);
       p.setLayout(null);
       b1.setBounds(40,70,120,42);
       p.add(b1);
      
      tf.setBounds(40,140,150,40);
      tf.setFont(font1);
      tf.setBackground(Color.BLACK);
      tf.setForeground(Color.red);
      tf.setText(name1);
      p.add(tf);
      tf1.setBounds(40,220,150,40);
      tf1.setFont(font1);
      tf1.setBackground(Color.BLACK);
      tf1.setForeground(Color.red);
      tf1.setText(name2);
      p.add(tf1);
      
      l2.setBounds(10,130,20,52);
      p.add(l2);
      l3.setBounds(10,210,20,52);
      p.add(l3);
     
      l4.setBounds(25,450,150,150);
      p.add(l4);
      b2.setBounds(25,460,150,60);
      p.add(b2);
      
      b3.setBounds(25,380,120,40);
      b3.setBackground(Color.BLUE);
      b3.setForeground(Color.red);
      b3.setFont(font2);
      p.add(b3);
      
      l4.setLayout(null);
      l6.setBounds(x1,y1,20,52);
      p.add(l6);
      l7.setBounds(x2,y2,20,52);
      p.add(l7);

      l8.setBounds(20,310,49,49);
      p.add(l8);
      l9.setBounds(110,310,49,49);
      p.add(l9);
      f.setVisible(false);
      f.setVisible(true);
      
      b1.addActionListener(this);
      b3.addActionListener(this);
      
       new Thread(new sss()).start();

       }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1)
        {
            //super("Snacks and Ladders host");
            x1=2;y1=530;x2=177;y2=530;v=0;v1=0;start1=0;start2=0;a1=5;a2=546;c1=45;c2=546;

        
       l.setBounds(200,0,700, 600);
       f.add(l);
       p.setBounds(0,0,200, 639);
       p.setBackground(Color.GREEN);
       f.add(p);
       p1.setBounds(900,0,100, 600);
       p1.setBackground(Color.WHITE);
       f.add(p1);
       l1.setBounds(925,0,50, 610);
       p1.add(l1);
       p.setLayout(null);
       b1.setBounds(40,70,120,42);
       p.add(b1);
      
      tf.setBounds(40,140,150,40);
      tf.setFont(font1);
      tf.setBackground(Color.BLACK);
      tf.setForeground(Color.red);
      tf.setText(name1);
      p.add(tf);
      tf1.setBounds(40,220,150,40);
      tf1.setFont(font1);
      tf1.setBackground(Color.BLACK);
      tf1.setForeground(Color.red);
      tf1.setText(name2);
      p.add(tf1);
      
      l2.setBounds(10,130,20,52);
      p.add(l2);
      l3.setBounds(10,210,20,52);
      p.add(l3);
     
      l4.setBounds(25,450,150,150);
      p.add(l4);
      b2.setBounds(25,460,150,60);
      p.add(b2);
      
      b3.setBounds(25,380,120,40);
      b3.setBackground(Color.BLUE);
      b3.setForeground(Color.red);
      b3.setFont(font2);
      p.add(b3);
      
      l4.setLayout(null);
      l6.setBounds(x1,y1,20,52);
      p.add(l6);
      l7.setBounds(x2,y2,20,52);
      p.add(l7);

      l8.setBounds(20,310,49,49);
      p.add(l8);
      l9.setBounds(110,310,49,49);
      p.add(l9);
      f.setVisible(false);
      f.setVisible(true);
      
     // b1.addActionListener(this);
      //b3.addActionListener(this);
            
        }
        
        
       if(e.getSource()==b3)
               {
                // a1=6935;
                   new Thread(new sssA()).start();

               }
        
    }
    
}

