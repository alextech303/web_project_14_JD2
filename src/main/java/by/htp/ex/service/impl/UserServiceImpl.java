package by.htp.ex.service.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.DaoProvider;
import by.htp.ex.dao.IUserDao;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.IUserService;
import by.htp.ex.util.validation.UserDataValidation;
import by.htp.ex.util.validation.ValidationProvider;

public class UserServiceImpl implements IUserService{

	private final IUserDao userDAO = DaoProvider.getInstance().getIUserDao();
//	private final UserDataValidation userDataValidation = ValidationProvider.getIntsance().getUserDataVelidation();
	
	@Override
	public String signIn(String login, String password) throws ServiceException {
		
		/*
		 * if(!userDataValidation.checkAUthData(login, password)) { throw new
		 * ServiceException("login ...... "); }
		 */
		
		try {
			if(userDAO.logination(login, password)) {
				return userDAO.getRole(login, password);
			}else {
				return "guest";
			}
			
		}catch(DaoException e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public String registration(NewUserInfo user) {
		try {
			if(userDAO.registation(user)) {
				return userDAO.getRole(login, password);
			}else {
				return "guest";
			}
			
		}catch(DaoException e) {
			throw new ServiceException(e);
		}
		
	}
	}


