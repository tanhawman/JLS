package jls.Ken;

import ADT.LList;
import jls.Arrangement;
import jls.Customer;
import jls.HomePage;
import jls.Order;
import jls.Product;

public class CustomerInvoiceMain extends javax.swing.JFrame {
    
    LList<Customer> CustList;
    LList<Order> OrderList;
    LList<Product> ProductList;
    LList<Arrangement> ArrangeList;

    public CustomerInvoiceMain(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, LList<Arrangement> ArrangeList, HomePage aThis) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        initComponents();
    }
    
    public CustomerInvoiceMain(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, LList<Arrangement> ArrangeList, GenInvoicePayment aThis) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        initComponents();
    }
    
    public CustomerInvoiceMain(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, LList<Arrangement> ArrangeList, RegisterForm aThis) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        initComponents();
    }

    public CustomerInvoiceMain(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, LList<Arrangement> ArrangeList, ManAccStat aThis) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accState = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chkLimit = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        Invoice = new javax.swing.JButton();
        backMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Maintain & Invoice Payment");

        accState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accState.setText("Manage Account Status");
        accState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accStateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Maintain & Invoice Payment Menu");

        chkLimit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkLimit.setText("Check Credit Limit");
        chkLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLimitActionPerformed(evt);
            }
        });

        reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18Naaa
        reg.setText("Registeration");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        Invoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Invoice.setText("Invoice Payment");
        Invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceActionPerformed(evt);
            }
        });

        backMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backMenu.setText("Back to Main Menu");
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backMenu)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accState, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(backMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new RegisterForm(CustList,OrderList,ProductList,ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_regActionPerformed

    private void chkLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLimitActionPerformed
        this.dispose();
        new checkCreditLimit().setVisible(true);
    }//GEN-LAST:event_chkLimitActionPerformed

    private void accStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accStateActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ManAccStat(CustList,OrderList,ProductList,ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_accStateActionPerformed

    private void InvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GenInvoicePayment(CustList,OrderList,ProductList,ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_InvoiceActionPerformed

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
        // BACK TO MAIN MENU
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_backMenuActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(CustomerInvoiceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerInvoiceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerInvoiceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerInvoiceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerInvoiceMain().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Invoice;
    private javax.swing.JButton accState;
    private javax.swing.JButton backMenu;
    private javax.swing.JButton chkLimit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reg;
    // End of variables declaration//GEN-END:variables
}
