package jls.Ken;

import ADT.LList;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.table.DefaultTableModel;
import jls.Customer;

public class CheckCreditLimit extends javax.swing.JFrame {

    LList<Customer> CustList;
    GridBagLayout layout = new GridBagLayout();
    creditLimit cl ;
    String search_txt;
        
    public CheckCreditLimit() {
        initComponents();
    }

    public CheckCreditLimit(LList<Customer> CustList, CustomerInvoiceMain aThis) {
        initComponents();
        this.CustList = CustList;
        cl = new creditLimit(CustList);
        empty.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 150;
        c.gridy = 0;
        empty.add(cl, c);
        c.gridx = 0;
        c.gridy = 0;
        cl.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        empty = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backMenu.setText("Back to Menu");
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Check Monthly Credit Limit");

        jLabel2.setText("Enter name below to search");

        search_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backMenu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search_btn))
                            .addComponent(empty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backMenu)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_btn))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(empty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CustomerInvoiceMain(CustList, this).setVisible(true);
    }//GEN-LAST:event_backMenuActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        search_txt = name.getText();
        DefaultTableModel model = (DefaultTableModel) cl.CLimit.getModel();
            
        while (model.getRowCount() != 0) {
            model.removeRow(0);
        }
        
        Object rowData[] = new Object[4];
        for(int i=1; i<=CustList.getNumberOfEntries(); i++){
            if(CustList.getEntry(i).getType().equals("corp_cust") && CustList.getEntry(i).getName().contains(search_txt)){
                rowData[0] = CustList.getEntry(i).getName();
                rowData[1] = CustList.getEntry(i).getContact();
                rowData[2] = CustList.getEntry(i).getRemaincredit();
                rowData[3] = CustList.getEntry(i).getCredit_limit();

                model.addRow(rowData);
            }
        }     
    }//GEN-LAST:event_search_btnActionPerformed

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
//            java.util.logging.Logger.getLogger(CheckCreditLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CheckCreditLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CheckCreditLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CheckCreditLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CheckCreditLimit().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backMenu;
    private javax.swing.JPanel empty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name;
    private javax.swing.JButton search_btn;
    // End of variables declaration//GEN-END:variables
}
