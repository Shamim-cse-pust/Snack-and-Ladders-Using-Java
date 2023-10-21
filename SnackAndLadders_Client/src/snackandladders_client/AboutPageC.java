
package snackandladders_client;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;



public class AboutPageC extends JFrame {
     
   JFrame f=new JFrame();
   
   Font font=new Font("Monaco",Font.BOLD,40);
    Font font1=new Font("Monaco",Font.BOLD,20);
    
    //JLabel.....
  JLabel l=new JLabel(" DEVELOPED BY ");
  JLabel l1=new JLabel("---------------------------------");
  JLabel l3=new JLabel();
  JLabel l4=new JLabel(new ImageIcon("Image\\Shamim.png"));
  JLabel l5=new JLabel(new ImageIcon("Image\\Mijan.png"));
  JLabel l6=new JLabel(new ImageIcon("Image\\Arpa.png"));
  JLabel l7=new JLabel("NAME  : MD SHAMIM MIAH");
  JLabel l8=new JLabel("ROLL  : 180128");
  JLabel l9=new JLabel("INSTITUTE : PABNA UNIVERSITY OF SCIENCE AND TECHNOLOGY");
  JLabel l10=new JLabel("PHONE : 01784766676 , 01866632854  ");
  JLabel l11=new JLabel("EMAIL : shamim.pust.cse@gmail.com");
  JLabel l12=new JLabel("NAME  : MD MIJANUR RAHMAN");
  JLabel l13=new JLabel("ROLL  : 180127");
  JLabel l14=new JLabel("INSTITUTE : PABNA UNIVERSITY OF SCIENCE AND TECHNOLOGY");
  JLabel l15=new JLabel("PHONE : 01784736869");
  JLabel l16=new JLabel("EMAIL : mijan.pust.cse@gmail.com");
  JLabel l17=new JLabel("NAME  : ARPA kAR");
  JLabel l18=new JLabel("ROLL  : 180126");
  JLabel l19=new JLabel("INSTITUTE : PABNA UNIVERSITY OF SCIENCE AND TECHNOLOGY");
  JLabel l20=new JLabel("PHONE : 01784779445");
  JLabel l21=new JLabel("EMAIL : arpa.pust.cse@gmail.com");
  
  
  //JButton....
  JButton b=new JButton(new ImageIcon("Image\\BackButton.png"));

  
  
  
  
  
  ///JPanel......
  Panel p=new Panel();
  Panel p1=new Panel();
  Panel p2=new Panel();
  Panel p3=new Panel();


   ///Border....
  
   Border bor = BorderFactory.createLineBorder(Color.GREEN);

    public AboutPageC() {
        super("Snacks and Ladders Help");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,740);
        setLocationRelativeTo(null);
        setResizable(false); 
        
        l.setBounds(380,5,300,40);
        l.setForeground(Color.red);
        l.setFont(font1);
        add(l);
        l1.setBounds(350,25,500,50);
        l1.setForeground(Color.BLUE);
        l1.setFont(font1);
        add(l1);
        
        
        
        p1.setBounds(10,80,970,180);
        p1.setBackground(Color.GREEN);
        add(p1);
        p2.setBounds(10,270,970,180);
        p2.setBackground(Color.GREEN);
        add(p2);
        p3.setBounds(10,460,970,180);
        p3.setBackground(Color.GREEN);
        add(p3);
        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        l4.setBounds(10,0,180,180);
        p1.add(l4);
        l5.setBounds(10,0,180,180);
        p2.add(l5);
        l6.setBounds(10,0,180,180);
        p3.add(l6);
        
        
        
        l7.setBounds(220,0,500,30);
        l7.setFont(font1);
        p1.add(l7);
        l8.setBounds(220,30,500,30);
        l8.setFont(font1);
        p1.add(l8);
        l9.setBounds(220,60,700,30);
        l9.setFont(font1);
        p1.add(l9);
        l10.setBounds(220,90,500,30);
        l10.setFont(font1);
        p1.add(l10);
        l11.setBounds(220,120,500,30);
        l11.setFont(font1);
        p1.add(l11);
        
        
        
        l12.setBounds(220,0,500,30);
        l12.setFont(font1);
        p2.add(l12);
        l13.setBounds(220,30,500,30);
        l13.setFont(font1);
        p2.add(l13);
        l14.setBounds(220,60,700,30);
        l14.setFont(font1);
        p2.add(l14);
        l15.setBounds(220,90,500,30);
        l15.setFont(font1);
        p2.add(l15);
        l16.setBounds(220,120,500,30);
        l16.setFont(font1);
        p2.add(l16);
        
        
        l17.setBounds(220,0,500,30);
        l17.setFont(font1);
        p3.add(l17);
        l18.setBounds(220,30,500,30);
        l18.setFont(font1);
        p3.add(l18);
        l19.setBounds(220,60,700,30);
        l19.setFont(font1);
        p3.add(l19);
        l20.setBounds(220,90,500,30);
        l20.setFont(font1);
        p3.add(l20);
        l21.setBounds(220,120,500,30);
        l21.setFont(font1);
        p3.add(l21);

        b.setBounds(10,650,100,50);
        add(b);
       b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
           {
              new myframe().setVisible(true);
              setVisible(false);
           }
       });
        
        
        
        
        
        
    }
    
}
