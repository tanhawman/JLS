/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Yee Kun
 */
public class Fresh extends javax.swing.JPanel {

    /**
     * Creates new form Fresh
     */
    public Fresh() {
        initComponents();        
        addRowToJTable();
        jTable1.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        
    }
    
    public class Item{
    public String item;
    public boolean order;
    public int price;
    public int quantity;
    public int total;
        
        public Item(String Item, boolean Order, int Price, int Quantity, int Total){
            this.item = Item;
            this.order = Order;
            this.price = Price;
            this.quantity = Quantity;
            this.total = Total;
        }
    }
    
    public ArrayList ListItem(){
        ArrayList<Item> list = new ArrayList<Item>();
        Item flower = new Item("Rose", false, 20, 0, 0);
        Item flower1 = new Item("Lily", false, 30, 0, 0);
        list.add(flower);
        list.add(flower1);
        return list;
    }
    
    public void addRowToJTable(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    ArrayList<Item> item = ListItem();
    Object rowData[] = new Object[5];
        
        for(int i=0; i<item.size(); i++){
            rowData[0] = item.get(i).item;
            rowData[1] = item.get(i).order;
            rowData[2] = item.get(i).price;
            rowData[3] = item.get(i).quantity;
            rowData[4] = item.get(i).total;
            model.addRow(rowData);
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
                "Item", "Order", "Price (RM)", "Quantity", "Total (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
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