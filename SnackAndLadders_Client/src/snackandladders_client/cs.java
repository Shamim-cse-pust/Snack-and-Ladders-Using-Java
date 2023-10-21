
package snackandladders_client;

import java.io.DataInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static snackandladders_client.Cgame.s;

/**
 *
 * @author HP
 */
public class cs implements Runnable {
    
 public static DataInputStream din;
    public cs() {
    }

    @Override
    public void run() {
        
           try
           {
               
               s=new Socket("localhost",6666);
               System.out.println("CONECTED");
               din=new DataInputStream(s.getInputStream());  
               
               
               String str1;  
               while(true)
               {
                   str1=din.readUTF();  
                    Cgame.ra1=Integer.parseInt(str1); 
                    
                    
                    
                    
                    //System.out.println(ra1);
   
                     if(Cgame.v==0){
                         
                         for(int j=1;j<=5;j++)
                    {
                        if(j==1)
                        {
                            Cgame.l9.setIcon(Cgame.img1);
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
                            Cgame.l9.setIcon(Cgame.img2);
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
                            Cgame.l9.setIcon(Cgame.img3);
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
                            Cgame.l9.setIcon(Cgame.img4);
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
                            Cgame.l9.setIcon(Cgame.img5);
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
                         
                         
                         
                     switch(Cgame.ra1)
                    {
                        
                        case 1:
                           Cgame.l9.setIcon(Cgame.img1);
                           
                           if(Cgame.start1==0)
                           {
                               
                               System.out.println("shamim");
                                Cgame.x1=5;
                                Cgame.y1=546;
                                Cgame.l6.setBounds(Cgame.x1,Cgame.y1,20,52);
                                Cgame.l.add(Cgame.l6);
                                
                                Cgame.l6.setLocation(Cgame.x1,Cgame.y1);
                                Cgame.start1=1;
                               Cgame.l.setVisible(false);
                               Cgame.l.setVisible(true);
                                break;
                           }
                           if(Cgame.start1==1)
                           {
                               run1(); 
                               break;
                           }
                              break; 
                           
                           
                           
                          

                        case 2:
                           Cgame.l9.setIcon(Cgame.img2);
                           
                          if(Cgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           
                           break;
                           
                        case 3:
                           Cgame.l9.setIcon(Cgame.img3);
                           
                          if(Cgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           break;
                           
                       case 4:
                           Cgame.l9.setIcon(Cgame.img4);
                           
                           if(Cgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           break;
                           
                        case 5:
                           Cgame.l9.setIcon(Cgame.img5);
                           
                           if(Cgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                           
                           
                           
                           break;
                           
                        case 6:
                           Cgame.l9.setIcon(Cgame.img6);
                           if(Cgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                           
                           
                           
                           break;
                            
                    }   
                     
                      if(Cgame.ra1>1) Cgame.v=1;
               }
                    //Cgame.a1=6935;
                     
                     if(Cgame.a1==6935)
                     {
                         System.out.println("player 1 is champion");
                         Cgame.f.setVisible(false);
                         
                         try{
                              Cgame.s.close();
                              din.close();
                            }
                         catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         
                         
                         new WinC(Cgame.name1,Cgame.name2,Cgame.name1).setVisible(true);
                     }
                     if(Cgame.c1==6975)
                     {
                         System.out.println("player 2 is champion");
                         Cgame.f.setVisible(false);
                         try{
                              Cgame.s.close();
                              din.close();
                            }
                         catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         
                         new WinC(Cgame.name1,Cgame.name2,Cgame.name2).setVisible(true);
                         //setVisible(false);
                         //new champion(name2,name1).setVisible(true);
                         //exit(0);
                     }

                          
                  
                  
               }
        
                     
     
                     
               }
               
           
           catch(Exception e)
           {
               System.out.println(e);
               
               
           }
      
      
        
        
        
        
    }
    
    public void run1() {
        int p=0;
        if((Cgame.a1+(70*Cgame.ra1))>7000)
        {
            p=1;
        }
        
        for(int i=0;i<Cgame.ra1;i++)
        {
            if(p==1) break;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(cs.class.getName()).log(Level.SEVERE, null, ex);
            }
             Cgame.a1=Cgame.a1+70;
             calculation1();
             //System.out.println(a1);

        
    }
        
        snack_ladder1();
        Cgame.l.setVisible(false);
        Cgame.l.setVisible(true);
  }
    
     public void calculation1() {
             Cgame.a2=Cgame.a1/700;
             if(Cgame.a2%2==0)
             {
                Cgame.x1=Cgame.a1%700;
                Cgame.y1=546-(Cgame.a2*60);
                Cgame.l6.setLocation(Cgame.x1,Cgame.y1);
             }
             else
             {
                Cgame.x1=700-(Cgame.a1%700)-60;
                Cgame.y1=546-(Cgame.a2*60);
                Cgame.l6.setLocation(Cgame.x1,Cgame.y1);
             }
  
    }
      public void snack_ladder1() {
        
        if(Cgame.a1==215)
        {
            Cgame.a1=1685;
            calculation1();
        }
        else if(Cgame.a1==845)
        {
            Cgame.a1=3155;
            calculation1();
        }
       else if(Cgame.a1==2245)
        {
            Cgame.a1=3365;
            calculation1();
        }
       else if(Cgame.a1==3435)
        {
            Cgame.a1=4765;
            calculation1();
        }
       else if(Cgame.a1==2875)
        {
            Cgame.a1=4345;
            calculation1();
        }
       else if(Cgame.a1==4275)
        {
            Cgame.a1=5605;
            calculation1();
        }
       else if(Cgame.a1==5115)
        {
            Cgame.a1=6375;
            calculation1();
        }
       else if(Cgame.a1==1825)
        {
            Cgame.a1=285;
            calculation1();
        }
        else if(Cgame.a1==2735)
        {
            Cgame.a1=145;
            calculation1();
        }
        else if(Cgame.a1==2945)
        {
            Cgame.a1=1195;
            calculation1();
        }
        else if(Cgame.a1==3715)
        {
            Cgame.a1=2105;
            calculation1();
        }
        else if(Cgame.a1==4555)
        {
            Cgame.a1=3085;
            calculation1();
        }
        else if(Cgame.a1==5255)
        {
            Cgame.a1=3995;
            calculation1();
        }
        else if(Cgame.a1==6165)
        {
            Cgame.a1=3645;
            calculation1();
        }
        else if(Cgame.a1==6865)
        {
            Cgame.a1=2805;
            calculation1();
        }
       
        
    }
    
}
