package com.taskw34.animalapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "owner")
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String surname;
    String phoneNumber;
    String email;
}
