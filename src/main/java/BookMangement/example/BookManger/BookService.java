package BookMangement.example.BookManger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;

    public String addBookToBookStore(Book book)
    {
       String ans= bookRepository.addBookToBookStore(book);

       return ans;
    }

    public List<Book> getBookList()
    {

      return bookRepository.getBookList();
    }
    public  Book getBookById(int bookId){
        return bookRepository.getBookById(bookId);
    }

    public String deleteBookByBookId(int bookId){
        return bookRepository.deleteBookById(bookId);
    }

    public  String updataBook(Integer bookId,Book book)
    {
        String ans=bookRepository.updateBook(bookId,book);
        return ans;
    }
}
