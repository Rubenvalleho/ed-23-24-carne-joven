package com.rubenvj.carnejoven.features.user.domain;

public class User {
    private final String dni;
    private String name;
    private String lastName;
    private String address;

    public User (String dni, String name, String lastName, String address) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}
