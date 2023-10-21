
package snackandladders_server;

import java.io.DataOutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static snackandladders_client.Cgame.s;

/**
 *
 * @author HP
 */
public class csA implements Runnable {
public static DataOutputStream dout;
    public csA() {
    }

    @Override
    public void run() {
        
        Random rand = new Random();
                   Cgame.ra = rand.nextInt(6);
                    if(Cgame.ra==0) Cgame.ra=6;
                    String str1 = Integer.toString(Cgame.ra); 
                    
                    
                   // System.out.println(start2);
                    
              
               
              if(Cgame.v==1){
                  
                  
                   try {  
                    dout=new DataOutputStream(Cgame.s.getOutputStream());
                    dout.writeUTF(str1);  
                    dout.flush();  
                      }
                     catch (Exception ex)
                     {
                         System.out.println(ex);
                     }

                  for(int j=1;j<=5;j++)
                    {
                        if(j==1){
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
                        if(j==2){
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
                        if(j==3){
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
                        if(j==4){
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
                        if(j==5){
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
                  
               switch(Cgame.ra)
                    {
                        
                        case 1:
                           Cgame.l9.setIcon(Cgame.img1);
                           if(Cgame. start2==0)
                           {
                                Cgame.x2=45;
                                Cgame.y2=546;
                                Cgame.l7.setBounds(Cgame.x2,Cgame.y2,20,52);
                                Cgame.l.add(Cgame.l7);
                                Cgame.start2=1;
                                Cgame.l.setVisible(false);
                                Cgame.l.setVisible(true);
                              
                                break;
                           }
                           
                              if(Cgame.start2==1)
                              {
                                  run2();
                                  break;
                              }
                               
                          
                               break;
                          
                           
                        
                        case 2:
                           Cgame.l9.setIcon(Cgame.img2);
                           
                         
                           if(Cgame.start2==1)
                           {
                               run2();
                               break;   
                           }
                         
                           break;
                           
                        case 3:
                           Cgame.l9.setIcon(Cgame.img3);
                           
                          
                           if(Cgame.start2==1)
                           {
                               run2();
                               break;   
                           }
                           
                       
                           break;
                           
                       case 4:
                           Cgame.l9.setIcon(Cgame.img4);
                           
                          
                           if(Cgame.start2==1)
                           {
                               run2();
                               break;   
                           }
                        
                           break;
                           
                        case 5:
                           Cgame.l9.setIcon(Cgame.img5);
                           
                           
                           if(Cgame. start2==1)
                           {
                               run2();
                               break;   
                           }
                          
                           break;
                           
                        case 6:
                           Cgame.l9.setIcon(Cgame.img6);
                          
                           if(Cgame.start2==1)
                           {
                               run2();
                               break;   
                           }

                           break;
                            
                    } 
               if(Cgame.ra>1) Cgame.v=0;
              }
              
                  //Cgame.c1=6975;
                     
                     if(Cgame.a1==6935)
                     {
                         System.out.println("player 1 is champion");
                         Cgame.f.setVisible(false);
                        try{
                              Cgame.s.close();
                              dout.close();
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
                              dout.close();
                            }
                         catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         
                         
                         new WinC(Cgame.name1,Cgame.name2,Cgame.name2).setVisible(true);
                        
                     } 
               
               
        
        
    }
    
    public void run2() {
       
       
        int p=0;
        if((Cgame.c1+(70*Cgame.ra))>7000)
        {
            p=1;
        }
       
          for(int i=0;i<Cgame.ra;i++)
            {
                
                if(p==1) break;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(csA.class.getName()).log(Level.SEVERE, null, ex);
            }
                 Cgame.c1=Cgame.c1+70;
                 calculation2();

            }
          snack_ladder2();
          Cgame.l.setVisible(false);
          Cgame.l.setVisible(true);
    }

      
      
      public void calculation2() 
    {
        
                 Cgame.c2=Cgame.c1/700;
                 if(Cgame.c2%2==0)
                 {
                    Cgame.x2=Cgame.c1%700;
                    Cgame.y2=546-(Cgame.c2*60);
                    Cgame.l7.setBounds(Cgame.x2,Cgame.y2,20,52);
                    Cgame.l.add(Cgame.l7);
                 }
                 else
                 {
                    Cgame.x2=700-(Cgame.c1%700)+20;
                    Cgame.y2=546-(Cgame.c2*60);
                    Cgame.l7.setBounds(Cgame.x2,Cgame.y2,20,52);
                    Cgame.l.add(Cgame.l7);
                 }
    }

      
      public void snack_ladder2() {
        
        if(Cgame.c1==215+40)
        {
            Cgame.c1=1685+40;
            calculation2();
        }
        else if(Cgame.c1==845+40)
        {
            Cgame.c1=3155+40;
            calculation2();
        }
       else if(Cgame.c1==2245+40)
        {
            Cgame.c1=3365+40;
            calculation2();
        }
       else if(Cgame.c1==3435+40)
        {
            Cgame.c1=4765+40;
            calculation2();
        }
       else if(Cgame.c1==2875+40)
        {
            Cgame.c1=4345+40;
            calculation2();
        }
       else if(Cgame.c1==4275+40)
        {
            Cgame.c1=5605+40;
            calculation2();
        }
       else if(Cgame.c1==5115+40)
        {
            Cgame.c1=6375+40;
            calculation2();
        }
       else if(Cgame.c1==1825+40)
        {
            Cgame.c1=285+40;
            calculation2();
        }
        else if(Cgame.c1==2735+40)
        {
            Cgame.c1=145+40;
            calculation2();
        }
        else if(Cgame.c1==2945+40)
        {
            Cgame.c1=1195+40;
            calculation2();
        }
        else if(Cgame.c1==3715+40)
        {
            Cgame.c1=2105+40;
            calculation2();
        }
        else if(Cgame.c1==4555+40)
        {
            Cgame.c1=3085+40;
            calculation2();
        }
        else if(Cgame.c1==5255+40)
        {
            Cgame.c1=3995+40;
            calculation2();
        }
        else if(Cgame.c1==6165+40)
        {
            Cgame.c1=3645+40;
            calculation2();
        }
        else if(Cgame.c1==6865+40)
        {
            Cgame.c1=2805+40;
            calculation2();
        }
    
}
}
