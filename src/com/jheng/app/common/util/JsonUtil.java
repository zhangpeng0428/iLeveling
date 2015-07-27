package com.jheng.app.common.util;

import java.lang.reflect.Type;
import com.google.gson.Gson;

/**
 * JSON工具类，Java对象和Json对象互相转换
 * 
 * @author jheng
 * @date 2013-08-10
 */
public final class JsonUtil {

	private JsonUtil() {
	}

	public static String toJson(Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}

	public static <T> T fromJson(String str, Type type) {
		Gson gson = new Gson();
		return gson.fromJson(str, type);
	}


	public static <T> T fromJson(String str, Class<T> type) {
		Gson gson = new Gson();
		return gson.fromJson(str, type);
	}

}
