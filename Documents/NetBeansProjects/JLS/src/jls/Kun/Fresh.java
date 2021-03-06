/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import ADT.LList;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import jls.Product;

/**
 *
 * @author Yee Kun
 */
public class Fresh extends javax.swing.JPanel {

    LList<Product> ProductList;

    /**
     * Creates new form Fresh
     */
    public Fresh(LList<Product> ProductList) {
        this.ProductList = ProductList;
        initComponents();
        addRowToJTable();
        jTable1.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

    }

    public class Item {

        public String item;
        public boolean order;
        public int price;
        public int stock;
        public int quantity;
        public int total;

        public Item(String Item, boolean Order, int Price, int Stock, int Quantity, int Total) {
            this.item = Item;
            this.order = Order;
            this.stock = Stock;
            this.price = Price;
            this.quantity = Quantity;
            this.total = Total;
        }

    }

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[6];
        boolean order = false;
        int qty = 0;
        int total = 0;

        for (int i = 1; i <= ProductList.getNumberOfEntries(); i++) {
            int discountRate = ProductList.getEntry(i).getDis_rate();
            int discount = 100 - discountRate;
            int discountPrice = ProductList.getEntry(i).getPrice() * discount / 100;

            if (ProductList.getEntry(i).getCategory().equals("fresh_flower")) {
                rowData[0] = ProductList.getEntry(i).getName();
                rowData[1] = order;
                rowData[2] = discountPrice;
                rowData[3] = ProductList.getEntry(i).getIn_stock();
                rowData[4] = qty;
                rowData[5] = total;
                model.addRow(rowData);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Order", "Price (RM)", "Stock", "Quantity", "Total (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
