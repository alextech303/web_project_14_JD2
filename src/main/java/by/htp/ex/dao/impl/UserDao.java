package by.htp.ex.dao.impl;

import java.sql.SQLException;
import java.util.Random;
import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.IUserDao;
import by.htp.ex.data.LoginUser;

public class UserDao implements IUserDao{
	
	 LoginUser  loginUser = new LoginUser();
	 

	@Override
	public boolean logination(String login, String password) throws DaoException {
		
		if(login.equals(loginUser.findUser(login)) & password.equals(loginUser.findPassword(password))) {
			loginUser.count = 0;
					
			return true;
		}else {
			loginUser.count = 0;
			return false;
		}
	}
			
		
	
	
	public String getRole(String login, String password) {
		return "user";
	}

	@Override
	public boolean registration(NewUserInfo user) throws DaoException  {
		// TODO Auto-generated method stub
		return true;
	}

}
