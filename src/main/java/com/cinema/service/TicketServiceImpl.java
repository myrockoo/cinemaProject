package com.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.domain.TicketVO;
import com.cinema.mapper.TicketMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

	private TicketMapper ticketMapper;
	
	@Override
	public TicketVO get(Long ticketNO) {
		return ticketMapper.get(ticketNO); 
	}

	@Override
	public List<TicketVO> getAll(Long memberNO) {
		return ticketMapper.getAll(memberNO);
	}

	@Override
	public int ticketing(TicketVO ticketVO) {
		return ticketMapper.ticketing(ticketVO);
	}

	@Override
	public int cancel(Long ticketNO) {
		return ticketMapper.cancel(ticketNO);
	}
	
	

}
