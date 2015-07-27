package com.jheng.app.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jheng.app.admin.entity.Manageadmin;
import com.jheng.app.foundation.service.CommonService;

@Controller
//@SessionAttributes("admin")
public class AdminController
{
	@Autowired
	private CommonService commonService;

	@RequestMapping("/admin/login.html")
	public String setupForm()
	{
		return "admin/login";
	}

	@RequestMapping("/admin/loginchk.html")
	public String adminLogin(HttpServletRequest req,
			HttpServletResponse resp)
	{
		//ModelAndView mav = new ModelAndView();
		String name = req.getParameter("aaName");
		String pwd = req.getParameter("aaPwd");
		HttpSession session = req.getSession();
		session.setAttribute("admin", null);
		if (name != null && pwd != null)
		{
			Map<Object, Object> map = new HashMap<Object, Object>();
			map.put("adminName", name);
			map.put("adminPwd", pwd);
			List<?> aList = commonService.find(Manageadmin.class, "select a from Manageadmin a where a.adminName=:adminName and a.adminPwd=:adminPwd", map, 0, 1);
			if(aList.size()>0){
				session.setAttribute("admin", aList.get(0));
				return "redirect:/admin/index.html";
			}
			else{
				return "admin/loginfail";
			}
		}
		return "admin/loginfail";
	}

	@RequestMapping("/admin/index.html")
	public String showAdminIndex()
	{
		return "admin/index";
	}
}
