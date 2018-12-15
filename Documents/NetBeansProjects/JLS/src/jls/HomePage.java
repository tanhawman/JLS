package jls;

import ADT.LList;
import com.placeholder.PlaceHolder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import jls.CusOrder.CustomerOrder;
import jls.CusOrder.Priority_Table;
import jls.CusOrder.price1;
import jls.Hawman.Menu;
import jls.Ken.CustomerInvoiceMain;
import jls.Kun.CatalogOrder;
import jls.Kun.SalesOrder;
import jls.Kun.SelectItem;
import jls.Kun.SelectItem_CorCust;
import jls.Sushi.DeliveryRoute;
import jls.Sushi.ShowOrder;

public class HomePage extends javax.swing.JFrame {  
    // 5 dummy
    Customer c1 = new Customer("Tong Chun Ken","male","corp_cust","910102-24-6533","No.123 Jalan awda","0123456789","Active", 300, 500);
    Customer c2 = new Customer("Soh Shi Yee","male","consumer","910102-12-1234","No.987 Taman Big","0123452341", "Active", 0, 0);
    Customer c3 = new Customer("Tan Yee Kun","male","consumer","900706-24-6533","No.123 Jalan awda","0123456789", "Active", 0, 0);
    Customer c4 = new Customer("Tan Haw Man","male","corp_cust","921102-14-2313","No.10 Kampung Room","0162837465", "Active", 100, 200); 
    Customer c5 = new Customer("Teo Jun Jie","female","corp_cust","801212-10-2222","No. 2 Monster Hunter World Iceborne","0112312221", "Freeze", 0, 100);
    Customer c6 = new Customer("Teo Zhuo Yang","male","consumer","890813-16-5412","No.27 Mie Jin Long","0124312889", "Active", 0, 0);
    
    String[] item_name_o1 = {"Lily", "Rose"};
    int[] quantity_o1 ={3,5};
    
    String[] item_name_o2 = {"Chrysanthemum", "Rose bouquet"};
    int[] quantity_o2 ={5,1};
    
    String[] item_name_o3 = {"Lily bouquet", "Chrysanthemum bouquet"};
    int[] quantity_o3 ={1,2};
    
    String[] item_name_o4 = {"Rose", "Chrysanthemum"};
    int[] quantity_o4 ={10,10};
    
    String[] item_name_o5 = {"Rose", "Lily", "Chrysanthemum", "Lily bouquet"};
    int[] quantity_o5 ={5,5,5,2};
    
    String[] item_name_o6 = {"Rose bouquet", "Lily bouquet", "Chrysanthemum bouquet"};
    int[] quantity_o6 ={1,2,3};
 
    // public Order(String order_ID, String[] item_name, int[] quantity, String address, String priority, String del_date, String status, int distance, String pickup_date, String pickup_time, boolean isPaid, int total_bill, String cust_name)
    Order o1 = new Order("O001", item_name_o1, quantity_o1, "Jalan Tak Ada, 53300 Kuala Lumpur", "Express", " ", "Pending", 250, "Delivery", "Delivery", true, 117, "Tan Yee Kun");
    Order o2 = new Order("O002", item_name_o2, quantity_o2, "No.123 Jalan awda", "Express", "01/12/18", "Delivered", 300, "Delivery", "Delivery", false, 150,"Tong Chun Ken");
    Order o3 = new Order("O003", item_name_o3, quantity_o3, "Self Pick-Up", "Normal", " ", "Pending", 0, "20/12/18", "10.00 am", true, 225, "Teo Zhuo Yang");
    Order o4 = new Order("O004", item_name_o4, quantity_o4, "Self Pick-Up", "Flexi", "03/12/18", "Delivered", 0, "03/12/18", "12:00 pm", false, 290, "Tan Haw Man");
    Order o5 = new Order("O005", item_name_o5, quantity_o5, "No. 2 Monster Hunter World Iceborne", "Normal", "05/12/18", "Delivered", 320, "Delivery", "Delivery", false, 365, "Teo Jun Jie");
    Order o6 = new Order("O006", item_name_o6, quantity_o6, "Self Pick-Up", "Flexi", " ", "Pending", 0, "25/12/18", "11.00 am", true, 455, "Soh Shi Yee");

    // public Product(String name, String desc, String category, int in_stock, int price, int dis_rate)
    Product p1 = new Product("Rose", "A beautiful rose.", "fresh_flower", 40, 15, 0);
    Product p2 = new Product("Lily", "A beautiful lily.", "fresh_flower", 35, 14, 0);
    Product p3 = new Product("Chrysanthemum", "A beautiful chrysanthemum.", "fresh_flower", 45, 14, 0);
    Product p4 = new Product("Rose bouquet", "A beautiful rose bouquet.", "bouquet", 18, 80, 20);
    Product p5 = new Product("Lily bouquet", "A beautiful lily bouquet.", "bouquet", 13, 75, 20);
    Product p6 = new Product("Chrysanthemum bouquet", "A beautiful chrysanthemum bouquet.", "bouquet", 10, 75, 0);
    Product p7 = new Product("Teddy bear", "A cute teddy bear.", "accessory", 22, 30, 50);
    Product p8 = new Product("Heart balloon", "A lovely heart balloon.", "accessory", 30, 20, 0);
    
    //public Arrangement(String a_ID, String a_style, String a_size, String a_flower, String a_accessory, String a_priority, int a_TotalPrice) 
    Arrangement a1 = new Arrangement("A001","Elliptical flower","Large","Rose","Teddy bear","Express",90);
    Arrangement a2 = new Arrangement("A002","Elliptical flower","Small","Lily","Teddy bear","Normal",50);
    Arrangement a3 = new Arrangement("A003","Vertical flower","Medium","Chrysanthemum","Heart balloon","Flexi",35);
    
    public String cust_type = "";
    
    LList<Customer> CustList = new LList<>();
    LList<Order> OrderList = new LList<>();
    LList<Product> ProductList = new LList<>();
    LList<Arrangement> ArrangeList = new LList<>();

    public static void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    PlaceHolder text1;

    public HomePage() {
        // Add Dummy Data
        CustList.add(c1);
        CustList.add(c2);
        CustList.add(c3);
        CustList.add(c4);
        CustList.add(c5);
        CustList.add(c6);
        
        OrderList.add(o1);
        OrderList.add(o2);
        OrderList.add(o3);
        OrderList.add(o4);
        OrderList.add(o5);
        OrderList.add(o6);
        
        ProductList.add(p1);
        ProductList.add(p2);
        ProductList.add(p3);
        ProductList.add(p4);
        ProductList.add(p5);
        ProductList.add(p6);
        ProductList.add(p7);
        ProductList.add(p8);
        
        ArrangeList.add(a1);
        ArrangeList.add(a2);
        ArrangeList.add(a3);
        
        initComponents();
        text1 = new PlaceHolder(jTextField1,"97xxxx-xx-xxxx");
    }
    public HomePage(LList<Arrangement> ArrangeList,LList<Product> ProductList, price1 aThis) {  
        this.ArrangeList = ArrangeList;
        this.ProductList = ProductList;
        initComponents();
    }
      public HomePage(LList<Arrangement> ArrangeList,LList<Product> ProductList, Priority_Table aThis) {  
        this.ArrangeList = ArrangeList;
        this.ProductList = ProductList;
        initComponents();
    }
        public HomePage(LList<Arrangement> ArrangeList,LList<Product> ProductList, CustomerOrder aThis) {  
        this.ArrangeList = ArrangeList;
        this.ProductList = ProductList;
        initComponents();
    }
        
        public HomePage(LList<Order> OrderList,LList<Product> ProductList, SalesOrder aThis) {  
        this.OrderList = OrderList;
        this.ProductList = ProductList;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Purchase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jls/0b0487f73691de942d15ccdbe6181003--popular-logos-free-apps.jpg"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Catalog Maintainance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("<html><p>Customer maintain &<br>Invoice Payment<p></html>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Order List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Panda Flower System");

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Delivery Route");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Customize");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Priority List");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Generate Sales Order");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel1, "card2");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jls/0b0487f73691de942d15ccdbe6181003--popular-logos-free-apps.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("IC:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton5.setText("Serach");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Panda Flower");

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(87, 87, 87))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel5, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLayeredPane1.removeAll();
        jLayeredPane1.add(jPanel5);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jLayeredPane1.removeAll();
        jLayeredPane1.add(jPanel1);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // KEN
        this.dispose();
        new CustomerInvoiceMain(CustList, OrderList, ProductList, ArrangeList, this).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.dispose();
        new ShowOrder(OrderList).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DeliveryRoute(OrderList).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new CustomerOrder(ArrangeList,ProductList, this).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        new Priority_Table(ArrangeList,ProductList, this).setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        for(int i=1; i<CustList.getNumberOfEntries(); i++){
            if(jTextField1.getText().toString().equals(CustList.getEntry(i).getIc())){
                if(CustList.getEntry(i).getType().equals("consumer")){
                    this.dispose();
                    new SelectItem(ProductList, CustList, OrderList, this).setVisible(true);
                }
                else{
                    this.dispose();
                    new SelectItem_CorCust(ProductList, CustList, OrderList, this).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CatalogOrder(OrderList, CustList, ProductList).setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
