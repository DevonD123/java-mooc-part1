/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Book implements ToBeStored{
    private double weight;
    private String name;
    private String writer;

    public Book(String writer, String name,double weight) {
        this.weight = weight;
        this.name = name;
        this.writer = writer;
    }
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.writer +": "+this.name;
    }
}
