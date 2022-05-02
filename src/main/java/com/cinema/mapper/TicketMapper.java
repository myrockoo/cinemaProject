package com.cinema.mapper;

import java.util.List;

import com.cinema.domain.TicketVO;

public interface TicketMapper {
	
	public TicketVO get(Long ticketNO);
	
	public List<TicketVO> getAll(Long memberNO);

	public int ticketing(TicketVO ticketVO);
	
	public int cancel(Long ticketNO);
}
