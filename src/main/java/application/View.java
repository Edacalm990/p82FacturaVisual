/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import controllers.FacturaJpaController;
import entities.Factura;
import java.time.Instant;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
public class View extends javax.swing.JFrame {

    private FacturaJpaController controladorFactura = new FacturaJpaController(Persistence.createEntityManagerFactory("p82"));
    private List<Factura> listaFacturas;

    public View() {
        listaFacturas = new ArrayList<>();
        initComponents();
        // cargo las facturas, si no hay se activará un botón para crear 20 facturas
        // si hay facturas se mostrará en el panel
        // si falla la bbdd saldrá un mensaje de error
        cargarFacturas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        crear = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFacturasPanel = new javax.swing.JList<>();
        cargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        crearFacturasPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        crear.setBackground(new java.awt.Color(0, 102, 153));
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setText("+");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(102, 0, 102));
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(153, 0, 0));
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("-");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        listaFacturasPanel.setBackground(new java.awt.Color(255, 255, 255));
        listaFacturasPanel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        listaFacturasPanel.setForeground(new java.awt.Color(102, 102, 102));
        listaFacturasPanel.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaFacturasPanel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaFacturasPanel.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(listaFacturasPanel);

        cargar.setText("cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURAS");

        crearFacturasPrueba.setBackground(new java.awt.Color(0, 0, 153));
        crearFacturasPrueba.setForeground(new java.awt.Color(255, 255, 255));
        crearFacturasPrueba.setText("crear facturas para pruebas");
        crearFacturasPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturasPruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(crear)
                        .addGap(18, 18, 18)
                        .addComponent(editar)
                        .addGap(18, 18, 18)
                        .addComponent(borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearFacturasPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear)
                    .addComponent(editar)
                    .addComponent(borrar)
                    .addComponent(cargar)
                    .addComponent(crearFacturasPrueba))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        CrearFactura panelCrear = new CrearFactura();
        panelCrear.setVisible(true);
        panelCrear.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_crearActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if (listaFacturasPanel.getAnchorSelectionIndex() != -1) {
            // creo el panel modificar pasandole la factura
            ModificarFactura panelModificar = new ModificarFactura(listaFacturas.get(listaFacturasPanel.getAnchorSelectionIndex()));
            panelModificar.setVisible(true);
            panelModificar.setLocationRelativeTo(null);
            // cierro el panel actual
            dispose();
        }
    }//GEN-LAST:event_editarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // si hay una factura seleccionada 
        if (listaFacturasPanel.getAnchorSelectionIndex() != -1) {
            // obtengo el codigo único
            int indice = listaFacturas.get(listaFacturasPanel.getAnchorSelectionIndex()).getCodigoUnico();
            // se crea el panel de confirmacion con la posición y el texto
            Confirmacion confirmacion = new Confirmacion(
                    indice,
                    "Esta seguro que quiere borrar la factura '%s' ".formatted(indice));
            confirmacion.setVisible(true);
            confirmacion.setLocationRelativeTo(null);
            // se cierra el panel actual
            dispose();
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        cargarFacturas();
    }//GEN-LAST:event_cargarActionPerformed

    private void crearFacturasPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturasPruebaActionPerformed
        // sirve para crear 20 facturas en caso de que la base de datos no ocntenga ninguna factura 
        
        for (int i = 0; i < 20; i++) {
            Factura tmp = new Factura();
            tmp.setFechaEmision(Date.from(Instant.now()));
            tmp.setDescripcion(RandomStringUtils.randomAlphabetic(5));
            tmp.setTotalImporte(Double.parseDouble(RandomStringUtils.randomNumeric(4)));
            try {
                controladorFactura.create(tmp);
            } catch (Exception e) {
                Error error = new Error("Error al crear las facturas de prueba");
                error.setVisible(true);
                error.setLocationRelativeTo(null);
            }

        }
        crearFacturasPrueba.setVisible(false);
        cargarFacturas();
    }//GEN-LAST:event_crearFacturasPruebaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
//    }
    private void cargarFacturas() {
        try {
            // si falla la conexión a la base de datos creará un panel de error
            this.listaFacturas = controladorFactura.findFacturaEntities();
        } catch (Exception e) {
            Error error = new Error("Base de datos no disponible, el programa no se ejecutará");
            error.setVisible(true);
            error.setLocationRelativeTo(null);
        }
        // si la bbdd está bien pero no hay facturas
        String[] listaFacturaString = new String[listaFacturas.size() != 0 ? listaFacturas.size() : 1];
        
        if (listaFacturas.size() == 0) {
            listaFacturaString[0] = "No existen facturas";
        } else {
            crearFacturasPrueba.setVisible(false);
            for (int i = 0; i < listaFacturas.size(); i++) {
                Factura get = listaFacturas.get(i);
                listaFacturaString[i] = get.toString();
            }
        }
        listaFacturasPanel.setListData(listaFacturaString);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cargar;
    private javax.swing.JButton crear;
    private javax.swing.JButton crearFacturasPrueba;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaFacturasPanel;
    // End of variables declaration//GEN-END:variables
}
