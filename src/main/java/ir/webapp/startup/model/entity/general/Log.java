package ir.webapp.startup.model.entity.general;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.enumeration.ActionType;
import ir.webapp.startup.model.entity.enumeration.DbTable;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "logEntity")
@Table(name="log_table")
//@NamedQueries(@NamedQuery(name = "findAll", query = "select oo from logEntity oo"))
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private DbTable dbTable;

    private long userId;

    @Enumerated(EnumType.STRING)
    private ActionType action;

    private String data;

    private String clientIp;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp actionDateTime;

    public Log(DbTable DbTable, long userId, ActionType action, String data, String clientIp) {
        this.dbTable = DbTable;
        this.userId = userId;
        this.action = action;
        this.data = data;
        this.clientIp = clientIp;
    }

    @PrePersist
    private void setActionDateTime(){
        actionDateTime= Timestamp.valueOf(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
