package com.jheng.app.foundation.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jheng.app.foundation.dao.CommonDAO;

@Repository
public class CommonDAOImpl implements CommonDAO
{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Object findById(Class<?> clazz, Serializable id)
	{
		if (id == null)
		{
			return null;
		}
		return entityManager.find(clazz, id);
	}

	@Override
	public List<Object> find(Class<?> clazz, String queryString,
			Map<Object, Object> params, int start, int max)
	{
		Query query = null;
		if (clazz != null)
		{
			query = entityManager.createQuery(queryString, clazz);
		}
		else
		{
			query = entityManager.createQuery(queryString);
		}
		if (params != null && params.size() > 0)
		{
			for (Object key : params.keySet())
			{
				query.setParameter(key.toString(), params.get(key));
			}
		}
		query.setFirstResult(start);
		query.setMaxResults(max);
		@SuppressWarnings("unchecked")
		List<Object> list = query.getResultList();
		return list;
	}

	@Override
	public List<Object> query(String queryStr, Map<Object, Object> params,
			int start, int max)
	{
		return this.find(null, queryStr, params, start, max);
	}

	@Override
	public void update(Object obj)
	{
		entityManager.merge(obj);
	}

	@Override
	public int batchUpdate(String jpql, Object[] params)
	{
		Query query = entityManager.createQuery(jpql);
		int parameterIndex = 1;
		if (params != null && params.length > 0)
		{
			for (Object obj : params)
			{
				query.setParameter(parameterIndex++, obj);
			}
		}
		query.setHint("org.hibernate.cacheable", true);
		return query.executeUpdate();
	}

	@Override
	public void remove(Class<?> clazz, Serializable id)
	{
		Object obj = this.findById(clazz, id);
		if (obj != null)
		{
			entityManager.remove(obj);
		}
	}

	@Override
	public void save(Object obj)
	{
		entityManager.persist(obj);
	}

	@Override
	public void flush()
	{
		entityManager.flush();
		entityManager.getTransaction().commit();
	}
}
