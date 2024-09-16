package com.mycompany.procesosapp;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        btnRoundRobin = new javax.swing.JButton();
        btnSJF = new javax.swing.JButton();
        btnFIFO = new javax.swing.JButton();
        btnPrioridad = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelTitulo.setText("Selecciona un Algoritmo de Planificación");

        btnRoundRobin.setBackground(new java.awt.Color(204, 204, 204));
        btnRoundRobin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRoundRobin.setForeground(new java.awt.Color(255, 0, 0));
        btnRoundRobin.setText("Round Robin");
        btnRoundRobin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoundRobinActionPerformed(evt);
            }
        });

        btnSJF.setBackground(new java.awt.Color(204, 204, 204));
        btnSJF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSJF.setForeground(new java.awt.Color(255, 0, 0));
        btnSJF.setText("SJF");
        btnSJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSJFActionPerformed(evt);
            }
        });

        btnFIFO.setBackground(new java.awt.Color(204, 204, 204));
        btnFIFO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFIFO.setForeground(new java.awt.Color(255, 0, 0));
        btnFIFO.setText("FIFO");
        btnFIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIFOActionPerformed(evt);
            }
        });

        btnPrioridad.setBackground(new java.awt.Color(204, 204, 204));
        btnPrioridad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPrioridad.setForeground(new java.awt.Color(255, 0, 0));
        btnPrioridad.setText("Prioridad");
        btnPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrioridadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnRoundRobin)
                        .addGap(52, 52, 52)
                        .addComponent(btnSJF)
                        .addGap(74, 74, 74)
                        .addComponent(btnFIFO)
                        .addGap(78, 78, 78)
                        .addComponent(btnPrioridad)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitulo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoundRobin)
                    .addComponent(btnSJF)
                    .addComponent(btnFIFO)
                    .addComponent(btnPrioridad))
                .addGap(65, 65, 65)
                .addComponent(jLabelResultado)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnRoundRobinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoundRobinActionPerformed
        new RoundRobinFrame().setVisible(true);
        jLabelResultado.setText("Algoritmo Round Robin ejecutado correctamente");
    }//GEN-LAST:event_btnRoundRobinActionPerformed

    private void btnSJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSJFActionPerformed
        new SJFInterface().setVisible(true);
        jLabelResultado.setText("Algoritmo SJF ejecutado correctamente");
    }//GEN-LAST:event_btnSJFActionPerformed

    private void btnFIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIFOActionPerformed
        new fcfsInterface().setVisible(true);
        jLabelResultado.setText("Algoritmo FCFS ejecutado correctamente");
    }//GEN-LAST:event_btnFIFOActionPerformed

    private void btnPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrioridadActionPerformed
        new prioridadUno().setVisible(true);
        jLabelResultado.setText("Algoritmo de Prioridad ejecutado correctamente");
    }//GEN-LAST:event_btnPrioridadActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFIFO;
    private javax.swing.JButton btnPrioridad;
    private javax.swing.JButton btnRoundRobin;
    private javax.swing.JButton btnSJF;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
