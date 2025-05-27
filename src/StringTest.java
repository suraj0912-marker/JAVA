public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("first");
        sb.append( 45);
        sb.append(" now this is a Car ");
        sb.append(76.67);
        System.out.println(sb);
    }
}
