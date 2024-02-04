package com.example.demo.domain.papago.domain;

import com.example.demo.domain.user.domain.User;
import com.example.demo.global.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class Word extends BaseEntity {
    private String word;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
