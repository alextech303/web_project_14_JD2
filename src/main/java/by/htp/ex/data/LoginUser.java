package by.htp.ex.data;

import java.util.ArrayList;
import java.util.List;

import by.htp.ex.bean.NewUserInfo;

public class LoginUser  {

	List<String> listOfLoginUser = new ArrayList<String>();
	
	public LoginUser() {
		listOfLoginUser.add("alex0");
		listOfLoginUser.add("alex1");
		listOfLoginUser.add("alex2");
	}
	
	public String getUser(int index) {
		
		return listOfLoginUser.get(index);
	}
}
