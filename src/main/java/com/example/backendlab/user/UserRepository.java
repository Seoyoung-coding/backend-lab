package com.example.backendlab.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<UserEntity> users = new ArrayList<>();   // DB 대신에 List로 저장된다

    public UserEntity save(UserEntity user) {   //User 저장
        user.add(user);
        return user;
    }
    public Optional<UserEntity> findById(int id) {  //ID로 유저 찾기, optional인 이유는 없을수도 있어서
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
    // 유저 조회로직
    public List<UserEntity> findAll() { // 전체 유저 찾기
        return users;
    }

    public void deleteById(int id) { //삭제
        users.removeIf(user -> user.getId() == id); //user의 id가 찾는 id와 같으면 true
    }
}