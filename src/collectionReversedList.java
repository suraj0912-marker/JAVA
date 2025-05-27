import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionReversedList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Rahul","suraj","Pawan");
        ReversedList(list);
        System.out.println(list);

    }
    public static void ReversedList( List<String> list){
        Collections.reverse(list);
    }
}
