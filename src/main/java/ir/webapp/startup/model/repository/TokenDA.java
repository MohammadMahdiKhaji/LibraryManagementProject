package ir.webapp.startup.model.repository;

import ir.webapp.startup.model.common.JPA;
import ir.webapp.startup.model.entity.general.Token;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TokenDA implements AutoCloseable {

    private EntityManager entityManager;

    public boolean checkToken(Token token) {
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select oo.expireDateTime from tokenEntity oo where oo.token = :token");
        query.setParameter("token", token.getToken());
        return (Timestamp.valueOf(String.valueOf(query.getSingleResult())).compareTo(Timestamp.valueOf(LocalDateTime.now())) >= 0) ? true : false;
    }

    public void close() throws Exception {
        entityManager.close();
    }
}
