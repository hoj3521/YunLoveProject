package com.basic.service;

import java.util.List;

import java.util.Map;

public interface PlanService {  //촬영계획


	public List<Map<String, Object>> SelectListSchedule(Map<String, Object> param);

	public boolean InsertSchedule(Map<String, Object> param);

	public boolean UpdateSchedule(Map<String, Object> param);

	public boolean DeleteSchedule(Map<String, Object> param);
	
	

	public boolean InsertTime(Map<String, Object> param);


	public boolean UpdateTime(Map<String, Object> param);
	
	public boolean DeleteTime(Map<String, Object> param);

	public boolean InsertActorManagement(Map<String, Object> param);


	public boolean UpdateActorManagement(Map<String, Object> param);

	public boolean DeleteActorManagement(Map<String, Object> param);
	
	public boolean InsertFilm(Map<String, Object> param);

	public boolean UpdateFilm(Map<String, Object> param);

	public boolean DeleteFilm(Map<String, Object> param);
	
	public List<Map<String, Object>> SelectListPlan(Map<String, Object> param);

	public List<Map<String, Object>> InsertPlan(Map<String, Object> param);

	public List<Map<String, Object>> UpdatePlan(Map<String, Object> param);

	public List<Map<String, Object>> DeletePlan(Map<String, Object> param);
}







