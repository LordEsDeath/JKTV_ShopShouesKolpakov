/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitity;

/**
 *
 * @author pupil
 */
public class ShopItem {
    private String name;
    private int price;
    private int amount;
    private int size;

    public ShopItem() {
    }

    public ShopItem(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
       
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ShopItem{" + "name=" + name + ", price=" + price + ", amount=" + amount + '}';
    }

    public String getPrise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
