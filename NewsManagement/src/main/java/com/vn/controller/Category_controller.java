package com.vn.controller;

import com.vn.dao.CategoryDAO;
import com.vn.dao.CategoryDAOImpl;
import com.vn.entities.Category;

public class Category_controller {

	static CategoryDAO categoryDAO = new CategoryDAOImpl();

	public static void main(String[] args) {

		// -------------------LIST CATEGORIES-----------------------
		System.out.println("Info Categories");
		for (Category list_cate : categoryDAO.getAll()) {
			System.out.println("ID : " + list_cate.getId());
			System.out.println("Category ID : " + list_cate.getName());
		}
//		// -------------------INSERT--------------------------------
//		Category ins_category = new Category();
//		ins_category.setName("Tin thế giới");
//		categoryDAO.create(ins_category);
//		System.out.println("Done!");
		
//		// -------------------UPDATE--------------------------------
//		Category upd_category = new Category();
//		upd_category.setId(1);
//		upd_category.setName("Tin trong nước");
//		categoryDAO.update(upd_category);
//		System.out.println("Done!");
		
//		// -------------------DELETE--------------------------------
//		Category del_category = new Category();
//		del_category.setId(24);
//		categoryDAO.delete(del_category);
//		System.out.println("Done!");
	}
}
