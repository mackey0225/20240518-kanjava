package com.example.kanjava.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.experimental.FieldNameConstants;

@Entity
@FieldNameConstants
@Table(name = "USERS")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String email;
  private String phone;
  private String zipcode;
  private String address;
  private LocalDate birthdate;

  public static User from(UserForm userForm) {
    User user = new User();
    user.name = userForm.name();
    user.email = userForm.email();
    user.phone = userForm.phone();
    user.zipcode = userForm.zipcode();
    user.address = userForm.address();
    user.birthdate = userForm.birthdate();
    return user;
  }
}
