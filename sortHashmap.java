import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sortHashmap {
    public static void main(String[] args) {
            Map<String,Integer> scores=new HashMap<>();
            scores.put("Raja",10);
            scores.put("Javed", 198);
            scores.put("Malinga", 0);
            System.out.println("scores"+scores);
            scores=sortByValue(scores);



    }
    private static Map<String,Integer>sortByValue(Map<String,Integer>scores){
        Map<String,Integer>sortedByValue=new LinkedHashMap<>();
        
    }
}
