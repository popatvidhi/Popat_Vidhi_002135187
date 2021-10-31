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
public class Community extends City{
    public String communityName;
    public Date createdAt;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    public String validateCommunityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Community Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "Community Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid Community Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public Boolean alreadtExists(String city, String community) {
        Boolean found = false;
        for (int i = 0; i < City.communityDir.size(); i++) {
            if (city.equals(City.communityDir.get(i).cityName) && community.equals(City.communityDir.get(i).communityName)) {
                found = true;
            }
        }
        return found;
    }
    
}
