package com.whackon.witmed.util.enums;

/**
 * <b>系统人员身份枚举信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public enum IdentitEnum {
	IDENTITY_ADMIN(EnumConstants.IDENTITY_ADMIN, "行政"),
	IDENTITY_DOCTOR(EnumConstants.IDENTITY_DOCTOR, "医生"),
	IDENTITY_NURSE(EnumConstants.IDENTITY_NURSE, "护士");

	private String code;                        // 编码
	private String remark;                      // 说明

	private IdentitEnum(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
