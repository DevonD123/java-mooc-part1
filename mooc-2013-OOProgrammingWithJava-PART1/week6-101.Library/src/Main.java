import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    
    Library k = new Library(); 
Book book1 = new Book("Core Java", "Addison Wesley", 2001);
Book book2 = new Book("Test Driven Development", "Addison Wesley", 2001);
Book book3 = new Book("Java Poweruser Guide", "Prentice Hall", 2012);
k.addBook(book1);
k.addBook(book2);
k.addBook(book3);
k.searchByTitle("Java");
  
    }}
