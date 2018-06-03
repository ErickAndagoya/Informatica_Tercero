/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neptuno;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQÚIPO
 */
public class FrmProveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmProveedores
     */
    public FrmProveedores() {
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

        btnnuevo = new javax.swing.JButton();
        txtciudad = new javax.swing.JTextField();
        btnimprimir = new javax.swing.JButton();
        txtregion = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        txtcod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtpais = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfax = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtbusquedaproveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtbusquedacomp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblproveedores = new javax.swing.JTable();
        txtidproveedor = new javax.swing.JTextField();
        txtnomcom = new javax.swing.JTextField();
        txtnomcontacto = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        txtdirrecion = new javax.swing.JTextField();
        btneditar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtpagina = new javax.swing.JTextField();

        setClosable(true);

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/nuevo.png"))); // NOI18N
        btnnuevo.setPreferredSize(new java.awt.Dimension(16, 16));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        txtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadActionPerformed(evt);
            }
        });

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/imprimir.jpg"))); // NOI18N
        btnimprimir.setPreferredSize(new java.awt.Dimension(16, 16));
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/save.png"))); // NOI18N
        btnguardar.setEnabled(false);
        btnguardar.setPreferredSize(new java.awt.Dimension(16, 16));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mantenimiento");

        txtpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaisActionPerformed(evt);
            }
        });

        jLabel2.setText("idProveedor");

        txttelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelfActionPerformed(evt);
            }
        });

        jLabel3.setText("NombreCompañía");

        jLabel4.setText("NombreContacto");

        jLabel5.setText("CargoContacto");

        txtfax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfaxActionPerformed(evt);
            }
        });

        jLabel13.setText("Busqueda");

        jLabel6.setText("Dirección");

        jLabel14.setText("idProveedor");

        jLabel7.setText("Ciudad");

        jLabel15.setText("NombreCompañía");

        txtbusquedaproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedaproveedorKeyReleased(evt);
            }
        });

        jLabel8.setText("Región");

        txtbusquedacomp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedacompKeyReleased(evt);
            }
        });

        jLabel9.setText("CódPostal");

        jLabel10.setText("País");

        jLabel11.setText("Teléfono");

        jLabel12.setText("Fax");

        tblproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblproveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblproveedores);

        txtidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedorActionPerformed(evt);
            }
        });
        txtidproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidproveedorKeyReleased(evt);
            }
        });

        txtnomcom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomcomKeyReleased(evt);
            }
        });

        txtnomcontacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomcontactoKeyReleased(evt);
            }
        });

        txtcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcargoActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/delete.png"))); // NOI18N
        btneliminar.setEnabled(false);
        btneliminar.setPreferredSize(new java.awt.Dimension(16, 16));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtdirrecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdirrecionActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/editar.png"))); // NOI18N
        btneditar.setEnabled(false);
        btneditar.setPreferredSize(new java.awt.Dimension(16, 16));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        jLabel16.setText("paginaprincipal");

        txtpagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtciudad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtregion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpais, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(txtidproveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnomcom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnomcontacto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdirrecion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfax, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpagina, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(27, 27, 27)
                        .addComponent(txtbusquedaproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtbusquedacomp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel2)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel16)
                                                                .addComponent(txtpagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel15))
                                                    .addComponent(txtnomcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addComponent(txtnomcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(txtdirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))
                                            .addComponent(txtregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23))
                                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addComponent(txtpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addComponent(txttelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel3)
                    .addComponent(txtbusquedaproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusquedacomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void txtpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaisActionPerformed

    private void txttelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelfActionPerformed

    private void txtfaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfaxActionPerformed

    private void txtidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedorActionPerformed

    private void txtcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoActionPerformed

    private void txtdirrecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdirrecionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdirrecionActionPerformed

    private void txtpaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaginaActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txtidproveedor.setText("");
        txtnomcom.setText("");
        txtnomcontacto.setText("");
        txtcargo.setText("");
        txtdirrecion.setText("");
        txtciudad.setText("");
        txtregion.setText("");
        txtcod.setText("");
        txtpais.setText("");
        txttelf.setText("");
        txtfax.setText("");
        txtpagina.setText("");
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Proveedor proveedores = new Proveedor("root" , "eran" , "neptuno2017_3" , "localhost");
        proveedores.conectarProveedor();
        JOptionPane.showMessageDialog(null , proveedores.guardarProveedor(txtidproveedor.getText() , txtnomcom.getText() , txtnomcontacto.getText() , txtcargo.getText() , txtdirrecion.getText() , txtciudad.getText() , txtregion.getText() , txtcod.getText() , txtpais.getText() , txttelf.getText() , txtfax.getText() , txtpagina.getText()));
        proveedores.cerrarProveedor();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Proveedor proveedores = new Proveedor("root" , "eran" , "neptuno2017_3" , "localhost");
        proveedores.conectarProveedor();       
        JOptionPane.showMessageDialog(null , proveedores.eliminarProveedor(txtidproveedor.getText()));
        proveedores.cerrarProveedor();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Proveedor proveedores = new Proveedor("root" , "eran" , "neptuno2017_3" , "localhost");
        proveedores.conectarProveedor();
        JOptionPane.showMessageDialog(null , proveedores.actualizarProveedor(txtidproveedor.getText() , txtnomcom.getText() , txtnomcontacto.getText() , txtcargo.getText() , txtdirrecion.getText() , txtciudad.getText() , txtregion.getText() , txtcod.getText() , txtpais.getText() , txttelf.getText() , txtfax.getText() , txtpagina.getText()));
        proveedores.cerrarProveedor();
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbusquedaproveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaproveedorKeyReleased
        try 
        {
            Proveedor proveedores = new Proveedor("root" , "eran" , "neptuno2017_3" , "localhost");
            proveedores.conectarProveedor();
            ResultSet rsProveedor = proveedores.buscarPorId(txtbusquedaproveedor.getText());
            //Para establecer el modelo al JTable
            
            DefaultTableModel modelo = new DefaultTableModel();
            tblproveedores.setModel(modelo);
            
            //Para conectarnos a nuestra base de datos
            
            ResultSetMetaData rsMd = rsProveedor.getMetaData();
            
            //La cantidad de columnas que tiene la consulta
            
            int cantidadColumnas = rsMd.getColumnCount();
            
            //Establecer como cabezeras el nombre de las colimnas
            
            for (int posicion = 1 ; posicion <= cantidadColumnas ; posicion ++)
            {
                modelo.addColumn(rsMd.getColumnLabel(posicion));
            }
            //Creando las filas para el JTable
            
            while (rsProveedor.next())
            {
                Object[] fila = new Object[cantidadColumnas];
                for (int posicion = 0; posicion < cantidadColumnas; posicion ++)
                {
                    fila[posicion] = rsProveedor.getObject(posicion + 1);
                }
                modelo.addRow(fila);
                
            }  
            proveedores.cerrarProveedor();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmProveedores.class.getName()).log(Level.SEVERE , null , ex);
        }
    }//GEN-LAST:event_txtbusquedaproveedorKeyReleased

    private void txtbusquedacompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedacompKeyReleased
        try 
        {
            Proveedor proveedores = new Proveedor("root" , "eran" , "neptuno2017_3" , "localhost");
            proveedores.conectarProveedor();
            ResultSet rsProveedor = proveedores.buscarPorNombreCompañía(txtbusquedacomp.getText());
            //Para establecer el modelo al JTable
            
            DefaultTableModel modelo = new DefaultTableModel();
            tblproveedores.setModel(modelo);
            
            //Para conectarnos a nuestra base de datos
            
            ResultSetMetaData rsMd = rsProveedor.getMetaData();
            
            //La cantidad de columnas que tiene la consulta
            
            int cantidadColumnas = rsMd.getColumnCount();
            
            //Establecer como cabezeras el nombre de las colimnas
            
            for (int posicion = 1 ; posicion <= cantidadColumnas ; posicion ++)
            {
                modelo.addColumn(rsMd.getColumnLabel(posicion));
            }
            //Creando las filas para el JTable
            
            while (rsProveedor.next())
            {
                Object[] fila = new Object[cantidadColumnas];
                for (int posicion = 0; posicion < cantidadColumnas; posicion ++)
                {
                    fila[posicion] = rsProveedor.getObject(posicion + 1);
                }
                modelo.addRow(fila);
                
            }  
            proveedores.cerrarProveedor();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmProveedores.class.getName()).log(Level.SEVERE , null , ex);
        }
    }//GEN-LAST:event_txtbusquedacompKeyReleased

    private void tblproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblproveedoresMouseClicked
        txtidproveedor.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 0)));
        txtnomcom.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 1)));
        txtnomcontacto.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 2)));
        txtcargo.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 3)));
        txtdirrecion.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 4)));
        txtciudad.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 5)));
        txtregion.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 6)));
        txtcod.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 7)));
        txtpais.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 8)));
        txttelf.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 9)));
        txtfax.setText(String.valueOf(tblproveedores.getValueAt(tblproveedores.getSelectedRow() , 10)));
        
        if (!txtidproveedor.getText().equals("") && !txtnomcom.getText().equals(""))
        {
            btneliminar.setEnabled(true);
            btnguardar.setEnabled(true);
            btneditar.setEnabled(true);
            
        }
        else
        {
            btneliminar.setEnabled(false);
            
        }
    }//GEN-LAST:event_tblproveedoresMouseClicked

    private void txtidproveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidproveedorKeyReleased
        if (!txtidproveedor.getText().equals("") && !txtnomcom.getText().equals(""))
        {
            
            btnguardar.setEnabled(true);
            btneditar.setEnabled(true);
        }
        else
        {
            
            btnguardar.setEnabled(false);
            btneditar.setEnabled(false);
            btneliminar.setEnabled(false);
        }
    }//GEN-LAST:event_txtidproveedorKeyReleased

    private void txtnomcomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomcomKeyReleased
        if (!txtnomcom.getText().equals("") && !txtidproveedor.getText().equals(""))
        {
            
            btnguardar.setEnabled(true);
            btneditar.setEnabled(true);
        }
        else
        {
            
            btnguardar.setEnabled(false);
            btneditar.setEnabled(false);
            btneliminar.setEnabled(false);
        }
    }//GEN-LAST:event_txtnomcomKeyReleased

    private void txtnomcontactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomcontactoKeyReleased
        while(!txtnomcontacto.getText().matches("([a-z]|[A-Z]|\\s)+") && txtnomcontacto.getText().length()>0)
        {
                txtnomcontacto.setText(txtnomcontacto.getText().substring(0 ,txtnomcontacto.getText().length()-1));
                JOptionPane.showMessageDialog(null, "Carater no válido", "Validación", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_txtnomcontactoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblproveedores;
    private javax.swing.JTextField txtbusquedacomp;
    private javax.swing.JTextField txtbusquedaproveedor;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdirrecion;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtnomcom;
    private javax.swing.JTextField txtnomcontacto;
    private javax.swing.JTextField txtpagina;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtregion;
    private javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}
