package com.cinema.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.domain.ReplyVO;
import com.cinema.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@AllArgsConstructor
@RequestMapping("/replies/")
public class ReplyController {

	private ReplyService replyService;
	
//	@GetMapping("/get/{replyNO}")
	public ResponseEntity<ReplyVO> get(@PathVariable("replyNO")Long replyNO) {
		log.info("get Reply..........replyNO: "+replyNO);
		ReplyVO replyVO = replyService.get(replyNO);
		log.info("get result: "+replyVO);
		return new ResponseEntity<>(replyVO,HttpStatus.OK);
	}

// @GetMapping("/getListFindByMovieNO/{movieNO}")
	public ResponseEntity<List<ReplyVO>> getListFindByMovieNO(@PathVariable("movieNO")Long movieNO){
		log.info("get ReplyList where movieNO: "+movieNO);
		return new ResponseEntity<>(replyService.getListFindByMovieNO(movieNO),HttpStatus.OK);
	}
	
// @GetMapping("/getListFindByMemberNO/{memberNO}")
	public ResponseEntity<List<ReplyVO>> getListFindByMemberNO(@PathVariable("memberNO")Long memberNO){
		log.info("get ReplyList where memberNO: "+memberNO);
		return new ResponseEntity<>(replyService.getListFindByMemberNO(memberNO),HttpStatus.OK);
	}
	
// @PostMapping	
	public ResponseEntity<String> create(@RequestBody ReplyVO replyVO){
		log.info("create Reply..........replyVO: "+replyVO);
		int result = replyService.register(replyVO);
		log.info("create result: "+result);
		return result == 1? new ResponseEntity<>("success",HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
// @RequestMapping(value= ... , method=put,patch)
	public ResponseEntity<String> modify(@RequestBody ReplyVO replyVO){
		log.info("modify Reply..........replyNO: "+replyVO.getReplyNO());
		int result = replyService.modify(replyVO);
		log.info("modify result: "+result);
		return result == 1? new ResponseEntity<>("success",HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

// @DeleteMapping()
	public ResponseEntity<String> remove(@PathVariable("replyNO") Long replyNO){
		log.info("remove reply..........replyNO: "+replyNO);
		return replyService.remove(replyNO) == 1?  new ResponseEntity<>("success",HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
