/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.Familia;
import Entidades.Persona;
import Entidades.Presupuesto;
import Negocios.Metodos;
import java.util.ArrayList;

/**
 *
 * @author Veronica Quesada
 */
public class ModificarPresupuesto extends javax.swing.JFrame {

    Metodos procesos = new Metodos();
    ArrayList<Presupuesto> usuarios;

    /**
     * Creates new form ModificarPresupuesto
     */
    public ModificarPresupuesto(java.awt.Frame parent, boolean modal) {
        initComponents();
        cargarid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbIdPersona = new javax.swing.JComboBox<>();
        cmbAnno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbSemana = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnSalirInicio = new javax.swing.JButton();
        txtClasificacion = new javax.swing.JLabel();
        cmbClasificacion = new javax.swing.JComboBox<>();
        lbEstado = new javax.swing.JLabel();
        btnClasifFamiliar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Semana:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Tipo:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Monto:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Descripción:");

        cmbIdPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdPersonaActionPerformed(evt);
            }
        });

        cmbAnno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción:", "2018", "2019", "2020", "2021" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Presupuesto");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/financiar.png"))); // NOI18N

        cmbSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la opción...", "Semana 1", "Semana 2", "Semana 3", "Semana 4" }));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("ID persona:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingreso ", "Egreso" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Mes:");

        btnSalirInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalirInicio.setText("Salir");
        btnSalirInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInicioActionPerformed(evt);
            }
        });

        txtClasificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtClasificacion.setText("Clasificación:");

        cmbClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Compras supermercados", "Viviendas básica", "Alquiler", "Gastos de higiene ", "Seguridad en vivienda", "Ingreso fijo", "Seguro medico", "Estudio", "Diversión", "Posgrado", "Bienes de lujo", "Viajes", "Mercados", "Otro" }));
        cmbClasificacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClasificacionItemStateChanged(evt);
            }
        });

        btnClasifFamiliar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnClasifFamiliar.setText("Clasif. Familiar");
        btnClasifFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasifFamiliarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Modificar");
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
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClasifFamiliar)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(66, 66, 66)
                        .addComponent(btnSalirInicio)
                        .addGap(99, 99, 99))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtClasificacion))
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbIdPersona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbAnno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSemana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMonto)
                        .addComponent(txtDescripcion)
                        .addComponent(cmbClasificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 402, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirInicio)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClasifFamiliar)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cmbIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(cmbAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cmbSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClasificacion))
                    .addGap(113, 113, 113)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIdPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdPersonaActionPerformed

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if (evt.getItem().toString().equals("Egreso")) {

            cmbClasificacion.setVisible(true);
            txtClasificacion.setVisible(true);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void btnSalirInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInicioActionPerformed
        volverInicio();
    }//GEN-LAST:event_btnSalirInicioActionPerformed

    private void cmbClasificacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClasificacionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasificacionItemStateChanged

    private void btnClasifFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasifFamiliarActionPerformed
        // TODO add your handling code here:

        clasifIngreso();


    }//GEN-LAST:event_btnClasifFamiliarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modificarPresupuesto();
          dispose();
            volverInicio(); 
    }//GEN-LAST:event_jButton1ActionPerformed
    public void cargarid() {
        try {
            ArrayList<Persona> usuarios = procesos.mostrarCedulas();
            for (Persona temp : usuarios) {
                cmbIdPersona.addItem(String.valueOf(temp.getId()));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(ModificarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarFamilia dialog = new RegistrarFamilia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    public void modificarPresupuesto() {
        int idPersona = Integer.parseInt((String) cmbIdPersona.getSelectedItem());
        String annos = (String) cmbAnno.getSelectedItem();
        int anno = Integer.parseInt(annos);
        String mes = ((String) cmbMes.getSelectedItem());
        String semana = ((String) cmbSemana.getSelectedItem());
        String tipo = ((String) cmbTipo.getSelectedItem());
        String descripcion = txtDescripcion.getText();
        int monto = Integer.parseInt((String) txtMonto.getText());
        String clasificacion = (String) cmbClasificacion.getSelectedItem();
        
        Persona p = new Persona(idPersona);

        Presupuesto presupuestos = new Presupuesto(p, anno, mes, semana, tipo, clasificacion, monto, descripcion);
        procesos.modificarPresupuesto(presupuestos);
    }
  

    public void clasifIngreso() {
        int ingresoFamiliar = 0;
        String ClasifIngreso = "";
        ArrayList<Integer> ListaAlta = new ArrayList<Integer>();
        ArrayList<Integer> ListaMediaAlta = new ArrayList<Integer>();
        ArrayList<Integer> ListaMediaBaja = new ArrayList<Integer>();
        ArrayList<Integer> ListaBajaSuperior = new ArrayList<Integer>();
        ArrayList<Integer> ListaBaja = new ArrayList<Integer>();

        int idPersona = Integer.parseInt((String) cmbIdPersona.getSelectedItem());
         int id = idPersona;
         Persona p = new Persona(id);
           
        Presupuesto usu = new Presupuesto(p);
        //usuarios = procesos.extraerIngreso(usu);
        int cantidad = 0;
        int cantidadpor = 0;
        int porcentajeAlta = 0;
        int porcentajeMAlta = 0;
        int porcentajeMBaja = 0;
        int porcentajeBSuperior = 0;
        int porcentajeBaja = 0;
        int cont = 0;
        int contA = 0;
        int contMA = 0;
        int contMB = 0;
        int contBS = 0;
        int contB = 0;

        int monto = 0;
        cantidad = procesos.mostrarReporte().size();
        cantidadpor = procesos.mostrarReporte().size();
        while (cantidad > 0) {
            ArrayList<Presupuesto> usuarios = procesos.extraerIngresoFamilia();
            
           
           ArrayList<Familia> fam = procesos.mostrarReporte();
            for (Familia temps : fam) {
            for (Presupuesto temp : usuarios) {
                if(temps.getApellido().equals(temp.getTipo())){
                    
                 if (monto == 0)  { 
                     monto = temp.getMonto();
                if (monto >= 2000000) {
                    contA++;
                    porcentajeAlta = ((contA * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 2000000 && monto > 800000) {
                    contMA++;
                    porcentajeMAlta = ((contMA * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 800000 && monto > 500000) {
                    contMB++;
                    porcentajeMBaja = ((contMB * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 500000 && monto > 300000) {
                    contBS++;
                    porcentajeBSuperior = ((contBS * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 300000) {
                    contB++;
                    porcentajeBaja = ((contB * 100) / cantidadpor);

                    cantidad--;
                }
                 }
                 else{
                    
                    monto += temp.getMonto();
                    
                                                    
                if (monto >= 2000000) {
                    
                    porcentajeAlta = ((contA * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 2000000 && monto > 800000) {
                    
                    porcentajeMAlta = ((contMA * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 800000 && monto > 500000) {
                    
                    porcentajeMBaja = ((contMB * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 500000 && monto > 300000) {
                    
                    porcentajeBSuperior = ((contBS * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 300000) {
                   
                    porcentajeBaja = ((contB * 100) / cantidadpor);

                    cantidad--;
                }
                 
                }
                        }if (monto >= 2000000) {
                    contA++;
                    porcentajeAlta = ((contA * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 2000000 && monto > 800000) {
                    contMA++;
                    porcentajeMAlta = ((contMA * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 800000 && monto > 500000) {
                    contMB++;
                    porcentajeMBaja = ((contMB * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 500000 && monto > 300000) {
                    contBS++;
                    porcentajeBSuperior = ((contBS * 100) / cantidadpor);

                    cantidad--;
                }
                if (monto < 300000) {
                    contB++;
                    porcentajeBaja = ((contB * 100) / cantidadpor);

                    cantidad--;
                }
            }
            }
    
        System.out.println("El porcentaje " + porcentajeAlta + "% corresponde a la clasificación clase alta");
        System.out.println("El porcentaje " + porcentajeMAlta + "% corresponde a la clasificación clase media alta");
        System.out.println("El porcentaje " + porcentajeMBaja + "% corresponde a la clasificación clase media baja");
        System.out.println("El porcentaje " + porcentajeBSuperior + "% corresponde a la clasificación clase baja superior");
        System.out.println("El porcentaje " + porcentajeBaja + "% corresponde a la clasificación clase baja");
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClasifFamiliar;
    private javax.swing.JButton btnSalirInicio;
    private javax.swing.JComboBox<String> cmbAnno;
    private javax.swing.JComboBox<String> cmbClasificacion;
    private javax.swing.JComboBox<String> cmbIdPersona;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbSemana;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel txtClasificacion;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

    
       public void volverInicio(){
         Inicio ventana = new Inicio(this,true);
        ventana.pack();
        setVisible(false);
        ventana.setVisible(true);
    }
 
}

