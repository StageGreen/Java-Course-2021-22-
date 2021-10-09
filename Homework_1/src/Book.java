import java.util.Comparator;

public class Book implements Comparable<Book> {

    public String name;
    public int price;
    public book_type type;

    public Book(String _name, int _price, book_type _type)
    {
        name = _name;
        price = _price;
        type = _type;
    }

    @Override
    public int compareTo(Book book) {

        return this.name.compareTo(book.name);
    }

    public static Comparator<Book> bookPrice =
            new Comparator<Book>() {
                @Override
                public int compare(Book book1, Book book2) {
                    return Integer.compare(book1.price, book2.price);
                }
            };

    public static Comparator<Book> bookType =
            new Comparator<Book>() {
                @Override
                public int compare(Book book1, Book book2) {
                    return book1.type.compareTo(book2.type);
                }
            };

}
