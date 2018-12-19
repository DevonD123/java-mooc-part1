/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> list = new ArrayList<Book>();

    public void addBook(String title, String publisher, int year){
        this.list.add(new Book(title,publisher,year));
    }
    public void addBook(Book newBook){
        this.list.add(newBook);
    }
    
    public void printBooks(){
        for (Book book : list) {
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : list) {
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : list) {
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : list) {
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}
