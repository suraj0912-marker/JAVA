public class ReverseDigit {
    public static void main(String[] args) {
        String original=" 123";
        String reversed=reverse(original);
        System.out.println(" ReversedString:"+ reversed);
    }
    public static String reverse(String str){
        StringBuilder Reversed= new StringBuilder(str);
        return Reversed.reverse().toString();
    }
}
