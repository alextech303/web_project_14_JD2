package by.htp.ex.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import by.htp.ex.bean.NewUserInfo;

public class LoginUser  {
	public int count=0;

	List<String> listOfLoginUser = new ArrayList<String>();
	List<String> listOfLoginUserpassword = new ArrayList<String>();
	
	public LoginUser() {
		
		listOfLoginUser.add("alex0"); listOfLoginUserpassword.add("1111");
		listOfLoginUser.add("alex1"); listOfLoginUserpassword.add("1111");
		listOfLoginUser.add("alex2"); listOfLoginUserpassword.add("1111");
		listOfLoginUser.add("alex3"); listOfLoginUserpassword.add("1111");
		listOfLoginUser.add("alex4"); listOfLoginUserpassword.add("1111");
		
	}
	
	public String findUser(String login ) {
		
		Iterator iterator = listOfLoginUser.iterator();
		
		while (iterator.hasNext()) {
			
		if(iterator.next().equals(login)) {
			
		return listOfLoginUser.get(count);
			
		}
			count++;	
			}
		return null;
	
	
	}
			
	public String findPassword(String password) {
		
		Iterator iterator2 = listOfLoginUserpassword.iterator();
		
		while (iterator2.hasNext()) {
						
			if(iterator2.next().equals(password)) {
				return listOfLoginUserpassword.get(count);
			}
			count++;
	}
		return null;
}
	
	
	public void setUser(String login, String password) {
		
		listOfLoginUser.add(login);
		listOfLoginUserpassword.add(password);
		
		
		
		
		
	}
}
