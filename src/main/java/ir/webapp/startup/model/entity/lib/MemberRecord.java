package ir.webapp.startup.model.entity.lib;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import ir.webapp.startup.model.entity.enumeration.Classification;
import ir.webapp.startup.model.entity.general.UserAccess;
import jakarta.persistence.*;
import lombok.*;
import org.glassfish.jersey.server.model.internal.SseTypeResolver;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "memberRecordEntity")
@Table(name = "member_record_table")
@NamedQueries({@NamedQuery(name = "findAllMemberRecord", query = "select oo from memberRecordEntity oo")})

public class MemberRecord extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private Classification classification;
    private Long noBookIssued;
    private Long maxBookLimit;
//    private String fullName;
//    private String address;
//    private int phoneNumber;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
