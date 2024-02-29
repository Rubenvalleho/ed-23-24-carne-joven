package com.rubenvj.carnejoven.features.user.domain;

public interface UserRepository {
    public User getUser(String dni);
    public void createUser(User user);
}
