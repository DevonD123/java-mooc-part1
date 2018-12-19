public class Main {
  public static void main(String[] args) {
    // write test code here
        Person pekka = new Person("Pekka", 15, 2, 1983);
        Person martin = new Person("Martin", 1, 3, 1983);
        
//        Person p2 = new Person("P2", 30, 11, 1800);
//        Person test = new Person("Test",1,1,1800);
//        System.out.println( test.getName() + " is older than " +  p2.getName() + ": "+ test.olderThan(p2) );
//        System.out.println( p2.getName() + " is older than " +  test.getName() + ": "+ p2.olderThan(test) );


        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
        System.out.println(martin.age());
        System.out.println(pekka.age());
  }
}
