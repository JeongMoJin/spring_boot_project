package com.example.spring_boot_project.repository;

import com.example.spring_boot_project.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Log4j2
public class BoardRepositoryTests {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void testInsert() {
        for (int i = 1; i <= 100; i++) {
            Board board = Board.builder()
                    .title("title...")
                    .content("content..." + i)
                    .writer("uesr" + (i % 10))
                    .build();
            Board result = boardRepository.save(board);
            log.info("BNO: " + result.getBno());
        }
    }

    @Test
    public void testSelect() {
        Long bno = 100L;
        Optional<Board> result = boardRepository.findById(bno);
        Board board = result.orElseThrow();
        log.info(board);
    }

    @Test
    public void testUpdate() {
        Long bno = 100L;
        Optional<Board> result = boardRepository.findById(bno);
        Board board = result.orElseThrow();

        board.change("update... title 100", "update content 100");
        boardRepository.save(board);
    }

    @Test
    public void deleteTest() {
        Long bno = 1L;
        boardRepository.deleteById(bno);
    }
}









