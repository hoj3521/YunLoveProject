package com.basic.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.mapper.BbsMapper;
import com.basic.service.BbsService;
import com.basic.service.LogDTO;

@Service
public class LogServiceImpl implements BbsService{

	@Autowired
	private BbsMapper bbsMapper;
	
	@Override
	public List<LogDTO> SelectListLog(LogDTO dto) {
		List<LogDTO> LogList = LogMapper.SelectListLog(dto);
		return LogList;
	}
	
	@Override
	public Map<String, Object> selectBbs(Map<String, Object> param) {
		int cnt = bbsMapper.updateBbsView(param);
		Map<String, Object> bbs = bbsMapper.selectBbs(param);
		return bbs;
	}

	@Override
	public boolean insertBbs(Map<String, Object> param) {
		int cnt = bbsMapper.insertBbs(param);
		if(cnt > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBbs(Map<String, Object> param) {
		int cnt = bbsMapper.updateBbs(param);
		if(cnt > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBbs(Map<String, Object> param) {
		int cnt = bbsMapper.deleteBbs(param);
		if(cnt > 0) {
			return true;
		}
		return false;
	}

}
