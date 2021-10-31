package com.whackon.witmed.user.dao;

import com.whackon.witmed.system.user.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>系统功能模块 - 基础用户数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@Repository
public interface UserDao {
	/**
	 * <b>根据查询对象查询用户信息</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query) throws Exception;
}
