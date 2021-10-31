package com.whackon.witmed.util;

import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 * @author Arthur
 * @version 1.0.0
 */
public class ConstantUtil {
	private static Properties props = new Properties();

	static {
		try {
			// 加载位于 src 下的配置文件 witmed.properties，并且进行解析
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("props/witmed/witmed.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>登录有效时间</b>
	 */
	public static final Long LOGIN_EXPIRE_SEC = Long.parseLong(props.getProperty("login.expire.second"));
}
