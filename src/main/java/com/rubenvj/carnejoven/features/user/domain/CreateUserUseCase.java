package com.rubenvj.carnejoven.features.user.domain;

import com.rubenvj.carnejoven.features.user.data.UserDataRepository;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute (User user) {
        userRepository.createUser(user);
    }
}
