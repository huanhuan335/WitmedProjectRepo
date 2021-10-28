package com.whackon.witmed.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>系统基础信息 - 基础实体信息</b>
 * <p>
 *     基础实体信息设定了如下属性：<br/>
 *     1、<b>status：系统状态</b><br/>
 *     2、<b>createUser：创建人</b><br/>
 *     3、<b>createTime：创建时间</b><br/>
 *     4、<b>updateUser：修改人</b><br/>
 *     5、<b>updateTime：修改时间</b><br/>
 *     系统所有功能模块实体信息<b>都必须继承于本基础实体信息</b>。
 * </p>
 * @author Arthur
 * @version 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 377806458505909427L;
	private String status;                      // 系统状态：0-禁用，1-启用
	private String createUser;                  // 创建人
	private Date createTime;                    // 创建时间
	private String updateUser;                  // 修改人
	private Date updateTime;                    // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
