package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.entity.lib.MemberRecord;
import ir.webapp.startup.model.entity.lib.Transaction;
import ir.webapp.startup.model.service.BookService;
import ir.webapp.startup.model.service.MemberRecordService;
import ir.webapp.startup.model.service.TransactionService;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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

    public List<Transaction> findAllBookBorrowed(Long memberId){
        try {
            return TransactionService.getTransactionService().findTransactionByMemberId(memberId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Transaction borrowBook(Long bookId, Long memberId) {
        try {
            Book book = BookService.getBookService().findById(bookId);
            MemberRecord memberRecord = MemberRecordService.getMemberRecordService().findById(memberId);
            if (book.isStatus()) {
                if (memberRecord.getNoBookIssued() < memberRecord.getMaxBookLimit()) {
                    memberRecord.setNoBookIssued(memberRecord.getNoBookIssued() + 1);
                    MemberRecordService.getMemberRecordService().edit(memberRecord);
                    //Adds 30 days for due date
                    return TransactionService.getTransactionService().save(new Transaction(
                            memberRecord,
                            book,
                            Timestamp.valueOf(LocalDateTime.now()),
                            Timestamp.valueOf(LocalDateTime.now().plusDays(30))));
                } else {
                    //exceeded the limit
                    return null;
                }
            }else {
                //book isn't available
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
