import java.util.ArrayList;
import java.util.List;

public class testingList {
    public static void main(String[] args) {
        List strList = new ArrayList() ;
        strList.add("suraj");
        strList.add("behra");

        strList.add(1,"Pawan");
        strList.remove(0);
        for (int i = 0; i <strList.size() ; i++) {
            System.out.print(strList.get(i));
        }


    }
}
