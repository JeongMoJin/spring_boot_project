package com.example.spring_boot_project.repository.search;

import com.example.spring_boot_project.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {
    Page<Board> search1(Pageable pageable);
}
