package com.example.simplerestappwithxml.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class User {

    private String name;
    private String surname;
    private int age;

}
