package com.lectopia.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lectopia.board.domain.BoardVO;
import com.lectopia.board.persistence.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void regist(BoardVO board) throws Exception {
		mapper.create(board);
	}

	@Override
	public void get(Integer bno) throws Exception {
		mapper.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		mapper.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		mapper.delete(bno);
	}

	@Override
	public List<BoardVO> getAll() throws Exception {
		return mapper.listAll();
		
	}

}
