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

    public Book getBookById(int bookId)
    {
        return bookStore.get(bookId);
    }

    public String deleteBookById(int bookId){
       if(!bookStore.containsKey(bookId))return "Book with bookId"+bookId+"Does not found in BookStore!!!";
       bookStore.remove(bookId);
       return "Book with bookId "+bookId+" has been Removed from database";
    }

    public String updateBook(Integer bookId,Book book)
    {
        Book res=bookStore.get(bookId);
        res.setTitle(book.getTitle()!=null? book.getTitle():res.getTitle());
        res.setAuthor(book.getAuthor()!=null? book.getAuthor():res.getAuthor());
        res.setDescription(book.getDescription()!=null?book.getDescription():res.getDescription());
        return "The Book With bookId "+bookId+" has been updated!!";
    }


}
