package BookMangement.example.BookManger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBookList()
    {
      return bookService.getBookList();

    }

    @PostMapping("/books")
    public String addBook(@RequestBody Book book)
    {
       return bookService.addBookToBookStore(book);
    }

//    @RequestMapping(value = "/books", method = RequestMethod.GET)
    /*This Inseated of the request mapping
    * you can use GetMapping
    * @RepsonseBody---> you have to write if you are using controller
    * if you are  not using controll you are using restController then you dont' need to use Responce Body.. here
    * we go..
    * ..*/

   @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int bookId)
   {
        return bookService.getBookById(bookId);
   }

   @DeleteMapping("/books/{bookId}")
    public String deleteBookByBookId(@PathVariable Integer bookId){
       return bookService.deleteBookByBookId(bookId);
   }

   @PutMapping("/books/{bookId}")
   public  String updataBook(@PathVariable("bookId") Integer bookId,@RequestBody Book book)
   {
       String responce=bookService.updataBook(bookId,book);

       return responce;
   }
}
