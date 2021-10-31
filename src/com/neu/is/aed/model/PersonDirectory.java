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
public class PersonDirectory {
    public static ArrayList<Person> personDir = new ArrayList<Person>();
    
    public static Person person1(){ 
        return new Person("Mayank Yadav", "4679992359", "Male", 23, "AB+", 41, "Boylston Street", "Boston", "MA", 02215);
    }
      
    public static Person person2(){ 
        return new Person("Akshata Jadhav", "4653992359", "Female", 25, "B+", 46, "Boylston Street", "Boston", "MA", 02215);
    }
    
    public static Person person3(){ 
        return new Person("Harsh Khanna", "2179992359", "Male", 25, "O+", 23, "Mass Avenue", "SFO", "CA", 34515);
    }
      
    public static Person person4(){ 
        return new Person("Milind Sharma", "4678762359", "Male", 24, "O-", 35, "Park Drive", "Boston", "MA", 02115);
    }
      
    public static Person person5(){ 
        return new Person("Anushka Desai", "3529992359", "Femaale", 23, "A-", 28, "New Jersey St", "New York", "NY", 03115);
    }
      
}

    
