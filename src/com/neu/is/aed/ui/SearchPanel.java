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
            if (car.getBrandName().equals(brandName)){
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
            if (car.getCity().equals(city) && car.isIsAvailable() == true){
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
            if (car.getCity().equals(city) && car.isIsAvailable() == false){
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

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBrandName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblBrandName.setForeground(new java.awt.Color(255, 255, 255));
        lblBrandName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrandName.setText("Brand Name :");

        comboBrandName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        comboBrandName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acura", "Audi", "Bentley", "BMW", "Chervolet", "Chrysler", "FIAT", "Ford", "Ferari", "Honda", "Hyundai", "Jaguar", "Jeep", "Kia", "Lamborghini", "Lincoln", "Maserati", "Mazda", "Mercedes-Benz", "Mercury", "Nissan", "Renault", "Skoda", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));

        btnBrandName.setText("Brand Filter");
        btnBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandNameActionPerformed(evt);
            }
        });

        lblAvailableCars.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAvailableCars.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailableCars.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvailableCars.setText("Availability :");

        btnYesAvailable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnYesAvailable.setText("Yes");
        btnYesAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesAvailableActionPerformed(evt);
            }
        });

        btnNoAvailable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnNoAvailable.setText("No");
        btnNoAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoAvailableActionPerformed(evt);
            }
        });

        lblManufactureYear.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblManufactureYear.setForeground(new java.awt.Color(255, 255, 255));
        lblManufactureYear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManufactureYear.setText("Manufacture Year :");

        txtManufactureYear.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btnManufactureYear.setText("jButton1");
        btnManufactureYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureYearActionPerformed(evt);
            }
        });

        lblMinSeats.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblMinSeats.setForeground(new java.awt.Color(255, 255, 255));
        lblMinSeats.setText("MinSeats :");

        txtMinSeats.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtMinSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinSeatsKeyTyped(evt);
            }
        });

        lblMaxSeats.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblMaxSeats.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxSeats.setText("MaxSeats :");

        txtMaxSeats.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtMaxSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaxSeatsKeyTyped(evt);
            }
        });

        btnMinMaxSeats.setText("jButton2");
        btnMinMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMaxSeatsActionPerformed(evt);
            }
        });

        lblSerialNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSerialNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSerialNumber.setText("Serial Number :");

        txtSerialNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtSerialNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialNumberKeyTyped(evt);
            }
        });

        btnSerialNumber.setText("jButton2");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        lblModelNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblModelNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelNumber.setText("Model Number :");

        txtModelNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btnModelNumber.setText("jButton2");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        lblMaintenanceCertificate.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblMaintenanceCertificate.setForeground(new java.awt.Color(255, 255, 255));
        lblMaintenanceCertificate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaintenanceCertificate.setText("Maintenance Cerificate :");

        btnExpired.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnExpired.setText("Expired");
        btnExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiredActionPerformed(evt);
            }
        });

        btnCertified.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnCertified.setText("Certified");
        btnCertified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertifiedActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City :");

        comboCity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        comboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose", "Detroit", "Jacksonville", "Indianapolis", "San Francisco", "Columbus", "Austin", "Memphis", "Fort Worth", "Baltimore", "Charlotte", "El Paso", "Boston", "Seattle", "Washington", "Milwaukee", "Denver", "Louisville/Jefferson County", "Las Vegas", "Nashville-Davidson", "Oklahoma City", "Portland", "Tucson", "Albuquerque", "Atlanta", "Long Beach", "Fresno", "Sacramento", "Mesa", "Kansas City", "Cleveland", "Virginia Beach", "Omaha", "Miami", "Oakland", "Tulsa", "Honolulu", "Minneapolis", "Colorado Springs", "Arlington", "Wichita", "Raleigh", "St. Louis", "Santa Ana", "Anaheim", "Tampa", "Cincinnati", "Pittsburgh", "Bakersfield", "Toledo", "Riverside", "Stockton", "Corpus Christi", "Newark", "Anchorage", "Buffalo", "St. Paul", "Plano", "Fort Wayne", "St. Petersburg", "Glendale", "Jersey City", "Lincoln", "Henderson", "Chandler", "Greensboro", "Scottsdale", "Baton Rouge", "Birmingham", "Norfolk", "Madison", "New Orleans", "Chesapeake", "Orlando", "Garland", "Hialeah", "Laredo", "Chula Vista", "Lubbock", "Reno", "Akron", "Durham", "Rochester", "Modesto", "Montgomery", "Fremont", "Shreveport", "Arlington", "Glendale" }));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        btnAvailable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAvailable.setText("Available");
        btnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableActionPerformed(evt);
            }
        });

        btnNotAvailable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnNotAvailable.setText("Not Available");
        btnNotAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotAvailableActionPerformed(evt);
            }
        });

        btnAllManufacturers.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAllManufacturers.setText("All manufacturer ");
        btnAllManufacturers.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAllManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllManufacturersActionPerformed(evt);
            }
        });

        tblBrands.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
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

        btnFirstCar.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH CARS");

        btnLastUpdated.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnLastUpdated.setText("Catalog Last Updated");
        btnLastUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastUpdatedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblManufactureYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAvailableCars, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrandName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblMinSeats)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))
                                    .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAllManufacturers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnYesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNoAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblMaxSeats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMinMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnExpired)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCertified))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBrandName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))
                                    .addComponent(btnModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAvailable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNotAvailable))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFirstCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLastUpdated, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrandName)
                    .addComponent(comboBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrandName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableCars)
                    .addComponent(btnYesAvailable)
                    .addComponent(btnNoAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufactureYear)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManufactureYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinSeats)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxSeats)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinMaxSeats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerialNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModelNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintenanceCertificate)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExpired)
                        .addComponent(btnCertified)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvailable)
                    .addComponent(btnNotAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAllManufacturers)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFirstCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLastUpdated)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(616, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
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

    private void txtMinSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinSeatsKeyTyped
        // TODO add your handling code here:
        char typedMinSeat = evt.getKeyChar();
        if(!Character.isDigit(typedMinSeat)){
            evt.consume();
        }
        //Restrict the length to 2 
        if(txtMinSeats.getText().length() > 1){
                evt.consume();
        }
    }//GEN-LAST:event_txtMinSeatsKeyTyped

    private void txtMaxSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxSeatsKeyTyped
        // TODO add your handling code here:
        char typedMaxSeat = evt.getKeyChar();
        if(!Character.isDigit(typedMaxSeat)){
            evt.consume();
        }
        //Restrict the length to 2 
        if(txtMaxSeats.getText().length() > 1){
                evt.consume();
        }
    }//GEN-LAST:event_txtMaxSeatsKeyTyped

    private void txtSerialNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNumberKeyTyped
        // TODO add your handling code here:
        //Restrict the length to 20 
        if(txtSerialNumber.getText().length() > 19){
                evt.consume();
        }
    }//GEN-LAST:event_txtSerialNumberKeyTyped

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
    private javax.swing.JPanel jPanel1;
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
