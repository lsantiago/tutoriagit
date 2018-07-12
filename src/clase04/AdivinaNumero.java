/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

/**
 *
 * @author Administrador
 */
public class AdivinaNumero extends javax.swing.JFrame {

    /**
     * Creates new form AdivinaNumero
     */
    public AdivinaNumero() {
        initComponents();
        lblMensaje.setText("<html>Piensa en un número entre <strong>1 y 5</strong></html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdivinar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdivinar.setText("Adivinar");
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdivinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 84, -1));
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 84, -1));
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase04/genioEditado.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 370, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
        // TODO add your handling code here:
        String sNumero;
        int nroUsuario;
        int nroMaquina;
        String mensaje;
        
        final int LI = 1;
        final int LS = 5;
        
        nroMaquina = (int)(LI + Math.random() * (LS - LI + 1));
        
        sNumero = txtNumero.getText();
        nroUsuario = Integer.parseInt(sNumero);
        
        mensaje = nroMaquina == nroUsuario ? "Genial adivinaste. " : 
                "Error, es otro número";
        
        lblMensaje.setText(mensaje);
    }//GEN-LAST:event_btnAdivinarActionPerformed

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
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdivinaNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}