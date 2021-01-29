package jpql;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team{
    @Id @GeneratedValue
    private Long id;
    private String name;

    //@BatchSize(size = 100) 글롤벌 로 가능
    @OneToMany(mappedBy = "team")
    List<Member> members = new ArrayList<>();

}
