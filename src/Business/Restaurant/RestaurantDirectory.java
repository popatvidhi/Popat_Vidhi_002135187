/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import UI.MainJFrame;
import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant newRestaurant(String name, String address, String mName, String phoneNumber, String userName) {
        Restaurant restaurant = new Restaurant(name, address, mName, phoneNumber, userName);
        restaurantDirectory.add(restaurant);
        return restaurant;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant);
        MainJFrame.ecoSystem.userAccountDirectory.removeUserAccount(restaurant.getUserName());
    }
    
    public Restaurant getRestaurant(String name) {
        for(Restaurant r : restaurantDirectory) {
            if(r.getRestaurantName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
}
