package com.example.spring_boot_project.repository;

import com.example.spring_boot_project.domain.Board;
import com.example.spring_boot_project.repository.search.BoardSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {

}
