package by.htp.ex.dao;

import by.htp.ex.bean.NewUserInfo;

public interface IUserDao {
	
	
//	String signIn(String login, String password) throws DaoException;
	
	boolean logination(String login, String password) throws DaoException;
	boolean registration(NewUserInfo user) throws DaoException;
	public String getRole(String login, String password) throws DaoException;
	

}
