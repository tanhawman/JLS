
package jls.Ken;

import ADT.LList;
import javax.swing.table.DefaultTableModel;
import jls.Customer;

public class creditLimit extends javax.swing.JPanel {

    LList<Customer> CustList;
    
    public creditLimit(LList<Customer> CustList) {
        initComponents();
        this.CustList = CustList;
        initComponents();
        addRowToJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CLimit = new javax.swing.JTable();

        CLimit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Remaining credit", "Credit Limit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CLimit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable CLimit;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) CLimit.getModel();
        Object rowData[] = new Object[4];

        for(int i=1; i<=CustList.getNumberOfEntries(); i++){
            if(CustList.getEntry(i).getType().equals("corp_cust")){
                rowData[0] = CustList.getEntry(i).getName();
                rowData[1] = CustList.getEntry(i).getContact();
                rowData[2] = CustList.getEntry(i).getRemaincredit();
                rowData[3] = CustList.getEntry(i).getCredit_limit();

                model.addRow(rowData);
            }
        }
    }
}
