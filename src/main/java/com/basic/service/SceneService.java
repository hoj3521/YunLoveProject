package com.basic.service;

import java.util.List;

import java.util.Map;

public interface SceneService { //스토리보드

	public List<Map<String, Object>> SelectListScene(Map<String, Object> param);
	
	//스토리보드 상세보기
	public Map<String, Object> SelectScene(Map<String, Object> param);
	
	
	
	public boolean InsertScene(Map<String, Object> param);
	
	
	
	public boolean UpdateScene(Map<String, Object> param);
	
	public boolean DeleteScene(Map<String, Object> param);

	public boolean InsertActor(Map<String, Object> param);
	
	public boolean UpdateActor(Map<String, Object> param);
	
	public boolean DeleteActor(Map<String, Object> param);
	
	
}
