package com.basic.service;

import java.util.List;

import java.util.Map;

public interface ScriptPaperService { //스크립트 페이퍼

	public List<Map<String, Object>> SelectListScript(Map<String, Object> param);
	
	public Map<String, Object> SelectScript(Map<String, Object> param);
	
	public boolean InsertScript(Map<String, Object> param);
	
	public boolean UpdateScript(Map<String, Object> param);
	
	public boolean SelectListTimeTable(Map<String, Object> param);
	
	public boolean SelectTimeTable(Map<String, Object> param);
	
	public boolean InsertTimeTable(Map<String, Object> param);
	
	public boolean UpdateTimeTable(Map<String, Object> param);
	
	public boolean DeleteTimeTable(Map<String, Object> param);
}
