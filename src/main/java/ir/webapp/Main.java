package ir.webapp;

import ir.webapp.startup.controller.app.UserAccessController;
import ir.webapp.startup.model.entity.enumeration.Classification;
import ir.webapp.startup.model.entity.general.UserAccess;
import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.repository.CRUDRepository;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CRUDRepository<UserAccess, Long> repository1 = new CRUDRepository<>();
        CRUDRepository<Book, Long> repository2 = new CRUDRepository<>();
        System.out.println(repository1.insert(new UserAccess("admin", "admin")));
        System.out.println(repository2.insert(new Book("author1", "name1", 2.25, 2L, true, 6, Timestamp.valueOf(LocalDateTime.now()))));
        System.out.println(repository2.insert(new Book("author2", "name2", 2.25, 2L, true, 6, Timestamp.valueOf(LocalDateTime.now()))));
    }
}
