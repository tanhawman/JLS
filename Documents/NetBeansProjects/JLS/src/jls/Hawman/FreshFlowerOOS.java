/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Hawman;

import ADT.LList;
import ADT.SListInterface;
import javax.swing.table.DefaultTableModel;
import jls.Arrangement;
import jls.Customer;
import jls.Order;
import jls.Product;

/**
 *
 * @author hawma
 */
public class FreshFlowerOOS extends javax.swing.JPanel {

    LList<Customer> CustList;
    LList<Order> OrderList;
    LList<Product> ProductList;
    SListInterface<Arrangement> ArrangeList;
    
    /**
     * Creates new form FreshFlowerOOS
     */
    public FreshFlowerOOS(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, SListInterface<Arrangement> ArrangeList) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList;
        initComponents();
        addRowToJTable();
    }
    
    public void addRowToJTable(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    Object rowData[] = new Object[1];
        
        for(int i=1; i<=ProductList.getNumberOfEntries(); i++){
            if (ProductList.getEntry(i).getIn_stock() == 0 && ProductList.getEntry(i).getCategory().equals("fresh_flower")) {
                rowData[0] = ProductList.getEntry(i).getName();
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
                "Product Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}