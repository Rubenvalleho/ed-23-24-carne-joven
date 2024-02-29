package com.rubenvj.carnejoven.features.user.domain;

import com.rubenvj.carnejoven.features.user.data.UserDataRepository;

public class GetUserUseCase {
    private UserDataRepository userDataRepository;

    public GetUserUseCase (UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    public User execute(String dni) {
        return userDataRepository.getUser(dni);
    }
}
