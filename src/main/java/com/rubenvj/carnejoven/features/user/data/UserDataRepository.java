package com.rubenvj.carnejoven.features.user.data;

import com.rubenvj.carnejoven.features.user.data.local.UserFileLocalDataSource;
import com.rubenvj.carnejoven.features.user.domain.User;
import com.rubenvj.carnejoven.features.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {
    private UserFileLocalDataSource userFileLocalDataSource;
    private static UserDataRepository instance = null;

    public static UserDataRepository newInstance() {
        if (instance == null) {
            instance = new UserDataRepository();
        }
        return instance;
    }

    @Override
    public User getUser(String dni) {
        return userFileLocalDataSource.obtainUser(dni);
    }

    @Override
    public void createUser(User user) {
        userFileLocalDataSource.saveUser(user);
    }
}
