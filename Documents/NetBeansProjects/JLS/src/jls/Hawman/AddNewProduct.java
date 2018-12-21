/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Hawman;

import ADT.LList;
import ADT.SListInterface;
import javax.swing.JOptionPane;
import jls.Arrangement;
import jls.Customer;
import jls.HomePage;
import jls.Order;
import jls.Product;

/**
 *
 * @author hawma HELLO
 */
public class AddNewProduct extends javax.swing.JFrame {

    LList<Customer> CustList;
    LList<Order> OrderList;
    LList<Product> ProductList;
    SListInterface<Arrangement> ArrangeList;
    Product p = new Product();
    
    public AddNewProduct(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, SListInterface<Arrangement> ArrangeList) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
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

        lblTitle = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        lblType = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add New Product");

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fresh flower", "Bouquet", "Floral arrangement accessory" }));

        lblType.setText("Product type: ");

        lblName.setText("Product name:");

        lblDesc.setText("Description: ");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        lblPrice.setText("Price (RM): ");

        lblQty.setText("Initial quantity: ");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset)
                                .addGap(36, 36, 36)
                                .addComponent(btnConfirm))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblDesc)
                                    .addComponent(lblPrice)
                                    .addComponent(lblType))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQty)
                        .addGap(18, 18, 18)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnReset)
                    .addComponent(jButton1))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String name = txtName.getText();
        String desc = txtDesc.getText();
        String price = txtPrice.getText();
        String qty = txtQty.getText();
        int type = comboType.getSelectedIndex();
        String typeString;
        String errorMsg = "";
        int valid = 1;

        if (type == 0) {
            typeString = "fresh_flower";
        }
        else if (type == 1) {
            typeString = "bouquet";
        }
        else {
            typeString = "accessory";
        }
        
        if(txtName.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPrice.getText().isEmpty() || txtQty.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "All fields are required.");
            valid = 0;
        }
        else{
            int countQty = Integer.parseInt(qty);
            int countPrice = Integer.parseInt(price);
            
            for (int i = 1; i <=ProductList.getNumberOfEntries(); i++){
                if (ProductList.getEntry(i).getName().equals(name)) {
                    errorMsg = errorMsg + "Product name already exists.\n";
                    valid = 0;
                }
            }
            
            if (countQty < 0){
                errorMsg = errorMsg + "Initial quantity should not be lower than 0.\n";
                valid = 0;
            }
            
            if (countPrice < 0){
                errorMsg = errorMsg + "Price should not be lower than 0.\n";
                valid = 0;
            }
            
            if (valid == 1) {
                errorMsg = errorMsg + "New product successfully added!\n";
                Product p = new Product(name, desc, typeString, Integer.parseInt(qty), Integer.parseInt(price), 0);
                ProductList.add(p);
            }
            JOptionPane.showMessageDialog(rootPane, errorMsg);
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        comboType.setSelectedIndex(0);
        txtName.setText("");
        txtDesc.setText("");
        txtPrice.setText("");
        txtQty.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Menu(CustList, OrderList, ProductList, ArrangeList).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
