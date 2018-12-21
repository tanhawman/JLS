/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.test
 */
package jls.Kun;

import ADT.LList;
import ADT.SListInterface;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import jls.Arrangement;
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
    SListInterface<Arrangement> ArrangeList;
    Purchase homepage;
    Fresh fresh;
    Bouquet bouquet;
    ConfirmOrder confirmOrder;
    OrderItem[] oi;
    String order_id;

    /**
     * Creates new form SalesOrder
     */
    public SalesOrder(Fresh fresh, Bouquet bouquet, ConfirmOrder confirmorder, SelectItem selectitem, LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, Purchase homepage, SelectItem_CorCust selectItem_CorCust, SListInterface<Arrangement> ArrangeListt) {
        this.homepage = homepage;
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.selectitem = selectitem;
        this.ArrangeList = ArrangeListt;
        this.selectItem_CorCust = selectItem_CorCust;
        this.fresh = fresh;
        this.bouquet = bouquet;
        this.confirmOrder = confirmorder;
        initComponents();

        updateDetails();
        addRowToJTable();
        addNewRecord();

    }

    public void updateDetails() {

        for (int i = 1; i <= OrderList.getNumberOfEntries(); i++) {
            order_id = "O" + String.format("%03d", (i + 1));
        }

        jLabel10.setText(order_id);

        for (int i = 1; i < CustList.getNumberOfEntries(); i++) {
            if (homepage.jTextField1.getText().equals(CustList.getEntry(i).getIc())) {
                if (CustList.getEntry(i).getType().equals("consumer")) {
                    jLabel11.setText(selectitem.jLabel3.getText());
                } else {
                    jLabel11.setText(selectItem_CorCust.jLabel3.getText());
                }
            }
        }

        for (int i = 1; i < CustList.getNumberOfEntries(); i++) {
            if (homepage.jTextField1.getText().equals(CustList.getEntry(i).getIc())) {
                if (CustList.getEntry(i).getType().equals("consumer")) {
                    jLabel12.setText(CustList.getEntry(i).getContact());
                } else {
                    jLabel12.setText(CustList.getEntry(i).getContact());
                }
            }
        }

        jLabel14.setText("Pending");

        if (confirmOrder.rdpickup.isSelected() == true) {
            jLabel13.setText("Self Pick-Up");
        } else {
            jLabel13.setText(confirmOrder.p2.jLabel2.getText());
        }

        if (confirmOrder.rdpickup.isSelected() == true) {
            jLabel16.setText((String) confirmOrder.p1.jComboBox1.getSelectedItem());
        } else {
            jLabel16.setText("Delivery");
        }

        if (confirmOrder.rdpickup.isSelected() == true) {
            JFormattedTextField editor = confirmOrder.p1.jXDatePicker1.getEditor();
            Date dateInDatePicker = (Date) editor.getValue();
            DateFormat sysDate = new SimpleDateFormat("dd/MM/yy");
            String date_to_store = sysDate.format(dateInDatePicker);

            jLabel18.setText(date_to_store);
        } else {
            jLabel18.setText("Delivery");
        }

    }

    String[] item = new String[20];
    int[] qty = new int[20];
    int num = 0;

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel model1 = (DefaultTableModel) fresh.jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) bouquet.jTable1.getModel();
        Object[] row = new Object[4];
        int totalPrice = 0;
        int itemNum = 0;
        for (int i = 0; i < model1.getRowCount(); i++) {
            boolean p1chkOrder = (boolean) fresh.jTable1.getValueAt(i, 1);
            int p1chkQty = Integer.parseInt(fresh.jTable1.getValueAt(i, 4).toString());
            if (p1chkOrder == true && p1chkQty > 0) {
                itemNum++;
            }
        }
        for (int i = 0; i < model2.getRowCount(); i++) {
            boolean p2chkOrder = (boolean) bouquet.jTable1.getValueAt(i, 1);
            int p2chkQty = Integer.parseInt(bouquet.jTable1.getValueAt(i, 4).toString());
            if (p2chkOrder == true && p2chkQty > 0) {
                itemNum++;
            }
        }
        oi = new OrderItem[itemNum];

        for (int i = 0; i < model1.getRowCount(); i++) {
            boolean p1chkOrder = (boolean) fresh.jTable1.getValueAt(i, 1);
            int p1chkPrice = Integer.parseInt(fresh.jTable1.getValueAt(i, 2).toString());
            int p1chkQty = Integer.parseInt(fresh.jTable1.getValueAt(i, 4).toString());
            int total = p1chkPrice * p1chkQty;

            if (p1chkOrder == true && p1chkQty > 0) {
                row[0] = model1.getValueAt(i, 0);
                row[1] = model1.getValueAt(i, 2);
                row[2] = model1.getValueAt(i, 4);
                row[3] = total;
                model.addRow(row);
                item[num] = model1.getValueAt(i, 0).toString();
                qty[num] = Integer.parseInt(model1.getValueAt(i, 4).toString());
                Product pname = null;
                for (int j = 1; j <= ProductList.getNumberOfEntries(); j++) {
                    if (item[num].equals(ProductList.getEntry(j).getName())) {
                        pname = ProductList.getEntry(j);
                    }
                }
                oi[num] = new OrderItem(pname, qty[num]);
                num++;
            }
            totalPrice += total;
            jLabel9.setText(Integer.toString(totalPrice));

        }

        for (int i = 0; i < model2.getRowCount(); i++) {
            boolean p2chkOrder = (boolean) bouquet.jTable1.getValueAt(i, 1);
            int p2chkPrice = Integer.parseInt(bouquet.jTable1.getValueAt(i, 2).toString());
            int p2chkQty = Integer.parseInt(bouquet.jTable1.getValueAt(i, 4).toString());
            int total = p2chkPrice * p2chkQty;

            if (p2chkOrder == true && p2chkQty > 0) {
                row[0] = model2.getValueAt(i, 0);
                row[1] = model2.getValueAt(i, 2);
                row[2] = model2.getValueAt(i, 4);
                row[3] = total;
                model.addRow(row);
                item[num] = model2.getValueAt(i, 0).toString();
                qty[num] = Integer.parseInt(model2.getValueAt(i, 4).toString());
                Product pname = null;
                for (int j = 1; j <= ProductList.getNumberOfEntries(); j++) {
                    if (item[num].equals(ProductList.getEntry(j).getName())) {
                        pname = ProductList.getEntry(j);
                    }
                }
                oi[num] = new OrderItem(pname, qty[num]);
                num++;
            }
            totalPrice += total;
            jLabel9.setText(Integer.toString(totalPrice));

        }

    }

    public void addNewRecord() {
        String orderid = jLabel10.getText();
        String address = jLabel13.getText();
        String total = jLabel9.getText();
        String name = jLabel11.getText();
        String pickupdate = jLabel18.getText();
        String pickuptime = jLabel16.getText();

        if (confirmOrder.rdpickup.isSelected() == true) {
            Order newOrder = new Order(orderid, oi, address, " ", "", "Pending", 0, pickupdate, pickuptime, true, Integer.valueOf(total), name);
            OrderList.add(newOrder);
        } else {
            Order newOrder = new Order(orderid, oi, address, " ", "", "Pending", 0, "Delivery", "Delivery", true, Integer.valueOf(total), name);
            OrderList.add(newOrder);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price (RM)", "Quantity", "Total (RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Pick-Up Time: ");

        jLabel16.setText("jLabel16");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Pick-Up Date: ");

        jLabel18.setText("jLabel18");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel8))
                .addGap(61, 61, 61)
                .addComponent(jLabel9)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
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
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addGap(60, 60, 60)
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
        new HomePage(CustList, OrderList, ProductList, ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
