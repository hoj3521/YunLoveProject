package com.basic.service;

import java.util.List;

import java.util.Map;

public interface CreatorService {
   //크리에이터 현황 (전체보기)
   public List<Map<String, Object>> selectListCreator(Map<String, Object> param);
            
   //크리에이터 정보 (상세보기)
   public Map<String, Object> selectCreator(Map<String, Object> param);
   
   public Map<String, Object> InsertCreator(Map<String, Object> param);
  
   public Map<String, Object> UpdateCreator(Map<String, Object> param);
   
   public Map<String, Object> DeleteCreator(Map<String, Object> param);
   
}