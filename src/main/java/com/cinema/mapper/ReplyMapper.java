package com.cinema.mapper;

import java.util.List;

import com.cinema.domain.ReplyVO;

public interface ReplyMapper {

	public ReplyVO get(Long replyNO);
	
	public List<ReplyVO> getListFindByMovieNO(Long movieNO);
	
	public List<ReplyVO> getListFindByMemberNO(Long memberNO);
	
	public int insert(ReplyVO replyVO);
	
	public int update(ReplyVO replyVO); 
	
	public int delete(Long replyNO);
	
}
