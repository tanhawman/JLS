/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import ADT.LList;
import ADT.SListInterface;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import jls.Arrangement;
import jls.Customer;
import jls.HomePage;
import jls.Order;
import jls.Product;

/**
 *
 * @author Yee Kun
 */
public class CatalogOrder extends javax.swing.JFrame {

    LList<Order> OrderList;
    LList<Customer> CustList;
    LList<Product> ProductList;
    SListInterface<Arrangement> ArrangeList;

    /**
     * Creates new form CatalogOrder
     */

    public CatalogOrder(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, SListInterface<Arrangement> ArrangeList) {

        this.OrderList = OrderList;
        this.CustList = CustList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;

        initComponents();
        addRowToJTable();
    }
    public CatalogOrder(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, SListInterface<Arrangement> ArrangeList, CatalogSalesOrder aThis) {

        this.OrderList = OrderList;
        this.CustList = CustList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;

        initComponents();
        addRowToJTable();
    }

    public class Item {

        public int no;
        public String orderId;
        public String custName;
        public String orderStatus;

        public Item(int no, String orderId, String custName, String orderStatus) {
            this.no = no;
            this.orderId = orderId;
            this.custName = custName;
            this.orderStatus = orderStatus;
        }
    }

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[4];
        int num = 1;

        for (int i = 1; i <= OrderList.getNumberOfEntries(); i++) {
            if (OrderList.getEntry(i).getStatus().equals("Pending") || OrderList.getEntry(i).getStatus().equals("Delivered")) {
                rowData[0] = num;
                rowData[1] = OrderList.getEntry(i).getOrder_ID();
                rowData[2] = OrderList.getEntry(i).getCust_name();
                rowData[3] = OrderList.getEntry(i).getStatus();
                model.addRow(rowData);
                num++;
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalog Order");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Catalog Order");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Order ID", "Customer Name", "Order Status"
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

        jButton1.setText("Generate Sales Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back to Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        new CatalogSalesOrder(CustList,OrderList, ProductList,ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new HomePage(CustList, OrderList, ProductList, ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
