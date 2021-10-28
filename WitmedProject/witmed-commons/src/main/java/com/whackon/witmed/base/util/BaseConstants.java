package com.whackon.witmed.base.util;

import java.util.Properties;

/**
 * <b>系统基础信息 - 基础常量信息工具类</b>
 * @author Arthur
 * @version 1.0.0
 */
public class BaseConstants {
	private static Properties props = new Properties();

	static {
		// 使用静态代码块加载配置文件并且进行解析
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息常量：当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>分页信息常量：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));

	/**
	 * <b>Swagger 配置文档常量：文档标题</b>
	 */
	public static final String SWAGGER_TITLE = props.getProperty("swagge.title");

	/**
	 * <b>Swagger 配置文档常量：文档描述</b>
	 */
	public static final String SWAGGER_DESCRIPTION = props.getProperty("swagger.description");

	/**
	 * <b>Swagger 配置文档常量：文档版本</b>
	 */
	public static final String SWAGGER_VERSION = props.getProperty("swagger.version");

	/**
	 * <b>Swagger 配置文档常量：联系人姓名</b>
	 */
	public static final String SWAGGER_CONTACT_NAME = props.getProperty("swagger.contact.name");

	/**
	 * <b>Swagger 配置文档常量：联系人网址</b>
	 */
	public static final String SWAGGER_CONTACT_URL = props.getProperty("swagger.contact.url");

	/**
	 * <b>Swagger 配置文档常量：联系人电子邮件</b>
	 */
	public static final String SWAGGER_CONTACT_EMAIL = props.getProperty("swagger.contact.email");

	/**
	 * <b>Swagger 配置文档常量：扫描基础包</b>
	 */
	public static final String SWAGGER_BASE_PACKAGE = props.getProperty("swagger.base.package");

	/**
	 * <b>系统加密算法秘钥信息常量</b>
	 */
	public static final String SECRET_KEY = props.getProperty("secret.key");
}
