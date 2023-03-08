package ir.webapp.startup.model.repository;

import ir.webapp.startup.model.common.JPA;
import ir.webapp.startup.model.entity.general.UserAccess;
import ir.webapp.startup.model.entity.enumeration.Classification;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class UserDA implements AutoCloseable  {
    private EntityManager entityManager;

    public boolean login(UserAccess userAccess) {
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select oo from userAccessEntity oo where oo.username = :username and password= :password");
        query.setParameter("username", userAccess.getUsername());
        query.setParameter("password", userAccess.getPassword());
        return (query.getResultList().size() == 1) ? true : false;
    }

    public Long getId(UserAccess userAccess){
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select oo.id from userAccessEntity oo where username = :username and password= :password");
        query.setParameter("username", userAccess.getUsername());
        query.setParameter("password", userAccess.getPassword());
        return (Long) query.getSingleResult();
    }

    public Long getMemberId(UserAccess userAccess){
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select oo.memberRecord.id from userAccessEntity oo where username = :username and password= :password");
        query.setParameter("username", userAccess.getUsername());
        query.setParameter("password", userAccess.getPassword());
        return (Long) query.getSingleResult();
    }

//    public boolean checkClassification(UserAccess userAccess){
//        entityManager = JPA.getJpa().getEntityManager();
//        Query query = entityManager.createQuery("select oo.classification from userAccessEntity oo where username = :username and password= :password");
//        query.setParameter("username", userAccess.getUsername());
//        query.setParameter("password", userAccess.getPassword());
//        return query.getSingleResult().equals(Classification.Manager);
//    }
//
//    public String getClassification(UserAccess userAccess){
//        entityManager = JPA.getJpa().getEntityManager();
//        Query query = entityManager.createQuery("select oo.classification from userAccessEntity oo where username = :username and password= :password");
//        query.setParameter("username", userAccess.getUsername());
//        query.setParameter("password", userAccess.getPassword());
//        return String.valueOf(query.getSingleResult());
//    }

    public void close() throws Exception {
        entityManager.close();
    }
}
