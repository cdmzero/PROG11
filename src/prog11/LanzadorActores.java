/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prog11;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static prog11.connection.connection;


/**
 *
 * @author zero
 */
public class LanzadorActores extends javax.swing.JFrame {

    /**
     * Creates new form LanzadorActores
     */
    public LanzadorActores() {
        initComponents();
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPremios = new javax.swing.JTextField();
        floatSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFnacimiento = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        enviar1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crud Actores");

        jLabel1.setText("Menu");

        txtNombre.setToolTipText("");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Fecha nacimiento");

        jLabel4.setText("Apellidos");

        txtApellidos.setToolTipText("");
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel5.setText("Premios");

        txtPremios.setToolTipText("");
        txtPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPremiosActionPerformed(evt);
            }
        });

        floatSalario.setToolTipText("");
        floatSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floatSalarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Salario");

        txtFnacimiento.setToolTipText("");
        txtFnacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnacimientoActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        tblActores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Fnacimiento", "Premios", "Salario", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActores);

        jLabel7.setText("Actores");

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        enviar1.setText("Guardar");
        enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Modificar)
                                .addGap(168, 168, 168)
                                .addComponent(limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enviar1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(floatSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPremios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(floatSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(Modificar)
                    .addComponent(enviar1)
                    .addComponent(borrar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPremiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPremiosActionPerformed

    private void floatSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floatSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floatSalarioActionPerformed

    private void txtFnacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnacimientoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        int fila = tblActores.getSelectedRow();

        String codigoActor = tblActores.getValueAt(fila, 5).toString();
  
        
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        String fechaNacimiento = txtFnacimiento.getText();
        String premio = txtPremios.getText();
        float salario = Float.parseFloat(floatSalario.getText());
        Random rand = new Random();
       

        try {

            Connection conn = connection();
            Statement stmt = conn.createStatement();

                        String query =  "UPDATE APEX_040000.ACTORES set nombre='"+nombre +"', apellido='"+apellido +"', f_nacimiento='"+fechaNacimiento +"', premios='"+premio +"'"
                                    + ", salario='"+salario +"' where codigo_actor='"+ codigoActor +"'";

             
                

            ResultSet rset = stmt.executeQuery(query);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        CargarTabla();
    
        
        
    }//GEN-LAST:event_ModificarActionPerformed
    private void limpiar() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtFnacimiento.setText("");
        txtPremios.setText("");
        floatSalario.setText("");
    }

    private void CargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblActores.getModel();
        modeloTabla.setRowCount(0);

        try {

            ResultSet rs;
            ResultSetMetaData rsmd;
            int columnas;
            Connection conn = connection();
            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT NOMBRE, APELLIDO, F_NACIMIENTO, PREMIOS, SALARIO, CODIGO_ACTOR FROM APEX_040000.ACTORES");

            rsmd = rs.getMetaData();

            columnas = rsmd.getColumnCount();

            while (rs.next()) {

                Object[] fila = new Object[columnas];

                for (int i = 0; i < columnas; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                modeloTabla.addRow(fila);

            }

            stmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        txtNombre.setText("");
        txtApellidos.setText("");
        txtFnacimiento.setText("");
        txtPremios.setText("");
        floatSalario.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       int fila = tblActores.getSelectedRow();

        String codigoActor = tblActores.getValueAt(fila, 5).toString();
  
     

        try {

            Connection conn = connection();
            Statement stmt = conn.createStatement();

                        String query =  "DELETE FROM APEX_040000.ACTORES where codigo_actor='"+ codigoActor +"'";

            ResultSet rset = stmt.executeQuery(query);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        CargarTabla();
        
    }//GEN-LAST:event_borrarActionPerformed

    private void enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar1ActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        String fechaNacimiento = txtFnacimiento.getText();
        String premio = txtPremios.getText();
        float salario = Float.parseFloat(floatSalario.getText());
        Random rand = new Random();
        int codigo_actor = rand.nextInt(50002);

        try {

            Connection conn = connection();
            Statement stmt = conn.createStatement();

            String query = "INSERT INTO APEX_040000.ACTORES (nombre, apellido, f_nacimiento, premios, salario, codigo_actor )"
                    + "VALUES ('" + nombre + "', '" + apellido + "', '" + fechaNacimiento + "', ' " + premio + "', '" + salario + "', '" + codigo_actor + "')";

            ResultSet rset = stmt.executeQuery(query);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        CargarTabla();
    }//GEN-LAST:event_enviar1ActionPerformed

    private void tblActoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActoresMouseClicked

        int fila = tblActores.getSelectedRow();

        String codigoActor = tblActores.getValueAt(fila, 5).toString();
        System.out.println("codigo actor"+codigoActor);
        try {

            // Traemos el socket de conexion y creamos la declaracion para hacer consultas
            Connection conn = connection();
            Statement stmt = conn.createStatement();

            // Resulset guarda el resultado de la consulta a la tabla de BD
            ResultSet rset = stmt.executeQuery("SELECT NOMBRE, APELLIDO, F_NACIMIENTO, PREMIOS, SALARIO FROM APEX_040000.ACTORES WHERE CODIGO_ACTOR="+ codigoActor+ "");

            while (rset.next()) {
                txtNombre.setText(rset.getString(1)); 
                txtApellidos.setText(rset.getString(2));
                txtFnacimiento.setText(rset.getString(3));
                txtPremios.setText(rset.getString(4));
                floatSalario.setText(rset.getString(5));

            }

            stmt.close();
            
            
        } catch (InputMismatchException err) {

        } catch (SQLException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LanzadorActores.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tblActoresMouseClicked

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
            java.util.logging.Logger.getLogger(LanzadorActores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanzadorActores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanzadorActores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanzadorActores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanzadorActores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton enviar1;
    private javax.swing.JTextField floatSalario;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tblActores;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtFnacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPremios;
    // End of variables declaration//GEN-END:variables
}
