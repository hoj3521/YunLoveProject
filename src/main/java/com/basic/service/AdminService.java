package com.basic.service;

import java.util.List;

import java.util.Map;

public interface AdminService {
   
   //마이페이지 불러오기
   public List<Map<String, Object>> SelectMypage(Map<String, Object> param);
   
   //계정 추가하기
   public boolean SelectListAccount(Map<String, Object> param);
   
   //마이페이지 수정하기
   public boolean SelectAccount(Map<String, Object> param);
   
   public boolean InsertAccount(Map<String, Object> param);
   
   //탈퇴하기
   public boolean UpdateAccount(Map<String, Object> param);
  
   public boolean DeleteAccount(Map<String, Object> param);
   
   public boolean SelectListDpt(Map<String, Object> param);
   
   public boolean SelectDpt(Map<String, Object> param);
   
   public boolean InsertDpt(Map<String, Object> param);
   
   public boolean UpdateDpt(Map<String, Object> param);
  
   public boolean DeleteDpt(Map<String, Object> param);
   
   
}