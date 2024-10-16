package com.gamblerslog.models.database;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Long id_users;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}
