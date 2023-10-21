
package snackandladders_client;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static snackandladders_server.Sgame.s;
//import static snackandladders_server.Sgame.ss;


public class sss implements Runnable {
   public static DataInputStream din;
    public sss() {
    }

    @Override
    public void run() {
       try
           {
               Sgame.ss=new ServerSocket(6666);
               Sgame.s=Sgame.ss.accept();
               System.out.println("CONECTED");
               din=new DataInputStream(Sgame.s.getInputStream());  
              System.out.println("iii");
              
               String str1; 
               while(true)
               {
                   str1=din.readUTF();  
                   Sgame.ra1=Integer.parseInt(str1);
                   //System.out.println(ra1);
                   
                   
                   
                  
                if(Sgame.v==1){
                    
                    for(int j=1;j<=5;j++)
                    {
                        if(j==1)
                        {
                            Sgame.l9.setIcon(Sgame.img1);
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            
                        }
                        if(j==2)
                        {
                            Sgame.l9.setIcon(Sgame.img2);
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                        }
                        if(j==3)
                        {
                            Sgame.l9.setIcon(Sgame.img3);
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                        }
                        if(j==4)
                        {
                            Sgame.l9.setIcon(Sgame.img4);
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                        }
                        if(j==5)
                        {
                            Sgame.l9.setIcon(Sgame.img5);
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }
                        }
                    }
                    
                    
                    switch(Sgame.ra1)
                    {
                        
                        case 1:
                           Sgame.l9.setIcon(Sgame.img1);
                           
                           //System.out.println(ra1);
                           if(Sgame.start2==0)
                           {
                               System.out.println("shamim");
                               
                               Sgame.x2=45;
                              Sgame. y2=546;
                              Sgame. l7.setBounds(Sgame.x2,Sgame.y2,20,52);
                               Sgame.l.add(Sgame.l7);
                               Sgame.l7.setLocation(Sgame.x2,Sgame.y2);
                               Sgame.start2=1;
                               Sgame.l.setVisible(false);
                               Sgame.l.setVisible(true);
                               break;
                           }
                           
                          else if( Sgame.start2==1)
                           {
                               run2();
                               
                               break;   
                           }
                           
                           break;
                          
                           
                        
                        case 2:
                          Sgame. l9.setIcon(Sgame.img2);
                           
                          
                           if(Sgame.start2==1)
                           {
                               run2();
                               break;   
                           }
                          
                           break;
                           
                        case 3:
                           Sgame.l9.setIcon(Sgame.img3);
                           
                          
                           if(Sgame.start2==1)
                           {
                               run2();
                          
                               break;   
                           }
                           
                           break;
                           
                       case 4:
                           Sgame.l9.setIcon(Sgame.img4);
                           
                          
                           if(Sgame.start2==1)
                           {
                               run2();
                
                               break;   
                           }
                          
                           
                           break;
                           
                        case 5:
                           Sgame.l9.setIcon(Sgame.img5);
                           
                           
                           if(Sgame.start2==1)
                           {
                               run2();
      
                               break;   
                           }
                         
                           
                           break;
                           
                        case 6:
                           Sgame.l9.setIcon(Sgame.img6);
                           
                           if(Sgame.start2==1)
                           {
                               run2();
                               break;   
                           }
                          
                           
                           break;
                            
                    }
                     if(Sgame.ra1>1) Sgame.v=0;
                }
               
                     //Sgame.c1=6975;
                     if(Sgame.a1==6935)
                     {
                         System.out.println("player 1 is champion");
                         Sgame.f.setVisible(false);
                         try{
                              Sgame.s.close();
                              Sgame.ss.close();
                              din.close();
                            }
                         catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         
                         
                         new Win(Sgame.name1,Sgame.name2,Sgame.name1).setVisible(true);
                     }
                     if(Sgame.c1==6975)
                     {
                         System.out.println("player 2 is champion");
                         Sgame.f.setVisible(false);
                         try{
                              Sgame.s.close();
                              Sgame.ss.close();
                              din.close();
                            }
                         catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         
                         
                         new Win(Sgame.name1,Sgame.name2,Sgame.name2).setVisible(true);
                     }
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                     
               }
               
               
           }
           catch(Exception e)
           {
               System.out.println(e);
               System.out.println("allah");
           }
    }

     public void run2() {
       
       
        int p=0;
        if((Sgame.c1+(70*Sgame.ra1))>7000)
        {
            p=1;
        }
       
          for(int i=0;i<Sgame.ra1;i++)
            {
                if(p==1) break;
                
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(sss.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                 Sgame.c1=Sgame.c1+70;
                 calculation2();
                 
            }
          snack_ladder2();
          Sgame.l.setVisible(false);
          Sgame.l.setVisible(true);
    }

      
      
      
      public void calculation2() 
    {
        
                 Sgame.c2=Sgame.c1/700;
                 if(Sgame.c2%2==0)
                 {
                    Sgame.x2=Sgame.c1%700;
                    Sgame.y2=546-(Sgame.c2*60);
                    Sgame.l7.setBounds(Sgame.x2,Sgame.y2,20,52);
                    Sgame.l.add(Sgame.l7);
                 }
                 else
                 {
                    Sgame.x2=700-(Sgame.c1%700)+20;
                    Sgame.y2=546-(Sgame.c2*60);
                    Sgame.l7.setBounds(Sgame.x2,Sgame.y2,20,52);
                    Sgame.l.add(Sgame.l7);
                 }
    }
      
 
      public void snack_ladder2() {
        
        if(Sgame.c1==215+40)
        {
            Sgame.c1=1685+40;
            calculation2();
        }
        else if(Sgame.c1==845+40)
        {
            Sgame.c1=3155+40;
            calculation2();
        }
       else if(Sgame.c1==2245+40)
        {
            Sgame.c1=3365+40;
            calculation2();
        }
       else if(Sgame.c1==3435+40)
        {
            Sgame.c1=4765+40;
            calculation2();
        }
       else if(Sgame.c1==2875+40)
        {
            Sgame.c1=4345+40;
            calculation2();
        }
       else if(Sgame.c1==4275+40)
        {
            Sgame.c1=5605+40;
            calculation2();
        }
       else if(Sgame.c1==5115+40)
        {
            Sgame.c1=6375+40;
            calculation2();
        }
       else if(Sgame.c1==1825+40)
        {
            Sgame.c1=285+40;
            calculation2();
        }
        else if(Sgame.c1==2735+40)
        {
            Sgame.c1=145+40;
            calculation2();
        }
        else if(Sgame.c1==2945+40)
        {
            Sgame.c1=1195+40;
            calculation2();
        }
        else if(Sgame.c1==3715+40)
        {
            Sgame.c1=2105+40;
            calculation2();
        }
        else if(Sgame.c1==4555+40)
        {
            Sgame.c1=3085+40;
            calculation2();
        }
        else if(Sgame.c1==5255+40)
        {
            Sgame.c1=3995+40;
            calculation2();
        }
        else if(Sgame.c1==6165+40)
        {
            Sgame.c1=3645+40;
            calculation2();
        }
        else if(Sgame.c1==6865+40)
        {
            Sgame.c1=2805+40;
            calculation2();
        }
    
    
    
    
}
}
