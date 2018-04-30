/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author EQÚIPO
 */
public class FrmSapce extends javax.swing.JFrame implements KeyListener
{

    BufferedImage imgfondo = null , imgalien1 = null , imgalien2 =null , imgtank = null , imgbala = null , imgali1 = null , imgali2 =null , imgal1 = null , imgal2 =null , imgexplo = null , imgenemigo = null , imgdis = null;
    int contador , teclado , movimientoaliens , movimientobala;
    int buclex , bucley;
    int[] alien = {20 , 80 , 140 , 200 , 260 , 320 , 380 , 440 , 500 , 560} ;
    int[] alien1 = {20 , 80 , 140 , 200 , 260 , 320 , 380 , 440 , 500 , 560};
    int[] alien2 = {20 , 80 , 140 , 200 , 260 , 320 , 380 , 440 , 500 , 560};
    int[] alien3 = {20 , 80 , 140 , 200 , 260 , 320 , 380 , 440 , 500 , 560};
    int[] alien4 = {20 , 80 , 140 , 200 , 260 , 320 , 380 , 440 , 500 , 560};
    int posicionxtank = 380;
    int [] posicionyalien = {90 , 150 , 210 , 270 , 330 };
    int [] posicionydisparo = {90 , 150 , 210 , 270 , 330 };
    int disparoalien;
  
    int posicionybala = 1000 ;
    int posicionxbala = 390;
    int direccionx = 1;
    int direccionxenemigo = 1;
    int direccionxtanke = 1;
    double distancia , distancia1 ,distancia2 , distancia3 , distancia4 , distanciaenemigo , distancianave;
    int verificar = 1;
    int verificar1 = 0 , verificar2 = 0 , verificar3 = 0 , verificar4 = 0;
    int verificarenemigo = 1;
    int [] verificacion = {1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1};
    int [] verificacion1 = {1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1};
    int [] verificacion2 = {1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1};
    int [] verificacion3 = {1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1};
    int [] verificacion4 = {1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1};
    int posicionxenemigo = -700;
    int posicionyenemigo = 45;
    int contador2;
    int marcador = 0;
    int marcadorvidas = 3;
    int [] posicion = {20 , 80 , 140 , 200 , 260 , 320 , 380 , 440 , 500 , 560};

    
    
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) 
    {}
    public void keyPressed(KeyEvent e)
    {
         teclado = e.getKeyCode();
//         System.out.println(teclado);
         
         if (teclado == 81)
         {
             movimientoaliens += 1;
             posicionxbala = posicionxtank + 10;
         }
         if (teclado == 65)
         {
             direccionxtanke = -1;
             posicionxtank += 5 * direccionxtanke;
             
         }
         if (teclado == 68)
         {
             direccionxtanke = 1;
             posicionxtank += 5 * direccionxtanke;
             
         }
         if (teclado == 32)
         {
             movimientobala += 1;
         }
    }
    
    public void paint(Graphics g)
    {
       super.paint(g);
       g.drawImage(imgfondo , 0 , 0 , this);
       g.setColor(Color.red);
       g.setFont(new Font ("Arial" , Font.BOLD , 20));
       g.drawString("Score", 600 , 60);
       g.drawString("Vidas", 100 , 60);
       g.drawString(String.valueOf(marcador), 620 , 90);   
       g.drawString(String.valueOf(marcadorvidas), 120 , 90); 
       
       if (verificarenemigo > 0)
       {
            g.drawImage(imgenemigo, posicionxenemigo, posicionyenemigo, this);
       }
       
       
       if (posicionxenemigo > 850 )
       {
           direccionxenemigo *= -1;
       }
       
       if (posicionxenemigo < -200 )
       {
           direccionxenemigo = 1;
       }
       distanciaenemigo = Math.sqrt(Math.pow((posicionxbala - posicionxenemigo) , 2) + Math.pow((posicionybala - posicionyenemigo) , 2));
       
       posicionxenemigo += 10 * direccionxenemigo;
       
       if (distanciaenemigo <= 25)
       {
           verificarenemigo = 0;
           posicionxenemigo = -700;
           posicionyenemigo = 45;
       }

         
     
       for (buclex = 0 ; buclex < 10 ; buclex ++)
       {
           
  
           if ( verificacion1[buclex] == 1)
           {
                g.drawImage(imgalien1 ,alien[buclex] , posicionyalien[0] , this);
           }
           
           if ( verificacion2[buclex] == 1)
           {
                g.drawImage(imgali1 ,alien1[buclex] , posicionyalien[1] , this);
           }
           
           if ( verificacion3[buclex] == 1)
           {
                g.drawImage(imgali1 ,alien2[buclex] , posicionyalien[2] , this);
           }
           
           if ( verificacion4[buclex] == 1)
           {
                g.drawImage(imgal1 ,alien3[buclex] , posicionyalien[3] , this);
           }
           
           if ( verificacion[buclex] == 1)
           {
               
               g.drawImage(imgal1 ,alien4[buclex] , posicionyalien[4] , this);

           }
    
           

           
           
           if (movimientoaliens > 0)
            {
                
                
                if (contador % 3 == 0)
                 {
                    
                    if ( verificacion1[buclex] == 1)
                        {
                            g.drawImage(imgalien2 ,alien[buclex] , posicionyalien[0] , this);
                        }

                    if ( verificacion2[buclex] == 1)
                        {
                            g.drawImage(imgali2 ,alien1[buclex] , posicionyalien[1] , this);
                        }

                    if ( verificacion3[buclex] == 1)
                        {
                            g.drawImage(imgali2 ,alien2[buclex] , posicionyalien[2] , this);
                        }

                    if ( verificacion4[buclex] == 1)
                        {
                            g.drawImage(imgal2,alien3[buclex] , posicionyalien[3] , this);
                        }
                    if (verificacion[buclex] == 1)
                        {
                            
                            g.drawImage(imgal2 ,alien4[buclex] , posicionyalien[4] , this);
                            
                        }
          

                 }
                if (alien[buclex] > 700  )
                     {
                         direccionx *= -1;   
                         posicionyalien[0] += 5;
                         posicionyalien[1] += 5;
                         posicionyalien[2] += 5;
                         posicionyalien[3] += 5;
                         posicionyalien[4] += 5;
                         
                         

                     }
                if (alien[buclex] < 20 )
                     {
                         direccionx = 1;
                         posicionyalien[0] += 5;
                         posicionyalien[1] += 5;
                         posicionyalien[2] += 5;
                         posicionyalien[3] += 5;
                         posicionyalien[4] += 5;

                     }
                
                alien[buclex] += 5 * direccionx;
                alien1[buclex] += 5 * direccionx;
                alien2[buclex] += 5 * direccionx;
                alien3[buclex] += 5 * direccionx;
                alien4[buclex] += 5 * direccionx;
                
                
                
                
//                    posicionyenemigo += 10;
                    
           
            }

       }
       
       
       
//       for (buclex = 0 ; buclex < 10 ; buclex ++)
//       {
//           if (verificar > 0)
//           {
//            g.drawImage(imgdis, posicion[disparoalien] , posicionydisparo[4], this);
//            posicionydisparo[4] +=1;    
//            
//                
//                
//                if (posicionydisparo[4] > 600)
//                {
//                    posicionydisparo[4] = posicionyalien[4];                 
//                  
//                    disparoalien = (int) (Math.random() * 9) + 1;
//                    
//                    if (verificacion[disparoalien] == 0)
//                    {
//                        disparoalien = (int) (Math.random() * 9) + 1;
//                    }
//                    
//                    
//                }
//           }
//       }
       for (buclex = 0 ; buclex < 10 ; buclex ++)
           {
               distancia = Math.sqrt(Math.pow((posicionxbala - alien4[buclex]) , 2) + Math.pow((posicionybala - posicionyalien[4]) , 2));
               
         
               if (distancia <= 25 && verificacion[buclex] == 1)
                {
                    movimientobala = 0;   
                    marcador += 10;
        
                    verificacion[buclex] = 0;
                    

                    g.drawImage(imgexplo, alien4[buclex] , posicionyalien[4] , this);
  
                    posicionxbala = posicionxtank + 10;
                    posicionybala = 900;
                    
     
                }
               if (verificar > 0)
                {
                 g.drawImage(imgdis, posicion[disparoalien] , posicionydisparo[4], this);
                 posicionydisparo[4] +=1;    
                 distancianave = Math.sqrt(Math.pow((posicion[disparoalien] - posicionxtank) , 2) + Math.pow((posicionydisparo[4] - 850) , 2));
                 if (distancia <= 25)
                 {
                     marcadorvidas -= 1;
                     if (marcadorvidas == 0)
                     {
                         temporizador.stop();
                         g.setColor(Color.white);
                         g.setFont(new Font ("Arial" , Font.BOLD , 50));
                         g.drawString("GAME OVER", 300 , 450);
                         
                     }
                 }

                     if (posicionydisparo[4] > 900)
                     {
                         posicionydisparo[4] = posicionyalien[4];                 

                         disparoalien = (int) (Math.random() * 9) + 1;
                         if (verificacion[disparoalien] == 0)
                         {
                             disparoalien = (int) (Math.random() * 9) + 1;
                         }

                     }
                     
                     if (verificacion[0] == 0 && verificacion[1] == 0 && verificacion[2] == 0 && verificacion[3] == 0 && verificacion[4] == 0 && verificacion[5] == 0 && verificacion[6] == 0 && verificacion[7] == 0 && verificacion[8] == 0 && verificacion[9] == 0 )
                     {
                         verificar = 0;
                         verificar1 = 1;
                     }
                }
           }
       
       for (buclex = 0 ; buclex < 10 ; buclex ++)
           {
               distancia1 = Math.sqrt(Math.pow((posicionxbala - alien3[buclex]) , 2) + Math.pow((posicionybala - posicionyalien[3]) , 2));
               
               if (distancia1 <= 25 && verificacion4[buclex] == 1 )
                {
                    movimientobala = 0;   
                    marcador += 20;
                  
                    verificacion4[buclex] = 0;
   
                    g.drawImage(imgexplo, alien3[buclex] , posicionyalien[3] , this);
                    
             
                    posicionxbala = posicionxtank + 10;
                    posicionybala = 900;
     
                }
               if (verificar1 > 0)
                {
                 g.drawImage(imgdis, posicion[disparoalien] , posicionydisparo[3], this);
                 posicionydisparo[3] +=1;    
                 distancianave = Math.sqrt(Math.pow((posicion[disparoalien] - posicionxtank) , 2) + Math.pow((posicionydisparo[4] - 850) , 2));
                 if (distancia <= 25)
                 {
                     marcadorvidas -= 1;
                     if (marcadorvidas == 0)
                     {
                         temporizador.stop();
                         g.setColor(Color.white);
                         g.setFont(new Font ("Arial" , Font.BOLD , 50));
                         g.drawString("GAME OVER", 300 , 450);
                         
                     }
                 }



                     if (posicionydisparo[3] > 900)
                     {
                         posicionydisparo[3] = posicionyalien[3];                 

                         disparoalien = (int) (Math.random() * 9) + 1;
                         if (verificacion4[disparoalien] == 0)
                         {
                             disparoalien = (int) (Math.random() * 9) + 1;
                         }

                     }
                     
                     if (verificacion4[0] == 0 && verificacion4[1] == 0 && verificacion4[2] == 0 && verificacion4[3] == 0 && verificacion4[4] == 0 && verificacion4[5] == 0 && verificacion4[6] == 0 && verificacion4[7] == 0 && verificacion4[8] == 0 && verificacion4[9] == 0 )
                     {
                         verificar1 = 0;
                         verificar2 = 1;
                     }
                }
           }
       
       for (buclex = 0 ; buclex < 10 ; buclex ++)
           {
               distancia2 = Math.sqrt(Math.pow((posicionxbala - alien2[buclex]) , 2) + Math.pow((posicionybala - posicionyalien[2]) , 2));
       
       
               if (distancia2 <= 25 && verificacion3[buclex] == 1)
                {
                    movimientobala = 0;      
                    marcador += 40;
                    verificacion3[buclex] = 0;
   
                    g.drawImage(imgexplo, alien2[buclex] , posicionyalien[2] , this);
         
                    posicionxbala = posicionxtank + 10;
                    posicionybala = 900;
     
                }
               if (verificar2 > 0)
                {
                 g.drawImage(imgdis, posicion[disparoalien] , posicionydisparo[2], this);
                 posicionydisparo[2] +=1;  
                 distancianave = Math.sqrt(Math.pow((posicion[disparoalien] - posicionxtank) , 2) + Math.pow((posicionydisparo[4] - 850) , 2));
                 if (distancia <= 25)
                 {
                     marcadorvidas -= 1;
                     if (marcadorvidas == 0)
                     {
                         temporizador.stop();
                         g.setColor(Color.white);
                         g.setFont(new Font ("Arial" , Font.BOLD , 50));
                         g.drawString("GAME OVER", 300 , 450);
                         
                     }
                 }
                 

                     if (posicionydisparo[2] > 900)
                     {
                         posicionydisparo[2] = posicionyalien[2];                 

                         disparoalien = (int) (Math.random() * 9) + 1;
                         if (verificacion3[disparoalien] == 0)
                         {
                             disparoalien = (int) (Math.random() * 9) + 1;
                         }

                     }
                     
                     if (verificacion3[0] == 0 && verificacion3[1] == 0 && verificacion3[2] == 0 && verificacion3[3] == 0 && verificacion3[4] == 0 && verificacion3[5] == 0 && verificacion3[6] == 0 && verificacion3[7] == 0 && verificacion3[8] == 0 && verificacion3[9] == 0 )
                     {
                         verificar2 = 0;
                         verificar3 = 1;
                     }
                }
           }
       
       for (buclex = 0 ; buclex < 10 ; buclex ++)
           {
               distancia3 = Math.sqrt(Math.pow((posicionxbala - alien1[buclex]) , 2) + Math.pow((posicionybala - posicionyalien[1]) , 2));
       
               if (distancia3 <= 25 && verificacion2[buclex] == 1)
                {
                    movimientobala = 0;      
                    marcador += 80;
                    verificacion2[buclex] = 0;
   
                    g.drawImage(imgexplo, alien1[buclex] , posicionyalien[1] , this);
                    
       
                    posicionxbala = posicionxtank + 10;
                    posicionybala = 900;
     
                }
               if (verificar3 > 0)
                {
                 g.drawImage(imgdis, posicion[disparoalien] , posicionydisparo[1], this);
                 posicionydisparo[1] +=1;    
                 distancianave = Math.sqrt(Math.pow((posicion[disparoalien] - posicionxtank) , 2) + Math.pow((posicionydisparo[4] - 850) , 2));
                 if (distancia <= 25)
                 {
                     marcadorvidas -= 1;
                     if (marcadorvidas == 0)
                     {
                         temporizador.stop();
                         g.setColor(Color.white);
                         g.setFont(new Font ("Arial" , Font.BOLD , 50));
                         g.drawString("GAME OVER", 300 , 450);
                         
                     }
                 }



                     if (posicionydisparo[1] > 900)
                     {
                         posicionydisparo[1] = posicionyalien[1];                 

                         disparoalien = (int) (Math.random() * 9) + 1;
                         if (verificacion2[disparoalien] == 0)
                         {
                             disparoalien = (int) (Math.random() * 9) + 1;
                         }

                     }
                     
                     if (verificacion2[0] == 0 && verificacion2[1] == 0 && verificacion2[2] == 0 && verificacion2[3] == 0 && verificacion2[4] == 0 && verificacion2[5] == 0 && verificacion2[6] == 0 && verificacion2[7] == 0 && verificacion2[8] == 0 && verificacion2[9] == 0 )
                     {
                         verificar3 = 0;
                         verificar4 = 1;
                     }
                }
           }
       
       for (buclex = 0 ; buclex < 10 ; buclex ++)
           {
               distancia4 = Math.sqrt(Math.pow((posicionxbala - alien[buclex]) , 2) + Math.pow((posicionybala - posicionyalien[0]) , 2));
               
               if (distancia4 <= 25 && verificacion1[buclex] == 1)
                {
                    movimientobala = 0;      
                    marcador += 100;
                    verificacion1[buclex] = 0;
   
                    g.drawImage(imgexplo, alien[buclex] , posicionyalien[0] , this);

                    posicionxbala = posicionxtank + 10;
                    posicionybala = 900;
     
                }
               if (verificar4 > 0)
                {
                 g.drawImage(imgdis, posicion[disparoalien] , posicionydisparo[0], this);
                 posicionydisparo[0] +=1;    
                 distancianave = Math.sqrt(Math.pow((posicion[disparoalien] - posicionxtank) , 2) + Math.pow((posicionydisparo[4] - 850) , 2));
                 if (distancia <= 25)
                 {
                     marcadorvidas -= 1;
                     if (marcadorvidas == 0)
                     {
                         temporizador.stop();
                         g.setColor(Color.white);
                         g.setFont(new Font ("Arial" , Font.BOLD , 50));
                         g.drawString("GAME OVER", 300 , 450);
                         
                     }
                 }



                     if (posicionydisparo[0] > 900)
                     {
                         posicionydisparo[0] = posicionyalien[0];                 

                         disparoalien = (int) (Math.random() * 9) + 1;
                         if (verificacion1[disparoalien] == 0)
                         {
                             disparoalien = (int) (Math.random() * 9) + 1;
                         }

                     }
                     
                     if (verificacion1[0] == 0 && verificacion1[1] == 0 && verificacion1[2] == 0 && verificacion1[3] == 0 && verificacion1[4] == 0 && verificacion1[5] == 0 && verificacion1[6] == 0 && verificacion1[7] == 0 && verificacion1[8] == 0 && verificacion1[9] == 0 )
                     {
                         verificar4 = 0;
                         
                     }
                }
               
           }
    
       g.drawImage(imgtank , posicionxtank , 850 , this);
       
       if (movimientobala > 0)
       { 
           g.drawImage(imgbala , posicionxbala , posicionybala , this);
                  
       }
           
    }
    
    
    
    Timer temporizador = new Timer(100, new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
            repaint();
            contador += 1;
            posicionybala -= 20;
            
            
        }
    });
        
    public FrmSapce() {
        initComponents();
        addKeyListener(this);
        
        try {
            imgfondo = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\fondo.png"));
            imgalien1 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\alien1.png"));
            imgalien2 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\alien2.png"));
            imgali1 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\ali1.png"));
            imgali2 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\ali2.png"));
            imgal1 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\al1.png"));
            imgal2 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\al2.png"));
            imgtank = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\tank.png"));
            imgbala = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\bala.png"));
            imgexplo = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\explo.png"));
            imgenemigo = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\enemigo.png"));
            imgdis = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Downloads\\Space Invaders\\invaders.png"));
        } catch (IOException ex) {
            Logger.getLogger(FrmSapce.class.getName()).log(Level.SEVERE, null, ex);
        }
        temporizador.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     disparoalien = (int) (Math.random() * 10) + 1;
                
                System.out.println(disparoalien);
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSapce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSapce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSapce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSapce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSapce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
