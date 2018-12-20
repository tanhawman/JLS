/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Ken;

import ADT.LList;
import ADT.SListInterface;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import jls.Arrangement;
import jls.Customer;
import jls.Order;
import jls.Product;

public class AccStat extends javax.swing.JPanel {

    LList<Customer> CustList;
    LList<Order> OrderList;
    LList<Product> ProductList;
    SListInterface<Arrangement> ArrangeList;

    public AccStat() {
        initComponents();
    }

    public AccStat(LList<Customer> CustList, LList<Order> OrderList, LList<Product> ProductList, SListInterface<Arrangement> ArrangeList) {
        this.CustList = CustList;
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        this.ArrangeList = ArrangeList; 
        initComponents();
        addRowToJTable(CustList);
        //jTable1.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
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
        Account = new javax.swing.JTable();

        Account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Remaining Credit", "Credit Limit", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableColumn status = Account.getColumnModel().getColumn(3);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Active");
        comboBox.addItem("Freeze");
        status.setCellEditor(new DefaultCellEditor(comboBox));
        jScrollPane1.setViewportView(Account);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRowToJTable(LList<Customer> CustList) {
        DefaultTableModel model = (DefaultTableModel) Account.getModel();
    
        Object rowData[] = new Object[4];
        
        for(int i=1; i<=CustList.getNumberOfEntries(); i++){
            if(CustList.getEntry(i).getType().equals("corp_cust")){
                rowData[0] = CustList.getEntry(i).getName();
                rowData[1] = CustList.getEntry(i).getRemaincredit();
                rowData[2] = CustList.getEntry(i).getCredit_limit();
                rowData[3] = CustList.getEntry(i).getStatus();

                model.addRow(rowData);
            }
        }      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Account;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
