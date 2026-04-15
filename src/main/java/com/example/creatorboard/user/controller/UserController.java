package com.example.creatorboard.user.controller;

import com.example.creatorboard.common.ApiResponse;
import com.example.creatorboard.user.dto.request.UpdateProfileRequest;
import com.example.creatorboard.user.dto.response.UserProfileResponse;
import com.example.creatorboard.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
//    private final UserService userService;
//
//    // view my profile
//    @GetMapping("/me")
//    public ApiResponse<UserProfileResponse> getMyProfile(@AuthenticationPrincipal PrincipalDetails userDetails{
//        UserProfileResponse response = userService.getMyProfile(userDetails.getUsername());
//        log.info("creator id : " + response.getCreatorId());
//        return ApiResponse.success("Profile Reviewd", response);
//    }
//
//    // edit my profile
//    @PatchMapping("/me")
//    public ApiResponse<Void> updateProfile(
//            @AuthenticationPrincipal PrincipalDetails userDetails,
//            @Valid @RequestBody UpdateProfileRequest request) {
//        userService.updateProfile(userDetails.getUsername(), request);
//        return ApiResponse.success("profile changed.", null);
//    }
}
