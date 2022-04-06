package in.springboot.userservice;

import org.springframework.stereotype.Service;

import in.springboot.user.User;

import java.util.*;

@Service("bean3")
public class UserService {

	public List<User> getlistconstruct() {
		List<User> user = new ArrayList<>();

		User u = new User(1, "user1");
		user.add(u);

		u = new User(2, "user2");
		user.add(u);

		u = new User(3, "user3");
		user.add(u);

		return user;
	}

	public List<User> getlistgetset() {
		List<User> user1 = new ArrayList<>();

		User u = new User(1, "user1");
		u.setid(11);
		u.setname("user11");
		user1.add(u);

		u = new User(2, "user2");
		u.setid(12);
		u.setname("user22");
		user1.add(u);

		u = new User(3, "user3");
		u.setid(13);
		u.setname("user33");
		user1.add(u);
		return user1;
	}

}
