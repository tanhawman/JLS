package jls.Ken;

import ADT.LList;
import ADT.SListInterface;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import jls.Arrangement;
import jls.Customer;
import jls.Order;
import jls.Product;

public class ManAccStat extends javax.swing.JFrame {
    LList<Customer> CustList;
    LList<Order> OrderList;
    LList<Product> ProductList;
    SListInterface<Arrangement> ArrangeList;
    GridBagLayout layout = new GridBagLayout();
    AccStat as;
    
    public ManAccStat(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, SListInterface<Arrangement> ArrangeList, CustomerInvoiceMain aThis) {
        initComponents();
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        as = new AccStat(CustList, OrderList, ProductList, ArrangeList);
        empty.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 150;
        c.gridy = 0;
        empty.add(as, c);
        c.gridx = 0;
        c.gridy = 0;
        as.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Instruction = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        empty = new javax.swing.JPanel();
        backMenu = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Account Status");

        Instruction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Instruction.setText("<html>\n<h3><strong><span style=\"text-decoration: underline;\">Instruction</span></strong></h3>\n<p>1. <strong>Status&nbsp;</strong>can be <strong><em>Active</em></strong> or <strong><em>Freeze.</em></strong></p>\n<p><strong><em>&nbsp; &nbsp; &nbsp; &nbsp; Active&nbsp; -&nbsp;</em></strong>The user is enabled to continue purchase products with their remaining credits.</p>\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<em><strong>Freeze -&nbsp;</strong></em>The user's account is unable to make any purchase until they pay his/her invoice.</p>\n<p>2. Freeze the user's account by changing the status and click Update.</p>\n</html>");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Account Status");

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        backMenu.setText("Back to Menu");
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(backMenu))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Instruction)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backMenu)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(Instruction)
                .addGap(27, 27, 27)
                .addComponent(empty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CustomerInvoiceMain(CustList, OrderList, ProductList, ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_backMenuActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Proceed with updates ? \nChoose no to rest your changes", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            
        if(confirm == JOptionPane.YES_OPTION){
            TableColumn status = as.Account.getColumnModel().getColumn(3);
            
            int row = 0;
            for(int i = 1; i <=CustList.getNumberOfEntries(); i++ ){
                    if(as.Account.getValueAt(row, 0).toString().equals(CustList.getEntry(i).getName())){
                        CustList.getEntry(i).setStatus(as.Account.getValueAt(row, 3).toString());
                        row++;
                    }
                
            }

            JOptionPane.showMessageDialog(null, "Update Completed.", "Confirm", JOptionPane.INFORMATION_MESSAGE);
            
        }else if(confirm == JOptionPane.NO_OPTION ){
        
            DefaultTableModel model = (DefaultTableModel) as.Account.getModel();
            
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
    
            Object rowData[] = new Object[4];
            for(int i=1; i<=CustList.getNumberOfEntries(); i++){
                if(CustList.getEntry(i).getType().equals("corp_cust")){
                    rowData[0] = CustList.getEntry(i).getName();
                    rowData[1] = CustList.getEntry(i).getRemaincredit();
                    rowData[2] = CustList.getEntry(i).getCredit_limit();
                    rowData[3] = CustList.getEntry(i).getStatus();

                    model.addRow(rowData);
                }
            }    
        }
    }//GEN-LAST:event_updateActionPerformed

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
//            java.util.logging.Logger.getLogger(ManAccStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManAccStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManAccStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManAccStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManAccStat().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instruction;
    private javax.swing.JButton backMenu;
    private javax.swing.JPanel empty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
