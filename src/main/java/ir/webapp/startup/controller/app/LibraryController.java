package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.service.BookService;

import java.util.List;

public class LibraryController {

    private static LibraryController libraryController = new LibraryController();

    private LibraryController(){
    }

    public static LibraryController getLibraryController() {
        return libraryController;
    }



    public List<Book> findAllBook(){
        try {
            return BookService.getBookService().findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
