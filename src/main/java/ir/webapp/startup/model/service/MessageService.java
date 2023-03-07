package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.general.Message;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;
import java.util.List;

public class MessageService extends ServiceImpl<Message, Long> {
    private static final MessageService messageService = new MessageService();

    private MessageService(){
    }

    public static MessageService getMessageService(){return messageService;}

    @Override
    public Message save(Message message) throws Exception {
        try (CRUDRepository<Message, Long> repository = new CRUDRepository<>()){
            return repository.insert(message);
        }
    }

    @Override
    public Message edit(Message message) throws Exception {
        return null;
    }

    @Override
    public Message remove(Long aLong) throws Exception {
        return null;
    }

    @Override
    public List<Message> findAll() throws Exception {
        return null;
    }

    @Override
    public Message findById(Long aLong) throws Exception {
        return null;
    }
}
