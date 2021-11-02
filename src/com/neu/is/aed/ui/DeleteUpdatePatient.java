/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.ui;

import com.neu.is.aed.model.Encounter;
import com.neu.is.aed.model.EncounterHistory;
import com.neu.is.aed.model.PatientDirectory;
import com.neu.is.aed.model.Person;
import com.neu.is.aed.model.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author vidhi
 */
public class DeleteUpdatePatient extends javax.swing.JPanel {

    /**
     * Creates new form DeleteUpdatePerson
     */
    String missingField = "Missing Field: ";
    Encounter encounter = new Encounter();
    int row;
    public DeleteUpdatePatient() {
        initComponents();
        loadEncounterTable();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterHistory = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblSetGender = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        lblBloodGroup = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblSetAge = new javax.swing.JLabel();
        lblSetName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSetBloodGroup = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblBodyTemprature = new javax.swing.JLabel();
        lblSetPatientID = new javax.swing.JLabel();
        lblRespiratoryRate = new javax.swing.JLabel();
        lblHighBloodPressure = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblSetHeartRate = new javax.swing.JLabel();
        lblSetHighBloodPressure = new javax.swing.JLabel();
        lblSetRespiratoryRate = new javax.swing.JLabel();
        lblSetBodyTemprature = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtHouseNumber = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        lblVisitDate = new javax.swing.JLabel();
        lblSetVisitDate = new javax.swing.JLabel();

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

        btnDelete.setText("DELETE PATIENT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE PATIENT");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblSetGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblZip.setText("Zip :");
        lblZip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblState.setText("State :");
        lblState.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCity.setText("City :");
        lblCity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCommunity.setText("Community :");
        lblCommunity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHouseNumber.setText("House Number :");
        lblHouseNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBloodGroup.setText("Blood Group :");
        lblBloodGroup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPhoneNumber.setText("Phone Number :");
        lblPhoneNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblGender.setText("Gender :");
        lblGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblName.setText("Name :");
        lblName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetBloodGroup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAge.setText("Age :");
        lblAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBodyTemprature.setText("Body Temprature :");
        lblBodyTemprature.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetPatientID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRespiratoryRate.setText("Respiratory Rate :");
        lblRespiratoryRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHighBloodPressure.setText("High Blood Pressure :");
        lblHighBloodPressure.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPatientID.setText("Patient ID :");
        lblPatientID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHeartRate.setText("Heart Rate :");
        lblHeartRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetHeartRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetHighBloodPressure.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetRespiratoryRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetBodyTemprature.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtHouseNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseNumberActionPerformed(evt);
            }
        });

        txtCommunity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        txtCity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtState.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        txtZip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });

        lblVisitDate.setText("Visit Date :");
        lblVisitDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSetVisitDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHighBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeartRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRespiratoryRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBodyTemprature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSetPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(lblSetHeartRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSetHighBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSetRespiratoryRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSetBodyTemprature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSetVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBloodGroup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHouseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblState, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSetGender, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(lblSetBloodGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(lblSetName, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(lblSetAge, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtHouseNumber)
                            .addComponent(txtCommunity)
                            .addComponent(txtCity)
                            .addComponent(txtState)
                            .addComponent(txtZip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(lblSetName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAge))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSetAge, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSetGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBloodGroup)
                            .addComponent(lblSetBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHouseNumber)
                            .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZip)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientID)
                            .addComponent(lblSetPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeartRate)
                            .addComponent(lblSetHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHighBloodPressure)
                            .addComponent(lblSetHighBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRespiratoryRate)
                            .addComponent(lblSetRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBodyTemprature)
                            .addComponent(lblSetBodyTemprature, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVisitDate)
                            .addComponent(lblSetVisitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDelete))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblEncounterHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncounterHistoryMouseClicked
        // TODO add your handling code here:
        row = tblEncounterHistory.rowAtPoint(evt.getPoint());
        this.encounter = EncounterHistory.encounterHistory.get(row);
        openSelectedEncounter();
        
    }//GEN-LAST:event_tblEncounterHistoryMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        EncounterHistory.encounterHistory.remove(this.encounter);
        loadEncounterTable();
        JOptionPane.showMessageDialog(this, "Patient Deleted Successfully");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(isValidData() == true){
        encounter.patient.person.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
        encounter.patient.person.address.setHouseNumber(Integer.parseInt(txtHouseNumber.getText()));
        encounter.patient.person.address.setCommunityName(txtCommunity.getText());
        encounter.patient.person.address.setCityName(txtCity.getText());
        encounter.patient.person.address.setState(txtState.getText());
        encounter.patient.person.address.setZip(Integer.parseInt(txtZip.getText()));
        loadEncounterTable();
        JOptionPane.showMessageDialog(this, "Patient Updated Successfully");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNumberActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed
    
    public void openSelectedEncounter(){
        
        lblSetName.setText(this.encounter.patient.person.getName());
        lblSetAge.setText(String.valueOf(this.encounter.patient.person.getAge()));
        lblSetGender.setText(this.encounter.patient.person.getGender());
        txtPhoneNumber.setText(String.valueOf(this.encounter.patient.person.getPhoneNumber()));
        lblSetBloodGroup.setText(this.encounter.patient.person.getBloodgroup());
        txtHouseNumber.setText(String.valueOf(this.encounter.patient.person.address.getHouseNumber()));
        txtCommunity.setText(this.encounter.patient.person.address.getCommunityName());
        txtCity.setText(this.encounter.patient.person.address.getCityName());
        txtState.setText(this.encounter.patient.person.address.getState());
        txtZip.setText(String.valueOf(this.encounter.patient.person.address.getZip()));
        lblSetPatientID.setText(String.valueOf(this.encounter.patient.getPatientId()));
        lblSetHeartRate.setText(String.valueOf(this.encounter.vitalSigns.getHeartRate()));
        lblSetHighBloodPressure.setText(String.valueOf(this.encounter.vitalSigns.getHighBloodPressure()));
        lblSetRespiratoryRate.setText(String.valueOf(this.encounter.vitalSigns.getOxygenLevel()));
        lblSetBodyTemprature.setText(String.valueOf(this.encounter.vitalSigns.getBodytemprature()));
        lblSetVisitDate.setText(this.encounter.visitDate.toString());
    }
    
    private boolean isValidData() {

        boolean isValid = false;
        if(txtPhoneNumber.getText().isBlank()){
            JOptionPane.showMessageDialog(this, missingField + lblPhoneNumber.getText(), lblPhoneNumber.getText(), JOptionPane.ERROR_MESSAGE);          
        }else if(txtHouseNumber.getText().isBlank()){
            JOptionPane.showMessageDialog(this, missingField + lblHouseNumber.getText(), lblHouseNumber.getText(), JOptionPane.ERROR_MESSAGE);          
        }else if(txtCommunity.getText().isBlank()){
            JOptionPane.showMessageDialog(this, missingField + lblCommunity.getText(), lblCommunity.getText(), JOptionPane.ERROR_MESSAGE);          
        }else if(txtCity.getText().isBlank()){
            JOptionPane.showMessageDialog(this, missingField + lblCity.getText(), lblCity.getText(), JOptionPane.ERROR_MESSAGE);          
        }else if(txtState.getText().isBlank()){
            JOptionPane.showMessageDialog(this, missingField + lblState.getText(), lblState.getText(), JOptionPane.ERROR_MESSAGE);          
        }else if(txtZip.getText().isBlank()){
            JOptionPane.showMessageDialog(this, missingField + lblZip.getText(), lblZip.getText(), JOptionPane.ERROR_MESSAGE);          
        }else{
            return isValid = true;
        }
        return isValid;
    }

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblBodyTemprature;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHighBloodPressure;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblSetAge;
    private javax.swing.JLabel lblSetBloodGroup;
    private javax.swing.JLabel lblSetBodyTemprature;
    private javax.swing.JLabel lblSetGender;
    private javax.swing.JLabel lblSetHeartRate;
    private javax.swing.JLabel lblSetHighBloodPressure;
    private javax.swing.JLabel lblSetName;
    private javax.swing.JLabel lblSetPatientID;
    private javax.swing.JLabel lblSetRespiratoryRate;
    private javax.swing.JLabel lblSetVisitDate;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblVisitDate;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTable tblEncounterHistory;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
