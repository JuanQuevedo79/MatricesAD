/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.sun.webkit.Timer;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jquevedo3
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", j, j);

            }

        }
    }

    public static void porDefectoTabla(JTable table1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) table1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }

    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static int cantidadPares(JTable tabla1) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    cont++;
                }

            }

        }
        return cont;
    }

    public static void pares(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraC(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }

            }

        }
    }
    public static void diagonalPricipal(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
         for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux=(int) tabla1.getValueAt(i, j);
                        if(i==j ){
                            tabla2.setValueAt(aux, i, j);
                        }
                        
                    }
                    
             }
    }
    public static void letraH(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
         for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux=(int) tabla1.getValueAt(i, j);
                        if(j==0 || j==nc-1 || i==(nf-1)/2 ){
                            tabla2.setValueAt(aux, i, j);
                        }
                        
                    }
                    
                }
    }
    public static int [][] pasoDeDatos(JTable tabla1){
        int nf ,nc ;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        
        int m[][] =new int[nf][nc];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
               
                m[i][j]=(int)tabla1.getValueAt(i, j);
                
            }
            
        }
        return m;
    }
}
