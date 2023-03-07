package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.general.Message;
import java.sql.Date;


public class MessageController {
    private static MessageController messageController = new MessageController();

    private MessageController() {
    }

    public static MessageController getMessageController() {
        return messageController;
    }

    public static Message save(String firstname, String lastname, String email, Date birthDate, String city) {
        try {

            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
