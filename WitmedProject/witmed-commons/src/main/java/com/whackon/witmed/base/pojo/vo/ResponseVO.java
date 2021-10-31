package com.whackon.witmed.base.pojo.vo;

import com.whackon.witmed.base.pojo.enums.ResponseCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b>系统基础信息 - 系统响应视图信息</b>
 * <p>
 *     系统响应视图信息设定了如下属性：<br/>
 *     1、<b>code：系统响应状态码</b><br/>
 *     2、<b>data：系统响应数据</b><br/>
 *     系统所有功能模块返回前端异步数据<b>都必须是本系统响应视图信息</b>。
 * </p>
 * @param <E>
 * @author Arthur
 * @version 1.0.0
 */
@ApiModel(value = "系统基础信息 - 系统响应视图信息")
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -1243700449847575050L;
	@ApiModelProperty(value = "系统响应状态码")
	private Integer code;                       // 系统响应状态码
	@ApiModelProperty(value = "系统响应数据")
	private E data;                             // 系统响应数据

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>获得系统响应成功视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(Object data) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(), data);
	}

	/**
	 * <b>获得系统用户未进行认证视图</b>
	 * @return
	 */
	public static ResponseVO getUnAuthResponseVO() {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getCode(), ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getRemark());
	}

	/**
	 * <b>获得系统业务处理流程错误视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getErrorResponseVO(Object data) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode(), data);
	}

	/**
	 * <b>获得系统响应异常误视图</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO getExceptionResponseVO(Exception e) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_EXCEPTION.getCode(), e.getMessage());
	}
}
