/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neptuno;

import java.awt.image.BufferedImage;

/**
 *
 * @author EQÚIPO
 */
public class FrmPrincipal extends javax.swing.JFrame 
{
    

    
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jdpContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuclientes = new javax.swing.JMenuItem();
        mnuempleados = new javax.swing.JMenuItem();
        mnucomp = new javax.swing.JMenuItem();
        mnuproveedores = new javax.swing.JMenuItem();
        mnucate = new javax.swing.JMenuItem();
        mnuprod = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnufac = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnulos = new javax.swing.JMenuItem();
        mnuventas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jdpContenedor.setPreferredSize(new java.awt.Dimension(400, 800));

        javax.swing.GroupLayout jdpContenedorLayout = new javax.swing.GroupLayout(jdpContenedor);
        jdpContenedor.setLayout(jdpContenedorLayout);
        jdpContenedorLayout.setHorizontalGroup(
            jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jdpContenedorLayout.setVerticalGroup(
            jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );

        jMenu1.setText("Mantenimineto");

        mnuclientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnuclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/cliente.jpg"))); // NOI18N
        mnuclientes.setText("Clientes");
        mnuclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclientesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuclientes);

        mnuempleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/empleado.jpg"))); // NOI18N
        mnuempleados.setText("Empleados");
        mnuempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuempleadosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuempleados);

        mnucomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/compañia.jpg"))); // NOI18N
        mnucomp.setText("Compañías de envios");
        mnucomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucompActionPerformed(evt);
            }
        });
        jMenu1.add(mnucomp);

        mnuproveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/proveedor.png"))); // NOI18N
        mnuproveedores.setText("Proveedores");
        mnuproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuproveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnuproveedores);

        mnucate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/categoria.png"))); // NOI18N
        mnucate.setText("Categorías");
        mnucate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucateActionPerformed(evt);
            }
        });
        jMenu1.add(mnucate);

        mnuprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/producto.jpg"))); // NOI18N
        mnuprod.setText("Productos");
        mnuprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuprodActionPerformed(evt);
            }
        });
        jMenu1.add(mnuprod);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Facturacion");

        mnufac.setText("Factura");
        mnufac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufacActionPerformed(evt);
            }
        });
        jMenu2.add(mnufac);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");

        mnulos.setText("Los 10 mejores clientes");
        mnulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulosActionPerformed(evt);
            }
        });
        jMenu3.add(mnulos);

        mnuventas.setText("Ventas por categoría");
        mnuventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuventasActionPerformed(evt);
            }
        });
        jMenu3.add(mnuventas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Acerca De");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclientesActionPerformed
        FrmClientes frmclientes = new FrmClientes();
        frmclientes.setVisible(true);
        jdpContenedor.add(frmclientes);
    }//GEN-LAST:event_mnuclientesActionPerformed

    private void mnuempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuempleadosActionPerformed
        FrmEmpleados frmempleados = new FrmEmpleados();
        frmempleados.setVisible(true);
        jdpContenedor.add(frmempleados);
    }//GEN-LAST:event_mnuempleadosActionPerformed

    private void mnucompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucompActionPerformed
        FrmCompañíadeEnviós frmcomp = new FrmCompañíadeEnviós();
        frmcomp.setVisible(true);
        jdpContenedor.add(frmcomp);
    }//GEN-LAST:event_mnucompActionPerformed

    private void mnuprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuprodActionPerformed
        FrmProductos frmprod = new FrmProductos();
        frmprod.setVisible(true);
        jdpContenedor.add(frmprod);        
    }//GEN-LAST:event_mnuprodActionPerformed

    private void mnuproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuproveedoresActionPerformed
        FrmProveedores frmpro = new FrmProveedores();
        frmpro.setVisible(true);
        jdpContenedor.add(frmpro);
    }//GEN-LAST:event_mnuproveedoresActionPerformed

    private void mnucateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucateActionPerformed
        FrmCategorías frmcate = new FrmCategorías();
        frmcate.setVisible(true);
        jdpContenedor.add(frmcate);
    }//GEN-LAST:event_mnucateActionPerformed

    private void mnufacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufacActionPerformed
        FrmFactura frmfac = new FrmFactura();
        frmfac.setVisible(true);
        jdpContenedor.add(frmfac);
    }//GEN-LAST:event_mnufacActionPerformed

    private void mnulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulosActionPerformed
        Frm10MejoresClientes frmfac = new Frm10MejoresClientes();
        frmfac.setVisible(true);
        jdpContenedor.add(frmfac);
    }//GEN-LAST:event_mnulosActionPerformed

    private void mnuventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuventasActionPerformed
        FrmVentas frmfac = new FrmVentas();
        frmfac.setVisible(true);
        jdpContenedor.add(frmfac);
    }//GEN-LAST:event_mnuventasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdpContenedor;
    private javax.swing.JMenuItem mnucate;
    private javax.swing.JMenuItem mnuclientes;
    private javax.swing.JMenuItem mnucomp;
    private javax.swing.JMenuItem mnuempleados;
    private javax.swing.JMenuItem mnufac;
    private javax.swing.JMenuItem mnulos;
    private javax.swing.JMenuItem mnuprod;
    private javax.swing.JMenuItem mnuproveedores;
    private javax.swing.JMenuItem mnuventas;
    // End of variables declaration//GEN-END:variables
}
