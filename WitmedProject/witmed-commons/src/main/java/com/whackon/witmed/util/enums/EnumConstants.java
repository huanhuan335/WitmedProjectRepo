package com.whackon.witmed.util.enums;

import java.util.Properties;

/**
 * <b>系统枚举常量信息类</b>
 * @author Arthur
 * @version 1.0.0
 */
class EnumConstants {
	private static Properties props = new Properties();

	static {
		// 使用静态代码块加载配置文件并且进行解析
		try {
			props.load(EnumConstants.class.getClassLoader().getResourceAsStream("props/witmed/enum.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>系统人员身份信息：行政人员</b>
	 */
	static final String IDENTITY_ADMIN = props.getProperty("identity.admin");

	/**
	 * <b>系统人员身份信息：医生</b>
	 */
	static final String IDENTITY_DOCTOR = props.getProperty("identity.doctor");

	/**
	 * <b>系统人员身份信息：护士</b>
	 */
	static final String IDENTITY_NURSE = props.getProperty("identity.nurse");
}
