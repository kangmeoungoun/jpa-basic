package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass

public abstract class BaseEntity{
    @Column(name = "INSERT_MEMBER")
    private String createBy;
    private LocalDateTime createdDate;
    @Column(name = "UPDATE_MEMBER")
    private String lastModifyBy;
    private LocalDateTime lastModifiedDate;
}
