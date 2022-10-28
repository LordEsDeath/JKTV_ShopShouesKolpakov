/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import enitity.ShopItem;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ItemManager {
     private final Scanner scanner;
     
public ItemManager(){
     scanner = new Scanner(System.in);
}

public ShopItem addItem(){
                    ShopItem item = new ShopItem();
                    System.out.println("Введите название обуви: ");
                    item.setName(scanner.nextLine());
                    System.out.println("Укажите Цену: ");
                    item.setPrice(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Укажите количество Продуктов: ");
                    item.setAmount(scanner.nextInt());
                    scanner.nextLine();
         return item;


}
public void printListItems(ShopItem[] items){
    
for(int i = 0; i < items.length; i++) {
    ShopItem item1 = items[i];
    System.out.printf(i+" - "+1+". " +item1.getName()+ " ,"+ item1.getPrice()+" $ ,"+ item1.getAmount()+ "штук.");}
}
}