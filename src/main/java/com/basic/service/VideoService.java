package com.basic.service;

import java.util.List;

import java.util.Map;

public interface VideoService {
   
   
   
   // 인기 컨텐츠 영상 조회하기
   public Map<String, Object> selectListBestVideo(Map<String, Object> param);
   
   public Map<String, Object> SelectContent(Map<String, Object> param);
   
   public Map<String, Object> InsertContent(Map<String, Object> param);
   
   public Map<String, Object> UpdateContent(Map<String, Object> param);

   public Map<String, Object> DeleteContent(Map<String, Object> param);
}