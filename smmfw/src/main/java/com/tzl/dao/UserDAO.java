/**
 * 
 */
package com.tzl.dao;

import java.util.List;

import com.tzl.model.UserPO;

/**
 * @author tangzhilong
 *
 */
public interface UserDAO {
	public List<UserPO> findAllUser() ;
}
