package com.basic.service;

import java.util.List;

import java.util.Map;

public interface LoginService {
   
   //마이페이지 불러오기
   public List<Map<String, Object>> selectOneMypage(Map<String, Object> param);
   
   //계정 추가하기
   public boolean insertAccount(Map<String, Object> param);
   
   //마이페이지 수정하기
   public boolean updateMypage(Map<String, Object> param);
   
   //탈퇴하기
   public boolean deleteMypage(Map<String, Object> param);
   
   
}