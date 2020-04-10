package ru.apolyakov.social_network.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private int id;
    private String login;
    private String password;

    private String firstName;
    private String secondName;

    private int age;
    private Gender gender;
    private String interests;
    private String city;


}
