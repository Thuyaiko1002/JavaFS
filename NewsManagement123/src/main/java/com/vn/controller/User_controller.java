package com.vn.controller;

import com.vn.dao.UserDAO;
import com.vn.dao.UserDAOImpl;
import com.vn.entities.User;

public class User_controller {
	static UserDAO userDAO = new UserDAOImpl();

	public static void main(String[] args) {
		// -------------------LIST USER-----------------------
		for (User list_user : userDAO.getAll()) {
			System.out.println("Info Article");
			System.out.println("ID : " + list_user.getId());
			System.out.println("Username : " + list_user.getUsername());
			System.out.println("Password : " + list_user.getPassword());
			System.out.println("Full Name: " + list_user.getFullname());
		}
		
//		// -------------------UPDATE--------------------------------
//		User upd_user = new User();
//		upd_user.setId(19);
//		upd_user.setUsername("thuyaiko123");
//		upd_user.setPassword("thuy123@");
//		upd_user.setFullname("Bùi Thị Thúy");
//		userDAO.update(upd_user);
//		System.out.println("Done!");
	}
}
