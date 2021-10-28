package com.whackon.witmed.base.pojo.vo;

import com.whackon.witmed.base.util.BaseConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <b>系统基础信息 - 系统分页视图信息</b>
 * <p>
 *     系统分页视图信息设定了如下属性：<br/>
 *     1、<b>pageNum：当前页码</b><br/>
 *     2、<b>pageSize：每页显示数量</b><br/>
 *     3、<b>list：分页列表</b><br/>
 *     4、<b>totalSize：总条数</b><br/>
 *     5、<b>totalPages：总页数</b><br/>
 *     系统所有功能模块返回前端异步分页数据<b>都必须是本分页视图信息</b>。
 * </p>
 * @param <E>
 * @author Arthur
 * @version 1.0.0
 */
@ApiModel(value = "系统基础信息 - 系统分页视图信息")
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -3458922961994208370L;
	@ApiModelProperty(value = "当前页码")
	private Integer pageNum;                        // 当前页码
	@ApiModelProperty(value = "每页显示数量")
	private Integer pageSize;                       // 每页显示数量
	@ApiModelProperty(value = "分页列表")
	private List<E> list;                           // 分页列表
	@ApiModelProperty(value = "总数量")
	private Long totalSize;                         // 总数量
	@ApiModelProperty(value = "总页数")
	private Integer totalPages;                     // 总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
}
