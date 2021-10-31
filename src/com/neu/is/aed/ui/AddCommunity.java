/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.ui;

import com.neu.is.aed.model.City;
import com.neu.is.aed.model.Community;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidhi
 */
public class AddCommunity extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunity
     */
    public AddCommunity() {
        initComponents();
        generateDropdown();
        DefaultTableModel model = (DefaultTableModel) tblCity.getModel();
        model.setRowCount(0);
        updateCityTable();
    }
    
    public void generateDropdown() {
        ArrayList<String> cityDropdown = new ArrayList<>();
        for (String cityValue : City.cityValues) {
            cityDropdown.add(String.valueOf(cityValue));
        }
        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
       comboCity.setModel(yearsSDropdownModel);
    }

    public void updateCityTable() {
        DefaultTableModel model = (DefaultTableModel) tblCity.getModel();
        model.setRowCount(0);
        for (int i = 0; i < City.communityDir.size(); i++) {
            Object[] row = {City.communityDir.get(i).cityName, City.communityDir.get(i).communityName, City.communityDir.get(i).createdAt};
            model.addRow(row);
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

        jToolBar1 = new javax.swing.JToolBar();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tblCity = new javax.swing.JTable();

        jToolBar1.setRollover(true);

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setText(" City :");
        lblCity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        comboCity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCommunity.setText("Community :");
        lblCommunity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City", "Community", "Created At"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(tblCity);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboCity, 0, 167, Short.MAX_VALUE)
                            .addComponent(txtCommunity)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCity, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCommunity))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String errorMessage = "";
        Community community = new Community();

        if (comboCity.getSelectedIndex() == -1) {
            errorMessage += "Please select City! \n";
        }
        String communityErrorMessage = community.validateCommunityName(txtCommunity.getText());
        errorMessage += communityErrorMessage;

        if (community.alreadtExists(comboCity.getSelectedItem().toString(), txtCommunity.getText())) {
            errorMessage += "Community already registered with the selected City \n";
        }
        if (errorMessage.length() != 0) {
            JOptionPane.showMessageDialog(this, errorMessage, "Add City", ERROR_MESSAGE);
        } else {
            community.communityName = txtCommunity.getText();
            community.cityName = comboCity.getSelectedItem().toString();
            community.createdAt = new Date();
            City.communityDir.add(community);
            updateCityTable();
            JOptionPane.showMessageDialog(this, "Successfully Added", "Addition", INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblCity;
    private javax.swing.JTextField txtCommunity;
    // End of variables declaration//GEN-END:variables
}
