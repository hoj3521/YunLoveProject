package com.basic.service;

import java.util.List;

import java.util.Map;

public interface ScenarioService { //시나리오 

	public List<Map<String, Object>> SelectListScenario(Map<String, Object> param);
	
	//시나리오 상세보기
	public List<Map<String, Object>> SelectScenario(Map<String, Object> param);
	
	public Map<String, Object> InsertScenario(Map<String, Object> param);
	
	public boolean UpdateScenario(Map<String, Object> param);
	
	public boolean DeleteScenario(Map<String, Object> param);
	
	
	
}
