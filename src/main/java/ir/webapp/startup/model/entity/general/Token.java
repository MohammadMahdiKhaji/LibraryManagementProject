package ir.webapp.startup.model.entity.general;

import com.google.gson.Gson;

import ir.webapp.startup.model.common.EncoderUtil;
import ir.webapp.startup.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "tokenEntity")
@Table(name = "token_table")
public class Token extends BaseEntity {

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private Timestamp expireDateTime;

    @Transient
    private Log log;

    public Token(UserAccess userAccess) throws Exception {
        expireDateTime = Timestamp
                            .valueOf(LocalDateTime.now().plusMinutes(2));
        token = EncoderUtil
                    .getSHA256(userAccess.getUsername()+":"+userAccess.getPassword().getBytes()+":"+Timestamp.valueOf(LocalDateTime.now()));
    }

    public Token(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
