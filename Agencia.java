package Semana1;
public class Agencia extends javax.swing.JFrame {
    public Agencia() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        transferir = new javax.swing.JButton();
        intereses = new javax.swing.JButton();
        Lista = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setBackground(new java.awt.Color(0, 0, 255));
        agregar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Banco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        transferir.setBackground(new java.awt.Color(0, 0, 255));
        transferir.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        transferir.setForeground(new java.awt.Color(255, 255, 255));
        transferir.setText("Transferir");
        transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirActionPerformed(evt);
            }
        });
        getContentPane().add(transferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 200, 50));

        intereses.setBackground(new java.awt.Color(0, 0, 255));
        intereses.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        intereses.setForeground(new java.awt.Color(255, 255, 255));
        intereses.setText("Intereses");
        intereses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interesesActionPerformed(evt);
            }
        });
        getContentPane().add(intereses, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 200, 50));

        Lista.setBackground(new java.awt.Color(0, 0, 255));
        Lista.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Lista.setForeground(new java.awt.Color(255, 255, 255));
        Lista.setText("Lista");
        Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaActionPerformed(evt);
            }
        });
        getContentPane().add(Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 200, 50));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 140, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaActionPerformed
        Lista list = new Lista();
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ListaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
      Agregar agg = new Agregar();
        agg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
       Transferir trans = new Transferir();
        trans.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transferirActionPerformed

    private void interesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interesesActionPerformed
        Intereses inte = new Intereses();
        inte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_interesesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lista;
    private javax.swing.JButton agregar;
    private javax.swing.JButton intereses;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton transferir;
    // End of variables declaration//GEN-END:variables
}
