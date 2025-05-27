import java.util.Collection;

public class printCollection {
   public static <E> void print(Collection <E> collection){
       for (E coll : collection) {
           System.out.println("collection is:");
           System.out.printf("%s",coll);

       }
       System.out.println();
    }
}
