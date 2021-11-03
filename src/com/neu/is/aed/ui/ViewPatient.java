/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.ui;

import com.neu.is.aed.model.City;
import com.neu.is.aed.model.Encounter;
import com.neu.is.aed.model.EncounterHistory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidhi
 */
public class ViewPatient extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatient
     */
    HashMap<String, ArrayList<Encounter>> abnormalData;
    public ViewPatient() {
        initComponents();
        loadEncounterTable();
        dropdownCity();
        dropdownCommunity();
        
    }
    
    public void loadEncounterTable(){
    int rowCount = tblEncounterHistory.getRowCount();
    DefaultTableModel model = (DefaultTableModel) tblEncounterHistory.getModel();
    for(int i=rowCount - 1;i>=0;i--){
        model.removeRow(i);
    }
    for(Encounter encounter: EncounterHistory.encounterHistory){
        Object row[] = new Object[15];
        
        row[0] = encounter.patient.person.getName();
        row[1] = encounter.patient.person.getAge();
        row[2] = encounter.patient.person.getGender();
        row[3] = encounter.patient.person.getPhoneNumber();
        row[4] = encounter.patient. person.getBloodgroup();
        row[5] = encounter.patient.person.address.getHouseNumber();
        row[6] = encounter.patient.person.address.getCommunityName();
        row[7] = encounter.patient.person.address.getCityName();
        row[8] = encounter.patient.person.address.getState();
        row[9] = encounter.patient.person.address.getZip();
        row[10] = encounter.vitalSigns.getHeartRate();
        row[11] = encounter.vitalSigns.getHighBloodPressure();
        row[12] = encounter.vitalSigns.getOxygenLevel();
        row[13] = encounter.vitalSigns.getBodytemprature();
        row[14] = encounter.visitDate;
        model.addRow(row);
    }
    }
    
    public void openAbnromalPatient(){
        int rowCount = tblEncounterHistory.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblEncounterHistory.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        System.out.println(EncounterHistory.encounterHistory);
        for(Encounter encounter: EncounterHistory.encounterHistory){
        Object row[] = new Object[15];
        if((encounter.patient.person.address.getCommunityName().equalsIgnoreCase(comboCommunity.getSelectedItem().toString())) &&
                (encounter.patient.person.address.getCityName().equalsIgnoreCase(comboCity.getSelectedItem().toString()))){
        if(encounter.patient.person.getAge() == 0.1){
            if(encounter.vitalSigns.getHighBloodPressure() < 50 || encounter.vitalSigns.getHighBloodPressure() >= 70){
                row[0] = encounter.patient.person.getName();
                row[1] = encounter.patient.person.getAge();
                row[2] = encounter.patient.person.getGender();
                row[3] = encounter.patient.person.getPhoneNumber();
                row[4] = encounter.patient. person.getBloodgroup();
                row[5] = encounter.patient.person.address.getHouseNumber();
                row[6] = encounter.patient.person.address.getCommunityName();
                row[7] = encounter.patient.person.address.getCityName();
                row[8] = encounter.patient.person.address.getState();
                row[9] = encounter.patient.person.address.getZip();
                row[10] = encounter.vitalSigns.getHeartRate();
                row[11] = encounter.vitalSigns.getHighBloodPressure();
                row[12] = encounter.vitalSigns.getOxygenLevel();
                row[13] = encounter.vitalSigns.getBodytemprature();
                row[14] = encounter.visitDate;
                model.addRow(row);
            }
        }else if(encounter.patient.person.getAge() > 0.1 && encounter.patient.person.getAge() <= 1){
            if(encounter.vitalSigns.getHighBloodPressure() < 70 || encounter.vitalSigns.getHighBloodPressure() >= 100){
                row[0] = encounter.patient.person.getName();
                row[1] = encounter.patient.person.getAge();
                row[2] = encounter.patient.person.getGender();
                row[3] = encounter.patient.person.getPhoneNumber();
                row[4] = encounter.patient. person.getBloodgroup();
                row[5] = encounter.patient.person.address.getHouseNumber();
                row[6] = encounter.patient.person.address.getCommunityName();
                row[7] = encounter.patient.person.address.getCityName();
                row[8] = encounter.patient.person.address.getState();
                row[9] = encounter.patient.person.address.getZip();
                row[10] = encounter.vitalSigns.getHeartRate();
                row[11] = encounter.vitalSigns.getHighBloodPressure();
                row[12] = encounter.vitalSigns.getOxygenLevel();
                row[13] = encounter.vitalSigns.getBodytemprature();
                row[14] = encounter.visitDate;
                model.addRow(row);
        }
        }else if(encounter.patient.person.getAge() > 1 && encounter.patient.person.getAge() <= 3){
            if(encounter.vitalSigns.getHighBloodPressure() < 80 || encounter.vitalSigns.getHighBloodPressure() >= 110){
                row[0] = encounter.patient.person.getName();
                row[1] = encounter.patient.person.getAge();
                row[2] = encounter.patient.person.getGender();
                row[3] = encounter.patient.person.getPhoneNumber();
                row[4] = encounter.patient. person.getBloodgroup();
                row[5] = encounter.patient.person.address.getHouseNumber();
                row[6] = encounter.patient.person.address.getCommunityName();
                row[7] = encounter.patient.person.address.getCityName();
                row[8] = encounter.patient.person.address.getState();
                row[9] = encounter.patient.person.address.getZip();
                row[10] = encounter.vitalSigns.getHeartRate();
                row[11] = encounter.vitalSigns.getHighBloodPressure();
                row[12] = encounter.vitalSigns.getOxygenLevel();
                row[13] = encounter.vitalSigns.getBodytemprature();
                row[14] = encounter.visitDate;
                model.addRow(row);
        }
        }else if(encounter.patient.person.getAge() > 3 && encounter.patient.person.getAge() <= 5){
            if(encounter.vitalSigns.getHighBloodPressure() < 80 || encounter.vitalSigns.getHighBloodPressure() >= 110){
                row[0] = encounter.patient.person.getName();
                row[1] = encounter.patient.person.getAge();
                row[2] = encounter.patient.person.getGender();
                row[3] = encounter.patient.person.getPhoneNumber();
                row[4] = encounter.patient. person.getBloodgroup();
                row[5] = encounter.patient.person.address.getHouseNumber();
                row[6] = encounter.patient.person.address.getCommunityName();
                row[7] = encounter.patient.person.address.getCityName();
                row[8] = encounter.patient.person.address.getState();
                row[9] = encounter.patient.person.address.getZip();
                row[10] = encounter.vitalSigns.getHeartRate();
                row[11] = encounter.vitalSigns.getHighBloodPressure();
                row[12] = encounter.vitalSigns.getOxygenLevel();
                row[13] = encounter.vitalSigns.getBodytemprature();
                row[14] = encounter.visitDate;
                model.addRow(row);
        }
        }else if(encounter.patient.person.getAge() > 5 && encounter.patient.person.getAge() <= 12){
            if(encounter.vitalSigns.getHighBloodPressure() < 80 || encounter.vitalSigns.getHighBloodPressure() >= 120){
                row[0] = encounter.patient.person.getName();
                row[1] = encounter.patient.person.getAge();
                row[2] = encounter.patient.person.getGender();
                row[3] = encounter.patient.person.getPhoneNumber();
                row[4] = encounter.patient. person.getBloodgroup();
                row[5] = encounter.patient.person.address.getHouseNumber();
                row[6] = encounter.patient.person.address.getCommunityName();
                row[7] = encounter.patient.person.address.getCityName();
                row[8] = encounter.patient.person.address.getState();
                row[9] = encounter.patient.person.address.getZip();
                row[10] = encounter.vitalSigns.getHeartRate();
                row[11] = encounter.vitalSigns.getHighBloodPressure();
                row[12] = encounter.vitalSigns.getOxygenLevel();
                row[13] = encounter.vitalSigns.getBodytemprature();
                row[14] = encounter.visitDate;
                model.addRow(row);
        }
        }else if(encounter.patient.person.getAge() > 12 ){
            if(encounter.vitalSigns.getHighBloodPressure() < 110 || encounter.vitalSigns.getHighBloodPressure() >= 120){
                row[0] = encounter.patient.person.getName();
                row[1] = encounter.patient.person.getAge();
                row[2] = encounter.patient.person.getGender();
                row[3] = encounter.patient.person.getPhoneNumber();
                row[4] = encounter.patient. person.getBloodgroup();
                row[5] = encounter.patient.person.address.getHouseNumber();
                row[6] = encounter.patient.person.address.getCommunityName();
                row[7] = encounter.patient.person.address.getCityName();
                row[8] = encounter.patient.person.address.getState();
                row[9] = encounter.patient.person.address.getZip();
                row[10] = encounter.vitalSigns.getHeartRate();
                row[11] = encounter.vitalSigns.getHighBloodPressure();
                row[12] = encounter.vitalSigns.getOxygenLevel();
                row[13] = encounter.vitalSigns.getBodytemprature();
                row[14] = encounter.visitDate;
                model.addRow(row);
        }
        }
        }
    }
    }
    
    
    public void dropdownCity() {
        ArrayList<String> cityDropdown = new ArrayList<>();
        for (String cityValue : City.cityValues) {
            cityDropdown.add(String.valueOf(cityValue));
        }
        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
        DefaultComboBoxModel<String> SDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        comboCity.setModel(SDropdownModel);
    }

    public void dropdownCommunity() {
        ArrayList<String> communityDropdown = new ArrayList<>();
        City.communityDir.stream().filter(communityValue -> (communityValue.cityName == null ? comboCity.getSelectedItem().toString() == null : communityValue.cityName.equals(comboCity.getSelectedItem().toString()))).forEachOrdered(communityValue -> {
            communityDropdown.add(String.valueOf(communityValue.communityName));
        });
        String[] citySDropdown = communityDropdown.toArray(new String[communityDropdown.size()]);
        DefaultComboBoxModel<String> SDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        this.comboCommunity.setModel(SDropdownModel);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterHistory = new javax.swing.JTable();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        btnAbnormal = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 153, 153));

        tblEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "PhoneNumber", "Blood Group", "House Number", "Community", "City", "State", "Zip", "Heart Rate", "Blood Pressure", "Respiratory Rate", "Body Temprature", "Visit Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEncounterHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncounterHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEncounterHistory);

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setText("City :");

        comboCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCommunity.setText("Community  :");

        comboCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        comboCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCommunityActionPerformed(evt);
            }
        });

        btnAbnormal.setText("SEARCH ABNORMAL");
        btnAbnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnAbnormal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAbnormal)
                .addContainerGap(422, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblEncounterHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncounterHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEncounterHistoryMouseClicked

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed

    private void comboCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCommunityActionPerformed

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        // TODO add your handling code here:
        this.dropdownCommunity();
    }//GEN-LAST:event_comboCityItemStateChanged

    private void btnAbnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalActionPerformed
        // TODO add your handling code here:
        openAbnromalPatient();
    }//GEN-LAST:event_btnAbnormalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbnormal;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JTable tblEncounterHistory;
    // End of variables declaration//GEN-END:variables
}
