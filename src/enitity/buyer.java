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
public class buyer {
    private String firstname;
    private String lastname;
    private String phone;
    private int balance;
    
    public buyer() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Покупатель{" + "Имя=" + firstname + ", Фамилие=" + lastname + ", Номер=" + phone + "Баланц"+ balance+'}';
    }
    
    
}
