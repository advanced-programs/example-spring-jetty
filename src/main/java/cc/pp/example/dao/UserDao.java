package cc.pp.example.dao;

import java.util.Collection;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import cc.pp.example.model.User;

@Repository
public class UserDao {

	private final TreeMap<Long, User> users = new TreeMap<Long, User>();

	private static long index = 3;

	public UserDao() {
		users.put(Long.valueOf(1), new User(1, "张三", 18));
		users.put(Long.valueOf(2), new User(1, "李四", 21));
	}

	public long addUser(User user) {
		user.setId(index++);
		users.put(user.getId(), user);
		return index;
	}

	public void delUser(long uid) {
		users.remove(uid);
	}

	public User getUser(long uid) {
		return users.get(uid);
	}

	public Collection<User> getUsers() {
		return users.values();
	}

}
