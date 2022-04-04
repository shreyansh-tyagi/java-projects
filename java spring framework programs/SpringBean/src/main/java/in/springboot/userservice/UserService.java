package in.springboot.userservice;

import org.springframework.stereotype.Service;

import in.springboot.user.User;

import java.util.*;


@Service 
public class UserService {
	
	public List<User> getlist(){
		List<User> user=new ArrayList<>();
		List<User> user1=new ArrayList<>();
		
		User u=new User(1,"user1");
		user.add(u);
		u.setid(11);
		u.setname("user11");
		user1.add(u);
		
		u=new User(2,"user2");
		user.add(u);
		u.setid(12);
		u.setname("user22");
		user1.add(u);
		
		u=new User(3,"user3");
		user.add(u);
		u.setid(13);
		u.setname("user33");
		user1.add(u);
		
		getlistmethod(user1);
		
		return user;
	}
	public List<User> getlistmethod(List<User> user1){
		return user1;
	}

}
