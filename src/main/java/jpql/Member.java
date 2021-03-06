package jpql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NamedQuery(name = "Member.findByUserName",
            query = "select m  from Member m where m.username = :username")
public class Member{
    @Id @GeneratedValue
    private Long id;
    private String username;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = " TEAM_ID")
    private Team team;


    public void chagngTeam(Team team){
        this.team=team;
        team.getMembers().add(this);
    }
    @Enumerated(EnumType.STRING)
    private MemberType type;
    @Override
    public String toString(){
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
