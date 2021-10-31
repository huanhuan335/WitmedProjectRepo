package com.whackon.witmed.system.user.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <b>系统功能模块 - 登录用户视图信息</b>
 * @author Arthur
 * @version 1.0.0
 */
@ApiModel(value = "系统功能模块 - 登录用户视图信息")
public class LoginUserVO extends BaseVO {
	private static final long serialVersionUID = -3068120864880580649L;
	@ApiModelProperty(value = "登录用户手机号码")
	private String cellphone;                       // 登录用户手机号码
	@ApiModelProperty(value = "登录用户密码")
	private String password;                        // 登录用户密码

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
