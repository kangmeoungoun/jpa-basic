package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
public class Period{
    //기간 Period
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}