package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.general.UserAccess;
import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class BookService extends ServiceImpl<Book, Long> {

    private static BookService bookService = new BookService();

    private BookService(){
    }

    public static BookService getBookService() {
        return bookService;
    }

    @Override
    public Book save(Book book) throws Exception {
        return null;
    }

    @Override
    public Book edit(Book book) throws Exception {
        return null;
    }

    @Override
    public Book remove(Long aLong) throws Exception {
        return null;
    }

    @Override
    public List<Book> findAll() throws Exception {
        try(CRUDRepository<Book,Long> repository = new CRUDRepository<>()){
            return repository.selectAll(Book.class);
        }
    }

    @Override
    public Book findById(Long aLong) throws Exception {
        return null;
    }
}
