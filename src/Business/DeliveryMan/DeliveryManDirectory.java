/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import UI.MainJFrame;
import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;
    
    public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan newDeliveryMan(String name, String address, String email, String phoneNumber, int age, String userName) {
        DeliveryMan deliveryMan = new DeliveryMan(name, address, email, phoneNumber, age, userName);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
        MainJFrame.ecoSystem.userAccountDirectory.removeUserAccount(deliveryMan.getUserName());
    }
}
