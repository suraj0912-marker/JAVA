public class Book {
    static int totalNoofbook ;

    //note complete
    String author;
    String title;
    String  isbn;
    boolean isborrowed;
    static{
        totalNoofbook=0;
    }
    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
}
Book(String isbn){
    String unknown = "unknown";

}
static int getTotalNoofbook(){
        return totalNoofbook;
}
void isborrowed() {
    if (isborrowed) {
        System.out.println(" book is already borrowed");
    } else {
        System.out.println(" enjoy the book");
    }
    this.isborrowed = true;
}
void returnBook(){
        if(isborrowed){
            System.out.println(" book wapis kar");
        } else  {
            System.out.println("this book is already return");
        }

}

    public static void main(String[] args) {

    }
}
