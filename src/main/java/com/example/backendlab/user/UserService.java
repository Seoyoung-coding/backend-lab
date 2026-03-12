package com.example.backendlab.user;

import java.time.LocalDateTime;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public UserEntity createUser(int id, String username, String email) {
        UserEntity user = new UserEntity(
                id,
                username,
                email,
                LocalDateTime.now()
        );

        return userRepository.save(user);
    }
}