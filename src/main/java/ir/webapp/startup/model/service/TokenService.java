package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.general.Token;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.repository.TokenDA;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;
import java.util.List;

public class TokenService extends ServiceImpl<Token,Long> {
    
    private static TokenService tokenService = new TokenService();

    private TokenService() {
    }

    public static TokenService getTokenService() {
        return tokenService;
    }

    @Override
    public Token save(Token token) throws Exception {
        try(CRUDRepository<Token,Long> repository = new CRUDRepository<>()){
            return repository.insert(token);
        }
    }

    @Override
    public Token edit(Token token) throws Exception {
        try(CRUDRepository<Token,Long> repository = new CRUDRepository<>()){
            return repository.update(token);
        }
    }

    @Override
    public Token remove(Long userAccessId) throws Exception {
        try(CRUDRepository<Token,Long> repository = new CRUDRepository<>()){
            return repository.delete(Token.class, userAccessId);
        }
    }


    @Override
    public List<Token> findAll() throws Exception {
        try (CRUDRepository<Token, Long> repository = new CRUDRepository<>()) {
            return repository.selectAll(Token.class);
        }
    }

    @Override
    public Token findById(Long userAccessId) throws Exception {
        try(CRUDRepository<Token,Long> repository = new CRUDRepository<>()){
            return repository.selectById(Token.class, userAccessId);
        }
    }

    public List<Token> executeQuery(String queryName) throws Exception {
        try(CRUDRepository<Token,Long> repository = new CRUDRepository<>()){
            return repository.executeQuery(queryName);
        }
    }

    public boolean checkToken(Token token) throws Exception {
        try(TokenDA repository = new TokenDA()){
            return repository.checkToken(token);
        }
    }
}
