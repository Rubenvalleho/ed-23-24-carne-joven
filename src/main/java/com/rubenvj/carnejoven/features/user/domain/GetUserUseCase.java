package com.rubenvj.carnejoven.features.user.domain;

import com.rubenvj.carnejoven.features.user.data.UserDataRepository;

public class GetUserUseCase {
    private UserRepository userRepository;

    public GetUserUseCase (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String dni) {
        return userRepository.getUser(dni);
    }
}
