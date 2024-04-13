package rskhr.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "social_media")
@Data
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sm_gen")
    @SequenceGenerator(name = "sm_gen",sequenceName = "sm_seq")
    private long id;

    private String telegram;

    private String whatsapp;

}
