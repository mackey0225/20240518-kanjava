package com.example.kanjava.user;

import java.time.LocalDate;

public record UserForm(
    String name,
    String email,
    String phone,
    String zipcode,
    String address,
    LocalDate birthdate) {
}