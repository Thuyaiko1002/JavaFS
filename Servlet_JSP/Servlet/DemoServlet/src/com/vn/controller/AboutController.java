package com.vn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet..........");
		request.setAttribute("message", "Error");
		request.getRequestDispatcher("about.jsp").forward(request, response);
//		PrintWriter printWriter = response.getWriter();
//		response.setContentType("text/plan");
//		printWriter.write("<html>");
//		printWriter.write("<body>");
//		printWriter.write("<a href = 'http://google.com'>Google.com</a>");
//		printWriter.write("</body>");
//		printWriter.write("</html>");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init..........");
		super.init();

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost..........");
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html>");
		printWriter.write("<body>");
		printWriter.write("<a href = 'http://google.com'>Google.com</a>");
		printWriter.write("</body>");
		printWriter.write("</html>");

	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service..........");
		super.service(req, resp);
	}
}
