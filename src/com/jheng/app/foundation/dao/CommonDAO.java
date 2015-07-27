package com.jheng.app.foundation.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonDAO
{

	public abstract Object findById(Class<?> clazz, Serializable id);

	public abstract List<Object> find(Class<?> clazz, String queryString,
			Map<Object, Object> params, int start, int max);

	public abstract List<Object> query(String queryStr,
			Map<Object, Object> params, int start, int max);

	public abstract void update(Object obj);

	public abstract int batchUpdate(String jpql, Object[] params);

	public abstract void remove(Class<?> clazz, Serializable id);

	public abstract void save(Object obj);

	public abstract void flush();

}