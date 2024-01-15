/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banegas_Bryan_Prueba_1;

import static Banegas_Bryan_Prueba_1.partida_nueva.dateTime;
import static Banegas_Bryan_Prueba_1.partida_nueva.ganador;
import static Banegas_Bryan_Prueba_1.partida_nueva.heroesganado;
import static Banegas_Bryan_Prueba_1.partida_nueva.jugadorHeroe;
import static Banegas_Bryan_Prueba_1.partida_nueva.jugadorVillanos;
import static Banegas_Bryan_Prueba_1.partida_nueva.mensaje;
import static Banegas_Bryan_Prueba_1.partida_nueva.mensajes;
import static Banegas_Bryan_Prueba_1.partida_nueva.perdedor;
import static Banegas_Bryan_Prueba_1.partida_nueva.turno;
import static Banegas_Bryan_Prueba_1.partida_nueva.villanosganado;
import java.util.ArrayList;

/**
 *
 * @author adalb
 */

public class rendirse extends javax.swing.JFrame {

    ArrayList<Usuario> users=crear_cuenta.listaUsuarios;
    String nombre=partida_nueva.ganador;
    int puntos;
    private partida_nueva jframe;
    public rendirse(partida_nueva jframe,ArrayList<Usuario> ListaUsuarios, String nombre, int puntos) {
        initComponents();
        this.jframe=jframe;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        si = new javax.swing.JButton();
        no = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Desea rendirse?");

        si.setText("Si");
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siMouseClicked(evt);
            }
        });

        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(no))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si)
                    .addComponent(no))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseClicked
        // TODO add your handling code here:
        if(turno==2){
            villanosganado++;
            ganador=jugadorVillanos;
            perdedor=jugadorHeroe;
            mensaje=ganador+" usando Villanos ha ganado ya que "+perdedor+" se ha retirado del juego"+"-"+dateTime;
            mensajes.add(mensaje);
        }else{
            heroesganado++;
            ganador=jugadorHeroe;
            perdedor=jugadorVillanos;
            mensaje=ganador+" usando Heroes ha ganado ya que "+perdedor+" se ha retirado del juego"+"-"+dateTime;
            mensajes.add(mensaje);
        }
        jframe.dispose();
        pantalla_de_ganador pasar=new pantalla_de_ganador(users,nombre,0);
        pasar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_siMouseClicked

    private void noActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(rendirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rendirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rendirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rendirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JButton no;
    public static javax.swing.JButton si;
    // End of variables declaration//GEN-END:variables
}