/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidhi
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;

    public ManageOrderJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.orderDirectory = ecoSystem.getOrderDirectory();
        populateTable();
        populateDeliveryTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        
        for(Order order : ecoSystem.getOrderDirectory().getOrderDirectory()) {
            if(account.getEmployee().getName().equals(order.getRestaurant().getRestaurantName())) {
                Object [] row = new Object[5];
                row[0] = order;
                row[1] = order.getMenu().getItemName();
                row[2] = order.getQuantity();
                row[3] = order.getQuantity() * order.getMenu().getPrice();
                row[4] = order.getOrderStatus();
                dtm.addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnCompleted = new javax.swing.JButton();
        btnAccepted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        btnAssignDelivery = new javax.swing.JButton();
        btnDeclined = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 51));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Item Name", "Quantity", "Price", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        btnCompleted.setText("COMPLETED");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        btnAccepted.setText("ACCEPTED");
        btnAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ORDERS");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Delivery Man", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryMan);

        btnAssignDelivery.setText("ASSIGN TO DELIVERY MAN");
        btnAssignDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryActionPerformed(evt);
            }
        });

        btnDeclined.setText("DECLINED");
        btnDeclined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclinedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssignDelivery)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeclined)
                        .addGap(63, 63, 63)
                        .addComponent(btnAccepted)
                        .addGap(48, 48, 48)
                        .addComponent(btnCompleted))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(254, 254, 254)
                            .addComponent(jLabel1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompleted)
                    .addComponent(btnAccepted)
                    .addComponent(btnDeclined))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAssignDelivery)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Accepted")) {
            order.setOrderStatus("Order Ready for Pick up");
            order.setAssign(true);
        }
        
        else if(order.getOrderStatus().equals("Order Placed")) {
            JOptionPane.showMessageDialog(null, "Order is should be accepted first");
            return;
        }
        
        else if(order.getOrderStatus().equals("Order Declined")){
            JOptionPane.showMessageDialog(null, "Order is Declined");
            return;
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already ready for pick up");
            return;
        }
        
        populateTable();
        
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Accepted");
        }
        
        else if(order.getOrderStatus().equals("Order Declined")){
            JOptionPane.showMessageDialog(null, "Order is Declined");
            return;
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }
        
        populateTable();
        
    }//GEN-LAST:event_btnAcceptedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryActionPerformed

        int selectedRow = tblOrder.getSelectedRow();
        int selectDeliverManRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow < 0 || selectDeliverManRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        DeliveryMan deliveryPartner = (DeliveryMan) tblDeliveryMan.getValueAt(selectDeliverManRow, 0);
        Order order = (Order) tblOrder.getValueAt(selectedRow,0);
        if(!(order.getOrderStatus().equals("Order Ready for Pick up"))){
            JOptionPane.showMessageDialog(null,"Order not completed yet");
        }
        else{
            order.setDeliveryMan(deliveryPartner.getUserName());
            order.setOrderStatus("Order Picked up");
            JOptionPane.showMessageDialog(null, "Order Picked up");
            populateTable();
        }
    }//GEN-LAST:event_btnAssignDeliveryActionPerformed

    private void btnDeclinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclinedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Accepted")) {
            JOptionPane.showMessageDialog(null, "Order is Accepted and hence cannot be declined");
            return;
        }
        
        else if(order.getOrderStatus().equals("Order Ready for Pick up")) {
            JOptionPane.showMessageDialog(null, "Order is ready and hence cannot be declined");
            return;
        }
        
        else if(order.getOrderStatus().equals("Delivered")) {
            JOptionPane.showMessageDialog(null, "Order is already delivered");
            return;
        }
        
        else if(order.getOrderStatus().equals("Order Picked up")){
            JOptionPane.showMessageDialog(null, "Order is already picked up ");
            return;
        }
        
        else {
            order.setOrderStatus("Order Declined");
        }
        
        populateTable();
    }//GEN-LAST:event_btnDeclinedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccepted;
    private javax.swing.JButton btnAssignDelivery;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnDeclined;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel tableRecordsStatus;
    
    private void populateDeliveryTable() {
        JTable table = tblDeliveryMan;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        for (DeliveryMan o : ecoSystem.getDeliveryManDirectory().getDeliveryManDirectory()) {
                Object[] c = new Object[2];
                c[0] = o;
                c[1] = o.getPhoneNumber();
                model.addRow(c);
        }
        table.getSelectedRow();
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
        }
    }
}
