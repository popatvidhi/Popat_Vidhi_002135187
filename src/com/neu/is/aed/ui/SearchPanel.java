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
import javax.swing.JOptionPane;
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
    ArrayList<String> brandsName = new ArrayList<String>();
    Car car;
    public SearchPanel(ArrayList<Car> cars) {
        initComponents();
        this.cars = cars;
        
        for(Car car: cars){
            if (!brandsName.contains(car.getBrandName())) {
                brandsName.add(car.getBrandName());
            }
        }
    }
    
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
    
    public void carExpired(){
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getCertificateExpiration().equals("Expired")){
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
    
    public void carCertified(){
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getCertificateExpiration().equals("Certified")){
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
    
    public void availableInCity(){
        String city = String.valueOf(comboCity.getSelectedItem());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getCity() == city && car.isIsAvailable() == true){
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
    
    public void notAvailableInCity(){
        String city = String.valueOf(comboCity.getSelectedItem());
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.getCity() == city && car.isIsAvailable() == false){
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
    
    public void allManufacturers(){
        int rowCount = tblBrands.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblBrands.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(String brandName: brandsName){
                Object row[] = new Object[1];
                row[0] = brandName;
                model.addRow(row);
        }     
    }
    
    public void firstAvailableCar(){
        int rowCount = tblCars.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Car car: cars){
            if (car.isIsAvailable() == true){
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
                break;
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

        lblBrandName = new javax.swing.JLabel();
        comboBrandName = new javax.swing.JComboBox<>();
        btnBrandName = new javax.swing.JButton();
        lblAvailableCars = new javax.swing.JLabel();
        btnYesAvailable = new javax.swing.JButton();
        btnNoAvailable = new javax.swing.JButton();
        lblManufactureYear = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        btnManufactureYear = new javax.swing.JButton();
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
        lblMaintenanceCertificate = new javax.swing.JLabel();
        btnExpired = new javax.swing.JButton();
        btnCertified = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        btnAvailable = new javax.swing.JButton();
        btnNotAvailable = new javax.swing.JButton();
        btnAllManufacturers = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBrands = new javax.swing.JTable();
        btnFirstCar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLastUpdated = new javax.swing.JButton();

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

        lblManufactureYear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManufactureYear.setText("Manufacture Year :");

        btnManufactureYear.setText("jButton1");
        btnManufactureYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureYearActionPerformed(evt);
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

        lblMaintenanceCertificate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaintenanceCertificate.setText("Maintenance Cerificate :");

        btnExpired.setText("Expired");
        btnExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiredActionPerformed(evt);
            }
        });

        btnCertified.setText("Certified");
        btnCertified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertifiedActionPerformed(evt);
            }
        });

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City :");

        comboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose", "Detroit", "Jacksonville", "Indianapolis", "San Francisco", "Columbus", "Austin", "Memphis", "Fort Worth", "Baltimore", "Charlotte", "El Paso", "Boston", "Seattle", "Washington", "Milwaukee", "Denver", "Louisville/Jefferson County", "Las Vegas", "Nashville-Davidson", "Oklahoma City", "Portland", "Tucson", "Albuquerque", "Atlanta", "Long Beach", "Fresno", "Sacramento", "Mesa", "Kansas City", "Cleveland", "Virginia Beach", "Omaha", "Miami", "Oakland", "Tulsa", "Honolulu", "Minneapolis", "Colorado Springs", "Arlington", "Wichita", "Raleigh", "St. Louis", "Santa Ana", "Anaheim", "Tampa", "Cincinnati", "Pittsburgh", "Bakersfield", "Toledo", "Riverside", "Stockton", "Corpus Christi", "Newark", "Anchorage", "Buffalo", "St. Paul", "Plano", "Fort Wayne", "St. Petersburg", "Glendale", "Jersey City", "Lincoln", "Henderson", "Chandler", "Greensboro", "Scottsdale", "Baton Rouge", "Birmingham", "Norfolk", "Madison", "New Orleans", "Chesapeake", "Orlando", "Garland", "Hialeah", "Laredo", "Chula Vista", "Lubbock", "Reno", "Akron", "Durham", "Rochester", "Modesto", "Montgomery", "Fremont", "Shreveport", "Arlington", "Glendale" }));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        btnAvailable.setText("Available");
        btnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableActionPerformed(evt);
            }
        });

        btnNotAvailable.setText("Not Available");
        btnNotAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotAvailableActionPerformed(evt);
            }
        });

        btnAllManufacturers.setText("All manufacturer ");
        btnAllManufacturers.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAllManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllManufacturersActionPerformed(evt);
            }
        });

        tblBrands.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Brands"
            }
        ));
        jScrollPane2.setViewportView(tblBrands);

        btnFirstCar.setText("First Available Passenger Car");
        btnFirstCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstCarActionPerformed(evt);
            }
        });

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH CARS");

        btnLastUpdated.setText("Catalog Last Updated");
        btnLastUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastUpdatedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblManufactureYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAvailableCars, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBrandName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblMinSeats)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3))
                                            .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMaintenanceCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                                    .addComponent(btnAllManufacturers))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnYesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNoAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblMaxSeats)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMinMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExpired)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCertified))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBrandName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                .addGap(1, 1, 1))
                                            .addComponent(btnModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAvailable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNotAvailable))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFirstCar, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(btnLastUpdated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
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
                    .addComponent(btnManufactureYear))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintenanceCertificate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExpired)
                        .addComponent(btnCertified)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvailable)
                    .addComponent(btnNotAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAllManufacturers)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnFirstCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLastUpdated)
                .addContainerGap(200, Short.MAX_VALUE))
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

    private void btnManufactureYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufactureYearActionPerformed
        // TODO add your handling code here:
        manufactureYear();
    }//GEN-LAST:event_btnManufactureYearActionPerformed

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

    private void btnExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpiredActionPerformed
        // TODO add your handling code here:
        carExpired();
    }//GEN-LAST:event_btnExpiredActionPerformed

    private void btnCertifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertifiedActionPerformed
        // TODO add your handling code here:
        carCertified();
    }//GEN-LAST:event_btnCertifiedActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableActionPerformed
        // TODO add your handling code here:
        availableInCity();
    }//GEN-LAST:event_btnAvailableActionPerformed

    private void btnNotAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotAvailableActionPerformed
        // TODO add your handling code here:
        notAvailableInCity();
    }//GEN-LAST:event_btnNotAvailableActionPerformed

    private void btnAllManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllManufacturersActionPerformed
        // TODO add your handling code here:
        allManufacturers();
    }//GEN-LAST:event_btnAllManufacturersActionPerformed

    private void btnFirstCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstCarActionPerformed
        // TODO add your handling code here:
        firstAvailableCar();
    }//GEN-LAST:event_btnFirstCarActionPerformed

    private void btnLastUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastUpdatedActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Catalog fleet last updated on : " + car.lastUpdated);
        
    }//GEN-LAST:event_btnLastUpdatedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllManufacturers;
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnBrandName;
    private javax.swing.JButton btnCertified;
    private javax.swing.JButton btnExpired;
    private javax.swing.JButton btnFirstCar;
    private javax.swing.JButton btnLastUpdated;
    private javax.swing.JButton btnManufactureYear;
    private javax.swing.JButton btnMinMaxSeats;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnNoAvailable;
    private javax.swing.JButton btnNotAvailable;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton btnYesAvailable;
    private javax.swing.JComboBox<String> comboBrandName;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAvailableCars;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintenanceCertificate;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblMaxSeats;
    private javax.swing.JLabel lblMinSeats;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTable tblBrands;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

}
