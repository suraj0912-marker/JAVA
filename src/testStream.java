import java.util.List;

public class testStream {
    public static void main(String[] args) {
        List<String>names=List.of("suraj","rahul","ajay");
        names.stream().forEach(name-> System.out.println(name));
    }
}
 