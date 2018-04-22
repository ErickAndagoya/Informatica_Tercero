/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoasteroide;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
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
public class Frmasteroide extends javax.swing.JFrame implements KeyListener
{
    int posicionx;
    int posiciony;
    int posicionx1;
    int contadornave = 0;
    int contador2;
    int contadorasteroide , contadorasteroide1 , contadorasteroide2 , contadorasteroide3 , contadorasteroide4 , contadorasteroide5;
    int contadorbala = 0;
    int teclado;
    int aleatoriox , aleatorioy ;
    double aceleracionx , aceleraciony , aceleracionbalax , aceleracionbalay ;
    double dlocationX = 400; 
    double dlocationY = 300;
    double locationX ; 
    double locationY ;
    double locationXasteroide ; 
    double locationYasteroide ;
    double locationXbala ; 
    double locationYbala ;
    int aleatorioaste;
    int aleatorioasceleracionaste;
    int aleatorioasceleracionaste2;
    int [] posicionxaste = {0 , 1 , 2 , 3 , 4 , 5};
    int [] posicionyaste = {0 , 1 , 2 , 3 , 4 , 5};
    double posicionxbala = 445; 
    double posicionybala = 345;
    double distanciaaste , distanciaaste1 , distanciaaste2 , distanciaaste3 , distanciaaste4 , distanciaaste5 , distancianave ;
    int explosionx1 = 0;
    int explosionx2 = 0;
    int explosionx3 = 0;
    int explosionx4 = 0;
    int explosionx5 = 0;
    int explosionx6 = 0;
    
    int explosiony1 = 0;
    int explosiony2 = 0;
    int explosiony3 = 0;
    int explosiony4 = 0;
    int explosiony5 = 0;
    int explosiony6 = 0;
    
    int bucle1;
    int bucle2;
    int teclado2;
    int explosion , explosion1 , explosion2 , explosion3 , explosion4 , explosion5;
    int movimientobala;
    int movimientoaste , movimientoaste1 , movimientoaste2 , movimientoaste3 , movimientoaste4 , movimientoaste5;
    int movimientonave;
    int marcador = 0;
    int marcadorvidas = 3;
    int duracion;
    int posicionxaste1 , posicionxaste2 , posicionxaste3 , posicionxaste4 , posicionxaste5 , posicionxaste6;
    int posicionyaste1 , posicionyaste2 , posicionyaste3 , posicionyaste4 , posicionyaste5 , posicionyaste6;
    int x , y;
   
    
    
    
    
    BufferedImage imgNebula = null, imgaste = null, imgaste2 = null , imgnave = null, imgnave2 = null, imgasteroid = null, imgshot = null , igmexplosion = null;
    
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) 
    {
        teclado = 0;
         if (teclado == 0 )
                {
                    if (aceleracionx != 0)
                    {
                        aceleracionx -= aceleracionx/2;
                    }
                    if (aceleraciony != 0)
                    {
                        aceleraciony -= aceleraciony/2;
                    }

                }    
         
     
    
    }
    public void keyPressed(KeyEvent e)
    {
       teclado = e.getKeyCode();
       teclado2 = e.getKeyCode();
       System.out.println(teclado);
       if (teclado == 68)
       {
           contadornave += 10;
           contadorbala += 10;
           
       
           
       }
       if (teclado == 65)
       {
           contadornave -= 10;
           contadorbala -= 10;
           
          
       }
       
       if (teclado == 87 )    
       {
          aceleracionx = Math.cos(Math.toRadians(contadornave % 360))* 5.99;
          aceleraciony = Math.sin(Math.toRadians(contadornave % 360))* 5.99;
          
          movimientonave +=1;
         
          
       }
       if (teclado2 == 32)
       {
          movimientobala += 1;
          aceleracionbalax = Math.cos(Math.toRadians(contadorbala % 360))* 10.99;
          aceleracionbalay = Math.sin(Math.toRadians(contadorbala % 360))* 10.99;
          duracion = 0;
          
          
       }
    
      
    }
    
   
    public void paint(Graphics g)
    {
       super.paint(g);
       g.setColor(Color.red);
            
       g.drawImage(imgNebula , 3 , 12 , this);
       g.drawImage(imgaste , posicionx , 12 , this);
       g.drawImage(imgaste2 , - 600 + posicionx , 12 , this);
       g.setFont(new Font ("Arial" , Font.BOLD , 20));
       g.drawString("Score", 600 , 60);
       g.drawString("Vidas", 100 , 60);
       g.drawString(String.valueOf(marcador), 620 , 90);   
       g.drawString(String.valueOf(marcadorvidas), 120 , 90); 
       aleatorioaste = 10 + (int) (Math.random() * 15) + 1;
       
   
       Graphics2D g2=(Graphics2D) g;
       
       double rotationRequired = Math.toRadians(contadornave);
       
       AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
       AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
       
       double rotationRequiredaste = Math.toRadians(contadorasteroide);
       AffineTransform txaste = AffineTransform.getRotateInstance(rotationRequiredaste, locationXasteroide, locationYasteroide);
       AffineTransformOp opaste1 = new AffineTransformOp(txaste, AffineTransformOp.TYPE_BILINEAR);
       
       double rotationRequiredaste2 = Math.toRadians(contadorasteroide1);
       AffineTransform txaste1 = AffineTransform.getRotateInstance(rotationRequiredaste2, locationXasteroide, locationYasteroide);
       AffineTransformOp opaste2 = new AffineTransformOp(txaste1, AffineTransformOp.TYPE_BILINEAR);
       
       double rotationRequiredaste3 = Math.toRadians(contadorasteroide2);
       AffineTransform txaste3 = AffineTransform.getRotateInstance(rotationRequiredaste3, locationXasteroide, locationYasteroide);
       AffineTransformOp opaste3 = new AffineTransformOp(txaste3, AffineTransformOp.TYPE_BILINEAR);
       
       double rotationRequiredaste4 = Math.toRadians(contadorasteroide3);
       AffineTransform txaste4 = AffineTransform.getRotateInstance(rotationRequiredaste3, locationXasteroide, locationYasteroide);
       AffineTransformOp opaste4 = new AffineTransformOp(txaste4, AffineTransformOp.TYPE_BILINEAR);
       
       
       double rotationRequiredaste5 = Math.toRadians(contadorasteroide4);
       AffineTransform txaste5 = AffineTransform.getRotateInstance(rotationRequiredaste3, locationXasteroide, locationYasteroide);
       AffineTransformOp opaste5 = new AffineTransformOp(txaste5, AffineTransformOp.TYPE_BILINEAR);
       
       
       double rotationRequiredaste6 = Math.toRadians(contadorasteroide5);
       AffineTransform txaste6 = AffineTransform.getRotateInstance(rotationRequiredaste3, locationXasteroide, locationYasteroide);
       AffineTransformOp opaste6 = new AffineTransformOp(txaste6, AffineTransformOp.TYPE_BILINEAR);
       
       double rotationRequired3 = Math.toRadians(contadorbala);
       AffineTransform txbala = AffineTransform.getRotateInstance(rotationRequired3, locationXbala ,  locationYbala);
       AffineTransformOp opbala = new AffineTransformOp(txbala, AffineTransformOp.TYPE_BILINEAR);
       
       
       dlocationX += aceleracionx;
       dlocationY += aceleraciony;
       
       
       
       if (explosion == 0 || explosion1 == 0 || explosion2 == 0 || explosion3 == 0 || explosion4 == 0 || explosion5 == 0)
       {
           posicionxbala += aceleracionbalax;
           posicionybala += aceleracionbalay;
          
       }
      
       
 
       if (movimientonave > 0)
       {
          g2.drawImage(op.filter(imgnave2, null), (int)dlocationX , (int)dlocationY , null);
          
          movimientonave = 0;
          
          
       }
      
      
       if (movimientobala > 0)
       {
            g2.drawImage(opbala.filter(imgshot, null), (int)posicionxbala , (int)posicionybala , null);
            
            duracion += 1;
                
       }
       if (duracion > 25)
       {
           posicionxbala = dlocationX + 45;
           posicionybala = dlocationY + 45;
           
       }
       
       if (movimientoaste > 1 )
       {
           for (x = 0 ; x < 5 ; x ++)
           {
               if (posicionxaste[x] == 0)
               {
                   posicionxaste[x] = posicionxaste1;                   
               }
               
               if (posicionxaste[x] == 1)
               {
                   posicionxaste[x] = posicionxaste2;
               }
               
               if (posicionxaste[x] == 2)
               {
                   posicionxaste[x] = posicionxaste3;
               }
               
               if (posicionxaste[x] == 3)
               {
                   posicionxaste[x] = posicionxaste4;
               }
               
               if (posicionxaste[x] == 4)
               {
                   posicionxaste[x] = posicionxaste5;
               }
               
               if (posicionxaste[x] == 5)
               {
                   posicionxaste[x] = posicionxaste6;
               }          
               
           }
           for (y = 0 ; y < 5 ; y ++)
           {
               if (posicionxaste[y] == 0)
               {
                   posicionyaste[y] = posicionyaste1;
               }
               
               if (posicionyaste[y] == 1)
               {
                   posicionyaste[y] = posicionyaste2;
               }
               
               if (posicionyaste[y] == 2)
               {
                   posicionyaste[y] = posicionyaste3;
               }
               
               if (posicionyaste[y] == 3)
               {
                   posicionyaste[y] = posicionyaste4;
               }
               
               if (posicionyaste[y] == 4)
               {
                   posicionyaste[y] = posicionyaste5;
               }
               
               if (posicionyaste[y] == 5)
               {
                   posicionyaste[y] = posicionyaste6;
               } 
           }
           
           g2.drawImage(opaste1.filter(imgasteroid, null), (int)posicionxaste[0], (int)posicionyaste[0], null);
           g2.drawImage(opaste2.filter(imgasteroid, null), (int)posicionxaste[1], (int)posicionyaste[1], null);
           g2.drawImage(opaste3.filter(imgasteroid, null), (int)posicionxaste[2], (int)posicionyaste[2], null);
           g2.drawImage(opaste4.filter(imgasteroid, null), (int)posicionxaste[3], (int)posicionyaste[3], null);
           g2.drawImage(opaste5.filter(imgasteroid, null), (int)posicionxaste[4], (int)posicionyaste[4], null);
           g2.drawImage(opaste6.filter(imgasteroid, null), (int)posicionxaste[5], (int)posicionyaste[5], null);
           
           if (explosion == 0)
           {
               posicionxaste[0] +=2;
               posicionyaste[0] +=5;
             
           }
            if (explosion2 == 0)
           {
               posicionxaste[1] +=5;
               posicionyaste[1] +=2;
             
           }
             if (explosion3 == 0)
           {
               posicionxaste[2] +=2;  
               posicionyaste[2] +=5;
             
           }
             
              if (explosion4 == 0)
           {
               posicionxaste[3] +=3;
               posicionyaste[3] +=5;
             
           }
               if (explosion5 == 0)
           {
               posicionxaste[4] +=8;     
               posicionyaste[4] +=5;
             
           }
                if (explosion == 0)
           {
               posicionxaste[5] +=5;
               posicionyaste[5] +=1;
             
           }
           contadorasteroide += 15;
           contadorasteroide1 += 15;
           contadorasteroide2 += 15;
           contadorasteroide3 += 15;
           contadorasteroide4 += 15;
           contadorasteroide2 += 15;
       }
         
 
            
       g2.drawImage(op.filter(imgnave, null), (int)dlocationX , (int)dlocationY , null);
       
        
     
       if (posicionxaste[0] > 800)
       {
           
           posicionxaste[0] = posicionxaste[0] % 800;
           
       }
       if (posicionyaste[0] > 600)
       {
          
           posicionyaste[0] = posicionyaste[0] % 600;
       }
       
       if (posicionxaste[1] > 800)
       {
           
           posicionxaste[1] = posicionxaste[1] % 800;
           
       }
       if (posicionyaste[1] > 600)
       {
          
           posicionyaste[1] = posicionyaste[1] % 600;
       }
       if (posicionxaste[2] > 800)
       {
           
           posicionxaste[2] = posicionxaste[2] % 800;
           
       }
       if (posicionyaste[2] > 600)
       {
          
           posicionyaste[2] = posicionyaste[2] % 600;
       }
       
       if (posicionxaste[3] > 800)
       {
           
           posicionxaste[3] = posicionxaste[3] % 800;
           
       }
       if (posicionyaste[3] > 600)
       {
          
           posicionyaste[3] = posicionyaste[3] % 600;
       }
       
       if (posicionxaste[4] > 800)
       {
           
           posicionxaste[4] = posicionxaste[4] % 800;
           
       }
       if (posicionyaste[4] > 600)
       {
          
           posicionyaste[4] = posicionyaste[4] % 600;
       }
       
       if (posicionxaste[5] > 800)
       {
           
           posicionxaste[5] = posicionxaste[5] % 800;
           
       }
       if (posicionyaste[5] > 600)
       {
          
           posicionyaste[5] = posicionyaste[5] % 600;
       }
       
       distanciaaste = Math.sqrt(Math.pow((posicionxbala - posicionxaste[0]) , 2) + Math.pow((posicionybala - posicionyaste[0]) , 2));
       distanciaaste1 = Math.sqrt(Math.pow((posicionxbala - posicionxaste[1]) , 2) + Math.pow((posicionybala - posicionyaste[1]) , 2));
       distanciaaste2 = Math.sqrt(Math.pow((posicionxbala - posicionxaste[2]) , 2) + Math.pow((posicionybala - posicionyaste[2]) , 2));
       distanciaaste3 = Math.sqrt(Math.pow((posicionxbala - posicionxaste[3]) , 2) + Math.pow((posicionybala - posicionyaste[3]) , 2));
       distanciaaste4 = Math.sqrt(Math.pow((posicionxbala - posicionxaste[4]) , 2) + Math.pow((posicionybala - posicionyaste[4]) , 2));
       distanciaaste5 = Math.sqrt(Math.pow((posicionxbala - posicionxaste[5]) , 2) + Math.pow((posicionybala - posicionyaste[5]) , 2));
       
       distancianave = Math.sqrt(Math.pow((dlocationX - posicionxaste[x]) , 2) + Math.pow((dlocationY - posicionyaste[y]) , 2));
       
       if (distancianave <= 45)
       {
           marcadorvidas -= 1;
           posicionxaste[x] = (int) (Math.random() * 700) + 1;
           posicionyaste[x] = (int) (Math.random() * 600) + 1;
           
       }
       
       if (distanciaaste <= 45)
       {
           System.out.println("Choco");
           movimientobala = 0;
           movimientoaste = 0;
           explosion = 1;
           g.drawImage(igmexplosion , posicionxaste[0] , posicionyaste[0] , posicionxaste[0] + 100 , posicionyaste[0] + 100 , explosionx1 , explosiony1 , explosionx1 + 100 , explosiony1 + 100, this);
 
       }
       
       if (distanciaaste1 <= 45)
       {
           System.out.println("Choco");
           movimientobala = 0;
           movimientoaste1 = 0;
           explosion1 = 1;
           g.drawImage(igmexplosion , posicionxaste[1] , posicionyaste[1] , posicionxaste[1] + 100 , posicionyaste[1] + 100 , explosionx2 , explosiony2 , explosionx2 + 100 , explosiony2 + 100, this);
       }
       
       if (distanciaaste2 <= 45)
       {
           System.out.println("Choco");
           movimientobala = 0;
           movimientoaste2 = 0;
           explosion2 = 1;
           g.drawImage(igmexplosion , posicionxaste[2] , posicionyaste[2] , posicionxaste[2] + 100 , posicionyaste[2] + 100 , explosionx3 , explosiony3 , explosionx3 + 100 , explosiony3 + 100, this);
       }
       
       if (distanciaaste3 <= 45)
       {
           System.out.println("Choco");
           movimientobala = 0;
           movimientoaste3 = 0;
           explosion3 = 1;
           g.drawImage(igmexplosion , posicionxaste[3] , posicionyaste[3] , posicionxaste[3] + 100 , posicionyaste[3] + 100 , explosionx4 , explosiony4 , explosionx4 + 100 , explosiony4 + 100, this);
       }
       
       if (distanciaaste4 <= 45)
       {
           System.out.println("Choco");
           movimientobala = 0;
           movimientoaste4 = 0;
           explosion4 = 1;
           g.drawImage(igmexplosion , posicionxaste[4] , posicionyaste[4] , posicionxaste[4] + 100 , posicionyaste[4] + 100 , explosionx5 , explosiony5 , explosionx5 + 100 , explosiony5 + 100, this);
       }
       
       if (distanciaaste5 <= 45)
       {
           System.out.println("Choco");
           movimientobala = 0;
           movimientoaste5 = 0;
           explosion5 = 1;
           g.drawImage(igmexplosion , posicionxaste[5] , posicionyaste[5] , posicionxaste[5] + 100 , posicionyaste[5] + 100 , explosionx6 , explosiony6 , explosionx6 + 100 , explosiony6 + 100, this);
       }
      
    }
    Timer temporizador = new Timer(100, new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
            contador2 ++;
            posicionx +=5;
            posiciony +=5;
            
            if(contador2 > 5)
            {
                movimientoaste +=1;
                movimientoaste1 +=1;
                movimientoaste2 +=1;
                movimientoaste3 +=1;
                movimientoaste4 +=1;
                movimientoaste5 +=1;
            }
        
            if (posicionx > 600)
            {
                posicionx = 3;    
            }
            
            
         
           
            repaint();
                               
        }
        
        });
    Timer temporizador1 = new Timer(10, new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
            if (explosion == 1)
            {
                
                explosionx1 += 100;
                
                System.out.println(explosionx1);
                
                if (explosionx1 >= 950)
                {
                    explosiony1 += 100;
                    explosionx1 = 0;
                    
                    
                    if (explosiony1 >= 950)
                    {
                        posicionxaste[0] = 100 +(int) (Math.random() * 800) + 1;
                        posicionyaste[0] = 100 +(int) (Math.random() * 800) + 1;
                      
                        
                        explosion = 0;
                        explosiony1 = 0;
                        marcador += 1;
                        duracion = 26;
                        
                    }
                    
           
                    
                }
                
               
                
            }
            if (explosion1 == 1)
            {
                
                explosionx2 += 100;                
                if (explosionx2 >= 950)
                {
                    explosiony2 += 100;
                    explosionx2 = 0;
                    
                    
                    if (explosiony2 >= 950)
                    {
                        posicionxaste[1] = 100 +(int) (Math.random() * 800) + 1;
                        posicionyaste[1] = 100 +(int) (Math.random() * 800) + 1;
                           
                        explosion1 = 0;
                        explosiony2 = 0;
                        marcador += 1;
                        duracion = 26;
                        
                    }                    
                }           
            }
            if (explosion2 == 1)
            {
                
                explosionx3 += 100;           
                if (explosionx3 >= 950)
                {
                    explosiony3 += 100;
                    explosionx3 = 0;
                    
                    
                    if (explosiony3 >= 950)
                    {
                        posicionxaste[2] = 100 +(int) (Math.random() * 800) + 1;
                        posicionyaste[2] = 100 +(int) (Math.random() * 800) + 1;
                    
                       
                        explosion2 = 0;
                        explosiony3 = 0;
                        marcador += 1;
                        duracion = 26;
                        
                    }                    
                }           
            }
            if (explosion3 == 1)
            {
                
                explosionx4 += 100;

                if (explosionx4 >= 950)
                {
                    explosiony4 += 100;
                    explosionx4 = 0;
                    
                    
                    if (explosiony4 >= 950)
                    {
                      
                        posicionxaste[3] = 100 +(int) (Math.random() * 800) + 1;
                        posicionyaste[3] = 100 +(int) (Math.random() * 800) + 1;
                        explosion3 = 0;
                        explosiony4 = 0;
                        marcador += 1;
                        duracion = 26;
                        
                    }                    
                }           
            }
            if (explosion4 == 1)
            {
                
                explosionx5 += 100;
  
                if (explosionx5 >= 950)
                {
                    explosiony5 += 100;
                    explosionx5 = 0;
                    
                    
                    if (explosiony5 >= 950)
                    {
                        posicionxaste[4] = 100 +(int) (Math.random() * 800) + 1;
                        posicionyaste[4] = 100 +(int) (Math.random() * 800) + 1;
                       
                        explosion4 = 0;
                        explosiony5 = 0;
                        marcador += 1;
                        duracion = 26;
                        
                    }                    
                }           
            }
            if (explosion5 == 1)
            {
                
                explosionx6 += 100;
     
                if (explosionx6 >= 950)
                {
                    explosiony6 += 100;
                    explosionx6 = 0;
                    
                    
                    if (explosiony6 >= 950)
                    {
                        posicionxaste[5] = 100 +(int) (Math.random() * 800) + 1;
                        posicionyaste[5] = 100 +(int) (Math.random() * 800) + 1;
                      
                        explosion5 = 0;
                        explosiony6 = 0;
                        marcador += 1;
                        duracion = 26;
                        
                    }                    
                }           
            }
        }
        });
    
    public Frmasteroide() {
        initComponents();
        addKeyListener(this);
        try {
            imgNebula = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\nebula_blue.png"));
            imgaste = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\debris2_blue.png"));
            imgaste2 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\debris2_blue.png"));
            imgnave = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\nave1.png"));
            locationX = imgnave.getWidth() / 2;
            locationY = imgnave.getHeight() / 2;
            imgnave2 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\nave2.png"));
            locationX = imgnave2.getWidth() / 2;
            locationY = imgnave2.getHeight() / 2;
            imgasteroid = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\asteroid_blue.png"));
            locationXasteroide = imgasteroid.getWidth() / 2;
            locationYasteroide = imgasteroid.getHeight() / 2;
            
            imgshot = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\shot1.png"));
            locationXbala = imgshot.getWidth() / 2;
            locationYbala = imgshot.getHeight() / 2;
            
            igmexplosion = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Documents\\NetBeansProjects\\imagenes asteroide\\explosion.hasgraphics.png"));
            
        } catch (IOException ex) {
            Logger.getLogger(Frmasteroide.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        temporizador.start();
        temporizador1.start();
        
      
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
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        posicionxaste1 = 100 +(int) (Math.random() * 800) + 1;
        posicionxaste2 = 100 +(int) (Math.random() * 800) + 1;
        posicionxaste3 = 100 +(int) (Math.random() * 800) + 1;
        posicionxaste4 = 100 +(int) (Math.random() * 800) + 1;
        posicionxaste5 = 100 +(int) (Math.random() * 800) + 1;
        posicionxaste6 = 100 +(int) (Math.random() * 800) + 1;
        
        posicionyaste1 = 100 +(int) (Math.random() * 600) + 1;
        posicionyaste2 = 100 +(int) (Math.random() * 600) + 1;
        posicionyaste3 = 100 +(int) (Math.random() * 600) + 1;
        posicionyaste4 = 100 +(int) (Math.random() * 600) + 1;
        posicionyaste5 = 100 +(int) (Math.random() * 600) + 1;
        posicionyaste6 = 100 +(int) (Math.random() * 600) + 1;
      
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
            java.util.logging.Logger.getLogger(Frmasteroide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmasteroide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmasteroide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmasteroide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmasteroide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
