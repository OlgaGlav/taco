package com.example.spring_uols.entity;


import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

}
