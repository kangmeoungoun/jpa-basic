package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "ADDRESS")
public class AddressEntity{
    @Id
    @GeneratedValue
    private Long id;

    public AddressEntity(){

    }


    private Address address;

    public AddressEntity(String city , String street , String zipCode){
        this.address = new Address(city , street , zipCode);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return address.equals(that.address);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id , address);
    }
}
