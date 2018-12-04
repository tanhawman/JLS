
package jls.Ken;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class ManageAccountStatus extends javax.swing.JFrame {

        Object[][] rowData = {{"Tong Chun Ken", 20.00, 2.00, "Freeze"},
                {"Tan Haw Man", 20.00, 2.50, "Active"},
                {"Soh Shi Yee", 15.00, 10.00, "Active"},
                {"Teo Jun Jie", 55.00, 15.50, "Active"},
                {"Tan Yee Kun", 125.00, 16.00, "Active"}};
        Object[] columnNames = { "Name", "Credit Limit", "Remaining credits", "Status"};
        
    public ManageAccountStatus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">awda                       
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Account = new javax.swing.JTable();
        Instruction = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Title.setText("Manage Account Status");

        Account.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Account.setModel(new DefaultTableModel(rowData,columnNames));
        Account.setToolTipText("");
        Account.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Account.setRowHeight(20);
        jScrollPane1.setViewportView(Account);
        
        // SET STATUS TO COMBO BOX
        TableColumn status = Account.getColumnModel().getColumn(3);
        
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Active");
        comboBox.addItem("Freeze");
        status.setCellEditor(new DefaultCellEditor(comboBox));
        
        Instruction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Instruction.setText("<html>\n<h3><strong><span style=\"text-decoration: underline;\">Instruction</span></strong></h3>\n<p>1. <strong>Credit limit</strong> shows the monthly credit limits of that customer.</p>\n<p>2. <strong>Remaining credits&nbsp;</strong>shows the remain credit limit of the customer within this month.</p>\n<p>3. <strong>Status&nbsp;</strong>can be <strong><em>Active</em></strong> or <strong><em>Freeze.</em></strong></p>\n<p><strong><em>&nbsp; &nbsp; &nbsp; &nbsp; Active&nbsp; -&nbsp;</em></strong>The user is enabled to continue purchase products with their remaining credits.</p>\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<em><strong>Freeze -&nbsp;</strong></em>The user's account is unable to make any purchase until they pay his/her invoice.</p>\n<p>4. Freeze the user's account by changing the status and click Update.</p>\n</html>");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(Instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>                        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Proceed with updates ? ", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            TableColumn status = Account.getColumnModel().getColumn(3);
        
            JComboBox comboBox = new JComboBox();
            comboBox.addItem("Active");
            comboBox.addItem("Freeze");
            status.setCellEditor(new DefaultCellEditor(comboBox));
//            THIS IS TO TAKE RECORD FROM JTABLE
//            Object[][] newStatus = new Object[Account.getRowCount()][Account.getColumnCount()];
//            
//            for(int i = 0; i<Account.getRowCount(); i++){
//                for (int j = 0; j< Account.getColumnCount(); j++) {
//                    newStatus[i][j] = Account.getValueAt(i, j);
//                }
//            }

            JOptionPane.showMessageDialog(null, "Update Completed.", "Confirm", JOptionPane.OK_OPTION);
            
        }else if(confirm == JOptionPane.NO_OPTION ){
            Account.setModel(new DefaultTableModel(rowData,columnNames));
            TableColumn status = Account.getColumnModel().getColumn(3);
        
            JComboBox comboBox = new JComboBox();
            comboBox.addItem("Active");
            comboBox.addItem("Freeze");
            status.setCellEditor(new DefaultCellEditor(comboBox));
        }
    }                                        

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageAccountStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAccountStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAccountStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAccountStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccountStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable Account;
    private javax.swing.JLabel Instruction;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
