/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jquevedo3
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear1, cmdLimpiar1};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOpciones};

        Helper.habilitarBotones(botonesH);
        Helper.habilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDeFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDeColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear1 = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdOpciones = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdLimpiar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("OPERACIONES MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 520, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Numero de Filas :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel2.add(txtNumeroDeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));

        jLabel3.setText("Numero de Columnas :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));
        jPanel2.add(txtNumeroDeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 500, 150));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 380, 230));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cant. Num Pares", "Numeros Pares", "Letra C", "Diagonal Principal", "Letra H", "Recorrido Uno", "Recorrido Dos" }));
        cmbOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 130, 30));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, 230));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear1.setText("Crear");
        cmdCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrear1ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        cmdOpciones.setText("Opciones");
        cmdOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOpcionesActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        cmdLlenadoAutomatico.setText("Automatico");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        cmdLimpiar1.setText("Limpiar");
        cmdLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiar1ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 450, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(929, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOpcionesActionPerformed
        int op, cantPares;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);

        switch (op) {
            case 0:
                cantPares = Helper.cantidadPares(tblTablaInicial);
                txtResultado.setText("El número de elementos pares es: " + cantPares);
                break;
            case 1:
                Helper.pares(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                Helper.letraC(tblTablaInicial, tblTablaResultado);
                break;
            case 3:
                Helper.diagonalPricipal(tblTablaInicial, tblTablaResultado);
                break;
            case 4:
                Helper.letraH(tblTablaInicial, tblTablaResultado);
                break;
            case 5:
                txtResultado.setText(Helper.recorridoUno(tblTablaInicial));
                break;
            case 6:
                txtResultado.setText(Helper.recorridoDos(tblTablaInicial));
                break;

        }
    }//GEN-LAST:event_cmdOpcionesActionPerformed

    private void cmdCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrear1ActionPerformed
        int nf, nc;
        DefaultTableModel tm, tm2;

        nf = Integer.parseInt(txtNumeroDeFilas.getText());
        nc = Integer.parseInt(txtNumeroDeColumnas.getText());

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(nf);
        tm.setColumnCount(nc);
        JButton botonesH[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdLimpiar1};
        JButton botones[] = {cmdCrear1};

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);


    }//GEN-LAST:event_cmdCrear1ActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiar1ActionPerformed

        txtNumeroDeFilas.setText("");
        txtNumeroDeColumnas.setText("");
        txtNumeroDeFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
        txtResultado.setText("");

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesH[] = {cmdCrear1, cmdLimpiar1};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOpciones};

        Helper.habilitarBotones(botonesH);
        Helper.habilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLimpiar1ActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed

        int nf, nc;
        int n;
        int sw, res;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;
                        } else {
                            sw = 0;
                        }

                    }
                } while (sw == 0);
            }

        }

    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void cmbOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear1;
    private javax.swing.JButton cmdLimpiar1;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroDeColumnas;
    private javax.swing.JTextField txtNumeroDeFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
