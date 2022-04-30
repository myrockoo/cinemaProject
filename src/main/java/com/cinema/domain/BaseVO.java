package com.cinema.domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Data
public class BaseVO {
	
	//createdDate
	private LocalDateTime createdAt;
	
	//LastModifiedDate
	private LocalDateTime modifiedAt;
	
	private LocalDateTime deleteAt;
	
}
