package OOPs.Aggregation;

public class Main {
    public static void main(String[] args) {
        // represents " has a " relationship between objects
        // one obj contains another object as a part of its structure
        // but one contained objects can exist independently
        Book book1 = new Book("Money","Morgan",89);
        Book book2 = new Book("Finance","Housel",199);
        Book book3 = new Book("Marketing","Williams",299);


        Book[] books ={book1,book2,book3};

//        for (Book eachBook :books){
//            System.out.println(eachBook.GetBookInfo().toUpperCase() + " Pages");
//        }

        Library library = new Library("Money Books",2021,books);
        library.print();
    }
}
