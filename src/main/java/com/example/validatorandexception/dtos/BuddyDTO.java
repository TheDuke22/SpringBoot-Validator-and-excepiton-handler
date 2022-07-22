package com.example.validatorandexception.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor (staticName = "build")
public class BuddyDTO {
    @NotEmpty
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    @Min(value = 14, message = "min age is 14") @Max(value = 144, message = "max age is 144")
    private Short age;

    private Long mobilePhone;

}
