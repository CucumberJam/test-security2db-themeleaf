package com.example.testsecurity2dbthemeleaf.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotEmpty(message = "Your name should be entered.")
    private String firstName;

    @NotEmpty(message = "Your surname should be entered.")
    private String lastName;

    @NotEmpty(message = "Email should be entered.")
    @Email
    private String email;

    @NotEmpty(message = "Password should be entered.")
    private String password;
}
