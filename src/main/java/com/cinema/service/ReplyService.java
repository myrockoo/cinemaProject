package com.cinema.service;

import java.util.List;

import com.cinema.domain.ReplyVO;

public interface ReplyService {

	public ReplyVO get(Long replyNO);
	
	public List<ReplyVO> getListFindByMovieNO(Long movieNO);
	
	public List<ReplyVO> getListFindByMemberNO(Long memberNO);
	
	public int register(ReplyVO replyVO);
	
	public int modify(ReplyVO replyVO);
	
	public int remove(Long replyNO);
}
