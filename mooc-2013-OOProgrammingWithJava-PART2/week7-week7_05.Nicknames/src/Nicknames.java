
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> myMap = new HashMap<String, String>();
        myMap.put( "matti","mage");
        myMap.put("mikael","mixu");
        myMap.put("arto","arppa");
        
        System.out.println(myMap.get("mikael"));
    }

}
