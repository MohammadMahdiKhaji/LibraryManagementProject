package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.lib.Book;
import ir.webapp.startup.model.entity.lib.MemberRecord;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class MemberRecordService extends ServiceImpl<MemberRecord, Long> {

    private static MemberRecordService memberRecordService = new MemberRecordService();

    private MemberRecordService() {
    }

    public static MemberRecordService getMemberRecordService() {
        return memberRecordService;
    }

    @Override
    public MemberRecord save(MemberRecord memberRecord) throws Exception {
        return null;
    }

    @Override
    public MemberRecord edit(MemberRecord memberRecord) throws Exception {
        try(CRUDRepository<MemberRecord,Long> repository = new CRUDRepository<>()){
            return repository.update(memberRecord);
        }
    }

    @Override
    public MemberRecord remove(Long aLong) throws Exception {
        return null;
    }

    @Override
    public List<MemberRecord> findAll() throws Exception {
        return null;
    }

    @Override
    public MemberRecord findById(Long aLong) throws Exception {
        try(CRUDRepository<MemberRecord,Long> repository = new CRUDRepository<>()){
            return repository.selectById(MemberRecord.class, aLong);
        }
    }
}