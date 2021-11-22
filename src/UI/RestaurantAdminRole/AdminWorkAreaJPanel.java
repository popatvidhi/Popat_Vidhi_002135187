

package UI.RestaurantAdminRole;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  vidhi
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, 
            CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, 
            DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.customerDirectory = ecoSystem.getCustomerDirectory();
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.orderDirectory = ecoSystem.getOrderDirectory();
        valueLabel.setText(account.getUsername());

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANAGER ROLE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        userJButton.setText("MANAGE RESTAURANT INFO");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 230, -1));

        manageEmployeeJButton.setText("MANAGE MENU");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, -1));

        manageOrganizationJButton.setText("MANAGE ORDERS");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 230, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("RESTAURANT :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageRestaurantInfoJPanel mrijp = new ManageRestaurantInfoJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory);
        userProcessContainer.add("manageMenuJPanel",mrijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory,menuDirectory);
        userProcessContainer.add("manageMenuJPanel",manageMenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory,menuDirectory, orderDirectory);
        userProcessContainer.add("ManageOrderJPanel",manageOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
