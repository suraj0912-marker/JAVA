package in.kgcoding.library;

public class LibraryItem {
    private  String itemId;
    private String title;
    private String  author;
    public void  checkout(){
        System.out.println("checkout");
    }
    public void retrunItem(){
        System.out.println(" returning the item");
    }
}
