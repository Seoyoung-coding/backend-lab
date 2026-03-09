package com.example.backendlab.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

// user는 사용자 생성/조회/수정/삭제 기능을 구현
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private int id;
    private String username;
    private String email;
    private LocalDateTime createTime;

}
