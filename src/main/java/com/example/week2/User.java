package com.example.week2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private String mobileNumber;
    private String role;
    private String gender;
    private String status;
    private boolean isActive;
}
