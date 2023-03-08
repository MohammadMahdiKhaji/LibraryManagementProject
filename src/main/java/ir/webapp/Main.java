package ir.webapp;

import ir.webapp.startup.controller.app.UserAccessController;
import ir.webapp.startup.model.entity.enumeration.Classification;
import ir.webapp.startup.model.entity.general.UserAccess;
import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.entity.lib.MemberRecord;
import ir.webapp.startup.model.entity.lib.Transaction;
import ir.webapp.startup.model.repository.CRUDRepository;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CRUDRepository<UserAccess, Long> repository1 = new CRUDRepository<>();
        CRUDRepository<Book, Long> repository2 = new CRUDRepository<>();
        CRUDRepository<Transaction, Long> repository3 = new CRUDRepository<>();
        CRUDRepository<MemberRecord, Long> repository4 = new CRUDRepository<>();
        MemberRecord memberRecord = new MemberRecord(Classification.Manager, 0L, 5L);
        UserAccess user = new UserAccess(memberRecord, "admin", "admin");
        System.out.println(repository1.insert(user));
        Book book1 = new Book("author1", "name1", true, 6, Timestamp.valueOf(LocalDateTime.now()));
        Book book2 = new Book("author2", "name2", true, 6, Timestamp.valueOf(LocalDateTime.now()));
        System.out.println(repository2.insert(book1));
        System.out.println(repository2.insert(book2));
        Transaction transaction = new Transaction(Timestamp.valueOf(LocalDateTime.now()), Timestamp.valueOf(LocalDateTime.now().plusDays(30)));
        System.out.println(repository3.insert(transaction));
        transaction.setBook(book1);
        transaction.setMemberRecord(memberRecord);
        System.out.println(repository3.update(transaction));
    }
}
