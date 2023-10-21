
package snackandladders_server;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class JoinPage extends JFrame implements ActionListener {
    
     
    JFrame f=new JFrame();
    Font font=new Font("Monaco",Font.BOLD,40);
    Font font1=new Font("Monaco",Font.BOLD,20);
    
    //JLabel.....
   JLabel l=new JLabel(" Conection Page");
 JLabel l1=new JLabel("--------------------------------");
 JLabel l2=new JLabel("# Waiting For Server.......");
 JLabel l3=new JLabel("Conected Player : ");
 JLabel l4=new JLabel();
 JLabel l5=new JLabel();
 JLabel lp=new JLabel();
  
  
  //JButton....
  JButton b=new JButton(new ImageIcon("Image\\BackButton.png"));
  JButton b1=new JButton("HOME");
  JButton b2=new JButton("Play");
  

    
  
   ///JPanel......
  Panel p=new Panel();
  Panel p1=new Panel();
  Panel p2=new Panel();
  Panel p3=new Panel();
    
  
  //variable....
 String port,userInput,s;
 int y,port1;
 
 
 //Socket .....
 
  PrintWriter out,out1 ;
  BufferedReader in,in1;
  Socket soc;
 
  

    public JoinPage(String s1) {
        
        super("Snacks and Ladders_join");
        new StartPage().setVisible(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,635);
        setLocationRelativeTo(null);
        //setResizable(false);
        new StartPage().setVisible(false);
        
        s=s1;
        p.setBounds(0,0,1000,600);
        p.setBackground(Color.GREEN);
        add(p);
        
        
        
//        p1.setBounds(0,550,1000,50);
//        p1.setBackground(Color.GREEN);
//        add(p1);
//        p1.setLayout(null);
//        lp.setBounds(360,555,400,40);
//        lp.setText("#Waiting for server");
//        lp.setForeground(Color.red);
//        lp.setFont(font);
//        p1.add(lp);
        
        
        p.setLayout(null);
        b.setBounds(10,530,100,50);
        p.add(b);
        
        b1.setBounds(870,530,100,50);
        b1.setBorder(new LineBorder(Color.BLACK));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.red);
        b1.setFont(font1);
        p.add(b1);
        
        
        
        
        
        l.setBounds(360,5,400,40);
        l.setForeground(Color.red);
        l.setFont(font);
        p.add(l);
        l1.setBounds(330,25,600,50);
        l1.setForeground(Color.BLUE);
        l1.setFont(font);
        p.add(l1);
        
        
        l2.setBounds(100,100,600,50);
        l2.setForeground(Color.BLUE);
        l2.setFont(font1);
        p.add(l2);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        
        while(true){
        try
        {
            port=JOptionPane.showInputDialog("Enter the Port Number"); 
            y=JOptionPane.YES_NO_OPTION;
             if(y == JOptionPane.YES_OPTION && port.length()==4 ) {
                 break;
             }
        }
        catch(Exception e)
        {
                    
        }
        }
        
        
        try
        {
        port1=Integer.parseInt(port);
        soc=new Socket("localhost",port1);
       l2.setText("CONECTION STABLISHED  : ");
        p.add(l2);
        
        
        
////        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));       /// data userinput .....
////        String userInput=in.readLine();  /// keyboard input ..........
//
        
         out =new PrintWriter(soc.getOutputStream(), true);
        out.println(s1);
         in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        userInput=in.readLine();

            setVisible(false);
            setVisible(true);
         
//         DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
//         dout.writeUTF(s1);
//         DataInputStream din=new DataInputStream(soc.getInputStream());
//         userInput=din.readUTF();
        
        
        
         l3.setBounds(100,200,600,50);
        l3.setForeground(Color.BLUE);
        l3.setFont(font1);
        p.add(l3);
        
        l4.setText(s1);
        l4.setBounds(100,250,600,50);
        l4.setForeground(Color.RED);
        l4.setFont(font1);
        p.add(l4);
        
        l5.setText(userInput);
        l5.setBounds(100,300,600,50);
        l5.setForeground(Color.RED);
        l5.setFont(font1);
        p.add(l5);
        
////        out =new PrintWriter(soc.getOutputStream(), true);
////        out.println(s1);
            in1 = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            userInput=in1.readLine();
            //setVisible(false);
            //setVisible(true);
            

            b2.setBounds(100,400,100,50);
            b2.setBorder(new LineBorder(Color.BLACK));
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.red);
            b2.setText("PLAY");
            b2.setFont(font1);
            p.add(b2);
            
            
            
        
            
                       
        
        
        
        }
         catch(Exception e)
        {
                 System.out.println(e);    
        }
        
        
//         try
//        {
////            out =new PrintWriter(soc.getOutputStream(), true);
////            out.println(s1);
//            in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
//            userInput=in.readLine();
//            setVisible(false);
//            setVisible(true);
//            
//
//            b2.setBounds(100,400,100,50);
//            b2.setBorder(new LineBorder(Color.BLACK));
//            b2.setBackground(Color.BLUE);
//            b2.setForeground(Color.red);
//            b2.setText("PLAY");
//            b2.setFont(font1);
//            p.add(b2);
//            b2.addActionListener(this);
//            
//        }
//        catch(Exception f)
//        {
//            
//        }
        
        
        
            
            b2.addActionListener(this);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b)
               {
                        try
                        {
                        out.close();
                        in.close();
                        soc.close();
                        }
                        catch(Exception f)
                        {
                            
                        }
                   new StartPage().setVisible(true);
                   setVisible(false);
               }
               if(e.getSource()==b1)
               {
                    try
                        {
                        out.close();
                        in.close();
                        soc.close();
                        }
                        catch(Exception f)
                        {
                            
                        }
              new myframe().setVisible(true);
              setVisible(false);   
               }
               if(e.getSource()==b2)
               { 
                    try
                        {
                        out.close();
                        in.close();
                        soc.close();
                        }
                        catch(Exception f)
                        {
                            
                        }
                    setVisible(false);
                    new Cgame(userInput,s);
              //new Play_join(s,port1,userInput).setVisible(true);
              
               }
              
        }

    
}
