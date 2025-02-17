package OOPs.Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Books: ");
        for (Book book : books) {
            System.out.println(book.GetBookInfo());
        }
    }
}
