/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banegas_Bryan_Prueba_1;

import static Banegas_Bryan_Prueba_1.escoger_bando.cantidadHeroes;
import static Banegas_Bryan_Prueba_1.escoger_bando.cantidadVillanos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class Mi_Perfil extends javax.swing.JFrame {

    ArrayList<Usuario> users = crear_cuenta.listaUsuarios;
    ArrayList<Usuario> usuariologs1 = partida_nueva.usuariologs1;
    ArrayList<Usuario> usuariologs2 = partida_nueva.usuariologs2;
    ArrayList<Usuario> mensajes = partida_nueva.mensajes;
    
    String G_Usuario;
    String G_Contraseña;
    String contraseña;
    int cantidadVillanosInt=0;
    int cantidadHeroesInt=0;

    public Mi_Perfil(ArrayList<Usuario> ListaUsuarios, String nombre, int puntos) {
        

        this.G_Usuario = login.usuarioLogin;
        this.G_Contraseña=contraseña;
        
        for (int i = 0; i < ListaUsuarios.size(); i++) {

            if (users.get(i).getnombre().equals(G_Usuario)) {
                puntos = users.get(i).getPuntos();
                contraseña = users.get(i).getcontra();
                break;
            }
        }
        for (int i = 0; i < ListaUsuarios.size(); i++) {

            if (users.get(i).getnombre().equals(G_Usuario)) {
                puntos = users.get(i).getPuntos();
                contraseña = users.get(i).getcontra();
                cantidadVillanosInt = users.get(i).getVillanos();
                cantidadHeroesInt = users.get(i).getHeroes();
                break;
            }
        }


        String cantidadVillanos = Integer.toString(cantidadVillanosInt);
        String cantidadHeroes = Integer.toString(cantidadHeroesInt);
        
        int contar = 1;
        String logs = "";
        
        for (int i = mensajes.size() - 1; i >= 0; i--) {
            if (G_Usuario.equals(usuariologs1.get(i))) {
                System.out.println(mensajes.get(i));
                
                logs+= +contar + ". " + mensajes.get(i) + "\n";
                
                contar++;

            } else if (G_Usuario.equals(usuariologs2.get(i))) {
                System.out.println(mensajes.get(i));
                
                logs+= +contar + ". " + mensajes.get(i) + "\n";

            }
        }
        
            initComponents();
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            UsernameText.setText(G_Usuario);
            PuntosText.setText(" " + puntos);
            jLabel5.setText("Hereoes han sido usados: "+cantidadHeroes+" veces");
            jLabel4.setText("Villanos han sido usados: "+cantidadVillanos+" veces");
            LogTextbox.setText(logs);
            
        } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameText = new javax.swing.JLabel();
        PuntosText = new javax.swing.JLabel();
        ContrasenaBoton = new javax.swing.JButton();
        EliminarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LogTextbox = new javax.swing.JTextArea();
        RetirarBoton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameText.setText("aaa");
        getContentPane().add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 170, 30));

        PuntosText.setText("jLabel1");
        getContentPane().add(PuntosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 110, -1));

        ContrasenaBoton.setBorder(null);
        ContrasenaBoton.setContentAreaFilled(false);
        ContrasenaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaBotonActionPerformed(evt);
            }
        });
        getContentPane().add(ContrasenaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 150, 60));

        EliminarBoton.setBorder(null);
        EliminarBoton.setContentAreaFilled(false);
        EliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 150, 60));

        LogTextbox.setBackground(new java.awt.Color(255, 255, 255));
        LogTextbox.setColumns(20);
        LogTextbox.setForeground(new java.awt.Color(0, 0, 0));
        LogTextbox.setRows(5);
        jScrollPane1.setViewportView(LogTextbox);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 170, 160));

        RetirarBoton.setText("Retirar");
        RetirarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(RetirarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 10, 120, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Los Heroes han sido usados:");
        jLabel5.setText("Los Heroes han sido usados: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Los Villanos han sido usados:");
        jLabel4.setText("Los Villanos han sido usados: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_MiPerfil.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContrasenaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaBotonActionPerformed
        int respuesta1 = JOptionPane.showConfirmDialog(null, "¿Desea cambiar su contraseña?", "CAMBIAR CONTRASEÑA?", JOptionPane.YES_NO_OPTION);

        if (respuesta1 == JOptionPane.YES_OPTION) {
            // bye bye cuenta

            String contraseñaActual = JOptionPane.showInputDialog(null, "Escribe su contraseña actual:");

            for (int i = 0; i < users.size(); i++) {

                if (users.get(i).getnombre().equals(G_Usuario)) {

                        if (users.get(i).getcontra().equals(contraseñaActual)) {

                            String contraseñaNueva = JOptionPane.showInputDialog(null, "Escribe la nueva contraseña:");

                            if (contraseñaNueva.equals(contraseñaActual) || contraseñaNueva.length() != 5) {
                            
                            while (contraseñaNueva.length() != 5) {

                                contraseñaNueva = JOptionPane.showInputDialog(null, "Contraseña invalida, la contraseña tiene que ser de 5 caracteres.");
                                JOptionPane.getRootFrame().dispose();
                            }
                            
                            while (contraseñaNueva.equals(contraseñaActual)) {

                                contraseñaNueva = JOptionPane.showInputDialog(null, "Contraseña invalida, la contraseña no puede ser la misma.");
                                JOptionPane.getRootFrame().dispose();
                            }
                            
                            }

                            this.users.get(i).setcontra(contraseñaNueva);
                            
                            System.out.println("Se cambio la contraseña de " + contraseñaActual + " a " + contraseñaNueva);
                            
                        } else {

                            System.out.println("Contraseña equivocada.");
                        }
                }
            }

        }else {
            System.out.println("Operación cancelada.");
        }
    }//GEN-LAST:event_ContrasenaBotonActionPerformed

    private void EliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBotonActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar tu cuenta de manera PERMANENTE?", "ELIMINAR CUENTA?", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            // bye bye cuenta
            for (int i = 0; i < users.size(); i++) {

                if (this.users.get(i).getnombre().equals(this.G_Usuario)) {
                    System.out.print(users.get(i));
                    this.users.remove(i);
                    System.out.print(users);
                }
            }
            JOptionPane.showMessageDialog(null, "Cuenta eliminada permanentemente.");
            System.out.println("Cuenta eliminada permanentemente.");
            crear_cuenta.cantidadeusuarios--;
            panel_control pasar = new panel_control();
            pasar.setVisible(true);
            this.dispose();

        } else {
            // no se elimino
            System.out.println("Operación cancelada.");
        }
        configuracion.clasico=0;
    }//GEN-LAST:event_EliminarBotonActionPerformed

    private void RetirarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarBotonActionPerformed
        // TODO add your handling code here:
        Menu pasar=new Menu(users,G_Usuario);
        pasar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetirarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(Mi_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mi_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mi_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mi_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mi_Perfil(null,null,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ContrasenaBoton;
    private javax.swing.JButton EliminarBoton;
    private javax.swing.JTextArea LogTextbox;
    private javax.swing.JLabel PuntosText;
    private javax.swing.JButton RetirarBoton;
    public static javax.swing.JLabel UsernameText;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
