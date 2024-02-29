package com.rubenvj.carnejoven.features.user.presentation;

import com.rubenvj.carnejoven.features.user.data.UserDataRepository;
import com.rubenvj.carnejoven.features.user.domain.CreateUserUseCase;
import com.rubenvj.carnejoven.features.user.domain.GetUserUseCase;
import com.rubenvj.carnejoven.features.user.domain.User;

public class UserPresentation {
    public static void getUser(String dni) {
        GetUserUseCase getUserUseCase = new GetUserUseCase(UserDataRepository.newInstance());
        getUserUseCase.execute(dni);
    }

    public static void createUser(User user) {
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(UserDataRepository.newInstance());
        createUserUseCase.execute(user);
    }
}
