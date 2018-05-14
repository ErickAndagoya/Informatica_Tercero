/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.applet.AudioClip;
import javax.swing.JOptionPane;




public class FrmJuego extends javax.swing.JFrame 
{
 
    int verificar = 1;
    int boton = 0;
    int contador;
    int aleatorio , aleatorioimagenes;
    int nuevo;
    int marcador = 0;
    
    ImageIcon imagen1 = new ImageIcon (getClass().getResource(" "));
    ImageIcon imagen2 = new ImageIcon (getClass().getResource(" "));
    
    AudioClip sonido;
    AudioClip sonido2;
    AudioClip sonido3;

    Timer temporizador = new Timer(50,new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            contador += 1;
            aleatorioimagenes = (int) (Math.random() * 5) + 1;
            lblcontador.setText(String.valueOf(marcador)); 
           
            switch (aleatorioimagenes)
                {
                    case 1:
                        imagen1 = new ImageIcon (getClass().getResource("piedra.png"));
                        lblcpu.setIcon(imagen1);
                    break;
                    case 2:
                        imagen1 = new ImageIcon (getClass().getResource("papel.png"));
                        lblcpu.setIcon(imagen1);
                    break;
                    case 3:
                        imagen1 = new ImageIcon (getClass().getResource("tijera.png"));
                        lblcpu.setIcon(imagen1);
                    break;
                    case 4:
                        imagen1 = new ImageIcon (getClass().getResource("lagarto.png"));
                        lblcpu.setIcon(imagen1);
                    break;
                    case 5:
                        imagen1 = new ImageIcon (getClass().getResource("spock.png"));
                        lblcpu.setIcon(imagen1);
                    break;
                }
            
            if (boton > 0)
            {
                aleatorio = aleatorioimagenes;
                temporizador.stop();
                System.out.println(aleatorio);
                
                
                if (boton == 1)
                {
                    imagen2 = new ImageIcon (getClass().getResource("piedra.png"));
                    lbljugador.setIcon(imagen2);
                }
                if (boton == 2)
                {
                    imagen2 = new ImageIcon (getClass().getResource("papel.png"));
                    lbljugador.setIcon(imagen2);
                }
                if (boton == 3)
                {
                    imagen2 = new ImageIcon (getClass().getResource("tijera.png"));
                    lbljugador.setIcon(imagen2);
                }
                if (boton == 4)
                {
                    imagen2 = new ImageIcon (getClass().getResource("lagarto.png"));
                    lbljugador.setIcon(imagen2);
                }
                if (boton == 5)
                {
                    imagen2 = new ImageIcon (getClass().getResource("spock.png"));
                    lbljugador.setIcon(imagen2);
                }
                
                if (boton == 3)
                {
                    if (aleatorio == 1)
                    {
                        sonido.play();

                    }
                    if (aleatorio == 2)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 3)
                    {
                        sonido3.play();
                    }
                    if (aleatorio == 4)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 5)
                    {
                        sonido.play();
                    }
                }
                if (boton == 5)
                {
                    if (aleatorio == 1)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 2)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 3)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 4)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 5)
                    {
                        sonido3.play();
                    }
                }
                if (boton == 1)
                {
                    if (aleatorio == 1)
                    {
                        sonido3.play();
                    }
                    if (aleatorio == 2)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 3)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 4)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 5)
                    {
                        sonido.play();
                    }
                }
                if (boton == 2)
                {
                    if (aleatorio == 1)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 2)
                    {
                        sonido3.play();
                    }
                    if (aleatorio == 3)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 4)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 5)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                }
                if (boton == 4)
                {
                    if (aleatorio == 1)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 2)
                    {
                        sonido2.play();
                        marcador += 1;
                    }
                    if (aleatorio == 3)
                    {
                        sonido.play();
                    }
                    if (aleatorio == 4)
                    {
                        sonido3.play();
                    }
                    if (aleatorio == 5)
                    {
                        sonido2.play();
                        marcador += 1;
                        
                    }
                }
           
            }
            
   
        }
    });
     
    public FrmJuego() {
        initComponents();
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/juego/perder.wav"));
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/juego/ganar.wav"));
        sonido3 = java.applet.Applet.newAudioClip(getClass().getResource("/juego/empate.wav"));
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPiedra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLagarto = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        lbljugador = new javax.swing.JLabel();
        lblcpu = new javax.swing.JLabel();
        btnrestar = new javax.swing.JButton();
        lblcontador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PIerdra , Papel , Tijera , Lagarto , Spock");
        setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(null);

        btnPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/piedra.png"))); // NOI18N
        btnPiedra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });
        getContentPane().add(btnPiedra);
        btnPiedra.setBounds(17, 323, 100, 72);

        jLabel1.setText("Reglas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 43, 16);

        jLabel2.setForeground(new java.awt.Color(245, 0, 0));
        jLabel2.setText("Tijera corta Papel ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 52, 106, 16);

        jLabel3.setForeground(new java.awt.Color(245, 0, 0));
        jLabel3.setText("Tijera decapitan Lagarto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 79, 140, 16);

        jLabel4.setForeground(new java.awt.Color(0, 235, 0));
        jLabel4.setText("Papel cubre Piedra");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 108, 107, 16);

        jLabel5.setForeground(new java.awt.Color(0, 235, 0));
        jLabel5.setText("Papel refuta a Spock");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 131, 118, 16);

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Piedra aplasta Lagarto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(12, 154, 128, 16);

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Piedra destruye Tijera");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(12, 177, 127, 16);

        jLabel8.setForeground(new java.awt.Color(100, 155, 0));
        jLabel8.setText("Lagarto envenena Spock");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(12, 206, 140, 16);

        jLabel9.setForeground(new java.awt.Color(100, 155, 0));
        jLabel9.setText("Lagarto come Papel");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(12, 233, 113, 16);

        jLabel10.setText("Spock rompe Tijera ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(12, 264, 117, 16);

        jLabel11.setText("Spock vaporiza Piedra");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(12, 287, 126, 16);

        btnLagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/lagarto.png"))); // NOI18N
        btnLagarto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagartoActionPerformed(evt);
            }
        });
        getContentPane().add(btnLagarto);
        btnLagarto.setBounds(101, 408, 100, 72);

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/papel.png"))); // NOI18N
        btnPapel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });
        getContentPane().add(btnPapel);
        btnPapel.setBounds(190, 323, 100, 72);

        btnTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/tijera.png"))); // NOI18N
        btnTijera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijeraActionPerformed(evt);
            }
        });
        getContentPane().add(btnTijera);
        btnTijera.setBounds(343, 323, 100, 72);

        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/spock.png"))); // NOI18N
        btnStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnStock);
        btnStock.setBounds(268, 408, 100, 72);

        btnJugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(50, 50, 155));
        btnJugar.setText("Jugar");
        btnJugar.setToolTipText("");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(380, 30, 80, 25);
        getContentPane().add(lbljugador);
        lbljugador.setBounds(330, 120, 100, 120);
        getContentPane().add(lblcpu);
        lblcpu.setBounds(220, 120, 100, 120);

        btnrestar.setText("Dos de Tres");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrestar);
        btnrestar.setBounds(249, 30, 110, 25);

        lblcontador.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblcontador.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblcontador);
        lblcontador.setBounds(310, 270, 50, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        temporizador.start();

        
          
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijeraActionPerformed
        boton = 3;
        

            
        
    }//GEN-LAST:event_btnTijeraActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        boton = 5;
        

            
        
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        boton = 1;
        

            
        
 
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        boton = 2;

           
        
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnLagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagartoActionPerformed
        boton = 4;

            
        
    }//GEN-LAST:event_btnLagartoActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        boton = 0;
        nuevo = 0;
        temporizador.restart();
        
       
        
    }//GEN-LAST:event_btnrestarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLagarto;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnTijera;
    private javax.swing.JButton btnrestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblcontador;
    private javax.swing.JLabel lblcpu;
    private javax.swing.JLabel lbljugador;
    // End of variables declaration//GEN-END:variables
}
