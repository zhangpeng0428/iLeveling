package com.jheng.app.foundation.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jheng.app.foundation.dao.CommonDAO;
import com.jheng.app.foundation.service.CommonService;

@Service
@Transactional
public class CommonServiceImpl implements CommonService
{
	@Autowired
	private CommonDAO commonDAO;

	@Override
	@Transactional(readOnly=true)
	public Object findById(Class<?> clazz, Serializable id)
	{
		return commonDAO.findById(clazz, id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Object> find(Class<?> clazz, String queryString,
			Map<Object, Object> params, int start, int max)
	{
		return commonDAO.find(clazz, queryString, params, start, max);
	}

	@Override
	public List<Object> query(String queryStr, Map<Object, Object> params,
			int start, int max)
	{
		return commonDAO.query(queryStr, params, start, max);
	}

	@Override
	public void update(Object obj)
	{
		commonDAO.update(obj);
	}

	@Override
	public int batchUpdate(String jpql, Object[] params)
	{
		return commonDAO.batchUpdate(jpql, params);
	}

	@Override
	public void remove(Class<?> clazz, Serializable id)
	{
		commonDAO.remove(clazz, id);
	}

	@Override
	public void save(Object obj)
	{
		commonDAO.save(obj);
	}

	@Override
	public void flush()
	{
		commonDAO.flush();
	}
	
	
}
