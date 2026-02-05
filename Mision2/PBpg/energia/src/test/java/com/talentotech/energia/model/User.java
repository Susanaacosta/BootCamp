package com.talentotech.energia.model;
import java.lang.annotation.Inherited;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)  
 private Long id;
 @Column(nulllable = false, unique = true)
 private String username;
  @Column(nulllable = false)
   private String email;
}

