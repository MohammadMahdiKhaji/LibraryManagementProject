package ir.webapp.startup.model.service;

import ir.webapp.startup.model.common.JPA;
import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.entity.lib.Transaction;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.repository.TrasnsactionDA;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;
import jakarta.persistence.Query;

import java.util.List;

public class TransactionService extends ServiceImpl<Transaction, Long> {

    private static TransactionService transactionService = new TransactionService();

    private TransactionService(){
    }

    public static TransactionService getTransactionService() {
        return transactionService;
    }

    @Override
    public Transaction save(Transaction transaction) throws Exception {
        try(CRUDRepository<Transaction,Long> repository = new CRUDRepository<>()){
            return repository.insert(transaction);
        }
    }

    @Override
    public Transaction edit(Transaction transaction) throws Exception {
        try(CRUDRepository<Transaction,Long> repository = new CRUDRepository<>()){
            return repository.update(transaction);
        }
    }

    @Override
    public Transaction remove(Long aLong) throws Exception {
        try(CRUDRepository<Transaction,Long> repository = new CRUDRepository<>()){
            return repository.delete(Transaction.class, aLong);
        }
    }

    @Override
    public List<Transaction> findAll() throws Exception {
        try(CRUDRepository<Transaction,Long> repository = new CRUDRepository<>()){
            return repository.selectAll(Transaction.class);
        }
    }

    @Override
    public Transaction findById(Long aLong) throws Exception {
        try(CRUDRepository<Transaction,Long> repository = new CRUDRepository<>()){
            return repository.selectById(Transaction.class, aLong);
        }
    }

    public List<Transaction> findTransactionByMemberId(Long memberId) throws Exception {
        try(TrasnsactionDA repository = new TrasnsactionDA()){
            return repository.findTransactionByMemberId(memberId);
        }
    }
}
