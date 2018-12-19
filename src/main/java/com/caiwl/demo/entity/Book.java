package com.caiwl.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    private int year;
}
