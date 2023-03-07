package ir.webapp.startup.model.service.serviceimpl;

import java.util.List;

public abstract class ServiceImpl <T, ID>{
    public abstract T save(T t) throws Exception;

    public abstract T edit(T t) throws Exception;

    public abstract T remove(ID id) throws Exception;

    public abstract List<T> findAll() throws Exception;

    public abstract T findById(ID id) throws Exception;

}
