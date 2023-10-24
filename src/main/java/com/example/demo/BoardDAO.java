package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDAO extends JpaRepository<BoardDTO, Long>{ // Jpa Repository를 상속... T 는 엔티티 클래스가 누구인지? ID 누가 프리이머리키냐?
	
}
