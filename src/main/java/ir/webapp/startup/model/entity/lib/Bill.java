package ir.webapp.startup.model.entity.lib;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import ir.webapp.startup.model.entity.general.UserAccess;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "billEntity")
@Table(name = "bill_table")
@NamedQueries({@NamedQuery(name = "findAllBill", query = "select oo from billEntity oo")})

public class Bill extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private MemberRecord memberRecord;
    private Timestamp date;
    private Double amount;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
