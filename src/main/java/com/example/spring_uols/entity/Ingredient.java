package com.example.spring_uols.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient implements Serializable {

    //TODO  @Id  org.springframework.data.annotation.Id;
    @Id
    private String id;
    private String name;
    private Type type;
}
