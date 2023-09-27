package com.basic.mapper;

import java.util.List;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LogMapper {

	@Autowired
    protected SqlSessionTemplate sqlSession;
	/* SqlSessionTemplate 
	 * C(CREATE) : sqlSession.insert(쿼리경로, 파리미터);
	 * R(READ)	 : sqlSession.selectOne(쿼리경로, 파리미터); / sqlSession.selectList(쿼리경로, 파리미터); 
	 * U(UPDATE) : sqlSession.update(쿼리경로, 파리미터);
	 * D(DELETE) : sqlSession.delete(쿼리경로, 파리미터);
	 */ 
	
	public List<LogDTO> SelectListLog(LogDTO dto) {
		return sqlSession.selectList("mapper.LogMapper.SelectListLog", dto);
	}//sqlSession.selectList ==> sqlSession의 메소드는 건들지말것 
	//service의 메소드이름과 mapper메소드 이름과 mapper.LogMapper.SelectListLog의 
	//메소드이름이 일치!!

	public LogDTO SelectLog(LogDTO dto) {
		return sqlSession.selectOne("mapper.LogMapper.SelectLog", dto);
	}// 해당 게시글만 보기(상세보기는) 반환타입으로 DTO객체로!!
	
	public int UpdateLog(LogDTO dto) {
		return sqlSession.update("mapper.LogMapper.UpdateLog", dto);
	}
	
	public int InsertLog(LogDTO dto) {
		return sqlSession.insert("mapper.LogMapper.InsertLog", dto);
	}
	
	
	
	public int DeleteLog(LogDTO dto) {
		return sqlSession.delete("mapper.LogMapper.DeleteLog", dto);
	}
}
