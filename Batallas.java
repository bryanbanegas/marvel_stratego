/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banegas_Bryan_Prueba_1;

import java.util.ArrayList;

/**
 *
 * @author adalb
 */
public class Batallas extends javax.swing.JFrame {

    //INSTANCIAR MENSAJES, USUARIOLOGIN (NOMBRE)
    
    ArrayList<Usuario> users;
    ArrayList<Usuario> mensajes;
    String Nombre_G;
    int CantidadHeroes;
    int CantidadVillanos;
    
    public Batallas(ArrayList<Usuario> mensajes, String nombre) 
    {
        ArrayList<Usuario> users = crear_cuenta.listaUsuarios;
        ArrayList<Usuario> usersTotal = crear_cuenta.listahistorica;
        ArrayList<Usuario> Mensajes = partida_nueva.mensajes;
        
        this.CantidadHeroes = partida_nueva.heroesganado;
        this.CantidadVillanos = partida_nueva.villanosganado;
        
       
        this.mensajes = (Mensajes != null) ? Mensajes : new ArrayList<>();
        this.Nombre_G = nombre;
        
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        int contar = 1;
        int batallas = 0;
        String usuariosHistoricos = "";
        String usuariosActivos = "";

        for (int i = 0; i < usersTotal.size(); i++) {
            Usuario usuario = usersTotal.get(i);
            usuariosHistoricos += (i + 1) + ". " + usuario.getnombre() + "\n";
        }

        for (int i = 0; i < users.size(); i++) {
            Usuario usuario = users.get(i);
            usuariosActivos += (i + 1) + ". " + usuario.getnombre() + "\n";
        }
        
        
        String mensajeHeroe = "Cantidad de partidas ganadas con heroes: " + CantidadHeroes + "\n";
        String mensajeVillano = "Cantidad de partidas ganadas con villanos: " + CantidadVillanos + "\n";
        batallas= CantidadHeroes+CantidadVillanos;
        String mensaje3 = "Cantidad de partidas jugadas: "+ batallas + "\n";

        System.out.println(batallas);
        
        UsuariosActivos.setText("USUARIOS ACTIVOS\n"+usuariosActivos);
        UsuariosHistoricos.setText("USUARIOS HISTORICOS\n"+usuariosHistoricos);
        CantidadPartidas.setText(mensajeHeroe + mensajeVillano + mensaje3);

    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CantidadPartidas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsuariosActivos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        UsuariosHistoricos = new javax.swing.JTextArea();
        RetirarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CantidadPartidas.setEditable(false);
        CantidadPartidas.setBackground(new java.awt.Color(255, 255, 255));
        CantidadPartidas.setColumns(20);
        CantidadPartidas.setRows(5);
        CantidadPartidas.setBorder(null);
        jScrollPane1.setViewportView(CantidadPartidas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 360, 90));

        UsuariosActivos.setEditable(false);
        UsuariosActivos.setBackground(new java.awt.Color(255, 255, 255));
        UsuariosActivos.setColumns(20);
        UsuariosActivos.setRows(5);
        UsuariosActivos.setBorder(null);
        jScrollPane2.setViewportView(UsuariosActivos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 90));

        UsuariosHistoricos.setEditable(false);
        UsuariosHistoricos.setBackground(new java.awt.Color(255, 255, 255));
        UsuariosHistoricos.setColumns(20);
        UsuariosHistoricos.setRows(5);
        UsuariosHistoricos.setBorder(null);
        jScrollPane3.setViewportView(UsuariosHistoricos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 360, 90));

        RetirarBoton.setBackground(new java.awt.Color(255, 255, 255));
        RetirarBoton.setForeground(new java.awt.Color(0, 0, 0));
        RetirarBoton.setText("Retirar");
        RetirarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(RetirarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 10, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundBatallas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetirarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarBotonActionPerformed
        Menu pasar = new Menu(users, Nombre_G);
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
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batallas(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CantidadPartidas;
    private javax.swing.JButton RetirarBoton;
    private javax.swing.JTextArea UsuariosActivos;
    private javax.swing.JTextArea UsuariosHistoricos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
