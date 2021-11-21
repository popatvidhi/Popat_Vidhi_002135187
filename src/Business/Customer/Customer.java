/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author vidhi
 */
public class Customer {
    
    private String name;
    private int age;
    private String homeAddress;
    private String userName;
    private String email;
    private String phoneNumber;
    
    public Customer(String name, String email, String phoneNumber, int age, String homeAddress, String userName) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.homeAddress = homeAddress;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    @Override
    public String toString() {
        return userName;
    }
    
    
}
