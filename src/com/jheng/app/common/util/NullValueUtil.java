package com.jheng.app.common.util;

public class NullValueUtil
{
	public static int null2Int(Object s)
	{
		int v = 0;
		if (s != null)
			try
			{
				v = Integer.parseInt(s.toString());
			}
			catch (Exception e)
			{
				
			}
		return v;
	}

	public static float null2Float(Object s)
	{
		float v = 0.0f;
		if (s != null)
			try
			{
				v = Float.parseFloat(s.toString());
			}
			catch (Exception e)
			{
			}
		return v;
	}

	public static double null2Double(Object s)
	{
		double v = 0.0;
		if (s != null)
			try
			{
				v = Double.parseDouble(null2String(s));
			}
			catch (Exception e)
			{
			}
		return v;
	}

	public static boolean null2Boolean(Object s)
	{
		boolean v = false;
		if (s != null)
			try
			{
				v = Boolean.parseBoolean(s.toString());
			}
			catch (Exception e)
			{
			}
		return v;
	}

	public static String null2String(Object s)
	{
		return s == null ? "" : s.toString().trim();
	}

	public static Long null2Long(Object s)
	{
		Long v = -1l;
		if (s != null)
			try
			{
				v = Long.parseLong(s.toString());
			}
			catch (Exception e)
			{
			}
		return v;
	}
}
