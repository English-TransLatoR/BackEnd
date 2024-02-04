package com.example.demo.domain.user.service;

import com.example.demo.domain.papago.domain.repository.WordRepository;
import com.example.demo.domain.user.domain.User;
import com.example.demo.domain.user.facade.UserFacade;
import com.example.demo.domain.user.presentation.dto.response.WordResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyWordService {
    private final WordRepository wordRepository;
    private final UserFacade userFacade;
    @Transactional(readOnly = true)
    public WordResponse execute() {
        User user = userFacade.getCurrentUser();
        return new WordResponse(user);
    }
}
