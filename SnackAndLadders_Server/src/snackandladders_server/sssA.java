
package snackandladders_server;

import java.io.DataOutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class sssA implements Runnable {
public static DataOutputStream dout;
    public sssA() {
    }

    @Override
    public void run() {
        
                    Random rand = new Random();
                    Sgame.ra = rand.nextInt(6);
                    if(Sgame.ra==0) Sgame.ra=6;
                    String str1 = Integer.toString(Sgame.ra); 
                    //System.out.println(start1);
                    //Sgame.c1=6975;
                    
               try {  
                dout=new DataOutputStream(Sgame.s.getOutputStream());
               dout.writeUTF(str1);  
               dout.flush();  
                 }
            catch (Exception ex)
            {
                System.out.println(ex);
                System.out.println("bangla");
            }
                   
                    if(Sgame.v==0)
                    {
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
                        
                        
                    switch(Sgame.ra)
                    {
                        
                        case 1:
                           Sgame.l9.setIcon(Sgame.img1);
                           
                           if(Sgame.start1==0)
                           {
                               System.out.println("shamim");
                                Sgame.x1=5;
                                Sgame.y1=546;
                                Sgame.l6.setBounds(Sgame.x1,Sgame.y1,20,52);
                                Sgame.l.add(Sgame.l6);
                                 Sgame.l.setVisible(false);
                                Sgame.l.setVisible(true);
                                Sgame.start1=1;
                                break;
                           }
                           
                           if(Sgame.start1==1)
                           {
                               
                               run1(); 
                           
                               break;
                           }
                           
                           
                           break;
                          
                           
                        
                        case 2:
                           Sgame.l9.setIcon(Sgame.img2);
                           
                          if(Sgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                           
                           break;
                           
                        case 3:
                           Sgame.l9.setIcon(Sgame.img3);
                           
                          if( Sgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                           
                         
                           
                           break;
                           
                       case 4:
                           Sgame.l9.setIcon(Sgame.img4);
                           
                           if(Sgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                          
                           break;
                           
                        case 5:
                           Sgame.l9.setIcon(Sgame.img5);
                           
                           if(Sgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }
                          
                           
                           break;
                           
                        case 6:
                           Sgame.l9.setIcon(Sgame.img6);
                           if(Sgame.start1==1)
                           {
                               
                               run1(); 
                               break;
                           }

                           break;
                            
                    } 
                    
                    if(Sgame.ra>1) Sgame.v=1;
                    }
  
                     
                    //Sgame.a1=6935;

                     if(Sgame.a1==6935)
                     {
                         System.out.println("player 1 is champion");
                         Sgame.f.setVisible(false);
                         
                         try{
                              Sgame.s.close();
                              Sgame.ss.close();
                              dout.close();
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
                              dout.close();
                            }
                         catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         
                         new Win(Sgame.name1,Sgame.name2,Sgame.name2).setVisible(true);
                     }

        
        
        
    }
    
    
    public  void run1() {
        int p=0;
        if((Sgame.a1+(70*Sgame.ra))>7000)
        {
            p=1;
        }
        
        for(int i=0;i<Sgame.ra;i++)
        {
            if(p==1) break;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(sssA.class.getName()).log(Level.SEVERE, null, ex);
            }
             Sgame.a1=Sgame.a1+70;
             calculation1();
             System.out.println(Sgame.a1);
  
    }
        
        snack_ladder1();
        Sgame.l.setVisible(false);
        Sgame.l.setVisible(true);
  }
    
    
     public void calculation1() {
             Sgame.a2=Sgame.a1/700;
             if(Sgame.a2%2==0)
             {
                Sgame.x1=Sgame.a1%700;
                Sgame.y1=546-(Sgame.a2*60);
                Sgame.l6.setLocation(Sgame.x1,Sgame.y1);
             }
             else
             {
                Sgame.x1=700-(Sgame.a1%700)-60;
                Sgame.y1=546-(Sgame.a2*60);
                Sgame.l6.setLocation(Sgame.x1,Sgame.y1);
             }
             
    }
      private void snack_ladder1() {
        
        if(Sgame.a1==215)
        {
            Sgame.a1=1685;
            calculation1();
        }
        else if(Sgame.a1==845)
        {
            Sgame.a1=3155;
            calculation1();
        }
       else if(Sgame.a1==2245)
        {
            Sgame.a1=3365;
            calculation1();
        }
       else if(Sgame.a1==3435)
        {
            Sgame.a1=4765;
            calculation1();
        }
       else if(Sgame.a1==2875)
        {
            Sgame.a1=4345;
            calculation1();
        }
       else if(Sgame.a1==4275)
        {
            Sgame.a1=5605;
            calculation1();
        }
       else if(Sgame.a1==5115)
        {
            Sgame.a1=6375;
            calculation1();
        }
       else if(Sgame.a1==1825)
        {
            Sgame.a1=285;
            calculation1();
        }
        else if(Sgame.a1==2735)
        {
            Sgame.a1=145;
            calculation1();
        }
        else if(Sgame.a1==2945)
        {
            Sgame.a1=1195;
            calculation1();
        }
        else if(Sgame.a1==3715)
        {
            Sgame.a1=2105;
            calculation1();
        }
        else if(Sgame.a1==4555)
        {
            Sgame.a1=3085;
            calculation1();
        }
        else if(Sgame.a1==5255)
        {
            Sgame.a1=3995;
            calculation1();
        }
        else if(Sgame.a1==6165)
        {
            Sgame.a1=3645;
            calculation1();
        }
        else if(Sgame.a1==6865)
        {
            Sgame.a1=2805;
            calculation1();
        }
       
        
    }
    
}
