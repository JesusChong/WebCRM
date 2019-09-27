/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;

/**
 *
 * @author Lenovo Y50-70
 */
public class Customer implements Serializable{

private int id;
private String name;
private String email;
private String address;
private String phone;
private int User_id;

    public Customer() {
        this.id = 0;
        this.name = "";
        this.email = "";
        this.address = "";
        this.phone = "";
        this.User_id = 0;
    }

    public Customer(int id, String name, String email, String address, String phone, int User_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.User_id = User_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }
    
    
    
    
    

    
    


     
}
