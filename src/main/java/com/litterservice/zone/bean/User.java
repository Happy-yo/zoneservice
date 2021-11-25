package com.litterservice.zone.bean;

import lombok.Data;

@Data
public class User {
    private long userid;
    private String username;
    private String password;
    private int admins;
}
