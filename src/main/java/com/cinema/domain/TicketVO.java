package com.cinema.domain;

import lombok.Data;

@Data
public class TicketVO extends BaseVO{
	
	private Long ticketNO;
	private Long memberNO;
	private Long movieNO;
	private Long cinemaNO;
	private Long theaterNO;
	private String seatNO;

}
