package com.fetter.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Data   // Define Getters and Setters - Get data and Set data to and from private members of a class
@Entity(name = "tb_users")  // Create a table in h2 db called "tb_users", the following model defines an Entity, that is, each member is a column of the table
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
