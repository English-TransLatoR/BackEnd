package com.example.demo.domain.user.presentation;

import com.example.demo.domain.user.presentation.dto.request.*;
import com.example.demo.domain.user.presentation.dto.response.WordResponse;
import com.example.demo.domain.user.service.*;
import com.example.demo.global.security.jwt.dto.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserSignupService userSignupService;
    private final UserLoginService userLoginService;
    private final MyWordService myWordService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void signup(@RequestBody UserSignupRequest request) {
        userSignupService.signup(request);
    }

    @PostMapping("/login")
    public TokenResponse login(@RequestBody LoginRequest loginRequest) {
        return userLoginService.login(loginRequest);
    }


    @GetMapping
    public WordResponse getMyWord() {
        return myWordService.execute();
    }

}