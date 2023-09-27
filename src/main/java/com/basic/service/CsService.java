package com.basic.service;

import java.util.List;

import java.util.Map;

public interface CsService {
   
   // 전체 문의글 목록
   public List<Map<String, Object>> SelectListNotes(Map<String, Object> param);
            
   //문의글 삽입
   public Map<String, Object> SelectNotes(Map<String, Object> param);
   
   //문의글 수정
   public boolean InsertNotes(Map<String, Object> param);
   
   //문의글 삭제
   public boolean UpdateNotes(Map<String, Object> param);
  
   public boolean DeleteNotes(Map<String, Object> param);
   
   public boolean SelectListQnA(Map<String, Object> param);
   
   public boolean SelectQnA(Map<String, Object> param);
   
   public boolean InsertQnA(Map<String, Object> param);
   
   public boolean UpdateQnA(Map<String, Object> param);
   
   public boolean DeleteQnA(Map<String, Object> param);
   
   
}