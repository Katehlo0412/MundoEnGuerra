/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Ejercito extends javax.swing.JFrame {

    /**
     * Creates new form Ejercito
     */
    public Ejercito() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LEjercito = new javax.swing.JLabel();
        TNombreEjerc = new javax.swing.JTextField();
        LSaldo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RBNombrarEjerc = new javax.swing.JRadioButton();
        RBAnadInfan = new javax.swing.JRadioButton();
        RBAnadirCab = new javax.swing.JRadioButton();
        RBAnadirGene = new javax.swing.JRadioButton();
        RBAnadirElef = new javax.swing.JRadioButton();
        RBAnadirTig = new javax.swing.JRadioButton();
        RBEliminarCmp = new javax.swing.JRadioButton();
        BConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Confirmar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        LEjercito.setText("Ejercito");

        TNombreEjerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreEjercActionPerformed(evt);
            }
        });

        LSaldo.setText("Saldo:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "ID", "Ataque", "Defensa", "Salud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(RBNombrarEjerc);
        RBNombrarEjerc.setText("Nombrar ejercito");
        RBNombrarEjerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNombrarEjercActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAnadInfan);
        RBAnadInfan.setText("Añadir infantería");
        RBAnadInfan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAnadInfanActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAnadirCab);
        RBAnadirCab.setText("Añadir caballero");
        RBAnadirCab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAnadirCabActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAnadirGene);
        RBAnadirGene.setText("Añadir general");
        RBAnadirGene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAnadirGeneActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAnadirElef);
        RBAnadirElef.setText("Añadir elefante");
        RBAnadirElef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAnadirElefActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAnadirTig);
        RBAnadirTig.setText("Añadir tigre");
        RBAnadirTig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAnadirTigActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBEliminarCmp);
        RBEliminarCmp.setText("Eliminar campo");
        RBEliminarCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBEliminarCmpActionPerformed(evt);
            }
        });

        BConfirmar.setText("Confirmar");
        BConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setText("Total:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(BConfirmar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RBNombrarEjerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBAnadInfan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBAnadirCab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBAnadirGene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBAnadirElef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBAnadirTig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBEliminarCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LEjercito, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TNombreEjerc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LEjercito)
                        .addComponent(TNombreEjerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LSaldo))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBNombrarEjerc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBAnadInfan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBAnadirCab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBAnadirGene)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBAnadirElef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBAnadirTig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBEliminarCmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BConfirmar)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded

    }//GEN-LAST:event_formComponentAdded

    private void RBNombrarEjercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNombrarEjercActionPerformed
        String textoIngresado = JOptionPane.showInputDialog(this, "Ingrese el nombre del ejercicio:", "Nombre del Ejercicio", JOptionPane.PLAIN_MESSAGE);

        if (textoIngresado != null && !textoIngresado.isEmpty()) {
            TNombreEjerc.setText(textoIngresado);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de ejercicio", "Error", JOptionPane.ERROR_MESSAGE);
        }

        Confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Selección de ejército confirmada");
            }
        });


    }//GEN-LAST:event_RBNombrarEjercActionPerformed

    private void TNombreEjercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreEjercActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNombreEjercActionPerformed

    private void RBAnadInfanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAnadInfanActionPerformed
        String inputValue = JOptionPane.showInputDialog(this, "Añadir el número de infantes para la batalla:", "Número de Infantes", JOptionPane.PLAIN_MESSAGE);

        // Verificar si se ingresó un valor y si ese valor es mayor o igual a 2
        if (inputValue != null && !inputValue.isEmpty()) {
            try {
                int numInfantes = Integer.parseInt(inputValue);
                if (numInfantes >= 2) {
                    
                } else {
                    // Mostrar un mensaje indicando que se debe agregar al menos 2 infantes
                    JOptionPane.showMessageDialog(this, "Se debe agregar mínimo 2 infantes", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                // Mostrar un mensaje de error si el valor ingresado no es un número válido
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar un mensaje indicando que se debe agregar un valor
            JOptionPane.showMessageDialog(this, "Debe agregar un número de infantes", "Error", JOptionPane.ERROR_MESSAGE);
        }

        Confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Selección de ejército confirmada");
            }
        });
    }//GEN-LAST:event_RBAnadInfanActionPerformed

    private void RBAnadirCabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAnadirCabActionPerformed
        // Verificar si el usuario ingresó un texto
        if (RBAnadirCab == null) {
            String caballeria = null;
            JOptionPane.showMessageDialog(this, "Debe añadir caballeria", caballeria, JOptionPane.PLAIN_MESSAGE);

        } else {
            // Mostrar un mensaje indicando que se debe ingresar un nombre de ejercicio
            JOptionPane.showMessageDialog(this, "Debe ingresar caballeria", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RBAnadirCabActionPerformed

    private void RBAnadirGeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAnadirGeneActionPerformed
        if (RBAnadirGene == null) {
            String general = null;
            JOptionPane.showMessageDialog(this, "Debe añadir un general", general, JOptionPane.ERROR_MESSAGE);

        } else {
            // Mostrar un mensaje indicando que se debe ingresar un nombre de ejercicio
            JOptionPane.showMessageDialog(this, "Debe ingresar caballeria", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RBAnadirGeneActionPerformed

    private void RBAnadirElefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAnadirElefActionPerformed

    }//GEN-LAST:event_RBAnadirElefActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        Batalla batalla = new Batalla();
        batalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void RBAnadirTigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAnadirTigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBAnadirTigActionPerformed

    private void RBEliminarCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBEliminarCmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBEliminarCmpActionPerformed

    private void BConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirmarActionPerformed
        Confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nombreEjercito = TNombreEjerc.getText();
                if (nombreEjercito.isEmpty()) {

                    return;
                }
                JOptionPane.showMessageDialog(null, "Selección de ejército confirmada: " + nombreEjercito);
            }
        });
        
        class ImagenFondo2 extends JPanel {

        //Atributos
        private Image imagen2;

        //Metodos
        @Override
        public void paint(Graphics g) {
            imagen2 = new ImageIcon(getClass().getResource("Imagenes/Lprincipal.jpeg")).getImage();
            g.drawImage(imagen2, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }
    }//GEN-LAST:event_BConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConfirmar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel LEjercito;
    private javax.swing.JLabel LSaldo;
    private javax.swing.JRadioButton RBAnadInfan;
    private javax.swing.JRadioButton RBAnadirCab;
    private javax.swing.JRadioButton RBAnadirElef;
    private javax.swing.JRadioButton RBAnadirGene;
    private javax.swing.JRadioButton RBAnadirTig;
    private javax.swing.JRadioButton RBEliminarCmp;
    private javax.swing.JRadioButton RBNombrarEjerc;
    private javax.swing.JTextField TNombreEjerc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
