package com.lectopia.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lectopia.board.domain.BoardVO;
import com.lectopia.board.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerView() {
		logger.info("Regisrer get method called....");
		
		return "/board/register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPost(BoardVO vo, Model model) { 
		logger.info("Regisrer post method called....");
		
		try {
			boardService.regist(vo);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Register post method - Error occured [" + e.getMessage() + "]");
		}
		
		model.addAttribute("result", "success");
		
		return "redirect:/board/listAll"; 
	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public String listAll(Model model) throws Exception {
		
		logger.info("show all list......................");
	    model.addAttribute("list", boardService.getAll());
	    return "/board/listAll";
	}
}





