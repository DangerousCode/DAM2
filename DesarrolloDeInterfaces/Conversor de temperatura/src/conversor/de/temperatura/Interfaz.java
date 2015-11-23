/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor.de.temperatura;

/**
 *
 * @author AlumnoT
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        campoTexto = new javax.swing.JTextField();
        rbCelsius = new javax.swing.JRadioButton();
        rbFarenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        cbCelsius = new javax.swing.JCheckBox();
        cbFarenheit = new javax.swing.JCheckBox();
        cbKelvin = new javax.swing.JCheckBox();
        lCelsius = new javax.swing.JLabel();
        lFarenheit = new javax.swing.JLabel();
        lKelvin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTexto.setToolTipText("Introduzca la temperatura");

        buttonGroup1.add(rbCelsius);
        rbCelsius.setSelected(true);
        rbCelsius.setText("ºC");
        rbCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelsiusActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFarenheit);
        rbFarenheit.setText("ºF");
        rbFarenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFarenheitActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbKelvin);
        rbKelvin.setText("ºK");
        rbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKelvinActionPerformed(evt);
            }
        });

        buttonGroup2.add(cbCelsius);
        cbCelsius.setText("ºC");
        cbCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCelsiusActionPerformed(evt);
            }
        });

        buttonGroup2.add(cbFarenheit);
        cbFarenheit.setText("ºF");
        cbFarenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFarenheitActionPerformed(evt);
            }
        });

        buttonGroup2.add(cbKelvin);
        cbKelvin.setText("ºK");
        cbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelvinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbKelvin)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rbFarenheit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbCelsius, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCelsius)
                    .addComponent(cbFarenheit)
                    .addComponent(cbKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFarenheit)
                    .addComponent(lKelvin))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelsius)
                    .addComponent(cbCelsius)
                    .addComponent(lCelsius))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFarenheit)
                    .addComponent(cbFarenheit)
                    .addComponent(lFarenheit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbKelvin)
                    .addComponent(cbKelvin)
                    .addComponent(lKelvin))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFarenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFarenheitActionPerformed
        cbFarenheit.setSelected(rootPaneCheckingEnabled);
    }//GEN-LAST:event_rbFarenheitActionPerformed

    private void rbCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelsiusActionPerformed
        cbCelsius.setSelected(rootPaneCheckingEnabled);
    }//GEN-LAST:event_rbCelsiusActionPerformed

    private void rbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKelvinActionPerformed
        cbKelvin.setSelected(rootPaneCheckingEnabled);
    }//GEN-LAST:event_rbKelvinActionPerformed

    private void cbCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCelsiusActionPerformed
        lCelsius.setText(null);
    }//GEN-LAST:event_cbCelsiusActionPerformed

    private void cbFarenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFarenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFarenheitActionPerformed

    private void cbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKelvinActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JCheckBox cbCelsius;
    private javax.swing.JCheckBox cbFarenheit;
    private javax.swing.JCheckBox cbKelvin;
    private javax.swing.JLabel lCelsius;
    private javax.swing.JLabel lFarenheit;
    private javax.swing.JLabel lKelvin;
    private javax.swing.JRadioButton rbCelsius;
    private javax.swing.JRadioButton rbFarenheit;
    private javax.swing.JRadioButton rbKelvin;
    // End of variables declaration//GEN-END:variables
}
