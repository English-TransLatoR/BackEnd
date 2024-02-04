package com.example.demo.domain.user.domain;

import com.example.demo.domain.papago.domain.Word;
import com.example.demo.domain.user.enums.Gender;
import com.example.demo.global.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class User extends BaseEntity {

    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "user")
    private List<Word> words = new ArrayList<>();
}