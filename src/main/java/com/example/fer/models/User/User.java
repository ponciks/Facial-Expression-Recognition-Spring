package com.example.fer.models.User;

import com.example.fer.models.Base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
@Data
public class User extends BaseEntity {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_USER", sequenceName = "SEQ_USER", allocationSize = 1)
    @GeneratedValue(generator = "GEN_USER", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private int age;

}
