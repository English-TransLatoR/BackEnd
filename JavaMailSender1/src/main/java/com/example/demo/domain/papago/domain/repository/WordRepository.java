package com.example.demo.domain.papago.domain.repository;

import com.example.demo.domain.papago.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
