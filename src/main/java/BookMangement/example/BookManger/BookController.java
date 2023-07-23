package BookMangement.example.BookManger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/getBookList")
    public List<Book> getBookList(){
      return bookService.getBookList();

    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book)
    {
       return bookService.addBookToBookStore(book);
    }
}
