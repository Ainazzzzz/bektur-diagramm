package rskhr.entities;

import jakarta.persistence.*;
import lombok.Data;
import rskhr.enums.City;

@Entity
@Table(name = "address")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_gen")
    @SequenceGenerator(name = "address_gen",sequenceName = "address_seq")
    private long id;

    @Enumerated(value = EnumType.STRING)
    private City city;

    private String address;
}
