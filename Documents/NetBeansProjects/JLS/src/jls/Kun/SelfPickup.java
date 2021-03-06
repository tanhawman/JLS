/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package jls.Kun;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.table.DatePickerCellEditor;

/**
 *
 * @author Yee Kun
 */
public class SelfPickup extends javax.swing.JPanel {
    Fresh p1;
    Bouquet p2;
    /**
     * Creates new form SelfPickup
     */
    public SelfPickup(Fresh fresh, Bouquet bouquet) {
        initComponents();  
        Date date = new Date();
        jXDatePicker1.getMonthView().setLowerBound(date);
        p1 = fresh;
        p2 = bouquet;
        addRowToJTable();
    }
    
    public class BoundDatePickerCellEditor extends DatePickerCellEditor {

    public BoundDatePickerCellEditor() {
        super();
    }

    public BoundDatePickerCellEditor(DateFormat dateFormat) {
        super(dateFormat);
    }

    public void setLowerBound(Date date) {
        datePicker.getMonthView().setLowerBound(date);          
    }

    public void setUpperBound(Date date) {
        datePicker.getMonthView().setLowerBound(date);          
    }

    }
    
    public void addRowToJTable(){
        DefaultTableModel model1 = (DefaultTableModel)p1.jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel)p2.jTable1.getModel();
        Object[] row = new Object[4];
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int totalPrice = 0;
        
        
        for (int i = 0; i < model1.getRowCount(); i++){           
            boolean p1chkOrder = (boolean) p1.jTable1.getValueAt(i, 1);
            int p1chkPrice = Integer.parseInt(p1.jTable1.getValueAt(i, 2).toString());
            int p1chkQty = Integer.parseInt(p1.jTable1.getValueAt(i, 4).toString());
            int total = p1chkPrice * p1chkQty;

            if(p1chkOrder == true && p1chkQty > 0){             
                row[0] = model1.getValueAt(i, 0);
                row[1] = model1.getValueAt(i, 2);
                row[2] = model1.getValueAt(i, 4);
                row[3] = total;
                model.addRow(row);   
                totalPrice += total;
                
            }
                
                lblTotalPrice.setText(Integer.toString(totalPrice));
            
        }
        
        for (int i = 0; i < model2.getRowCount(); i++){           
            boolean p2chkOrder = (boolean) p2.jTable1.getValueAt(i, 1);
            int p2chkPrice = Integer.parseInt(p2.jTable1.getValueAt(i, 2).toString());
            int p2chkQty = Integer.parseInt(p2.jTable1.getValueAt(i, 4).toString());
            int total = p2chkPrice * p2chkQty;

            if(p2chkOrder == true && p2chkQty > 0){             
                row[0] = model2.getValueAt(i, 0);
                row[1] = model2.getValueAt(i, 2);
                row[2] = model2.getValueAt(i, 4);
                row[3] = total;
                model.addRow(row);    
                
            }
                totalPrice += total;
                lblTotalPrice.setText(Integer.toString(totalPrice));
            
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
        lblTotal = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Order Details:");

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

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("Total Price (RM): ");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalPrice.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pick-Up Date: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Time:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00 am", "11:00 am", "12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm" }));

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addGap(41, 41, 41)
                .addComponent(lblTotalPrice)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPrice)
                    .addComponent(lblTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        
    }//GEN-LAST:event_jXDatePicker1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPrice;
    // End of variables declaration//GEN-END:variables
}
