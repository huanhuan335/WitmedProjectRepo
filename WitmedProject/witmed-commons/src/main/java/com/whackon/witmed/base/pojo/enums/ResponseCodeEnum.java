package com.whackon.witmed.base.pojo.enums;

/**
 * <b>系统基础信息 - 系统响应状态编码枚举信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public enum ResponseCodeEnum {
	RESPONSE_CODE_SUCCESS(BaseEnumConstants.RESPONSE_CODE_SUCCESS, "系统处理响应成功"),
	RESPONSE_CODE_UNAUTH(BaseEnumConstants.RESPONSE_CODE_UNAUTH, "系统用户未进行认证"),
	RESPONSE_CODE_ERROR(BaseEnumConstants.RESPONSE_CODE_ERROR, "系统业务处理流程错误"),
	RESPONSE_CODE_EXCEPTION(BaseEnumConstants.RESPONSE_CODE_EXCEPTION, "系统响应异常");

	private Integer code;                       // 编码
	private String remark;                      // 说明

	private ResponseCodeEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
