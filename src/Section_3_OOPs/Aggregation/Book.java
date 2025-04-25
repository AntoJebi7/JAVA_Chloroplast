package Section_3_OOPs.Aggregation;

public class Book {
    String title;
    String author;
    int pages;
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    String GetBookInfo(){
        return this.title + "\t" + this.author + "\t" + this.pages;
    }
}
