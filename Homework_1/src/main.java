public class main {
    public static void main(String[] args) {

        //init library
        Library lib = new Library("Montevideo street, 21", 100);

        //fill Library with books
        lib.addBook("East of Eden", 25, book_type.novel);
        lib.addBook("A Clockwork Orange", 18, book_type.novel);
        lib.addBook("The Way Less Traveled", 20, book_type.story);
        lib.addBook("Cartwheels in a Sari", 5, book_type.story);
        lib.addBook("Bible", 10, book_type.story);
        lib.addBook("Mary Oliver", 7, book_type.poems);

        //remove one
        lib.removeBook("Bible");

        //reverse order display
        System.out.println("Books in reverse order of adding: ");
        lib.displayBooksReversed();
        System.out.println();

        //most expensive book
        Book priceyBook = lib.getMostExpensiveBook();
        System.out.println("The most expensive book is " + priceyBook.name +
                " for the price of " + priceyBook.price + " BGN");
        System.out.println();

        //sort by price
        lib.sortBooksByPrice();
        System.out.println("Books sorted by price: ");
        lib.displayBooks();
        System.out.println();

        //sort by names in descending order
        lib.sortBooksByNameReverse();
        System.out.println("Books sorted by name in descending order: ");
        lib.displayBooks();
        System.out.println();

        //sort by type then by price in descending order
        lib.sortBooksByTypeAndByPriceReverse();
        System.out.println("Books sorted by type and price in descending order: ");
        lib.displayBooks();
        System.out.println();

        //last book by name
        lib.sortBooksByName();
        Book lastBook = lib.lastBookByName();
        System.out.println("Last book by name is " + lastBook.name);

    }
}
