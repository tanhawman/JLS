/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import javax.swing.JOptionPane;

/**
 *
 * @author yeekun
 */
public class SelectItem extends javax.swing.JFrame {

    /**
     * Creates new form SelectItem
     */
    public SelectItem() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblShop = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblRose = new javax.swing.JLabel();
        lblChrysanthemum = new javax.swing.JLabel();
        lblDaisy = new javax.swing.JLabel();
        lblTRose = new javax.swing.JLabel();
        lblRoseB = new javax.swing.JLabel();
        lblChrysanthemumB = new javax.swing.JLabel();
        lblDaisyB = new javax.swing.JLabel();
        chkRose = new javax.swing.JCheckBox();
        chkChrysanthemum = new javax.swing.JCheckBox();
        chkDaisy = new javax.swing.JCheckBox();
        chkRoseB = new javax.swing.JCheckBox();
        chkChrysanthemumB = new javax.swing.JCheckBox();
        chkDaisyB = new javax.swing.JCheckBox();
        lblPRose = new javax.swing.JLabel();
        lblPChrysanthemum = new javax.swing.JLabel();
        lblPDaisy = new javax.swing.JLabel();
        lblPRoseB = new javax.swing.JLabel();
        lblPChrysanthemumB = new javax.swing.JLabel();
        lblPDaisyB = new javax.swing.JLabel();
        lblTChrysanthemum = new javax.swing.JLabel();
        lblTDaisy = new javax.swing.JLabel();
        lblTRoseB = new javax.swing.JLabel();
        lblTChrysanthemumB = new javax.swing.JLabel();
        lblTDaisyB = new javax.swing.JLabel();
        txtChrysanthemum = new javax.swing.JTextField();
        txtDaisy = new javax.swing.JTextField();
        txtRoseB = new javax.swing.JTextField();
        txtChrysanthemumB = new javax.swing.JTextField();
        txtDaisyB = new javax.swing.JTextField();
        txtRose = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblShop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblShop.setText("Flore FlowerShop");

        lblItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItem.setText("Item");

        lblOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrder.setText("Order");

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrice.setText("Price (RM)");

        lblQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQty.setText("Quantity");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("Total (RM)");

        lblRose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRose.setText("Rose");

        lblChrysanthemum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChrysanthemum.setText("Chrysanthemum");

        lblDaisy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDaisy.setText("Daisy");

        lblTRose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTRose.setText("0");

        lblRoseB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoseB.setText("Rose-Bouquets");

        lblChrysanthemumB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChrysanthemumB.setText("Chrysanthemum-Bouquets");

        lblDaisyB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDaisyB.setText("Daisy-Bouquets");

        lblPRose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRose.setText("20");

        lblPChrysanthemum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPChrysanthemum.setText("18");

        lblPDaisy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPDaisy.setText("15");

        lblPRoseB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRoseB.setText("120");

        lblPChrysanthemumB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPChrysanthemumB.setText("100");

        lblPDaisyB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPDaisyB.setText("90");

        lblTChrysanthemum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTChrysanthemum.setText("0");

        lblTDaisy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTDaisy.setText("0");

        lblTRoseB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTRoseB.setText("0");

        lblTChrysanthemumB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTChrysanthemumB.setText("0");

        lblTDaisyB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTDaisyB.setText("0");

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalculate.setText("Calculate Price");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Price (RM)");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalPrice.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRose)
                            .addComponent(lblChrysanthemum)
                            .addComponent(lblDaisy)
                            .addComponent(lblRoseB)
                            .addComponent(lblChrysanthemumB)
                            .addComponent(lblDaisyB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrder)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkChrysanthemum)
                                    .addComponent(chkRose)
                                    .addComponent(chkDaisy)
                                    .addComponent(chkRoseB)
                                    .addComponent(chkChrysanthemumB)
                                    .addComponent(chkDaisyB))
                                .addGap(17, 17, 17)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPrice)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPRoseB)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPChrysanthemum)
                                        .addComponent(lblPRose)
                                        .addComponent(lblPDaisy))
                                    .addComponent(lblPChrysanthemumB)
                                    .addComponent(lblPDaisyB))
                                .addGap(72, 72, 72)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRose)
                                    .addComponent(lblQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRoseB)
                                    .addComponent(txtChrysanthemumB)
                                    .addComponent(txtDaisyB))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(lblTotal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTChrysanthemum)
                                            .addComponent(lblTRose)
                                            .addComponent(lblTDaisy)
                                            .addComponent(lblTRoseB)
                                            .addComponent(lblTChrysanthemumB)
                                            .addComponent(lblTDaisyB)
                                            .addComponent(lblTotalPrice))
                                        .addGap(52, 52, 52))))
                            .addComponent(txtChrysanthemum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDaisy, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lblShop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(165, 165, 165)
                .addComponent(btnCalculate)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblShop)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem)
                    .addComponent(lblOrder)
                    .addComponent(lblPrice)
                    .addComponent(lblQty)
                    .addComponent(lblTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRose)
                    .addComponent(lblTRose)
                    .addComponent(chkRose)
                    .addComponent(lblPRose)
                    .addComponent(txtRose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblChrysanthemum)
                        .addComponent(chkChrysanthemum))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPChrysanthemum)
                        .addComponent(lblTChrysanthemum)
                        .addComponent(txtChrysanthemum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDaisy)
                    .addComponent(chkDaisy)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTDaisy)
                        .addComponent(txtDaisy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPDaisy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoseB)
                    .addComponent(chkRoseB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTRoseB)
                        .addComponent(txtRoseB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPRoseB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChrysanthemumB)
                    .addComponent(chkChrysanthemumB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPChrysanthemumB)
                        .addComponent(lblTChrysanthemumB)
                        .addComponent(txtChrysanthemumB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDaisyB)
                    .addComponent(chkDaisyB)
                    .addComponent(lblPDaisyB)
                    .addComponent(lblTDaisyB)
                    .addComponent(txtDaisyB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotalPrice))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnCalculate))
                .addGap(18, 18, 18)
                .addComponent(btnPlaceOrder)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        chkRose.setSelected(false);
        chkChrysanthemum.setSelected(false);
        chkDaisy.setSelected(false);
        chkRoseB.setSelected(false);
        chkChrysanthemumB.setSelected(false);
        chkDaisyB.setSelected(false);
        txtRose.setText("");
        txtChrysanthemum.setText("");
        txtDaisy.setText("");
        txtRoseB.setText("");
        txtChrysanthemumB.setText("");
        txtDaisyB.setText("");
        lblTRose.setText("0");
        lblTChrysanthemum.setText("0");
        lblTDaisy.setText("0");
        lblTRoseB.setText("0");
        lblTChrysanthemumB.setText("0");
        lblTDaisyB.setText("0");
        lblTotalPrice.setText("0");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if(chkRose.isSelected() && !txtRose.getText().isEmpty()){
            int quantity = Integer.parseInt(txtRose.getText());
            if(quantity > 0){
                int qty = Integer.parseInt(txtRose.getText()) * 20;
                String price = String.valueOf(qty);
                lblTRose.setText(price);
            }          
        }
        else{
            lblTRose.setText("0");
        }
        
        if(chkChrysanthemum.isSelected() && !txtChrysanthemum.getText().isEmpty()){
            int quantity = Integer.parseInt(txtChrysanthemum.getText());
            if(quantity > 0){
                int qty = Integer.parseInt(txtChrysanthemum.getText()) * 18;
                String price = String.valueOf(qty);
                lblTChrysanthemum.setText(price);
            }
        }
        else{
            lblTChrysanthemum.setText("0");
        }
        
        if(chkDaisy.isSelected() && !txtDaisy.getText().isEmpty()){
            int quantity = Integer.parseInt(txtDaisy.getText());
            if(quantity > 0){
                int qty = Integer.parseInt(txtDaisy.getText()) * 15;
                String price = String.valueOf(qty);
                lblTDaisy.setText(price);
            }
        }
        else{
            lblTDaisy.setText("0");
        }
        
        if(chkRoseB.isSelected() && !txtRoseB.getText().isEmpty()){
            int quantity = Integer.parseInt(txtRoseB.getText());
            if(quantity > 0){
                int qty = Integer.parseInt(txtRoseB.getText()) * 120;
                String price = String.valueOf(qty);
                lblTRoseB.setText(price);
            }
        }
        else{
            lblTRoseB.setText("0");
        }
        
        if(chkChrysanthemumB.isSelected() && !txtChrysanthemumB.getText().isEmpty()){
            int quantity = Integer.parseInt(txtChrysanthemumB.getText());
            if(quantity > 0){
                int qty = Integer.parseInt(txtChrysanthemumB.getText()) * 100;
                String price = String.valueOf(qty);
                lblTChrysanthemumB.setText(price);
            }
        }
        else{
            lblTChrysanthemumB.setText("0");
        }
        
        if(chkDaisyB.isSelected() && !txtDaisyB.getText().isEmpty()){
            int quantity = Integer.parseInt(txtDaisyB.getText());
            if(quantity > 0){
                int qty = Integer.parseInt(txtDaisyB.getText()) * 90;
                String price = String.valueOf(qty);
                lblTDaisyB.setText(price);
            }
        }
        else{
            lblTDaisyB.setText("0");
        }
        
        if(chkRose.isSelected() && txtRose.getText().isEmpty() || chkChrysanthemum.isSelected() && txtChrysanthemum.getText().isEmpty() || chkDaisy.isSelected() && txtDaisy.getText().isEmpty() || chkRoseB.isSelected() && txtRoseB.getText().isEmpty() || chkChrysanthemumB.isSelected() && txtChrysanthemumB.getText().isEmpty() || chkDaisyB.isSelected() && txtDaisyB.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Quantity field is required.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(chkRose.isSelected() && Integer.parseInt(txtRose.getText()) < 1 || chkChrysanthemum.isSelected() && Integer.parseInt(txtChrysanthemum.getText()) < 1 || chkDaisy.isSelected() && Integer.parseInt(txtDaisy.getText()) < 1 || chkRoseB.isSelected() && Integer.parseInt(txtRoseB.getText()) < 1 || chkChrysanthemumB.isSelected() && Integer.parseInt(txtChrysanthemumB.getText()) < 1 || chkDaisyB.isSelected() && Integer.parseInt(txtDaisyB.getText()) < 1){
            JOptionPane.showMessageDialog(rootPane, "Quantity cannot less than or equal 0.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        
        int total = Integer.parseInt(lblTRose.getText()) + Integer.parseInt(lblTChrysanthemum.getText()) + Integer.parseInt(lblTDaisy.getText()) + Integer.parseInt(lblTRoseB.getText()) + Integer.parseInt(lblTChrysanthemumB.getText()) + Integer.parseInt(lblTDaisyB.getText());
        String totalPrice = String.valueOf(total);
        lblTotalPrice.setText(totalPrice);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        if(chkRose.isSelected() && txtRose.getText().isEmpty() || chkChrysanthemum.isSelected() && txtChrysanthemum.getText().isEmpty() || chkDaisy.isSelected() && txtDaisy.getText().isEmpty() || chkRoseB.isSelected() && txtRoseB.getText().isEmpty() || chkChrysanthemumB.isSelected() && txtChrysanthemumB.getText().isEmpty() || chkDaisyB.isSelected() && txtDaisyB.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Quantity field is required.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (!chkRose.isSelected() && !chkChrysanthemum.isSelected() && !chkDaisy.isSelected() && !chkRoseB.isSelected() && !chkChrysanthemumB.isSelected() && !chkDaisyB.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "You Haven't select any item!!!", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(chkRose.isSelected() && Integer.parseInt(txtRose.getText()) < 1 || chkChrysanthemum.isSelected() && Integer.parseInt(txtChrysanthemum.getText()) < 1 || chkDaisy.isSelected() && Integer.parseInt(txtDaisy.getText()) < 1 || chkRoseB.isSelected() && Integer.parseInt(txtRoseB.getText()) < 1 || chkChrysanthemumB.isSelected() && Integer.parseInt(txtChrysanthemumB.getText()) < 1 || chkDaisyB.isSelected() && Integer.parseInt(txtDaisyB.getText()) < 1){
                JOptionPane.showMessageDialog(rootPane, "Quantity cannot less than or equal 0.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                int select = JOptionPane.showConfirmDialog(rootPane, "Confirm Order?", "Process to select pick-up priority", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (select == 0){
                    JOptionPane.showMessageDialog(rootPane, "You place an order!!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                }
            }                       
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed
 
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
            java.util.logging.Logger.getLogger(SelectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkChrysanthemum;
    private javax.swing.JCheckBox chkChrysanthemumB;
    private javax.swing.JCheckBox chkDaisy;
    private javax.swing.JCheckBox chkDaisyB;
    private javax.swing.JCheckBox chkRose;
    private javax.swing.JCheckBox chkRoseB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblChrysanthemum;
    private javax.swing.JLabel lblChrysanthemumB;
    private javax.swing.JLabel lblDaisy;
    private javax.swing.JLabel lblDaisyB;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblPChrysanthemum;
    private javax.swing.JLabel lblPChrysanthemumB;
    private javax.swing.JLabel lblPDaisy;
    private javax.swing.JLabel lblPDaisyB;
    private javax.swing.JLabel lblPRose;
    private javax.swing.JLabel lblPRoseB;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblRose;
    private javax.swing.JLabel lblRoseB;
    private javax.swing.JLabel lblShop;
    private javax.swing.JLabel lblTChrysanthemum;
    private javax.swing.JLabel lblTChrysanthemumB;
    private javax.swing.JLabel lblTDaisy;
    private javax.swing.JLabel lblTDaisyB;
    private javax.swing.JLabel lblTRose;
    private javax.swing.JLabel lblTRoseB;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTextField txtChrysanthemum;
    private javax.swing.JTextField txtChrysanthemumB;
    private javax.swing.JTextField txtDaisy;
    private javax.swing.JTextField txtDaisyB;
    private javax.swing.JTextField txtRose;
    private javax.swing.JTextField txtRoseB;
    // End of variables declaration//GEN-END:variables
}
