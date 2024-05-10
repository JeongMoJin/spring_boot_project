package com.example.spring_boot_project.repository.search;

import com.example.spring_boot_project.domain.Board;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class BoardSearchImpl extends QuerydslRepositorySupport implements BoardSearch {
    public BoardSearchImpl() {
        super(Board.class);
    }

    @Override
    public Page<Board> search1(Pageable pageable) {
        QBoard board = QBoard.board;
        JPQLQuery<Board> query = from(board);
        query.where(board.title.contains("1")); // where title like
        List<Board> list = query.fetch();
        long count = query.fetchCount();
        return null;
    }
}
