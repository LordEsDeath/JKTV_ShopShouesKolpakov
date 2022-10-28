/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.Scanner;
import enitity.buyer;
/**
 *
 * @author pupil
 */

public class BuyerManager {
    private Scanner scanner;

    public BuyerManager() {
        scanner = new Scanner(System.in);
    }
    
    public buyer createBuyer(){
        buyer buyers = new buyer();
        System.out.print("Имя покупателя: ");
        buyers.setFirstname(scanner.nextLine());
        System.out.print("Фамилия покупателя: ");
        buyers.setLastname(scanner.nextLine());
        System.out.println("Телефон покупателя: ");
        buyers.setPhone(scanner.nextLine());
        System.out.println("Его баланc: ");
        buyers.setBalance(scanner.nextInt());
        scanner.nextLine();
        return buyers;
    } 
    
    public void printListBuyers(buyer[] Buyers){
        for (int i = 0; i < Buyers.length; i++) {
            System.out.printf("%d. %s %s. Телефон: %s%n. Баланц: %d"
                    ,i+1
                    ,Buyers[i].getFirstname()
                    , Buyers[i].getLastname()
                    , Buyers[i].getPhone()
                    , Buyers[i].getBalance()
            );
        }
    }
    public buyer[] addMoney(buyer[] buyers){
        System.out.print("Имя покупателя: ");
        String name =  scanner.nextLine();
        
        System.out.println("Сколько денег добавим: ");
        int money =  scanner.nextInt();
        scanner.nextLine();
        
        for(buyer b: buyers ){
            if(b.getFirstname().equals(name)){
            b.setBalance(money+b.getBalance());
            break;
        }
            
        }
        return buyers;
    }

    
}
