/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.is.aed.model;

import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class City {
    public static String[] cityValues = {"Boston", "Salem", "Cambridge", "Worcester", "Plymouth", "Lowell"};
    public String cityName;
    public static ArrayList<Community> communityDir = new ArrayList<>();
    public String state;

    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
