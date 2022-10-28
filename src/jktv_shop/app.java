
package jktv_shop;
import enitity.ShopItem;
import enitity.buyer;
import java.util.Arrays;
import java.util.Scanner;
import manager.BuyerManager;
import manager.ItemManager;

public class app {
     private Scanner scanner;
     private ItemManager itemManager;
     private BuyerManager buyerManager;
     private ShopItem[] items;
     private buyer[] buyers;
         
     
     
public app(){
     scanner = new Scanner(System.in);
     itemManager = new ItemManager();
     buyerManager = new BuyerManager();
     
     items = new ShopItem[0];
     buyers = new buyer[0];
     
}

public void run(){

    boolean repeat = true;
        do{
            System.out.println(" Выберите задачу из списка: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продаваемых продуктов");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Покупка товаров");
            System.out.println("6. Доход магазина за все время");
            System.out.println("7. Добавление денег покупателю");
        
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("0. Закрыть приложение");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить продукт");
                    createItem(itemManager.addItem());
                    break;
                case 2:
                    System.out.println("2. Список продаваемых продуктов");
                    itemManager.printListItems(items);
                    break;
                case 3:
                    System.out.println("3. Добавить покупателя");
                    addBuyer(buyerManager.createBuyer());
                    break;
                case 4:
                    System.out.println("4. Список покупателей");
                    buyerManager.printListBuyers(buyers);
                    break;
                case 5:
                    System.out.println("5. Покупка товаров");
                    break;
                case 6:
                    System.out.println("6. Доход магазина за все время");
                    break;
                case 7:
                    System.out.println("7. Добавление денег покупателю");
                    buyers = buyerManager.addMoney(buyers);
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");  

        
        
    }
private void createItem(ShopItem book){
        items = Arrays.copyOf(items, items.length+1);
        items[items.length-1] = book;
    }
private void addBuyer(buyer buyer) {
        buyers = Arrays.copyOf(buyers, buyers.length + 1);
        buyers[buyers.length - 1] = buyer;
    }

}
    
    


