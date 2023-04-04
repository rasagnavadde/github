import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // Data Structures
        // Array, List

        Map<String, String> myStringMap = new HashMap<String, String>();

        myStringMap.put("telugu", "Dasara");
        myStringMap.put("hindi", "Pathaan");
        myStringMap.put("english", "John Wick");
        myStringMap.put("english", "Shazam");

        System.out.println(myStringMap);

        System.out.println(myStringMap.get("Pathaan"));

    }
}