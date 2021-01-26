package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address{
    //주소
    private String city;
    private String street;
    private String zipcode;

    public Address(){
    }

    public Address(String city , String street , String zipcode){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
