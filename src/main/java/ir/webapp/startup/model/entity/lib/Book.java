package ir.webapp.startup.model.entity.lib;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bookEntity")
@Table(name = "book_table")
@NamedQueries({@NamedQuery(name = "findAllBook", query = "select oo from bookEntity oo")})

public class Book extends BaseEntity {

    private String author;
    private String name;
    private Double price;
    private Long rackNo;
    private boolean status;
    private int edition;
    private Timestamp dateOfPurchase;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
