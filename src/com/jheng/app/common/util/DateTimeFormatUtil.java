package com.jheng.app.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期格式化工具类
 * 
 * @author jheng
 *
 */
public class DateTimeFormatUtil
{
	public static SimpleDateFormat sdf;
	static
	{
		if (sdf == null)
		{
			sdf = new SimpleDateFormat();
		}
	}

	public static String format(Date date, String pattern)
	{
		sdf.applyPattern(pattern);
		String result = sdf.format(date);
		return result;
	}

	public static Date parse(Date date, String pattern)
	{
		return parse(format(date, pattern), pattern);
	}

	public static Date parse(String dateStr, String pattern)
	{
		sdf.applyPattern(pattern);
		Date date = null;
		try
		{
			date = sdf.parse(dateStr);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		return date;
	}

	public static Timestamp parseTime(String logStartTime, String string)
	{
		return Timestamp.valueOf(string);
	}
	
	/**
	 * 获得当月首日
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getMinDate(int year,int month){
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		date = c.getTime();
		return date;
	}
	
	/**
	 * 获得当月最后一天
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getMaxDate(int year,int month){
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(year, month-1, day);
		date = c.getTime();
		return date;
	}
	
	
}
