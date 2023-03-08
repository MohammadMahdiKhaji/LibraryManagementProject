package ir.webapp.startup.model.entity.base;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.general.Log;
import ir.webapp.startup.model.entity.enumeration.ActionType;
import ir.webapp.startup.model.entity.enumeration.DbTable;
import ir.webapp.startup.model.service.LogService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Version
//    private long versionId;

    @PostPersist
    private void saveLog() throws Exception {
        LogService.getLogService().save(new Log(
                DbTable.valueOf(this.getClass().getSimpleName()),
                1,
                ActionType.Persist,

//                this.toString()
                "tst",

                "IP"));
    }

    @PostUpdate
    private void editLog() throws Exception {
        LogService.getLogService().save(new Log(
                DbTable.valueOf(this.getClass().getSimpleName()),
                1,
                ActionType.Update,

//                this.toString(),
                "tst",

                "IP"));
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
