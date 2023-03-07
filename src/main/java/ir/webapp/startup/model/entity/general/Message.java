package ir.webapp.startup.model.entity.general;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "messageEntity")
@Table(name = "message_table")
@NamedQueries({@NamedQuery(name = "findAllMessages", query = "select oo from messageEntity oo")})

public class Message extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private UserAccess userAccessEntitySender;

    //@OneToMany
    @OneToOne(cascade = CascadeType.ALL)
    private UserAccess userAccessEntityReceiver;

    private Timestamp timestamp;

    private String text;

    private boolean seen;

    public Message(UserAccess userAccessEntitySender, UserAccess userAccessEntityReceiver, String text) {
        this.userAccessEntitySender = userAccessEntitySender;
        this.userAccessEntityReceiver = userAccessEntityReceiver;
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.text = text;
        this.seen = false;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
