package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team{
    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;
    @OneToMany(mappedBy = "team",fetch = FetchType.LAZY)
    List<Member> members = new ArrayList<>();

}
