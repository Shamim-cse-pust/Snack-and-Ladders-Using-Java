
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


public class ConectPage extends JFrame implements ActionListener {
    
    
    JFrame f=new JFrame();
    Font font=new Font("Monaco",Font.BOLD,40);
     Font font1=new Font("Monaco",Font.BOLD,20);
    
    //JLabel.....
 JLabel l=new JLabel(" Conection Page");
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
 
 
 ///sockets...
 
  PrintWriter out ;
  BufferedReader in;
  Socket soc;
  ServerSocket ss;
  
    public ConectPage(String s1) {
        
        super("Snacks and Ladders_Host");
        new StartPage().setVisible(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,635);
        setLocationRelativeTo(null);
       // setResizable(false);
        System.out.println(s1);
        new StartPage().setVisible(false);
        s=s1;
        
        p.setBounds(0,0,1000,600);
        p.setBackground(Color.GREEN);
        add(p);
        p.setLayout(null);
        b.setBounds(10,530,100,50);
        p.add(b);
        
        b1.setBounds(870,530,100,50);
        b1.setBorder(new LineBorder(Color.BLACK));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.red);
        b1.setText("HOME");
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
        ss=new ServerSocket(port1);
        soc=ss.accept();
        l2.setText("CONECTION STABLISHED  : ");
        p.add(l2);
        

       
        in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        userInput=in.readLine();
        out =new PrintWriter(soc.getOutputStream(), true);
        out.println(s1);
        
        
        
        setVisible(false);
        setVisible(true);

//          DataInputStream din=new DataInputStream(soc.getInputStream());
//          userInput=din.readUTF();
//          DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
//          dout.writeUTF(s1);
        
        
        
        
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
        
        
        
        
        
       
        b2.addActionListener(this);
        
        
        
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b)
               {
                   new StartPage().setVisible(true);
                   setVisible(false);
               }
               if(e.getSource()==b1)
               {
              new myframe().setVisible(true);
              setVisible(false);
               }
               if(e.getSource()==b2)
               {
                   try
                   {
//                        in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
//                        userInput=in.readLine();
                        out =new PrintWriter(soc.getOutputStream(), true);
                        out.println(s);
                        //setVisible(false);
                        //setVisible(true);
                        
                        
                        out.close();
                        in.close();
                        ss.close();
                        soc.close();
                   }
                   catch(Exception f)
                   {
                       
                   }
                   
                   setVisible(false);
                   
//                   game g= new game();
//                   Thread t= new Thread(g);
                   
                   //new game().setVisible(true);
                  // new Play_host1().setVisible(true);
               //new Play_host(s,port1,userInput).setVisible(true);
               new Sgame(s,userInput);
              
               }
               
               
        }

    
}