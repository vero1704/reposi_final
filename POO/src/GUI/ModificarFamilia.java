/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.Familia;
import Negocios.Metodos;
import java.util.ArrayList;

/**
 *
 * @author Ignacio Brenes
 */
public class ModificarFamilia extends javax.swing.JFrame {

    Metodos procesos = new Metodos();

    public ModificarFamilia(java.awt.Frame parent, boolean modal) {
        initComponents();
        cargarFamilias();               //Call the method for the ejecution
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbProvincia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbCantón = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbDistrito = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bntGuardarFamilia = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        cmbFamilia = new javax.swing.JComboBox<>();
        lbEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Provincia:");

        cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "San Jose", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limon" }));
        cmbProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProvinciaItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Cantón:");

        cmbCantón.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCantónItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Distrito: ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/family (1).png"))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Familia");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Apellido Familiar:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Dirección:");

        bntGuardarFamilia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bntGuardarFamilia.setText("Guardar");
        bntGuardarFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarFamiliaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(cmbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbCantón, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtDireccion)
                                                .addComponent(cmbDistrito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(88, 88, 88)
                                            .addComponent(jLabel1))
                                        .addComponent(jLabel2))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(bntGuardarFamilia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSalir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(cmbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1)
                            .addGap(35, 35, 35)
                            .addComponent(jLabel2))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbCantón, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntGuardarFamilia)
                        .addComponent(btnSalir))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarFamilias() {          
        try {
            ArrayList<Familia> usuarios = procesos.mostrarReporte();
            for (Familia temp : usuarios) {
                cmbFamilia.addItem(temp.getApellido());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cmbProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProvinciaItemStateChanged
        if (cmbProvincia.getSelectedItem() == "San Jose") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Acosta");
            this.cmbCantón.addItem("Aserrí");
            this.cmbCantón.addItem("Alajuelita");
            this.cmbCantón.addItem("Curridabat");
            this.cmbCantón.addItem("Desamparados");
            this.cmbCantón.addItem("Dota");
            this.cmbCantón.addItem("Escazú");
            this.cmbCantón.addItem("Goicochea");
            this.cmbCantón.addItem("León Cortes");
            this.cmbCantón.addItem("Montes de Oca");
            this.cmbCantón.addItem("Mora");
            this.cmbCantón.addItem("Moravia");
            this.cmbCantón.addItem("Pérez Zeledón");
            this.cmbCantón.addItem("Puriscal");
            this.cmbCantón.addItem("San José");
            this.cmbCantón.addItem("Santa Ana");
            this.cmbCantón.addItem("Tarrazú");
            this.cmbCantón.addItem("Tibás");
            this.cmbCantón.addItem("Turrubares");
            this.cmbCantón.addItem("Vázquez de Coronado");
        } else if (cmbProvincia.getSelectedItem() == "Alajuela") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Alajuela");
            this.cmbCantón.addItem("Atenas");
            this.cmbCantón.addItem("Grecia");
            this.cmbCantón.addItem("Guatuso");
            this.cmbCantón.addItem("Orotina");
            this.cmbCantón.addItem("Palmares");
            this.cmbCantón.addItem("Poás");
            this.cmbCantón.addItem("Rio Cuarto");
            this.cmbCantón.addItem("San Carlos");
            this.cmbCantón.addItem("San Mateo");
            this.cmbCantón.addItem("San Ramon");
            this.cmbCantón.addItem("Upala");
            this.cmbCantón.addItem("Valverde Vega");
            this.cmbCantón.addItem("Zarcero");
        } else if (cmbProvincia.getSelectedItem() == "Cartago") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Alvarado");
            this.cmbCantón.addItem("Cartago");
            this.cmbCantón.addItem("El Guarco");
            this.cmbCantón.addItem("Jiménez");
            this.cmbCantón.addItem("La Unión");
            this.cmbCantón.addItem("Oreamuno");
            this.cmbCantón.addItem("Paraíso");
            this.cmbCantón.addItem("Turrialba");
        } else if (cmbProvincia.getSelectedItem() == "Heredia") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Barva");
            this.cmbCantón.addItem("Belén");
            this.cmbCantón.addItem("Flores");
            this.cmbCantón.addItem("San Isidro");
            this.cmbCantón.addItem("San Pablo");
            this.cmbCantón.addItem("San Rafael");
            this.cmbCantón.addItem("Santa Bárbara");
            this.cmbCantón.addItem("Santo Domingo");
            this.cmbCantón.addItem("Sarapiquí");
        } else if (cmbProvincia.getSelectedItem() == "Guanacaste") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Abangares");
            this.cmbCantón.addItem("Bagaces");
            this.cmbCantón.addItem("Cañas");
            this.cmbCantón.addItem("Hojancha");
            this.cmbCantón.addItem("La Cruz");
            this.cmbCantón.addItem("Nandayure");
            this.cmbCantón.addItem("Nicoya");
            this.cmbCantón.addItem("Santa Cruz");
            this.cmbCantón.addItem("Tilarán");
        } else if (cmbProvincia.getSelectedItem() == "Puntarenas") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Aguirre");
            this.cmbCantón.addItem("Buenos Aires");
            this.cmbCantón.addItem("Corredores");
            this.cmbCantón.addItem("Coto Brus");
            this.cmbCantón.addItem("Esparza");
            this.cmbCantón.addItem("Garabito");
            this.cmbCantón.addItem("Golfito");
            this.cmbCantón.addItem("Montes de Oro");
            this.cmbCantón.addItem("Osa");
            this.cmbCantón.addItem("Parrita");
            this.cmbCantón.addItem("Puntarenas");
        } else if (cmbProvincia.getSelectedItem() == "Limon") {
            this.cmbCantón.removeAllItems();
            this.cmbCantón.addItem("Guácimo");
            this.cmbCantón.addItem("Guapiles");
            this.cmbCantón.addItem("Limón");
            this.cmbCantón.addItem("Matina");
            this.cmbCantón.addItem("Pococí");
            this.cmbCantón.addItem("Talamanca");
        }
    }//GEN-LAST:event_cmbProvinciaItemStateChanged

    private void cmbCantónItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCantónItemStateChanged
        if (cmbCantón.getSelectedItem() == "Acosta") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Ignacio");
            this.cmbDistrito.addItem("Sabanilla");
            this.cmbDistrito.addItem("Cangrejal");
        } else if (cmbCantón.getSelectedItem() == "Aserrí") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Tarbaca");
            this.cmbDistrito.addItem("Salitrillos");
            this.cmbDistrito.addItem("Monterrey");
        } else if (cmbCantón.getSelectedItem() == "Alajuelita") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Alajuelita");
            this.cmbDistrito.addItem("San Josecito");
            this.cmbDistrito.addItem("San Antonio");
        } else if (cmbCantón.getSelectedItem() == "Curridabat") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Granadilla");
            this.cmbDistrito.addItem("Tirrases");
            this.cmbDistrito.addItem("Curridabat");
        } else if (cmbCantón.getSelectedItem() == "Desamparadados") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Patarra");
            this.cmbDistrito.addItem("San Rafael Arriba");
            this.cmbDistrito.addItem("Desamparados");
        } else if (cmbCantón.getSelectedItem() == "Dota") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San María");
            this.cmbDistrito.addItem("Jardín");
            this.cmbDistrito.addItem("Copey");
        } else if (cmbCantón.getSelectedItem() == "Escazú") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Antonio");
            this.cmbDistrito.addItem("San Rafael");
            this.cmbDistrito.addItem("San Miguel");
        } else if (cmbCantón.getSelectedItem() == "Goicochea") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Guadalupe");
            this.cmbDistrito.addItem("Purral");
            this.cmbDistrito.addItem("San Francisco");
        } else if (cmbCantón.getSelectedItem() == "León Cortes") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Llano bonito");
            this.cmbDistrito.addItem("San Antonio");
            this.cmbDistrito.addItem("Santa Cruz");
        } else if (cmbCantón.getSelectedItem() == "Montes de Oca") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Pedro");
            this.cmbDistrito.addItem("Sabanilla");
            this.cmbDistrito.addItem("Mercedes");
        } else if (cmbCantón.getSelectedItem() == "Mora") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Cuidad Colón");
            this.cmbDistrito.addItem("Tabarsia");
            this.cmbDistrito.addItem("Guayabo");
        } else if (cmbCantón.getSelectedItem() == "Moravia") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Jerónimo");
            this.cmbDistrito.addItem("La Tinidad");
            this.cmbDistrito.addItem("San Vicente");
        } else if (cmbCantón.getSelectedItem() == "Pérez Zeledón") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Isidro del General");
            this.cmbDistrito.addItem("Pejibaye");
            this.cmbDistrito.addItem("Parámo");
        } else if (cmbCantón.getSelectedItem() == "Purisal") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Candelaria");
            this.cmbDistrito.addItem("San Thiago");
            this.cmbDistrito.addItem("Chirres");
        } else if (cmbCantón.getSelectedItem() == "San Jóse") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Zapote");
            this.cmbDistrito.addItem("La Uruca");
            this.cmbDistrito.addItem("Pavas");
        } else if (cmbCantón.getSelectedItem() == "Santa Ana") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Santa Ana");
            this.cmbDistrito.addItem("Piedades");
            this.cmbDistrito.addItem("Pozos");
        } else if (cmbCantón.getSelectedItem() == "Tarrazú") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Marcos");
            this.cmbDistrito.addItem("San Lorenzo");
            this.cmbDistrito.addItem("San Carlos");
        } else if (cmbCantón.getSelectedItem() == "Tibás") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("León XIII");
            this.cmbDistrito.addItem("Llorente");
            this.cmbDistrito.addItem("San Juan Tibas");
        } else if (cmbCantón.getSelectedItem() == "Turrubares") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Luis");
            this.cmbDistrito.addItem("San Pedro");
            this.cmbDistrito.addItem("San Pablo");
        } else if (cmbCantón.getSelectedItem() == "Vásquez de Coronado") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Isidro");
            this.cmbDistrito.addItem("San Rafael");
            this.cmbDistrito.addItem("Dulce Nombre");
        } else if (cmbCantón.getSelectedItem() == "Alajuela") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Carrizal");
            this.cmbDistrito.addItem("Rio Segundo");
            this.cmbDistrito.addItem("La Guacima");
        } else if (cmbCantón.getSelectedItem() == "Atenas") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Eulalia");
            this.cmbDistrito.addItem("Mercedes");
            this.cmbDistrito.addItem("Atenas");
        } else if (cmbCantón.getSelectedItem() == "Grecia") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Tacares");
            this.cmbDistrito.addItem("Bolivar");
            this.cmbDistrito.addItem("San Roque");
        } else if (cmbCantón.getSelectedItem() == "Guatuso") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Rafael");
            this.cmbDistrito.addItem("Cote");
            this.cmbDistrito.addItem("Katira");
        } else if (cmbCantón.getSelectedItem() == "Orotina") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Mastate");
            this.cmbDistrito.addItem("La Ceiba");
            this.cmbDistrito.addItem("Orotina");
        } else if (cmbCantón.getSelectedItem() == "Palmares") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Zaragoza");
            this.cmbDistrito.addItem("Buenos Aires");
            this.cmbDistrito.addItem("Candelaria");
        } else if (cmbCantón.getSelectedItem() == "Poás") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Sabana Redonda");
            this.cmbDistrito.addItem("San Pedro");
            this.cmbDistrito.addItem("San Rafael");
        } else if (cmbCantón.getSelectedItem() == "Rio Cuarto") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Santa Rita");
            this.cmbDistrito.addItem("Rio Cuarto");
        } else if (cmbCantón.getSelectedItem() == "San Carlos") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Quesada");
            this.cmbDistrito.addItem("La Fortuna");
            this.cmbDistrito.addItem("Pital");
        } else if (cmbDistrito.getSelectedItem() == "San Mateo") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Mateo");
            this.cmbDistrito.addItem("Labrador");
            this.cmbDistrito.addItem("Desmonte");
        } else if (cmbCantón.getSelectedItem() == "San Ramón ") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Volio");
            this.cmbDistrito.addItem("Concepción");
            this.cmbDistrito.addItem("San Rafael");
        } else if (cmbCantón.getSelectedItem() == "Upala") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Bijagua");
            this.cmbDistrito.addItem("Canalete");
            this.cmbDistrito.addItem("Pizote");
        } else if (cmbCantón.getSelectedItem() == "Valverde Vega") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Sarchi Norte");
            this.cmbDistrito.addItem("Sarchi Sur");
            this.cmbDistrito.addItem("Toro Amarrillo");
        } else if (cmbCantón.getSelectedItem() == "Zarcero") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Laguna");
            this.cmbDistrito.addItem("Tapezco");
            this.cmbDistrito.addItem("Las Brisas");
        } else if (cmbCantón.getSelectedItem() == "Alvarado") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Patallas");
            this.cmbDistrito.addItem("Cervantes");
        } else if (cmbCantón.getSelectedItem() == "Cartago") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Corralillo");
            this.cmbDistrito.addItem("Tierra Blanca");
            this.cmbDistrito.addItem("Llano Grande");
        } else if (cmbCantón.getSelectedItem() == "El Guarco") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("El Tejar");
            this.cmbDistrito.addItem("San Isidro");
        } else if (cmbCantón.getSelectedItem() == "Jimenéz") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Turrurique");
            this.cmbDistrito.addItem("Pejibaye");
            this.cmbDistrito.addItem("Juan Viñas");
        } else if (cmbCantón.getSelectedItem() == "La Unión") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Tres Ríos");
            this.cmbDistrito.addItem("San Diego");
            this.cmbDistrito.addItem("San Rafael");
        } else if (cmbCantón.getSelectedItem() == "Oreamuno") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Cipreses");
            this.cmbDistrito.addItem("San Rafael");
        } else if (cmbCantón.getSelectedItem() == "Paraíso") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Cachí");
            this.cmbDistrito.addItem("Orosi");
            this.cmbDistrito.addItem("Paraíso");
        } else if (cmbCantón.getSelectedItem() == "Turrialba") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Pavones");
            this.cmbDistrito.addItem("Chirripo");
            this.cmbDistrito.addItem("Tuis");
        } else if (cmbCantón.getSelectedItem() == "Barva") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Barva");
            this.cmbDistrito.addItem("San Pablo");
            this.cmbDistrito.addItem("Santa Lucía");
        } else if (cmbCantón.getSelectedItem() == "Belén") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("La Rivera");
            this.cmbDistrito.addItem("La Asunción");
        } else if (cmbCantón.getSelectedItem() == "San Isidro") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Isidro");
            this.cmbDistrito.addItem("San Francisco");
            this.cmbDistrito.addItem("Concepcion");
        } else if (cmbCantón.getSelectedItem() == "San Pablo") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Pablo");
            this.cmbDistrito.addItem("Rincón de Sabanilla");
        } else if (cmbCantón.getSelectedItem() == "San Rafael") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("San Rafael");
            this.cmbDistrito.addItem("San Josecito");
            this.cmbDistrito.addItem("Angeles");
        } else if (cmbCantón.getSelectedItem() == "Santa Bárbara") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Santo Domingo");
            this.cmbDistrito.addItem("San Pedro");
            this.cmbDistrito.addItem("Santa Barbará");
        } else if (cmbCantón.getSelectedItem() == "Santo Domingio") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Santo Thomás");
            this.cmbDistrito.addItem("San Miguel");
            this.cmbDistrito.addItem("Santa Rosa");
        } else if (cmbCantón.getSelectedItem() == "Sarapiquí") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Puerto Viejo");
            this.cmbDistrito.addItem("La Virgen");
            this.cmbDistrito.addItem("Orqueta");
        } else if (cmbCantón.getSelectedItem() == "Abangares") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Las Juntas");
            this.cmbDistrito.addItem("San Juan");
        } else if (cmbCantón.getSelectedItem() == "Bagaces") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("La Fortuna");
            this.cmbDistrito.addItem("Bagaces");
        } else if (cmbCantón.getSelectedItem() == "Cañas") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Cañas");
            this.cmbDistrito.addItem("Bebedero");
            this.cmbDistrito.addItem("Palmira");
        } else if (cmbCantón.getSelectedItem() == "Hojancha") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Hojancha");
            this.cmbDistrito.addItem("Matanbu");
            this.cmbDistrito.addItem("Puerto Carrillo");
        } else if (cmbCantón.getSelectedItem() == "La Cruz") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("La Cruz");
            this.cmbDistrito.addItem("La Garrita");
            this.cmbDistrito.addItem("Santa Cecilia");
        } else if (cmbCantón.getSelectedItem() == "Nandayure") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Santa Rita");
            this.cmbDistrito.addItem("San Pablo");
            this.cmbDistrito.addItem("Porvenir");
        } else if (cmbCantón.getSelectedItem() == "Nicoya") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Samará");
            this.cmbDistrito.addItem("Nosara");
            this.cmbDistrito.addItem("Quebrada Honda");
        } else if (cmbCantón.getSelectedItem() == "Santa Cruz") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Tamarindo");
            this.cmbDistrito.addItem("Cabo Velas");
            this.cmbDistrito.addItem("Cuajiniquil");
        } else if (cmbCantón.getSelectedItem() == "Tilarán") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Tronadora");
            this.cmbDistrito.addItem("Libano");
            this.cmbDistrito.addItem("Arenal");
        } else if (cmbCantón.getSelectedItem() == "Buenos Aires") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Buenos Aires");
            this.cmbDistrito.addItem("Borruca");
            this.cmbDistrito.addItem("Volcán");
        } else if (cmbCantón.getSelectedItem() == "Corredores") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Corredor");
            this.cmbDistrito.addItem("Paso Canoas");
            this.cmbDistrito.addItem("La Cuesta");
        } else if (cmbCantón.getSelectedItem() == "Coto Brus") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("AguaBuena");
            this.cmbDistrito.addItem("Sabalito");
            this.cmbDistrito.addItem("San Vito");
        } else if (cmbCantón.getSelectedItem() == "Esparza") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Espiruto Santo");
            this.cmbDistrito.addItem("San Rafael");
            this.cmbDistrito.addItem("Caldera");
        } else if (cmbCantón.getSelectedItem() == "Garabito") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Jacó");
            this.cmbDistrito.addItem("Tarcoles");
        } else if (cmbCantón.getSelectedItem() == "Golfito") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Puerto Jimenez");
            this.cmbDistrito.addItem("Golfito");
        } else if (cmbCantón.getSelectedItem() == "Montes de Oro") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Miramar");
            this.cmbDistrito.addItem("La Unión");
        } else if (cmbCantón.getSelectedItem() == "Osa") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Palmar");
            this.cmbDistrito.addItem("Bahia Ballena");
            this.cmbDistrito.addItem("Cuidad Cortez");
        } else if (cmbCantón.getSelectedItem() == "Parrita") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Parrita");
        } else if (cmbCantón.getSelectedItem() == "Puntarenas") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Chomes");
            this.cmbDistrito.addItem("Paquera");
            this.cmbDistrito.addItem("Levanto");
        } else if (cmbCantón.getSelectedItem() == "Guácimo") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Guácimo");
            this.cmbDistrito.addItem("Pocorra");
            this.cmbDistrito.addItem("Río Jimenez");
        } else if (cmbCantón.getSelectedItem() == "Guápiles") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Guápiles");
        } else if (cmbCantón.getSelectedItem() == "Pococí") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Roxana");
            this.cmbDistrito.addItem("La Rita");
            this.cmbDistrito.addItem("Cariarí");
        } else if (cmbCantón.getSelectedItem() == "Limón") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Valle de la Estrella");
            this.cmbDistrito.addItem("Limón");
            this.cmbDistrito.addItem("Río Blanco");
        } else if (cmbCantón.getSelectedItem() == "Matína") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Matína");
            this.cmbDistrito.addItem("Batán");
            this.cmbDistrito.addItem("Carrandi");
        } else if (cmbCantón.getSelectedItem() == "Talamanca") {
            this.cmbDistrito.removeAllItems();
            this.cmbDistrito.addItem("Cahuita");
            this.cmbDistrito.addItem("Sixaola");
            this.cmbDistrito.addItem("Bratsi");
        }
    }//GEN-LAST:event_cmbCantónItemStateChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Inicio ventana = new Inicio(this, true);
        ventana.pack();
        setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void bntGuardarFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarFamiliaActionPerformed
        lbEstado.setText("");
        try {
            modificarFamilia();
            dispose();
        } catch (RuntimeException ex) {
            lbEstado.setText("Llene los datos correctamente");
        } catch (Exception ex) {
            lbEstado.setText("Intente nuevamente");
        }
    }//GEN-LAST:event_bntGuardarFamiliaActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarFamilia dialog = new ModificarFamilia(new javax.swing.JFrame(), true);
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

    public void modificarFamilia() {
        String Apellido = (String) cmbFamilia.getSelectedItem();

        Familia familias = new Familia(Apellido);
        procesos.modificarFamilia(familias);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardarFamilia;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCantón;
    private javax.swing.JComboBox<String> cmbDistrito;
    private javax.swing.JComboBox<String> cmbFamilia;
    private javax.swing.JComboBox<String> cmbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JTextField txtDireccion;
    // End of variables declaration//GEN-END:variables
}