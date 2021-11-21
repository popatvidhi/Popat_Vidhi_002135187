/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuDirectory;

/**
 *
 * @author vidhi
 */
public class Restaurant {
    private String restaurantName;
    private String address;
    private String managerName;
    private String phoneNumber;
    private MenuDirectory MenuDirectory;
    private String userName;
    
    public Restaurant(String restaurantName, String address, String managerName, String phoneNumber, String userName) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public MenuDirectory getMenuDirectory() {
        return MenuDirectory;
    }

    public void setMenuDirectory(MenuDirectory MenuDirectory) {
        this.MenuDirectory = MenuDirectory;
    }
    
    

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    
    @Override
    public String toString() {
        return restaurantName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
}
