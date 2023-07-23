package BookMangement.example.BookManger;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepository
{
    private Map<Integer,Book> bookStore=new HashMap<>();

    public String addBookToBookStore(Book book)
    {
        Integer bookId=book.getBookId();
        bookStore.put(bookId,book);
        return "Book with bookId-"+bookId+" is Added in The book Store Successfully";
    }

    public List<Book> getBookList()
    {
        List<Book>list=new ArrayList<>(bookStore.values());
        return list;
    }


}
