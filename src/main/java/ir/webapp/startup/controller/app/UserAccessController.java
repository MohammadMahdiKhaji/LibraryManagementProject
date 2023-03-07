package ir.webapp.startup.controller.app;


import ir.webapp.startup.model.entity.general.UserAccess;
import ir.webapp.startup.model.entity.enumeration.Classification;
import ir.webapp.startup.model.service.UserAccessService;
import java.sql.Date;
import java.util.List;

public class UserAccessController {

    private static UserAccessController userAccessController = new UserAccessController();

    private UserAccessController() {
    }

    public static UserAccessController getUserAccessController() {
        return userAccessController;
    }


    //signup
    public UserAccess save(String username, String password) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .save(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public UserAccess signup(String username, String password, String firstname, String lastname) {
        try {
            return UserAccessService.getUserAccessService().save(new UserAccess());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public UserAccess edit(UserAccess userAccess) {
        return null;
    }

    public UserAccess remove(UserAccess userAccess, Long aLong) {
        return null;
    }

    public List<UserAccess> findAll(UserAccess userAccess) {
        return null;
    }

    public UserAccess findById(Long id) {
        try {
            return UserAccessService.getUserAccessService().findById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<UserAccess> executeQuery(String string) {
        return null;
    }

    public static boolean login(String username, String password) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .login(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static Long getId(String username, String password) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .getId(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
