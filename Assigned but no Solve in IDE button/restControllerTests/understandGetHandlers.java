@RestController
public class LibraryController {

    private List<Book> books = new ArrayList<>();

    // 1
    @GetMapping(path = "/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return books.get(id - 1);
    }

    // 2
    @GetMapping(path = "/books")
    public Book getBook() {
        return books.get(0);
    }

    // 3
    @GetMapping(path = "/books/{name}")
    public Book getBookByName(@PathVariable String name) {
        Book book;
        for (Book value : books) {
            book = value;
            if (book.getName().equals(name)) return book;
        }
        return null;
    }

}
