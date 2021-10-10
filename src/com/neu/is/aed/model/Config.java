/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.model;

import com.neu.is.aed.ui.CreatePanel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author vidhi
 */
public class Config {
    public static Properties prop = new Properties();
    
    public void saveProp() {
        try {
            prop.store(new FileOutputStream("config.txt"), null);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public Car getCar(String carNum) throws IOException {
        Car car = new Car();   
        String carNUmber = "car" + carNum;
        try {
            prop.load(new FileInputStream("config.txt"));
            car.setCarName(prop.getProperty(carNUmber + "Name"));
            car.setBrandName(prop.getProperty(carNUmber + "BrandName"));
            car.setModelNumber(prop.getProperty(carNUmber + "ModelNumber"));
            car.setSerialNumber(prop.getProperty(carNUmber + "SerialNumber"));
            car.setManufactureYear(Integer.parseInt(prop.getProperty(carNUmber + "ManufactureYear")));
            car.setMinNumberOfSeats(Integer.parseInt(prop.getProperty(carNUmber + "MinSeats")));
            car.setMaxNumberOfSeats(Integer.parseInt(prop.getProperty(carNUmber + "MaxSeats")));
            car.setIsAvailable(Boolean.valueOf(prop.getProperty(carNUmber + "IsAvailable")));
            car.setCertificateExpiration(prop.getProperty(carNUmber + "MaintenanceExpired"));
            car.setCity(prop.getProperty(carNUmber + "AvailableInCity"));
        } catch (FileNotFoundException ex) {

        }
        return car;
    }
}
