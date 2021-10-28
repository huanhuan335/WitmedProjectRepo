package com.whackon.witmed.base.pojo.enums;

import java.util.Properties;

/**
 * <b>系统基础信息 - 基础枚举配置常量信息工具类</b>
 * @author Arthur
 * @version 1.0.0
 */
class BaseEnumConstants {
	private static Properties props = new Properties();

	static {
		// 使用静态代码块加载配置文件并且进行解析
		try {
			props.load(BaseEnumConstants.class.getClassLoader().getResourceAsStream("props/base/enum.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>系统状态常量：启用状态</b>
	 */
	public static final String STATUS_ENABLE = props.getProperty("status.enable");

	/**
	 * <b>系统状态常量：禁用状态</b>
	 */
	public static final String STATUS_DISABLE = props.getProperty("status.disable");

	/**
	 * <b>系统响应编码信息：系统处理响应成功</b>
	 */
	static final Integer RESPONSE_CODE_SUCCESS = Integer.parseInt(props.getProperty("response.code.success"));

	/**
	 * <b>系统响应编码信息：系统用户未进行认证</b>
	 */
	static final Integer RESPONSE_CODE_UNAUTH = Integer.parseInt(props.getProperty("response.code.unauth"));

	/**
	 * <b>系统响应编码信息：系统业务处理流程错误</b>
	 */
	static final Integer RESPONSE_CODE_ERROR = Integer.parseInt(props.getProperty("response.code.error"));

	/**
	 * <b>系统响应编码信息：系统响应异常</b>
	 */
	static final Integer RESPONSE_CODE_EXCEPTION = Integer.parseInt(props.getProperty("response.code.exception"));
}
