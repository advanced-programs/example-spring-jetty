package zx.soft.example.controller;

import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import zx.soft.example.dao.UserDao;
import zx.soft.example.model.User;

@Controller
@RequestMapping("/users")
public class UserController {

	@Inject
	private UserDao userDao;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody User addUser(@RequestBody User user, HttpServletResponse response) {
		long uid = userDao.addUser(user);
		response.setHeader("Location", "/users/" + uid);
		return user;
	}

	@RequestMapping(value = "/{uid}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delUser(@PathVariable long uid) {
		userDao.delUser(uid);

	}

	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable long uid) {
		return userDao.getUser(uid);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Collection<User> getUsers() {
		return userDao.getUsers();
	}

}
