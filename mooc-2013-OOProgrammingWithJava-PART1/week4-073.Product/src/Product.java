/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;
    
    public Product(String nameAtStart, double priceAtStart,int amountAtStar){
        this.amountAtStart = amountAtStar;
        this.priceAtStart = priceAtStart;
        this.nameAtStart = nameAtStart;
    }
    public void printProduct(){
        System.out.println(this.nameAtStart + ", price "+ this.priceAtStart+", amount "+this.amountAtStart);
    }
}
