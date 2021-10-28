package com.whackon.witmed.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>系统基础信息 - 基础控制层类</b>
 * <p>
 *     基础控制层类依赖注入了以下属性：<br/>
 *     1、<b>HttpServletRequest</b><br/>
 *     2、<b>HttpServletResponse</b><br/>
 *     3、<b>HttpSession</b><br/>
 *     系统所有功能模块控制层类<b>都必须继承于本基础控制层类</b>。
 * </p>
 * @author Arthur
 * @version 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
