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
@Entity(name = "transactionEntity")
@Table(name = "transaction_table")
@NamedQueries({@NamedQuery(name = "findAllTransaction", query = "select oo from transactionEntity oo")})

public class Transaction extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private MemberRecord memberRecord;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Book book;
    private Timestamp dateOfIssue;
    private Timestamp dueDate;

    public Transaction(Timestamp dateOfIssue, Timestamp dueDate) {
        this.dateOfIssue = dateOfIssue;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
