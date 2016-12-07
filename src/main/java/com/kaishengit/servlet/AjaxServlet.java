package com.kaishengit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kaishengit.util.HttpUtil;

@WebServlet("/ajax.xml")
public class AjaxServlet extends HttpServlet{
	
	/*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "http://www.pingwest.com/feed/";
        String result = HttpUtil.sendHttpGetRequestWithString(url);

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/xml;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print(result);
        out.flush();
        out.close();
    }*/
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url="http://www.pingwest.com/feed/";
		String result=HttpUtil.sendHttpGetRequestWithString(url);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/xml;charset=UTF-8");
		
		PrintWriter out=resp.getWriter();
		
		out.print(result);
		out.flush();
		out.close();
		
		
	}
}
