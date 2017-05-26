package com.example.episodicshows.user;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by thomas.fowler on 5/17/17.
 */
@Entity(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
}
