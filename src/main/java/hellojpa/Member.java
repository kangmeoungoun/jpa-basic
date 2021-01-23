package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter @Setter
@Entity
public class Member{
    @Id
    private Long id;

    @Column(name="name",nullable = false)
    private String username;

    private int age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;


    private LocalDate testLocalDate;
    private LocalDateTime testLocalDateTime;


    @Lob
    private String description;

    @Transient
    private int temp;

    public Member(){
    }
}
