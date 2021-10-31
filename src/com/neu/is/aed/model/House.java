/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.model;

/**
 *
 * @author vidhi
 */
public class House extends Community{
    public int houseNumber;
    public int zip;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }


    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

   
}
