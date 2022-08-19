package com.example.spring_uols.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Ingredient implements Serializable {
    private final String id;
    private final String name;
    private final Type type;
}
