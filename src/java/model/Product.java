/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo Y50-70
 */
public class Product {
    
    private int id;
    private String desc;
    private String num;
    private String type;

    public Product() {
        this.id = 0;
        this.desc = "";
        this.num = "";
        this.type = "";
    }

    public Product(int id, String desc, String num, String type) {
        this.id = id;
        this.desc = desc;
        this.num = num;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
