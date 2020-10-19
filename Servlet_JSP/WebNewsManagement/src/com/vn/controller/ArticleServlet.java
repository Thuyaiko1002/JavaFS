package com.vn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.dao.ArticleDAO;
import com.vn.dao.ArticleDAOImpl;
import com.vn.entities.Article;

@WebServlet(urlPatterns = { "/article" })
public class ArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static ArticleDAO articleDao = new ArticleDAOImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Article> list = new ArrayList<Article>();
		list = articleDao.getAll();
		request.setAttribute("name", list);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/article.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}