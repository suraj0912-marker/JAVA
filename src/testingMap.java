import java.util.HashMap;
import java.util.Map;

public class testingMap {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("suraj",34);
        map.put("rahul",38);
        System.out.println(map.size());
        System.out.println(map.get("suraj"));
    }
}
