/**
 * 
 */
package com.tzl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tzl.dao.UserDAO;
import com.tzl.model.UserPO;

/**
 * @author tangzhilong
 *
 */
@Service("userService")
public class UserService implements IUserService {

	@Autowired
    private UserDAO userDAO ;
	
	/* (non-Javadoc)
	 * @see com.tzl.service.IUserService#findAllUser()
	 */
	public List<UserPO> findAllUser() {
		return userDAO.findAllUser();
	}

}
