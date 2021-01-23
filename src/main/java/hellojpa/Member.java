package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity

@SequenceGenerator(
            name ="member_seq_generator"
        , sequenceName = "member_seq"
        , initialValue = 1,allocationSize = 2
)

/*
@TableGenerator(
        name = "MEMBER_SEQ_GENERATOR"
        , table = "MY_SEQUENCES"
        , pkColumnName = "MEMBER_SEQ",allocationSize = 1
)
*/
public class Member{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "member_seq_generator")
//    @GeneratedValue(strategy = GenerationType.TABLE,generator = "MEMBER_SEQ_GENERATOR")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private String username;

    public Member(){
    }
}
