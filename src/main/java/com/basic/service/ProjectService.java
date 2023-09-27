package com.basic.service;

import java.util.List;

import java.util.Map;

public interface ProjectService {
   //기획현황 전체보기
   public List<Map<String, Object>> SelectListProject(Map<String, Object> param);
   
   //기획작성
   public boolean SelectProject(Map<String, Object> param);
   
   //기획수정
   public boolean InsertProject(Map<String, Object> param);
   
   //기획삭제
   public boolean UpdateProject(Map<String, Object> param);
   
   //프로젝트현황 전체보기
   public List<Map<String, Object>> DeleteProject(Map<String, Object> param);
   
   //프로젝트 작성
   public boolean SelectListBudget(Map<String, Object> param);
   
   //프로젝트 수정
   public boolean InsertBudget(Map<String, Object> param);
   
   //프로젝트 삭제
   public boolean UpdateBudget(Map<String, Object> param);
   
   
   public boolean DeleteBudget(Map<String, Object> param);
   
   public boolean SelectListTotal(Map<String, Object> param);
   
   public boolean InsertTotal(Map<String, Object> param);
   
   public boolean UpdateTotal(Map<String, Object> param);
   
   public boolean DeleteTotal(Map<String, Object> param);
   
   public boolean SelectListProduce(Map<String, Object> param);
   
   public boolean InsertProduce(Map<String, Object> param);
   
   public boolean UpdateProduce(Map<String, Object> param);
   
   public boolean DeleteProduce(Map<String, Object> param);
   
   
}
   