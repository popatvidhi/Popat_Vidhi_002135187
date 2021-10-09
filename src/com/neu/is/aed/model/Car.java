/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.model;

import java.util.Date;

/**
 *
 * @author vidhi
 */
public class Car {
    String brandName;
    String carName;
    String modelNumber;
    String serialNumber;
    int manufactureYear;
    int MaxNumberOfSeats;
    int MinNumberOfSeats;
    boolean isAvailable;
    String city; 
    String certificateExpiration;

    public Car() {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMaxNumberOfSeats() {
        return MaxNumberOfSeats;
    }

    public void setMaxNumberOfSeats(int MaxNumberOfSeats) {
        this.MaxNumberOfSeats = MaxNumberOfSeats;
    }

    public int getMinNumberOfSeats() {
        return MinNumberOfSeats;
    }

    public void setMinNumberOfSeats(int MinNumberOfSeats) {
        this.MinNumberOfSeats = MinNumberOfSeats;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCertificateExpiration() {
        return certificateExpiration;
    }

    public void setCertificateExpiration(String certificateExpiration) {
        this.certificateExpiration = certificateExpiration;
    }
    
    public Car(String carName, String brandName, String modelNumber, String serialNumber, int manufactureYear, int MaxNumberOfSeats, int MinNumberOfSeats, boolean isAvailable, String city, String certificateExpiration) {
        this.carName = carName;
        this.brandName = brandName;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.manufactureYear = manufactureYear;
        this.MaxNumberOfSeats = MaxNumberOfSeats;
        this.MinNumberOfSeats = MinNumberOfSeats;
        this.isAvailable = isAvailable;
        this.city = city;
        this.certificateExpiration = certificateExpiration;
        
    }
}
