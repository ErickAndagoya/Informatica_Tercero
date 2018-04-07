/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

/**
 *
 * @author EQÚIPO
 */
public class FrmPong extends javax.swing.JFrame implements KeyListener
{
    int pelotax = 385;
    int pelotay = 300;
    int direccionx = 1;
    int direcciony = 1;  
    int paleta1 = 225;
    int paleta2 = 225;
    int marcador1 = 0;
    int marcador2 = 0;
    int aleatorio;
    int aleatorio2;
   
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e)
    {
       int paleta = e.getKeyCode();
       System.out.println(paleta);
       
       if (paleta == 38)
       {
           if (paleta1 > 40)
           {             
                paleta1 -= 10;
           }       
       }
       
        if (paleta == 40)
       {
           if (paleta1 < 440)
           {     
                paleta1 += 10;
           }       
       }
        if (paleta == 87)
       {
           if (paleta2 > 40)
           {    
                paleta2 -= 10;
           }       
       }
        if (paleta == 83)
       {
           if (paleta2 < 440)
           {        
                paleta2 += 10;
           }       
       }
        if (paleta == 81)
        {
            marcador1 = 0;
            marcador2 = 0;
            pelotax = 385;
            pelotay = 300;
            aleatorio2 = (int)(Math.random()*2) + 1;
            aleatorio = 2;
            paleta1 = 225;
            paleta2 = 225;
            if (aleatorio2 == 1)
            {
                direccionx = 1;
                direcciony = 0;
                              
            }
            else 
            {
                direccionx = -1;
                direcciony = 0;    
            }                        
        }
       
    }
        
    
    
    public void paint (Graphics g)
    {
        super.paint (g);
 
        g.setColor(Color.red);
        g.fillRect(10 , paleta1 , 50 , 200);
        g.fillRect(760 , paleta2 , 50 , 200);
        g.setColor(Color.black);
        g.fillOval(pelotax , pelotay , 50 , 50);
        g.setFont(new Font ("Arial" , Font.BOLD , 20));
        g.drawString(String.valueOf(marcador1), 250 , 75);
        g.drawString(String.valueOf(marcador2) , 550 , 75);      
        
    }
    Timer temporizador = new Timer(10, new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
             
            if (pelotax > 710 || pelotax < 50)
            {
                
                switch (direccionx)
                {
                    
                    case -1:
                        
                        if (pelotay > paleta1 - 25 && pelotay  < paleta1 + 175)
                        {
                            direccionx *= -1;   
                            if (pelotay > paleta1 - 25 && pelotay < paleta1 + 50 )
                            {
                                aleatorio = 2 + (int)(Math.random()*3) + 1;
                                direcciony = 1;
                               
                                
                            }
                            if (pelotay > paleta1 + 50 && pelotay < paleta1 + 100 )
                            {
                                aleatorio = 3;
                                direccionx = 1;
                                direcciony = 0;
                            }
                            if (pelotay > paleta1 + 100 && pelotay < paleta1 + 200 )
                            {
                                aleatorio = 2 + (int)(Math.random()*3) + 1;
                                direcciony = -1;
                            }
                    
                        }
                        if (pelotax < 0)
                        {
                            pelotax = 385;
                            pelotay = 300;
                            marcador2 += 1;
                            aleatorio = 2;
                            direccionx = 1;
                            direcciony = 0;
                            paleta1 = 225;
                            paleta2 = 225;     
                        }
                        
                    break;
                    case 1:
                    
                        if (pelotay  > paleta2 - 25 && pelotay < paleta2 + 175)
                        {
                            direccionx *= -1;
                            if (pelotay > paleta2 - 25 && pelotay < paleta2 + 50 )
                            {
                                aleatorio = 2 + (int)(Math.random()*3) + 1;
                                direcciony = 1;
                            }
                            if (pelotay > paleta2 + 50 && pelotay < paleta2 + 100 )
                            {
                                aleatorio = 3;
                                direccionx = -1;
                                direcciony = 0;
                            }
                            if (pelotay > paleta2 + 100 && pelotay < paleta2 + 200 )
                            {
                                aleatorio = 2 + (int)(Math.random()*3) + 1;
                                direcciony = -1;
                            }
                           
                        }
                        if (pelotax > 800)
                        {
                            pelotax = 385;
                            pelotay = 300;
                            marcador1 += 1;
                            aleatorio = 2;
                            direccionx = -1;   
                            direcciony = 0;
                            paleta1 = 225;
                            paleta2 = 225;
                            
                        }
                        break;                 
                }
                                        
            }    
            
            pelotax += aleatorio * direccionx;          
            repaint();
            
            if(pelotay >= 550 || pelotay <= 40)
            {
                direcciony *=-1;
            }
           
            pelotay += aleatorio * direcciony;
            repaint (); 
        }
    });
    
    public FrmPong() {
        initComponents();
        addKeyListener(this);
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
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
