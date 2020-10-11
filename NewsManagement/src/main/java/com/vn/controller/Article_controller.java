package com.vn.controller;

import com.vn.dao.ArticleDAO;
import com.vn.dao.ArticleDAOImpl;
import com.vn.dao.CategoryDAO;
import com.vn.dao.CategoryDAOImpl;
import com.vn.dao.UserDAO;
import com.vn.dao.UserDAOImpl;
import com.vn.entities.Article;
import com.vn.entities.Category;
import com.vn.entities.User;

public class Article_controller {

	static ArticleDAO articleDao = new ArticleDAOImpl();
	static CategoryDAO categoryDAO = new CategoryDAOImpl();
	static UserDAO userDAO = new UserDAOImpl();

	public static void main(String[] args) {

//		// -------------------LIST ARTICLE-----------------------
//		System.out.println("Info Article");
//		for (Article list_art : articleDao.getAll()) {
//			System.out.println("ID : " + list_art.getId());
//			System.out.println("Category ID : " + list_art.getCategory());
//			System.out.println("User ID : " + list_art.getUser());
//			System.out.println("Name : " + list_art.getName());
//			System.out.println("Image : " + list_art.getImage());
//			System.out.println("Summary : " + list_art.getSummary());
//			System.out.println("Content : " + list_art.getContent());
//			System.out.println("Create Time : " + list_art.getCreateTime());
//		}
		// -------------------INSERT--------------------------------
		Category ins_category = new Category();
		ins_category.setId(2);
		User ins_user = new User();
		ins_user.setUsername("thuy1");
		ins_user.setPassword("12345678");
		ins_user.setFullname("Bùi Thị Thúy");
		userDAO.create(ins_user);
		Article ins_article = new Article();
		ins_article.setCategory(ins_category);
		ins_article.setUser(ins_user);
		ins_article.setName("Thông tin về Tiêu chiến.");
		ins_article.setImage("D:\\unnamed.jpg");
		ins_article.setSummary("Tiêu Chiến là một diễn viên.");
		ins_article.setContent(
				"Tiêu Chiến (tiếng Trung: 肖战; phiên âm: Xiao Zhan) (sinh ngày 5 tháng 10 năm 1991) là một nam diễn viên, ca sĩ người Trung Quốc, thành viên của nhóm nhạc nam XNINE (X Cửu Thiếu Niên Đoàn). Tên Fandom là Tiểu Phi Hiệp (tiếng Trung:小飞侠).");
		ins_article.setCreateTime(java.util.Calendar.getInstance().getTime());
		// insert
		articleDao.create(ins_article);
		System.out.println("Done!");

//		// -------------------UPDATE--------------------------------
//		Category upd_category = new Category();
//		upd_category.setId(3);
//		User upd_user = new User();
//		upd_user.setId(19);
//		Article up_article = new Article();
//		up_article.setId(1);
//		up_article.setCategory(upd_category);
//		up_article.setUser(upd_user);
//		up_article.setName("Thông tin về Tiêu chiến 1.");
//		up_article.setImage("D:\\unnamed.jpg");
//		up_article.setSummary("Tiêu Chiến là một diễn viên trẻ.");
//		up_article.setContent(
//				"Tiêu Chiến (tiếng Trung: 肖战; phiên âm: Xiao Zhan) (sinh ngày 5 tháng 10 năm 1991) là một nam diễn viên, ca sĩ người Trung Quốc, thành viên của nhóm nhạc nam XNINE (X Cửu Thiếu Niên Đoàn). Tên Fandom là Tiểu Phi Hiệp (tiếng Trung:小飞侠).");
//		up_article.setCreateTime(java.util.Calendar.getInstance().getTime());
//		articleDao.update(up_article);
//		System.out.println("Done!");
//
//		// -------------------Delete--------------------------------
//		Article del_article = new Article();
//		del_article.setId(2);
//		articleDao.delete(del_article);
//		System.out.println("Done!");
	}
}
