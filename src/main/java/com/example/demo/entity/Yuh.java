package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Yuh {

    @Id
    @Column(name = "yuh_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int count;

    private String name;


}
