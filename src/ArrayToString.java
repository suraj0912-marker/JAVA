public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[]{"we","are","a","student"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append("");
        }
        System.out.println(sb);
    }
}