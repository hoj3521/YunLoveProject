package com.basic.service;

import java.util.List;

import java.util.Map;

public interface LogService {  //제작일지


	public List<LogDTO> SelectListLog(LogDTO dto);

	
	// SelectLog 는 해당 게시글만 보기 메소드인데 
	//반환타입을 무얼로 해야되나요????
	
	public LogDTO SelectLog(LogDTO dto); 

	public boolean InsertLog(LogDTO dto);

	public boolean UpdateLog(LogDTO dto);
	
	public boolean DeleteLog(LogDTO dto);
	
}



	


	







