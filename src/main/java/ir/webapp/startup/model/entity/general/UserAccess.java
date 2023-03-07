package ir.webapp.startup.model.entity.general;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import ir.webapp.startup.model.entity.enumeration.Classification;
import ir.webapp.startup.model.entity.lib.MemberRecord;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "userAccessEntity")
@Table(name = "user_access_table")
@NamedQueries({@NamedQuery(name = "findAllUserAccess", query = "select oo from userAccessEntity oo")})

public class UserAccess extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private MemberRecord memberRecord;

    //LowerCase And Trim
    @Column(columnDefinition = "NVARCHAR2(30)", unique = true)
    private String username;

    //Trim
    @Column(columnDefinition = "NVARCHAR2(30)", unique = true)
    private String password;

    public UserAccess(String username, String password) {
        this.username = username.toLowerCase().trim();
        this.password = password.trim();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
