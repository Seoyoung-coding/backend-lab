package com.example.backendlab.user;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Optional<UserEntity> getUser(int id) {
        return userRepository.findById(id);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}