package com.vn.dao;

import java.util.List;
import com.vn.entities.User;

public interface UserDAO {

	public List<User> getAll();

	public User create(User user);

	public User update(User user);

	public User delete(User user);

}
