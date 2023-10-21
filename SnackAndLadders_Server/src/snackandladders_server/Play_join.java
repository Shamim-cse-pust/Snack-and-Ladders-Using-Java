package snackandladders_server;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Play_join extends JFrame implements ActionListener{
    
JFrame f=new JFrame();
    Font font=new Font("Monaco",Font.BOLD,40);
    Font font1=new Font("Monaco",Font.BOLD,15);
    Font font2=new Font("Monaco",Font.BOLD,25);
    
    ///image
    
    ImageIcon img1 =new ImageIcon("Image\\dice1.png");
    ImageIcon img2 =new ImageIcon("Image\\dice2.png");
    ImageIcon img3 =new ImageIcon("Image\\dice3.png");
    ImageIcon img4 =new ImageIcon("Image\\dice4.png");
    ImageIcon img5 =new ImageIcon("Image\\dice5.png");
    ImageIcon img6 =new ImageIcon("Image\\dice6.png");
    ImageIcon img7 =new ImageIcon("Image\\gifdice.gif");
    
    
    
  //JLabel.....
  JLabel l=new JLabel(new ImageIcon("Image\\bord.jpg"));
  JLabel l1=new JLabel(new ImageIcon("Image\\name.png"));
  JLabel l2=new JLabel(new ImageIcon("Image\\person1.png"));
  JLabel l3=new JLabel(new ImageIcon("Image\\person2.png"));
  JLabel l4=new JLabel(new ImageIcon("Image\\start.jpg"));
  JLabel l5=new JLabel(new ImageIcon("Image\\start.jpg"));
  JLabel l6=new JLabel(new ImageIcon("Image\\person1.png"));
  JLabel l7=new JLabel(new ImageIcon("Image\\person2.png"));
  JLabel l8=new JLabel(new ImageIcon("Image\\gifdice.gif"));
  JLabel l9=new JLabel(img6);
  JLabel l10=new JLabel(new ImageIcon("Image\\person1.png"));
  //JLabel l11=new JLabel(new ImageIcon("Image\\dice5.png"));
  
  //JLabel l2=new JLabel("shamim");
  

    
 
  //JButton....
  //JButton b=new JButton(new ImageIcon("Image\\about.gif"));
  JButton b1=new JButton(new ImageIcon("Image\\home.jpg"));
  JButton b2=new JButton(new ImageIcon("Image\\start.gif"));
  JButton b3=new JButton("roll");
  JButton b4=new JButton(new ImageIcon("Image\\ExitButton.png"));
 //JButton b5=new JButton(new ImageIcon("Image\\person1.png"));

  
  
  ///JTextField....
  JTextField tf= new JTextField();
  JTextField tf1= new JTextField();
 /// JPanel.....
  
  
  JPanel p=new JPanel();
  JPanel p1=new JPanel();
 // JPanel p2=new JPanel((LayoutManager) new ImageIcon("Image\\bord.jpg"));
    
    
    int x1=2,y1=530,x2=177,y2=530,v=0,start1=0,start2=0,a1=5,a2=546,c1=45,c2=546,ra;
    
    
    
  
  //variables...
 String port,userInput,s;
 int y,port1;
 String name1,name2,name3;
 
 ///sockets...
 
 PrintWriter out,out1 ;
  BufferedReader in,in1;
  Socket soc;
  ServerSocket ss;
  

    public Play_join(String s1,int port,String s2) {
        
       super("Snacks and Ladders join");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,639);
        setLocationRelativeTo(null);
        setResizable(false);
        
        name1=s1;
        name2=s2;
        port1=port;
        
        tf.setText(name2);
        tf1.setText(name1);
        System.out.println(name1  +  name2);
        
        
        
        l.setBounds(200,0,700, 600);
       add(l);
       p.setBounds(0,0,200, 639);
       p.setBackground(Color.GREEN);
       add(p);
       p1.setBounds(900,0,100, 600);
       p1.setBackground(Color.WHITE);
       add(p1);
       l1.setBounds(925,0,50, 610);
       p1.add(l1);
      p.setLayout(null);
      b1.setBounds(40,70,120,42);
      p.add(b1);
      
      tf.setBounds(40,140,150,40);
      tf.setFont(font1);
      tf.setBackground(Color.BLACK);
      tf.setForeground(Color.red);
      p.add(tf);
      tf1.setBounds(40,220,150,40);
      tf1.setFont(font1);
      tf1.setBackground(Color.BLACK);
      tf1.setForeground(Color.red);
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
        
      
      
       
      
      
      
      
      
      try
      {
          soc=new Socket("localhost",port1);
//          DataInputStream din=new DataInputStream(soc.getInputStream());  
//
//                String str="",str2="";  
//                while(!str.equals("stop")){  
//                str=din.readUTF();    
//                }  
//                din.close();  
//                soc.close();  
//                ss.close();  
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      System.out.println("Connected");
       
      
      b1.addActionListener(this);
        
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
               
               if(e.getSource()==b1)
               {
                    new myframe().setVisible(true);
                    setVisible(false);
               }
               
        }
    
}
