import java.util.*;

public class Library {
    public String address;
    public int area;
    ArrayList<Book> books;

    public Library(String _address, int _area)
    {
        address = _address;
        area = _area;
        books = new ArrayList<Book>();
    }

    public void addBook(String name, int price, book_type type)
    {
        books.add(new Book(name, price, type));
    }

    public void removeBook(String _name)
    {
        books.removeIf(element -> (element.name.equals(_name)));
    }

    public void displayBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("There are no books!");
        }
        else
        {
            ListIterator<Book> It = books.listIterator();
            while (It.hasNext())
            {
                Book book= It.next();
                System.out.println(book.name + ", " + book.price + " BGN, " + book.type);
            }
        }

    }


    public void displayBooksReversed()
    {
        if (books.isEmpty())
        {
            System.out.println("There are no books!");
        }
        else
        {
            ListIterator<Book> It = books.listIterator(books.size());
            while (It.hasPrevious())
            {
                Book book= It.previous();
                System.out.println(book.name + ", " + book.price + " BGN, " + book.type);
            }
        }
    }

    public Book getMostExpensiveBook()
    {
        if(books.isEmpty())
        {
            System.out.println("No books!");
            return null;
        };
        Book max = books.get(0);
        for(Book book : books)
        {
            if(book.price > max.price)
                max = book;
        }
        return max;
    }

    public void sortBooksByName()
    {
        Collections.sort(books);
    }

    public void sortBooksByNameReverse()
    {
        Collections.sort(books, Collections.reverseOrder());
    }

    public Book lastBookByName()
    {
        List<Book> copyBooks = new ArrayList<Book>(books);
        Collections.sort(copyBooks);
        return copyBooks.get(copyBooks.size()-1);
    }

    public void sortBooksByPrice()
    {
        Collections.sort(books, Book.bookPrice);
    }

    public void sortBooksByTypeAndByPriceReverse() {
        Collections
                .sort(books,
                        Book.bookType
                                .thenComparing(Book.bookPrice.reversed()));
    }

}
