package com.bluealtair.apis.data.entities;

import com.bluealtair.apis.data.enumeration.UserRole;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;

}
