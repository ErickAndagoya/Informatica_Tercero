/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traga;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author usuario
 */
public class Tragaperras extends javax.swing.JFrame 
{

    int contador;
    int contadordinero;
    int aleatorio;
    int aleatorio1;
    int aleatorio2;
    int aleatoriodinero , aleatoriodinero1 , aleatoriodinero2 , aleatoriodinero3 , aleatoriodinero4 , aleatoriodinero5 , aleatoriodinero6 , aleatoriodinero7;
    int residuo;
    int buclex;
    int []posicionx = { 0 , 50 , 100 , 150 , 200 , 250 , 300 , 350};
    int posiciony = 700;
    
    BufferedImage imgdinero = null , imgdinero2 = null;
    
    ImageIcon imagen1 = new ImageIcon (getClass().getResource("1.png"));
    ImageIcon imagen2 = new ImageIcon (getClass().getResource("1.png"));
    ImageIcon imagen3 = new ImageIcon (getClass().getResource("1.png"));
  
    AudioClip sonido;
    AudioClip sonido2;
    AudioClip sonido3;
    AudioClip sonido4;
    
    public void paint(Graphics g)
    {
       super.paint(g);
       for (buclex = 0 ; buclex < 7 ; buclex ++)
       {
           
            g.drawImage(imgdinero , posicionx[buclex] , posiciony , this);
            
            if (contadordinero % 2 == 0)
            {
                g.drawImage(imgdinero2 , posicionx[buclex] , posiciony , this);
            }
            
       }
       lblcrono.setText(String.valueOf(contador));
    
    }
    
    Timer temporizadordinero = new Timer(50 , new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            repaint();
            
            contadordinero += 1;
            posicionx[0] += aleatoriodinero;
            posicionx[1] += aleatoriodinero1;
            posicionx[2] += aleatoriodinero2;
            posicionx[3] += aleatoriodinero3;
            posicionx[4] -= aleatoriodinero5;
            posicionx[5] -= aleatoriodinero5;
            posicionx[6] -= aleatoriodinero6;
            posicionx[7] -= aleatoriodinero7;

            posiciony -= 5; 
            
            if (posicionx[buclex] > 400 || posicionx[buclex] < 0 || posiciony < 0)
            {
                posicionx[0] = 0;
                posicionx[1] = 50;
                posicionx[2] = 100;
                posicionx[3] = 150;
                posicionx[4] = 200;
                posicionx[5] = 250;
                posicionx[6] = 300;
                posicionx[7] = 350;
                posiciony = 400;
                temporizadordinero.stop();
            }           
        }
    });
        
        
    Timer temporizador = new Timer(50 , new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            
            repaint();
            contador += 1;
            aleatorio = (int) (Math.random() * 10) + 1;
            sonido4.play();
            
             
                switch (aleatorio)
                {
                    case 1: imagen1 = new ImageIcon (getClass().getResource("1.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 2: imagen1 = new ImageIcon (getClass().getResource("2.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 3: imagen1 = new ImageIcon (getClass().getResource("3.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 4: imagen1 = new ImageIcon (getClass().getResource("4.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 5: imagen1 = new ImageIcon (getClass().getResource("5.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 6: imagen1 = new ImageIcon (getClass().getResource("6.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 7: imagen1 = new ImageIcon (getClass().getResource("7.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 8: imagen1 = new ImageIcon (getClass().getResource("8.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 9: imagen1 = new ImageIcon (getClass().getResource("9.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                            

                    case 10: imagen1 = new ImageIcon (getClass().getResource("10.png"));
                            Imagen1.setIcon(imagen1);
                                    break;                             
                }
            if (contador % 2 == 0)
            {
                aleatorio1 = (int) (Math.random() * 10) + 1;
            }
            
                switch (aleatorio1)
                {
                    case 1: imagen2 = new ImageIcon (getClass().getResource("1.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 2: imagen2 = new ImageIcon (getClass().getResource("2.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 3: imagen2 = new ImageIcon (getClass().getResource("3.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 4: imagen2 = new ImageIcon (getClass().getResource("4.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 5: imagen2 = new ImageIcon (getClass().getResource("5.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 6: imagen2 = new ImageIcon (getClass().getResource("6.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 7: imagen2 = new ImageIcon (getClass().getResource("7.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 8: imagen2 = new ImageIcon (getClass().getResource("8.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 9: imagen2 = new ImageIcon (getClass().getResource("9.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            

                    case 10: imagen2 = new ImageIcon (getClass().getResource("10.png"));
                            Imagen2.setIcon(imagen2);
                                    break;                            
                }
            if (contador % 4 == 0)
            {
                aleatorio2 = (int) (Math.random() * 10) + 1;
            }
            
            switch (aleatorio2)
            {
                case 1: imagen3 = new ImageIcon (getClass().getResource("1.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
          
                case 2: imagen3 = new ImageIcon (getClass().getResource("2.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
           
                case 3: imagen3 = new ImageIcon (getClass().getResource("3.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
            
                case 4: imagen3 = new ImageIcon (getClass().getResource("4.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
          
                case 5: imagen3 = new ImageIcon (getClass().getResource("5.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
           
                case 6: imagen3 = new ImageIcon (getClass().getResource("6.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
           
                case 7: imagen3 = new ImageIcon (getClass().getResource("7.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
            
                case 8: imagen3 = new ImageIcon (getClass().getResource("8.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
           
                case 9: imagen3 = new ImageIcon (getClass().getResource("9.png"));
                        Imagen3.setIcon(imagen3);
                                break;                            
         
                case 10: imagen3 = new ImageIcon (getClass().getResource("10.png"));
                        Imagen3.setIcon(imagen3);
                                break;                              
            }  
            if (contador == 100)
            {
                temporizador.stop();
                contador = 0;
               
                if (aleatorio == aleatorio1 && aleatorio1 == aleatorio2)
                {
                    txtSaldo.setText(String.valueOf(Integer.parseInt(txtSaldo.getText()) + 2 * Integer.parseInt(cbxApostar.getSelectedItem().toString())));
                    sonido.play();
                    temporizadordinero.start();
                    
                }
                else if ((aleatorio ==  aleatorio1 && aleatorio2 == 1) || (aleatorio == aleatorio2 && aleatorio1 == 1) || (aleatorio1 == aleatorio2 && aleatorio == 1) )
                {
                    txtSaldo.setText(String.valueOf(Integer.parseInt(txtSaldo.getText()) + Integer.parseInt(cbxApostar.getSelectedItem().toString())));
                    sonido.play();
                    temporizadordinero.start();
                    
                }
                 
                else if (aleatorio != aleatorio1 && aleatorio1 != aleatorio2)
                {
                    txtSaldo.setText(String.valueOf(Integer.parseInt(txtSaldo.getText()) - Integer.parseInt(cbxApostar.getSelectedItem().toString())));
                    sonido2.play();
      
                }
                
                else if (aleatorio == 1 && aleatorio1 == 1 &&  aleatorio2 == 1)
                {
                    txtSaldo.setText(String.valueOf(Integer.parseInt(txtSaldo.getText()) + 3 * Integer.parseInt(cbxApostar.getSelectedItem().toString())));
                    sonido.play();
                  
                }
                else if ((aleatorio ==  aleatorio1) || (aleatorio == aleatorio2) || (aleatorio1 == aleatorio2) )
                {
                    txtSaldo.setText(String.valueOf(Integer.parseInt(txtSaldo.getText()))) ;
                    sonido2.play();
                 
               
                }
                
                if (Integer.valueOf(txtSaldo.getText()) == 0)
                {
                    JOptionPane.showMessageDialog(null , "GRACIAS POR TU DINERO");
                    System.exit(0);
                    sonido2.play();
                    
                }
               
               
            }
            
        }
    });
    
    
    public Tragaperras() {
        initComponents();
        this.setLocationRelativeTo(null);
        cbxApostar.addItem("5");
        cbxApostar.addItem("10");
        cbxApostar.addItem("20");
        cbxApostar.addItem("50");
        cbxApostar.addItem("100");
        txtSaldo.setText("100");
        
        Imagen1.setIcon(imagen1);
        
        Imagen2.setIcon(imagen2);
        
        Imagen3.setIcon(imagen3);
        
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/traga/correcto.wav"));
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/traga/perder.wav"));
        sonido3 = java.applet.Applet.newAudioClip(getClass().getResource("/traga/inicio.wav"));
        sonido4 = java.applet.Applet.newAudioClip(getClass().getResource("/traga/juego.wav"));
        
        try {
            imgdinero = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Desktop\\Erick\\tercero\\informatica\\Traga\\100.jpg"));
            imgdinero2 = ImageIO.read(new File("C:\\Users\\EQÚIPO\\Desktop\\Erick\\tercero\\informatica\\Traga\\1002.png"));
       
        } catch (IOException ex) {
            Logger.getLogger(Tragaperras.class.getName()).log(Level.SEVERE , null , ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxApostar = new javax.swing.JComboBox<>();
        txtSaldo = new javax.swing.JTextField();
        Imagen2 = new javax.swing.JLabel();
        Imagen3 = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblcrono = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(10, 145, 10));
        setPreferredSize(new java.awt.Dimension(400, 500));

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 155, 0));
        jLabel1.setText("Traga monedas");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Saldo");

        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Apostar");

        cbxApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxApostarActionPerformed(evt);
            }
        });

        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        jLabel4.setText("Comodin = Corona");

        lblcrono.setFont(new java.awt.Font("Trebuchet MS", 3, 13)); // NOI18N

        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblcrono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxApostar, 0, 66, Short.MAX_VALUE)
                            .addComponent(txtSaldo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnIniciar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblcrono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxApostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btnIniciar))
                    .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (Integer.parseInt(cbxApostar.getSelectedItem().toString()) <= Integer.valueOf(txtSaldo.getText()))
                {
                    temporizador.start();
                    sonido3.play();
                    
                  
                    
                    aleatoriodinero = (int) (Math.random() * 10) + 1;
                    aleatoriodinero1= (int) (Math.random() * 10) + 1;
                    aleatoriodinero2 = (int) (Math.random() * 10) + 1;
                    aleatoriodinero3 = (int) (Math.random() * 10) + 1;
                    aleatoriodinero4 = (int) (Math.random() * 10) + 1;
                    aleatoriodinero5 = (int) (Math.random() * 10) + 1;
                    aleatoriodinero6 = (int) (Math.random() * 10) + 1;
                    aleatoriodinero7 = (int) (Math.random() * 10) + 1;
                    
               
                }
        else 
        {
            JOptionPane.showMessageDialog(null,"NO TIENES SALDO SUFICIENTE");
        }
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void cbxApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxApostarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxApostarActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frminicio regresar = new Frminicio ();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tragaperras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tragaperras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tragaperras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tragaperras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tragaperras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cbxApostar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblcrono;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
