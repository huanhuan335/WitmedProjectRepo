package com.whackon.witmed.user.service;

import com.whackon.witmed.system.user.pojo.vo.UserVO;

/**
 * <b>系统功能模块 - 基础用户业务层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface UserService {

	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	UserVO getUserByCellphone(String cellphone) throws Exception;
}
