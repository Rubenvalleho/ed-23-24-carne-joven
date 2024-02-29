package com.rubenvj.carnejoven.features.user.domain;

import com.rubenvj.carnejoven.features.user.data.UserDataRepository;

public class CreateUserUseCase {
    private final UserDataRepository userDataRepository;

    public CreateUserUseCase (UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    public void execute (User user) {
        userDataRepository.createUser(user);
    }
}
