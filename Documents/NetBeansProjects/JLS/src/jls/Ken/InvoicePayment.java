package jls.Ken;

import ADT.LList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jls.Arrangement;
import jls.Customer;
import jls.Order;
import jls.Product;

public class InvoicePayment extends javax.swing.JFrame {

    LList<Customer> CustList = new LList<>();
    LList<Order> OrderList = new LList<>();
    LList<Product> ProductList = new LList<>();
    LList<Arrangement> ArrangeList = new LList<>();
    
    Object[][] empty = {{"","",null}};
    Object[][] rowData_1;
    Object[] names = {"tong chun ken", "soh shi yee"};
    Object[] columnNames = {"Order ID", "Order Date", "Total Bill"};
    Object[][] rowData_2;
    double bill = 0.00;
    String s_date = "";
    public static String[] inv_month = {"2018:Nov - Dec"};
    JFrame frame = new JFrame("Input Dialog Example 3");
    String temp = "";
    double change = 0.00;
    
    public InvoicePayment(Order o1, Order o2, Order o3) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        Object[][] empty = {{"","",null}};
        this.empty = empty;

        Object[][] rowData_1 = {{o1.getOrderid(), o1.getPickupdate(), o1.getTotal_bill()},
                    {o2.getOrderid(), o2.getPickupdate(), o2.getTotal_bill()}};
        
        this.rowData_1 = rowData_1;

        Object[][] rowData_2 = {{o3.getOrderid(), o3.getPickupdate(), o3.getTotal_bill()}};
        
        this.rowData_2 = rowData_2;
                    
        initComponents();
    }

    InvoicePayment(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, LList<Arrangement> ArrangeList, CustomerInvoiceMain aThis) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        
        Object[][] empty = {{"","",null}};
        
        Object[][] rowData_1 = {{OrderList, o1.getPickupdate(), o1.getTotal_bill()},
                    {o2.getOrderid(), o2.getPickupdate(), o2.getTotal_bill()}};
        
        this.rowData_1 = rowData_1;

        Object[][] rowData_2 = {{o3.getOrderid(), o3.getPickupdate(), o3.getTotal_bill()}};
        
        this.rowData_2 = rowData_2;
        
         initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        err_msg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totalBill = new javax.swing.JLabel();
        custLabel = new javax.swing.JLabel();
        Cust_Pay = new javax.swing.JTextField();
        ModMenu = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Payment");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18Nasd
        jLabel1.setText("Monthly Credit Debt Payment ");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setText("Name");
        ModMenu.setText("Back to Menu");
        ModMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModMenuActionPerformed(evt);
            }
        });
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        custLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        custLabel.setText("Customer Pay:");

        jLabel3.setText("<html>\n<p><strong>Tips:</strong><br />1. Enter name above to check for monthly debt.</p> <br/>\n<p>2. Upon the check button clicked, all orders made by using monthly credit will be shown.</p>\n</html>");

        err_msg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        err_msg.setForeground(new java.awt.Color(255, 0, 51));
        err_msg.setText("Coporate Customers not found. Please try again.");
        err_msg.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(36, Short.MAX_VALUE)
                                                .addGap(10, 10, 10)
                                                .addComponent(ModMenu)
                                        )
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(err_msg)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25))))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(err_msg)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(ModMenu)
                        )
        );

        jTabbedPane1.addTab("Check", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(empty, columnNames) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jButton3.setText("Confirm Payment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setEnabled(false);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total Bill :(RM)");

        totalBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(custLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Cust_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                        .addComponent(totalBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(custLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                        .addComponent(Cust_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4))
        );

        jTabbedPane1.addTab("Invoice Payment", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String name = inputName.getText().toLowerCase();
        int found = 0;

        //Check for name
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i].toString().toLowerCase())) {
                found = 1;
                break;
            }
        }

        if (found == 0) {
            err_msg.setVisible(true);
        } else {
            String s_month = (String) JOptionPane.showInputDialog(frame, "Invoice for which period?", "Invoice Period:", JOptionPane.QUESTION_MESSAGE, null, inv_month, inv_month[0]);
            if (name.equals("tong chun ken")) // Get data into the object, and put into table
            // Should calculate bill before putting into table
            {
                jTable2.setModel(new DefaultTableModel(rowData_1, columnNames));
            } else if (name.equals("soh shi yee")) {
                jTable2.setModel(new DefaultTableModel(rowData_2, columnNames));
            }

            for (int j = 0; j < jTable2.getRowCount(); j++) {
                String temp = jTable2.getValueAt(j, 2).toString();
                bill += Double.parseDouble(temp);
            }

            jButton3.setEnabled(true);
            String convert = String.format("%.2f", bill);
            totalBill.setText(convert);
            jTabbedPane1.setSelectedIndex(1);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        //BACK button
        onSwitch();
    }

    private void ModMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // STORE / ADD / UPDATE DO WHATEVER YOU WANNA DO BEFORE GOING BACK.
        this.dispose();
        new CustomerInvoiceMain().setVisible(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // PAYMENT confirm button
        double haha = Cal_Change(bill, Cust_Pay.getText());
        if (haha < bill) {
            JOptionPane.showMessageDialog(null, temp, "Payment", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, temp, "Payment", JOptionPane.INFORMATION_MESSAGE);
            onSwitch();
        }

    }

    public double Cal_Change(Double bill, String cust) {
        try {
            if (Double.parseDouble(Cust_Pay.getText()) < bill) {
                temp = "Please pay the staff with sufficient payment.";
            } else {
                change = Double.parseDouble(Cust_Pay.getText()) - bill;
                temp = "Payment completed.\nChanges:\t RM" + change;
            }

        } catch (NumberFormatException ex) {
            temp = "Enter Numbers only !";
        }
        return change;
    }

    public void onSwitch() {
        jTable2.setModel(new DefaultTableModel(empty, columnNames));
        err_msg.setVisible(false);
        inputName.setText("");
        bill = 0.0;
        Cust_Pay.setText("");
        jTabbedPane1.setSelectedIndex(0);
    }
//    
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
//            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InvoicePayment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel err_msg;
    private javax.swing.JTextField inputName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel totalBill;
    private javax.swing.JLabel custLabel;
    private javax.swing.JTextField Cust_Pay;
    private javax.swing.JButton ModMenu;
    // End of variables declaration                   
}
