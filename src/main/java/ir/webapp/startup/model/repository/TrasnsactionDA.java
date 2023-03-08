package ir.webapp.startup.model.repository;

import ir.webapp.startup.model.common.JPA;
import ir.webapp.startup.model.entity.lib.Transaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class TrasnsactionDA implements AutoCloseable  {
    private EntityManager entityManager;

    public List<Transaction> findTransactionByMemberId(Long memberId){
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select oo from transactionEntity oo where oo.memberRecord.id = :memberId");
        query.setParameter("memberId", memberId);
        return query.getResultList();
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
    }
}
