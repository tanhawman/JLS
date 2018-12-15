
package jls.Ken;

import ADT.LList;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jls.Arrangement;
import jls.Customer;
import jls.Order;
import jls.Product;

public class GenInvoicePayment extends javax.swing.JFrame {
    
    LList<Customer> CustList;
    LList<Order> OrderList;
    LList<Product> ProductList;
    LList<Arrangement> ArrangeList;
    GridBagLayout layout = new GridBagLayout();
    InvPay ip ;
    String temp;
    int total_bill = 0;
    int change = 0;
    String name_txt;

    public GenInvoicePayment(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, LList<Arrangement> ArrangeList, CustomerInvoiceMain aThis) {
        initComponents();
        ip = new InvPay();
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        empty.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 150;
        c.gridy = 0;
        empty.add(ip, c);
        c.gridx = 0;
        c.gridy = 0;
        ip.setVisible(true);
    }

    public GenInvoicePayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        empty = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        err_msg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalBill_txt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CustPay = new javax.swing.JTextField();
        Cal_Change = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Payment");
        setPreferredSize(new java.awt.Dimension(541, 650));
        setSize(new java.awt.Dimension(541, 600));

        Back.setText("Back to Menu");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Name :");

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        empty.setMaximumSize(new java.awt.Dimension(5000, 500));

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("<html>\n<p><strong>Tips:</strong><br />1. Enter name above to check for monthly debt.</p> <br/>\n<p>2. Upon the check button clicked, all orders made by the customer using monthly credit will be shown.</p>\n</html>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        err_msg.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        err_msg.setForeground(new java.awt.Color(255, 0, 0));
        err_msg.setText("jLabel5");
        err_msg.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total Bill : (RM)");

        totalBill_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalBill_txt.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customer Pay :");

        CustPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Cal_Change.setText("Confirm Payment");
        Cal_Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cal_ChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(empty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(err_msg)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalBill_txt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cal_Change)
                            .addComponent(CustPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(err_msg))
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(empty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalBill_txt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CustPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Cal_Change, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Generate Payment Invoice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isFind(String name){
        String toSearch = name;
        for(int i = 1; i < OrderList.getNumberOfEntries(); i++){
            if(toSearch.equals(OrderList.getEntry(i).getCust_name().toLowerCase()) &&  !(OrderList.getEntry(i).isIsPaid())){
                return true;
            }
        }
        return false;
    }
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CustomerInvoiceMain(CustList, OrderList, ProductList, ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        err_msg.setVisible(false);
        total_bill = 0;
        CustPay.setText("");
        totalBill_txt.setText("");
        name_txt = name.getText().toLowerCase();
        
        DefaultTableModel model = (DefaultTableModel) ip.jTable1.getModel();
        for (int i = 0; i < ip.jTable1.getRowCount(); i++){ 
            model.removeRow(0);
        }
            
        if(isFind(name_txt)){
            
            Object newData[] = new Object[3];
            for(int i=1; i<=OrderList.getNumberOfEntries(); i++){
                if( !OrderList.getEntry(i).isIsPaid() && OrderList.getEntry(i).getCust_name().toLowerCase().equals(name_txt)){
                    newData[0] = OrderList.getEntry(i).getOrder_ID();
                    newData[1] = OrderList.getEntry(i).getDel_date();
                    newData[2] = OrderList.getEntry(i).getTotal_bill();

                    total_bill += OrderList.getEntry(i).getTotal_bill();
                    model.addRow(newData);
                }
            }
            
            totalBill_txt.setText(total_bill+".00");
        }else{
            err_msg.setText("Customer Not Found or Customer have no unpaid invoice.");
            err_msg.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cal_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cal_ChangeActionPerformed
        // TODO add your handling code here:
        try{
            int cust_pay = Cal_Change(total_bill, Integer.parseInt(CustPay.getText()));

            if (cust_pay < total_bill ) {
                JOptionPane.showMessageDialog(null, temp, "Payment", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, temp, "Payment", JOptionPane.INFORMATION_MESSAGE);
                for(int i= 1; i < CustList.getNumberOfEntries(); i++){
                    // set cust stat to Active, set Remaining credit limit to monthly limit, find by order id to update ispaid 
                    if(CustList.getEntry(i).getName().toLowerCase().equals(name_txt)){
                        CustList.getEntry(i).setStatus("Active");
                        CustList.getEntry(i).setRemaincredit(CustList.getEntry(i).getCredit_limit());
                        break;
                    }
                }
            
                int row = 0;
                for(int i=1; i<=OrderList.getNumberOfEntries()+1; i++){
                    if(OrderList.getEntry(i).getOrder_ID().equals(ip.jTable1.getValueAt(row, 0).toString())){
                        OrderList.getEntry(i).setIsPaid(true);
                        row++;
                    }
                }
            }
        }catch(NumberFormatException ex){
            temp = "Enter Numbers only !";
            JOptionPane.showMessageDialog(null, temp, "Payment", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Cal_ChangeActionPerformed

    public int Cal_Change(int bill, int cust) {
        total_bill = bill;
        if (cust < total_bill) {
            temp = "Please pay the staff with sufficient payment.";
        } else {
            change = cust - total_bill;
            temp = "Payment completed.\nChanges:\t RM" + change;
        }
        return change;
    }
        
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
//            java.util.logging.Logger.getLogger(InvoicePayment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InvoicePayment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InvoicePayment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InvoicePayment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InvoicePayment2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cal_Change;
    private javax.swing.JTextField CustPay;
    private javax.swing.JPanel empty;
    private javax.swing.JLabel err_msg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel totalBill_txt;
    // End of variables declaration//GEN-END:variables
}
