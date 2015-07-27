package com.jheng.app.admin.interceptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.jheng.app.admin.entity.Manageadmin;
import com.jheng.app.foundation.service.CommonService;

public class AdminLoginInterceptor extends HandlerInterceptorAdapter
{
	private String infoPage;
	@Autowired
	private CommonService commonService;

	public String getInfoPage()
	{
		return infoPage;
	}

	public void setInfoPage(String infoPage)
	{
		this.infoPage = infoPage;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{
		HttpSession session = request.getSession();
		Manageadmin admin = (Manageadmin) session.getAttribute("admin");
		if (admin == null)
		{
			// String ctxPath = request.getRequestURI();
			// System.out.println(ctxPath);
			response.sendRedirect(this.getInfoPage());
			return false;
		}
		else
		{
			Map<Object, Object> map = new HashMap<Object, Object>();
			map.put("adminName", admin.getAdminName());
			map.put("adminPwd", admin.getAdminPwd());
			List<?> aList = commonService.find(Manageadmin.class,
					"select a from Manageadmin a where a.adminName=:adminName and a.adminPwd=:adminPwd", map, 0, 1);
			if (aList.size() > 0)
				return true;
			else
				return false;
		}
	}
}
