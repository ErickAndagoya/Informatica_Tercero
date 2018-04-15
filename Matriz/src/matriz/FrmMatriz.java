/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.awt.Color;
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
public class FrmMatriz extends javax.swing.JFrame implements KeyListener
{
    

    public int filas , columnas;
    int teclado;
    int direccionx;
    int posicionx;
    int contador;
    int posiciony;
    int sube;
    int teclado2;
    public static int x = new Color(0 , 0 , 0).getRGB();
    public static int o = new Color(255 , 255 , 255).getRGB();
    public static int d = new Color(0 , 255 , 0).getRGB();
    
     int [][] pacman={{o,o,o,o,o,o,o,o,x,x,x,o,o,o,o,o,o,o,o,},
                      {o,o,o,o,o,o,x,x,d,d,d,x,x,o,o,o,o,o,o,},
                      {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                      {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                      {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                      {o,o,x,d,d,d,d,d,d,d,d,d,d,d,d,d,x,o,o,},
                      {o,o,x,d,d,d,d,d,d,d,d,d,d,d,d,d,x,o,o,},
                      {o,x,d,x,x,x,x,d,d,d,d,d,x,x,x,x,d,x,o,},
                      {o,x,d,x,o,o,x,x,d,d,d,x,x,o,o,x,d,x,o,},
                      {o,x,d,x,o,x,x,x,x,d,x,x,x,x,o,x,d,x,o,},
                      {o,x,d,x,x,x,o,x,x,d,x,o,x,x,x,x,d,x,o,},
                      {o,o,x,d,x,x,x,x,x,d,x,x,x,x,x,d,x,o,o,},
                      {o,o,x,d,d,x,x,x,x,d,x,x,x,x,d,d,x,o,o,},
                      {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                      {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                      {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                      {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                      {o,o,o,x,x,d,x,x,d,d,d,x,x,d,x,x,o,o,o,},
                      {o,x,x,d,d,d,d,d,x,x,x,d,d,d,d,d,x,x,o,},
                      {x,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,x,},
                      {x,d,d,d,x,d,d,d,d,d,d,d,d,d,x,d,d,d,x,},
                      {o,x,x,x,o,x,d,d,d,d,d,d,d,x,o,x,x,x,o,},
                      {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                      {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                      {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                      {o,o,o,x,d,d,d,d,x,x,x,d,d,d,d,x,o,o,o,},
                      {o,o,x,d,d,d,d,x,o,o,o,x,d,d,d,d,x,o,o,},
                      {o,o,x,d,d,x,x,o,o,o,o,o,x,x,d,d,x,o,o,},
                      {o,o,o,x,x,o,o,o,o,o,o,o,o,o,x,x,o,o,o,},};
     
     int [][] pacman1={{o,o,o,o,o,o,o,o,x,x,x,o,o,o,o,o,o,o,o,},
                       {o,o,o,o,o,o,x,x,d,d,d,x,x,o,o,o,o,o,o,},
                       {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,o,x,d,d,d,d,d,d,d,d,d,d,d,d,d,x,o,o,},
                       {o,o,x,d,d,d,d,d,d,d,d,d,d,d,d,d,x,o,o,},
                       {o,x,d,x,x,x,x,d,d,d,d,d,x,x,x,x,d,x,o,},
                       {o,x,d,x,o,o,x,x,d,d,d,x,x,o,o,x,d,x,o,},
                       {o,x,d,x,o,x,x,x,x,d,x,x,x,x,o,x,d,x,o,},
                       {o,x,d,x,x,x,o,x,x,d,x,o,x,x,x,x,d,x,o,},
                       {o,o,x,d,x,x,x,x,x,d,x,x,x,x,x,d,x,o,o,},
                       {o,o,x,d,d,x,x,x,x,d,x,x,x,x,d,d,x,o,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,x,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,x,o,},
                       {x,d,x,x,o,x,d,d,d,d,d,d,d,x,o,x,x,d,x,},
                       {x,d,d,d,x,x,x,x,d,d,d,x,x,x,x,d,d,d,x,},
                       {o,x,x,d,d,d,d,d,x,x,x,d,d,d,d,d,x,x,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                       {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                       {o,x,x,x,d,d,d,d,d,d,d,d,d,d,d,x,x,x,o,},
                       {x,d,d,d,d,d,d,d,x,x,x,x,d,d,d,d,d,d,x,},
                       {o,x,x,x,x,x,x,x,o,o,o,o,x,x,x,x,x,x,o,},
                       {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,},
                       {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,},};
     
     int [][] pacman2={{o,o,o,o,o,o,o,o,x,x,x,o,o,o,o,o,o,o,o,},
                       {o,o,o,o,o,o,x,x,d,d,d,x,x,o,o,o,o,o,o,},
                       {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,x,x,o,o,},
                       {o,o,x,d,d,d,d,d,d,d,d,d,d,x,x,x,x,o,o,},
                       {o,x,d,d,d,d,d,d,d,d,d,d,d,x,x,o,x,x,o,},
                       {o,x,d,d,d,d,d,d,d,d,d,d,d,x,x,o,x,x,o,},
                       {o,x,d,d,d,d,d,d,d,d,d,d,d,x,x,o,o,x,o,},
                       {o,x,d,d,d,d,d,d,d,d,d,d,d,x,x,x,x,x,o,},
                       {o,o,x,d,d,d,d,d,d,d,d,d,d,x,x,x,x,o,o,},
                       {o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,x,x,o,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,o,o,x,d,d,d,d,d,d,d,d,d,d,d,x,o,o,o,},
                       {o,o,o,o,x,d,d,d,d,d,d,d,d,d,x,o,o,o,o,},
                       {o,o,o,o,o,x,d,d,d,d,d,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,o,o,x,x,d,d,d,x,x,o,o,o,o,o,o,},
                       {o,o,o,o,o,o,x,d,x,x,x,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,o,x,x,d,d,d,d,d,d,x,o,o,o,o,o,},
                       {o,o,o,o,x,d,x,d,d,d,x,d,d,d,x,o,o,o,o,},
                       {o,o,o,x,d,d,x,d,x,d,d,x,d,d,x,o,o,o,o,},
                       {o,o,o,x,d,x,x,d,d,x,x,x,d,d,x,o,o,o,o,},
                       {o,o,o,o,x,o,x,d,d,d,d,d,d,d,x,o,o,o,o,},
                       {o,o,o,o,o,o,x,d,x,x,d,d,d,d,x,o,o,o,o,},
                       {o,o,o,o,o,o,x,d,d,d,x,x,d,d,d,x,o,o,o,},
                       {o,o,o,o,o,x,d,d,d,x,o,o,x,d,d,d,x,o,o,},
                       {o,o,o,o,o,x,d,d,x,o,o,o,x,x,d,d,x,o,o,},
                       {o,o,o,o,o,o,x,x,o,o,o,o,o,o,x,x,o,o,o,},};
     
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) 
    {
    teclado = 0;
    }
    public void keyPressed(KeyEvent e)
    {
       teclado = e.getKeyCode();
       teclado2 = e.getKeyCode();
       System.out.println(teclado);
    }
   
    public void paint(Graphics g)
    {
       
        super.paint(g);
             
        if (teclado == 68)
            {
                for(filas = 0 ; filas < 29 * 4 ; filas ++)
                        {
                            for(columnas = 0 ; columnas < 19 * 4 ; columnas ++)
                                {
                                    if (contador % 3 == 0)
                                        {

                                            g.setColor(new Color(pacman[filas / 4][columnas / 4]));
                                            g.drawRect( columnas + posicionx , 150 + filas - posiciony , 1 , 1);


                                        }
                                    else
                                    {

                                        g.setColor(new Color(pacman2[filas / 4][columnas / 4]));
                                        g.drawRect( columnas + posicionx , 150 + filas - posiciony , 1 , 1);
                                    }
                                }
                        }
            }
        else
           {
               for(filas = 0 ; filas < 29 * 4 ; filas++)
                        {
                            for(columnas = 0 ; columnas < 19 * 4 ; columnas ++)
                                {
                                    g.setColor(new Color(pacman[filas / 4][columnas / 4]));
                                    g.drawRect( columnas + posicionx , 150 + filas - posiciony , 1 , 1);
                                }
                        }
           }
    
        if (teclado2 == 87)
            {
                for(filas = 0 ; filas < 29 * 4 ; filas ++)
                        {
                            for(columnas = 0 ; columnas < 19 * 4 ; columnas ++)
                                {
                                    if (contador %5 == 0)
                                        {

                                            g.setColor(new Color(pacman[filas / 4][columnas / 4]));
                                            g.drawRect( columnas + posicionx  , 150 + filas - posiciony , 1 , 1);


                                        }
                                    else
                                    {

                                        g.setColor(new Color(pacman1[filas / 4][columnas / 4]));
                                        g.drawRect( columnas + posicionx  , 150 + filas - posiciony , 1 , 1);
                                    }
                                }
                        }
            }
        else
           {
               for(filas = 0 ; filas < 29 * 4 ; filas ++)
                        {
                            for(columnas = 0 ; columnas < 19 * 4 ; columnas ++)
                                {
                                    g.setColor(new Color(pacman[filas / 4][columnas / 4]));
                                    g.drawRect( columnas + posicionx , 150 + filas - posiciony , 1 , 1);
                                }
                        }
           }
        if (teclado == 65)
            {
                for(filas = 0 ; filas < 29 * 4 ; filas ++)
                        {
                            for(columnas = 0 ; columnas < 19 * 4 ; columnas ++)
                                {
                                    if (contador %3 == 0)
                                        {

                                            g.setColor(new Color(pacman[filas / 4][columnas / 4]));
                                            g.drawRect( columnas + posicionx  , 150 + filas - posiciony , 1 , 1);


                                        }
                                    else
                                    {

                                        g.setColor(new Color(pacman2[filas / 4][columnas / 4]));
                                        g.drawRect( 19 * 4 - columnas + posicionx  , 150 + filas - posiciony , 1 , 1);
                                    }
                                }
                        }
            }
        else
           {
               for(filas = 0 ; filas < 29 * 4 ; filas ++)
                        {
                            for(columnas = 0 ; columnas < 19 * 4 ; columnas ++)
                                {
                                    g.setColor(new Color(pacman[filas / 4][columnas / 4]));
                                    g.drawRect( columnas + posicionx , 150 + filas - posiciony , 1 , 1);
                                }
                        }
           }
                                
                                         
    }
    
    Timer temporizador = new Timer(100, new ActionListener() 
    {
        public void actionPerformed (ActionEvent e)
        {
            repaint();
            contador += 1;
            
            System.out.println(sube);
            switch (teclado)
            {      
                case 68:

                    posicionx += 5; 
                break;
                case 65:

                    posicionx -= 5; 
                break;
            
            }
            switch (teclado2)
            { 
                case 87:
                    sube += 1;
                    posiciony += 5;
                    if (sube == 20)
                    {
                        teclado2 = 83;

                    }

                break;
                case 83:
                    sube += 1;
                    posiciony -= 5;
                    if (sube == 40)
                    {
                        teclado2 = 68;
                        sube = 0;

                    } 
                break;
           
            }          
        }
    });
    
    public FrmMatriz() {
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
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
