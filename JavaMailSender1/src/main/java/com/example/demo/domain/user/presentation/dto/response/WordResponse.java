package com.example.demo.domain.user.presentation.dto.response;

import com.example.demo.domain.papago.domain.Word;
import com.example.demo.domain.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class WordResponse {
    private List<String> word;

    public WordResponse(User user) {
        word = user.getWords().stream().map(Word::getWord).collect(Collectors.toList());
    }
}
