/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.ui;

import com.neu.is.aed.model.Car;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidhi
 */
public class SearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    //Icon icon = new ImageIcon("/Users/vidhi/Desktop/NEU/Semester 1/AED/Assignment02/image.png");
    ArrayList<Car> cars = new ArrayList<Car>();
    Car car;
    public SearchPanel(ArrayList<Car> cars) {
        initComponents();
        this.cars = cars;
    }
    
    /*public void loadTable(){
    int rowCount = tblCars.getRowCount();
    DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
    for(int i=rowCount - 1;i>=0;i--){
        model.removeRow(i);
    }
    for(Car car: cars){
        Object row[] = new Object[10];
        row[0] = car.getCarName();
        row[1] = car.getBrandName();
        row[2] = car.getModelNumber();
        row[3] = car.getSerialNumber();
        row[4] = car.getManufactureYear();
        row[5] = car.getMaxNumberOfSeats();
        row[6] = car.getMinNumberOfSeats();
        row[7] = car.isIsAvailable();
        row[8] = car.getCertificateExpiration();
        row[9] = car.getCity();
        model.addRow(row);
    }
    }*/
    public void brandName(){
        String brandName = String.valueOf(comboBrandName.getSelectedItem());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getBrandName() == brandName ){
                Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
        } 
    }
    public void carYesAvailable(){
        String brandName = String.valueOf(comboBrandName.getSelectedItem());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.isIsAvailable() == true ){
                 Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
        }     
    }
    public void carNoAvailable(){
        String brandName = String.valueOf(comboBrandName.getSelectedItem());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.isIsAvailable() == false ){
                Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
        }     
    }
    public void manufactureYear(){
        int year = Integer.parseInt(txtManufactureYear.getText());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getManufactureYear() == year ){
                Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
        } 
    }
    public void minMaxSeats(){
        int min = Integer.parseInt(txtMinSeats.getText());
        int max = Integer.parseInt(txtMaxSeats.getText());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getMinNumberOfSeats() == min && car.getMaxNumberOfSeats() <= max ) {
                Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
        } 
    }
    
    public void serialNumber(){
        String serialNo = txtSerialNumber.getText();
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getSerialNumber().equals(serialNo)) {
                Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
        } 
    }
    
    public void modelNumber(){
        String modelNo = txtModelNumber.getText();
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getModelNumber().equals(modelNo)) {
                Object row[] = new Object[10];
                row[0] = car.getCarName();
                row[1] = car.getBrandName();
                row[2] = car.getModelNumber();
                row[3] = car.getSerialNumber();
                row[4] = car.getManufactureYear();
                row[5] = car.getMaxNumberOfSeats();
                row[6] = car.getMinNumberOfSeats();
                row[7] = car.isIsAvailable();
                row[8] = car.getCertificateExpiration();
                row[9] = car.getCity();
                model.addRow(row);
            }
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
        tblCars = new javax.swing.JTable();
        lblBrandName = new javax.swing.JLabel();
        comboBrandName = new javax.swing.JComboBox<>();
        btnBrandName = new javax.swing.JButton();
        lblAvailableCars = new javax.swing.JLabel();
        btnYesAvailable = new javax.swing.JButton();
        btnNoAvailable = new javax.swing.JButton();
        lblManufactureYear = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblMinSeats = new javax.swing.JLabel();
        txtMinSeats = new javax.swing.JTextField();
        lblMaxSeats = new javax.swing.JLabel();
        txtMaxSeats = new javax.swing.JTextField();
        btnMinMaxSeats = new javax.swing.JButton();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        btnSerialNumber = new javax.swing.JButton();
        lblModelNumber = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        btnModelNumber = new javax.swing.JButton();

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car", "Brand", "Model number", "Serial number", "Manufacture year", "Maximum no. of seats", "Minimum no. of seats", "Availability", "Maintenance certificate expiry date", "Available in City "
            }
        ));
        jScrollPane1.setViewportView(tblCars);

        lblBrandName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrandName.setText("Brand Name :");

        comboBrandName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acura", "Audi", "Bentley", "BMW", "Chervolet", "Chrysler", "FIAT", "Ford", "Ferari", "Honda", "Hyundai", "Jaguar", "Jeep", "Kia", "Lamborghini", "Lincoln", "Maserati", "Mazda", "Mercedes-Benz", "Mercury", "Nissan", "Renault", "Skoda", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));

        btnBrandName.setText("Brand Filter");
        btnBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandNameActionPerformed(evt);
            }
        });

        lblAvailableCars.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvailableCars.setText("Availability :");

        btnYesAvailable.setText("Yes");
        btnYesAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesAvailableActionPerformed(evt);
            }
        });

        btnNoAvailable.setText("No");
        btnNoAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoAvailableActionPerformed(evt);
            }
        });

        lblManufactureYear.setText("Manufacture Year :");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMinSeats.setText("MinSeats :");

        lblMaxSeats.setText("MaxSeats :");

        btnMinMaxSeats.setText("jButton2");
        btnMinMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMaxSeatsActionPerformed(evt);
            }
        });

        lblSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSerialNumber.setText("Serial Number :");

        btnSerialNumber.setText("jButton2");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelNumber.setText("Model Number :");

        btnModelNumber.setText("jButton2");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblManufactureYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAvailableCars, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrandName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMinSeats)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnYesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNoAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxSeats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnMinMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBrandName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))
                                    .addComponent(btnModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrandName)
                    .addComponent(comboBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrandName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableCars)
                    .addComponent(btnYesAvailable)
                    .addComponent(btnNoAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufactureYear)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinSeats)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxSeats)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinMaxSeats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerialNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModelNumber))
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandNameActionPerformed
        // TODO add your handling code here:
        brandName();
    }//GEN-LAST:event_btnBrandNameActionPerformed

    private void btnYesAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesAvailableActionPerformed
        // TODO add your handling code here:
        carYesAvailable();
    }//GEN-LAST:event_btnYesAvailableActionPerformed

    private void btnNoAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoAvailableActionPerformed
        // TODO add your handling code here:
        carNoAvailable();
    }//GEN-LAST:event_btnNoAvailableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        manufactureYear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMinMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinMaxSeatsActionPerformed
        // TODO add your handling code here:
        minMaxSeats();
    }//GEN-LAST:event_btnMinMaxSeatsActionPerformed

    private void btnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumberActionPerformed
        // TODO add your handling code here:
        serialNumber();
    }//GEN-LAST:event_btnSerialNumberActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        // TODO add your handling code here:
        modelNumber();
    }//GEN-LAST:event_btnModelNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandName;
    private javax.swing.JButton btnMinMaxSeats;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnNoAvailable;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton btnYesAvailable;
    private javax.swing.JComboBox<String> comboBrandName;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailableCars;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblMaxSeats;
    private javax.swing.JLabel lblMinSeats;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

}
