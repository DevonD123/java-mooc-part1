package dictionary;

public class Main {
    public static void main(String[] args) {
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();
        dict.add("hied","word");
        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("ohjelmointi") );
        System.out.println( dict.translate("alla oleva") );
        boolean didSave = dict.save();
        if(didSave){
            System.out.println("Save success");
        }
    }
}
