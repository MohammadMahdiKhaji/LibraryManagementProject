package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.general.Token;
import ir.webapp.startup.model.entity.general.UserAccess;
import ir.webapp.startup.model.service.TokenService;
import java.util.List;

public class TokenController {

    private static TokenController tokenController = new TokenController();

    private TokenController() {

    }

    public static TokenController getTokenController() {
        return tokenController;
    }

    public static Token save(String username, String password) {
        try {
            return TokenService
                        .getTokenService()
                            .save(new Token(new UserAccess(username, password)));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public static Token edit(Token token) {
        return null;
    }

    public static Token remove(Token token, Long aLong) {
        return null;
    }

    public static List<Token> findAll(Token token) {
        return null;
    }

    public static Token findById(Token token, Long aLong) {
        return null;
    }

    public static List<Token> executeQuery(String string) {
        return null;
    }

    public static boolean checkToken(String token) {
        try {
            return TokenService.getTokenService().checkToken(new Token(token));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
