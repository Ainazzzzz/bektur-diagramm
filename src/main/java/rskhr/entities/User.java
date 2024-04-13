package rskhr.entities;

import jakarta.persistence.*;
import lombok.Data;
import rskhr.enums.Department;
import rskhr.enums.Gender;
import rskhr.enums.MaritalStatus;
import rskhr.enums.Position;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(name = "user_gen",sequenceName = "user_seq")
    private long id;

    private String fullName;

    private String email;

    private String avatar;

    private String password;

    private long phoneNumber;

    private int uniqueNumber;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Enumerated(value = EnumType.STRING)
    private MaritalStatus maritalStatus;

    @Enumerated(value = EnumType.STRING)
    private Position position;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.DETACH})
    private Address address;

    private LocalDate birthDate;

    @OneToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.REMOVE,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.DETACH})
    private SocialMedia socialMedia;

    @Enumerated(value = EnumType.STRING)
    private Department department;


}


