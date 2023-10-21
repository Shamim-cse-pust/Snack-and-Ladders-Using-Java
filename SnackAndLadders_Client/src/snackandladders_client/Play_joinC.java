package snackandladders_client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Play_joinC extends JFrame implements ActionListener{
    
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
    
    
    int x1=2,y1=530,x2=177,y2=530,v=0,v1=0,start1=0,start2=0,a1=5,a2=546,c1=45,c2=546,ra,ra1,ttt=0;
    
    
    
    
    
    
    
  
  //variables...
 String port,userInput;
 int y,port1;
 String name1,name2,name3;
 
 ///sockets...
 
 Socket s;
 DataInputStream din;
 DataOutputStream dout,dout1;
  

    public Play_joinC(String s1,int port,String s2) {
        
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
        
      
      b1.addActionListener(this);
      b3.addActionListener(this);
      
       try
        {
             s=new Socket("localhost",port1);
             System.out.println("CONECTED");

        }
        catch(Exception f)
        {
            System.out.println(f);
        }
      
      
     
      try
           {
               
              
               din=new DataInputStream(s.getInputStream());  
                
               
               String str1;  
               while(true)
               {
                   
                   
                   str1=din.readUTF();  
                   ra1=Integer.parseInt(str1); 
                     System.out.println(ra1);
                   
                   
                     if(v==0){
                     switch(ra1)
                    {
                        
                        case 1:
                           l9.setIcon(img1);
                           
                           if(start1==0)
                           {
                               
                               System.out.println("shamim");
                                x1=5;
                                y1=546;
                                l6.setBounds(x1,y1,20,52);
                                l.add(l6);
                                
                                l6.setLocation(x1,y1);
                                start1=1;
                               l.setVisible(false);
                               l.setVisible(true);
                                break;
                           }
                           if(start1==1)
                           {
                               run1(); 
                               break;
                           }
                              break; 
                           
                           
                           
                          

                        case 2:
                           l9.setIcon(img2);
                           
                          if(start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           
                           break;
                           
                        case 3:
                           l9.setIcon(img3);
                           
                          if(start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           break;
                           
                       case 4:
                           l9.setIcon(img4);
                           
                           if(start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           break;
                           
                        case 5:
                           l9.setIcon(img5);
                           
                           if(start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                           
                           
                           
                           break;
                           
                        case 6:
                           l9.setIcon(img6);
                           if(start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                           
                           
                           
                           break;
                            
                    }   
                     
                      if(ra1>1) v=1;
               }
                    
                     
                     if(a1==6935)
                     {
                         System.out.println("player 1 is champion");
                         //exit(0);
                     }
                     if(c1==6975)
                     {
                         System.out.println("player 2 is champion");
                         //exit(0);
                     }

                       
                     
               }

                     
               }
               
           
           catch(Exception e)
           {
               System.out.println(e);
           }
      
      
       
       
      
      
        
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
               
               if(e.getSource()==b1)
               {
                    new myframe().setVisible(true);
                    try
                    {
                        s.close();

                    }
                    catch(Exception f)
                    {
                        System.out.println(f);
                    }
                    setVisible(false);
               }
               
               
               
               
               if(e.getSource()==b3)
               {
       
                    Random rand = new Random();
                    ra = rand.nextInt(6);
                    if(ra==0) ra=6;
                    String str1 = Integer.toString(ra); 
                    
               try {  
                dout=new DataOutputStream(s.getOutputStream());
               dout.writeUTF(str1);  
               dout.flush();  
                 }
           catch (Exception ex)
           {
               System.out.println(ex);
           }
               
              if(v==1){
               switch(ra)
                    {
                        
                        case 1:
                           l9.setIcon(img1);
                           if( start2==0)
                           {
                                x2=45;
                                y2=546;
                                l7.setBounds(x2,y2,20,52);
                                l.add(l7);
                                start2=1;
                              
                                break;
                           }
                           
                              if(start2==1)
                              {
                                  run2();
                                  break;
                              }
                               
                          
                               break;
                          
                           
                        
                        case 2:
                           l9.setIcon(img2);
                           
                         
                           if(start2==1)
                           {
                               run2();
                               break;   
                           }
                         
                           break;
                           
                        case 3:
                           l9.setIcon(img3);
                           
                          
                           if(start2==1)
                           {
                               run2();
                               break;   
                           }
                           
                       
                           break;
                           
                       case 4:
                           l9.setIcon(img4);
                           
                          
                           if(start2==1)
                           {
                               run2();
                               break;   
                           }
                        
                           break;
                           
                        case 5:
                           l9.setIcon(img5);
                           
                           
                           if( start2==1)
                           {
                               run2();
                               break;   
                           }
                          
                           break;
                           
                        case 6:
                           l9.setIcon(img6);
                          
                           if(start2==1)
                           {
                               run2();
                               break;   
                           }

                           break;
                            
                    } 
               if(ra>1) v=0;
              }
              
                     
                     if(a1==6935)
                     {
                         System.out.println("player 1 is champion");
                         //exit(0);
                     }
                     if(c1==6975)
                     {
                         System.out.println("player 2 is champion");
                         //exit(0);
                     } 
               
               
               
               
               
               }
               
               
               
               
               
               
               
        }
    
    
    public void run1() {
        int p=0;
        if((a1+(70*ra1))>7000)
        {
            p=1;
        }
        
        for(int i=0;i<ra1;i++)
        {
            if(p==1) break;
             a1=a1+70;
             calculation1();
             //System.out.println(a1);

        
    }
        
        snack_ladder1();
  }
    
     public void calculation1() {
             a2=a1/700;
             if(a2%2==0)
             {
                x1=a1%700;
                y1=546-(a2*60);
                l6.setLocation(x1,y1);
             }
             else
             {
                x1=700-(a1%700)-60;
                y1=546-(a2*60);
                l6.setLocation(x1,y1);
             }
  
    }
      private void snack_ladder1() {
        
        if(a1==215)
        {
            a1=1685;
            calculation1();
        }
        else if(a1==845)
        {
            a1=3155;
            calculation1();
        }
       else if(a1==2245)
        {
            a1=3365;
            calculation1();
        }
       else if(a1==3435)
        {
            a1=4765;
            calculation1();
        }
       else if(a1==2875)
        {
            a1=4345;
            calculation1();
        }
       else if(a1==4275)
        {
            a1=5605;
            calculation1();
        }
       else if(a1==5115)
        {
            a1=6375;
            calculation1();
        }
       else if(a1==1825)
        {
            a1=285;
            calculation1();
        }
        else if(a1==2735)
        {
            a1=145;
            calculation1();
        }
        else if(a1==2945)
        {
            a1=1195;
            calculation1();
        }
        else if(a1==3715)
        {
            a1=2105;
            calculation1();
        }
        else if(a1==4555)
        {
            a1=3085;
            calculation1();
        }
        else if(a1==5255)
        {
            a1=3995;
            calculation1();
        }
        else if(a1==6165)
        {
            a1=3645;
            calculation1();
        }
        else if(a1==6865)
        {
            a1=2805;
            calculation1();
        }
       
        
    }
      
      
      
      
      
      
      
      
      
      
      public void run2() {
       
       
        int p=0;
        if((c1+(70*ra))>7000)
        {
            p=1;
        }
       
          for(int i=0;i<ra;i++)
            {
                if(p==1) break;
                 c1=c1+70;
                 calculation2();

            }
          snack_ladder2();
    }

      
      
      public void calculation2() 
    {
        
                 c2=c1/700;
                 if(c2%2==0)
                 {
                    x2=c1%700;
                    y2=546-(c2*60);
                    l7.setBounds(x2,y2,20,52);
                    l.add(l7);
                 }
                 else
                 {
                    x2=700-(c1%700)+20;
                    y2=546-(c2*60);
                    l7.setBounds(x2,y2,20,52);
                    l.add(l7);
                 }
    }

      
      private void snack_ladder2() {
        
        if(c1==215+40)
        {
            c1=1685+40;
            calculation2();
        }
        else if(c1==845+40)
        {
            c1=3155+40;
            calculation2();
        }
       else if(c1==2245+40)
        {
            c1=3365+40;
            calculation2();
        }
       else if(c1==3435+40)
        {
            c1=4765+40;
            calculation2();
        }
       else if(c1==2875+40)
        {
            c1=4345+40;
            calculation2();
        }
       else if(c1==4275+40)
        {
            c1=5605+40;
            calculation2();
        }
       else if(c1==5115+40)
        {
            c1=6375+40;
            calculation2();
        }
       else if(c1==1825+40)
        {
            c1=285+40;
            calculation2();
        }
        else if(c1==2735+40)
        {
            c1=145+40;
            calculation2();
        }
        else if(c1==2945+40)
        {
            c1=1195+40;
            calculation2();
        }
        else if(c1==3715+40)
        {
            c1=2105+40;
            calculation2();
        }
        else if(c1==4555+40)
        {
            c1=3085+40;
            calculation2();
        }
        else if(c1==5255+40)
        {
            c1=3995+40;
            calculation2();
        }
        else if(c1==6165+40)
        {
            c1=3645+40;
            calculation2();
        }
        else if(c1==6865+40)
        {
            c1=2805+40;
            calculation2();
        }
       
        
    }

    
    
}


    

