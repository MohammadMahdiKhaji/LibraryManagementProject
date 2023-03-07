package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.general.Log;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class LogService extends ServiceImpl<Log, Long> {
    private static LogService logService = new LogService();

    private LogService() {
    }

    public static LogService getLogService() {
        return logService;
    }

    @Override
    public Log save(Log log) throws Exception {
        try (CRUDRepository<Log, Long> logRepository = new CRUDRepository<>()) {
            log = logRepository.insert(log);
            System.out.printf("Automation [LOG] Action : [%s] on %s [%s] at [%s] \n",
                    log.getAction(),
                    log.getDbTable(),
                    log.getData().toString().replace("\\\"","'"),
                    log.getActionDateTime().toString());
            return log;
        }
    }

    @Override
    public Log edit(Log log) throws Exception {
        return null;
    }

    @Override
    public Log remove(Long aLong) throws Exception {
        try (CRUDRepository<Log, Long> logRepository = new CRUDRepository<>()) {
            return null;
        }
    }


    @Override
    public List<Log> findAll() throws Exception {
        return null;
    }

    @Override
    public Log findById(Long aLong) throws Exception {
        return null;
    }
}
