package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void write() {
		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setSeq(1);
///		boardDTO.setId("hong");
//		boardDTO.setName("허균");
//		boardDTO.setSubject("홍길동전");
//		boardDTO.setContent("불쌍한 사람을 도우는 의적!!");
//		boardDAO.save(boardDTO); // save안에 인서트와 업데이트가 같이 들어가있다.
		
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setSeq(2);
		boardDTO.setId("neo");
		boardDTO.setName("네오");
		boardDTO.setSubject("네오는 고양이다!!");
		boardDTO.setContent("카카오 프렌즈");
		boardDAO.save(boardDTO);
	}

	@Override
	public List<BoardDTO> list() {
		return boardDAO.findAll();
		
	}
	
	
}
