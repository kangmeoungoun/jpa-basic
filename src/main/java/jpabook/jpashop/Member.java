package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER_T")
@Getter
@Setter
public class Member extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(insertable = false,updatable = false,name = "TEAM_ID")
    private Team team;


}
