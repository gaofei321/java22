package com.kaishengit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kaishengit.entity.Users;

@WebServlet("/readJson.json")
public class jsonServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json;charset=UTF-8");
		
		Users user1=new Users(1,"tom","beijing");
		Users user2=new Users(1,"rose","shanghai");
		Users user3=new Users(1,"jack","guangdong");
		
		List<Users> userList=Arrays.asList(user1,user2,user3);
		
		Gson gson=new Gson();	
		String json=gson.toJson(userList);
		
		PrintWriter out=resp.getWriter();
		out.print(json);
		out.flush();
		out.close();
		
	}
	
	
	
}
