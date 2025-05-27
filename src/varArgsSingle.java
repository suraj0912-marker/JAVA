 class varArgsSingle {
     public static void main(String[] args) {
         System.out.println(concatenate("suraj"));
         System.out.println(concatenate("behra"));

         System.out.println(concatenate("welcome to the my world"));
     }
    public static String concatenate(String...strs){


        StringBuilder sb=new StringBuilder();
        for (String str : strs) {
            sb.append(str).append("");

        }
        return sb.toString();

    }
}
