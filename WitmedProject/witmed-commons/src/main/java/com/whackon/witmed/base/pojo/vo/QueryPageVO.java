package com.whackon.witmed.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b>系统基础信息 - 系统查询分页视图信息</b>
 * <p>
 *     系统查询分页视图信息设定了如下属性：<br/>
 *     1、<b>queryVO：查询视图</b><br/>
 *     2、<b>pageVO：分页视图</b><br/>
 *     如果需要使用传输层进行分页查询，则<b>必须使用本系统查询分页视图进行数据传输</b>。
 * </p>
 * @param <E>
 * @author Arthur
 * @version 1.0.0
 */
@ApiModel(value = "系统基础信息 - 系统查询分页视图信息")
public class QueryPageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -7051580131896636576L;
	@ApiModelProperty(value = "查询视图")
	private E queryVO;                      // 查询视图
	@ApiModelProperty(value = "分页视图")
	private PageVO<E> pageVO;               // 分页视图

	public QueryPageVO() {}

	public QueryPageVO(E queryVO, PageVO<E> pageVO) {
		this.queryVO = queryVO;
		this.pageVO = pageVO;
	}

	public QueryPageVO(E queryVO, Integer pageNum, Integer pageSize) {
		this.queryVO = queryVO;
		this.pageVO = new PageVO<E>(pageNum, pageSize);
	}

	public E getQueryVO() {
		return queryVO;
	}

	public void setQueryVO(E queryVO) {
		this.queryVO = queryVO;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}
