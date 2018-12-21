/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Ken;

import ADT.LList;
import javax.swing.table.DefaultTableModel;
import jls.Customer;
import jls.Order;

/**
 *
 * @author user
 */
public class InvPay extends javax.swing.JPanel {

    LList<Order> OrderList;
    LList<Customer> CustList;
    
    public InvPay() {
        initComponents();
    }

    InvPay(LList<Order> OrderList, LList<Customer> CustList, String name) {
        this.OrderList = OrderList;
        this.CustList = CustList;
        initComponents();
        // addRowToJTable(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Date", "Total Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void addRowToJTable(String toSearch) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    Object rowData[] = new Object[3];
        
        for(int i=1; i<=OrderList.getNumberOfEntries(); i++){
            if( (!OrderList.getEntry(i).isIsPaid()) && OrderList.getEntry(i).getCust_name().equals(toSearch)){
            rowData[0] = OrderList.getEntry(i).getOrder_ID();
            rowData[1] = OrderList.getEntry(i).getDel_date();
            rowData[2] = OrderList.getEntry(i).getTotal_bill();

            model.addRow(rowData);
            }
        }
    }
}
