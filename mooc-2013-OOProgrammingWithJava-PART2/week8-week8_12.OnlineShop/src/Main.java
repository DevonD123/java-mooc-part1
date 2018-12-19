import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // link list is faster to insert due to not copying everything into new tbl each insert
        // array list adding is slower but searching is faster as they are indexed
        
        //interfaces basically let you keep similar objects together in lists
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
       
    }
}
