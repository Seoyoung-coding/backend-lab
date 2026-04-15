package com.example.creatorboard.user.service;

import com.example.creatorboard.user.dto.request.UpdateProfileRequest;
import com.example.creatorboard.user.exception.UserNotFoundException;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;

public class UserService {

    //U-04: 프로필 수정 (닉네임, 프로필 이미지) - 완료
    @Transactional
    public void updateProfile(String email, UpdateProfileRequest request) {
    }
}