/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates test
 * and open the template in the editor.w3r
 */
package jls.Kun;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Yee Kun
 */
public class ConfirmOrder extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    SelfPickup p1;
    Delivery p2;
    /**
     * Creates new form ConfirmOrder
     */
    public ConfirmOrder(Fresh fresh, Bouquet bouquet) {
        initComponents();
        rdpickup.setSelected(true);
        p1 = new SelfPickup(fresh, bouquet);
        p2 = new Delivery(fresh, bouquet);
        jPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 150;
        c.gridy = 0;
        jPanel.add(p1, c);
        c.gridx = 0;
        c.gridy = 0;
        jPanel.add(p2, c);
        p1.setVisible(true);
        p2.setVisible(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        rdpickup = new javax.swing.JRadioButton();
        rdDelivery = new javax.swing.JRadioButton();
        jPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirm Order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Please confirm your order");

        buttonGroup1.add(rdpickup);
        rdpickup.setText("Self Pick-Up");
        rdpickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdpickupActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdDelivery);
        rdDelivery.setText("Delivery");
        rdDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        btnCancel.setText("Back");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(rdpickup)
                        .addGap(138, 138, 138)
                        .addComponent(rdDelivery))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdpickup)
                    .addComponent(rdDelivery))
                .addGap(18, 18, 18)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void rdpickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdpickupActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
    }//GEN-LAST:event_rdpickupActionPerformed

    private void rdDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDeliveryActionPerformed
        p2.setVisible(true);
        p1.setVisible(false);
    }//GEN-LAST:event_rdDeliveryActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if(rdpickup.isSelected() == true){
            if(p1.jXDatePicker1.getDate() == null){
                JOptionPane.showMessageDialog(rootPane, "Please choose a Pick-Up Date.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                int select = JOptionPane.showConfirmDialog(rootPane, "Are you confirm?", "Process to select pick-up priority", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (select == 0){
                    JOptionPane.showMessageDialog(rootPane, "You place an order!!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);                                   
                }
            }
        }
        else{
            int select = JOptionPane.showConfirmDialog(rootPane, "Are you confirm?", "Process to select pick-up priority", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (select == 0){
                JOptionPane.showMessageDialog(rootPane, "You place an order!!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);                                   
            }
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConfirmOrder().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JRadioButton rdDelivery;
    private javax.swing.JRadioButton rdpickup;
    // End of variables declaration//GEN-END:variables
}
