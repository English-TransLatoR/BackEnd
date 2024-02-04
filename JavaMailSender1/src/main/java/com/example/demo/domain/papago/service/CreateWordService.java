package com.example.demo.domain.papago.service;

import com.example.demo.domain.papago.domain.Word;
import com.example.demo.domain.papago.domain.repository.WordRepository;
import com.example.demo.domain.papago.presentation.dto.CreateWordRequest;
import com.example.demo.domain.user.domain.User;
import com.example.demo.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateWordService {
    private final WordRepository wordRepository;
    private final UserFacade userFacade;

    @Transactional
    public void word(CreateWordRequest request) {
        User user = userFacade.getCurrentUser();
        wordRepository.save(
                Word.builder()
                        .word(request.getWord())
                        .user(user)
                        .build()
        );
    }
}
