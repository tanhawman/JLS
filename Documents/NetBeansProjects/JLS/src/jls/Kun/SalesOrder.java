/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.test
 */
package jls.Kun;

import ADT.LList;
import javax.swing.table.DefaultTableModel;
import jls.Customer;
import jls.HomePage;
import jls.Order;
import jls.OrderItem;
import jls.Product;
import jls.Purchase;

/**
 *
 * @author Yee Kun
 */
public class SalesOrder extends javax.swing.JFrame {
    LList<Product> ProductList;
    LList<Customer> CustList;
    LList<Order> OrderList;
    SelectItem selectitem;
    SelectItem_CorCust selectItem_CorCust;
    Purchase homepage;
    Fresh fresh;
    Bouquet bouquet;
    ConfirmOrder p1;
    OrderItem[] oi = new OrderItem[99];
    String order_id;
    /**
     * Creates new form SalesOrder
     */
    public SalesOrder(Fresh fresh, Bouquet bouquet, ConfirmOrder confirmorder, SelectItem selectitem, LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, Purchase homepage, SelectItem_CorCust selectItem_CorCust) {
        this.homepage = homepage;
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.selectitem = selectitem;
        this.selectItem_CorCust = selectItem_CorCust;
        p1 = confirmorder;
        initComponents();
        
        updateDetails();
        addRowToJTable();
        
        String orderid = jLabel10.getText();
        String address = jLabel13.getText();
        String total = jLabel9.getText();
        String name = jLabel11.getText();

        Order newOrder = new Order(orderid, oi, address, " ", " ", "Pending", 0, "Delivery", "Delivery", true, Integer.valueOf(total), name);
        OrderList.add(newOrder);
        
    }
     
    public void updateDetails(){
        
        for (int i = 1; i <= OrderList.getNumberOfEntries(); i++) {
            order_id = "O" + String.format("%03d", (i + 1));
        }
                
        jLabel10.setText(order_id);
        
        for(int i=1; i<CustList.getNumberOfEntries(); i++){
            if(homepage.jTextField1.getText().equals(CustList.getEntry(i).getIc())){
                if(CustList.getEntry(i).getType().equals("consumer")){
                    jLabel11.setText(selectitem.jLabel3.getText());
                }
                else{
                    jLabel11.setText(selectItem_CorCust.jComboBox1.getSelectedItem().toString());
                }
            }
        }
        
            
        for(int i=1; i<CustList.getNumberOfEntries(); i++){
            if(homepage.jTextField1.getText().equals(CustList.getEntry(i).getIc())){
                if(CustList.getEntry(i).getType().equals("consumer")){
                    jLabel12.setText(CustList.getEntry(i).getContact());
                }
                else{
                    jLabel12.setText(CustList.getEntry(i).getContact());
                }
            }
        }
        
        
        
        jLabel14.setText("Pending");
        
        if(p1.rdpickup.isSelected() == true){
            jLabel13.setText("Self Pick-Up");
        }
        else{
            jLabel13.setText(p1.p2.jLabel2.getText());
        }
        
    }
    
    
    String[] item = new String[20];
    int[] qty = new int[20];
    int num = 0;
    public void addRowToJTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel model1 = (DefaultTableModel)p1.p1.jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel)p1.p2.jTable1.getModel();
        Object[] row = new Object[4];
        int totalPrice = 0;
        
        for (int i = 0; i < model1.getRowCount(); i++){           
            boolean p1chkOrder = (boolean) p1.p1.p1.jTable1.getValueAt(i, 1);
            int p1chkPrice = Integer.parseInt(p1.p1.p1.jTable1.getValueAt(i, 2).toString());
            int p1chkQty = Integer.parseInt(p1.p1.p1.jTable1.getValueAt(i, 3).toString());
            int total = p1chkPrice * p1chkQty;

            if(p1chkOrder == true && p1chkQty > 0){             
                row[0] = model1.getValueAt(i, 0);
                row[1] = model1.getValueAt(i, 2);
                row[2] = model1.getValueAt(i, 3);
                row[3] = total;
                model.addRow(row);
                item[num] = model1.getValueAt(i, 0).toString();
                qty[num] = Integer.parseInt(model1.getValueAt(i, 3).toString());
                Product pname = null;
                for(int j = 1; j <= ProductList.getNumberOfEntries(); j++){
                    if(item[num].equals(ProductList.getEntry(j).getName())){
                        pname = ProductList.getEntry(j);
                    }
                }
                oi[i] = new OrderItem(pname,qty[num]);
                num++;
            }
                totalPrice += total;
                jLabel9.setText(Integer.toString(totalPrice));
            
        }
        
       
        
        for (int i = 0; i < model2.getRowCount(); i++){         
            boolean p2chkOrder = (boolean) p1.p1.p2.jTable1.getValueAt(i, 1);
            int p2chkPrice = Integer.parseInt(p1.p1.p2.jTable1.getValueAt(i, 2).toString());
            int p2chkQty = Integer.parseInt(p1.p1.p2.jTable1.getValueAt(i, 3).toString());
            int total = p2chkPrice * p2chkQty;

            if(p2chkOrder == true && p2chkQty > 0){             
                row[0] = model2.getValueAt(i, 0);
                row[1] = model2.getValueAt(i, 2);
                row[2] = model2.getValueAt(i, 3);
                row[3] = total;
                model.addRow(row);    
                item[num] = model2.getValueAt(i, 0).toString();
                qty[num] = Integer.parseInt(model2.getValueAt(i, 3).toString());
                Product pname = null;
                for(int j = 1; j <= ProductList.getNumberOfEntries(); j++){
                    if(item[num].equals(ProductList.getEntry(j).getName())){
                        pname = ProductList.getEntry(j);
                    }
                }
                oi[i] = new OrderItem(pname,qty[num]);
                num++;
            }
                totalPrice += total;
                jLabel9.setText(Integer.toString(totalPrice));
            
        }
        
    
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Order");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sales Order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Order ID: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Customer Name: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Contact: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ship to Address: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Order Status: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Order Details: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price (RM)", "Quantity", "Total (RM)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Price (RM): ");

        jLabel9.setText("0");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel8))
                .addGap(61, 61, 61)
                .addComponent(jLabel9)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addGap(101, 101, 101)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new HomePage(OrderList, ProductList, this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
