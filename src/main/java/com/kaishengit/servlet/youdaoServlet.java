package com.kaishengit.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.kaishengit.util.HttpUtil;

@WebServlet("/youdao.xml")
public class youdaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String query=req.getParameter("query");
		
		
		String url="http://fanyi.youdao.com/openapi.do?keyfrom=kaishengit&key=1587754017&type=data&doctype=xml&version=1.1&q=" + query;
		String result=HttpUtil.sendHttpGetRequestWithString(url);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/xml;charset=UTF-8");
		
		System.out.println(result);
			PrintWriter out=resp.getWriter();
			out.print(result);
			out.flush();
			out.close();
			
		/*CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpGet=new HttpGet("http://fanyi.youdao.com/openapi.do?keyfrom=kaishengit&key=1587754017&type=data&doctype=xml&version=1.1&q=" + query);
		HttpResponse response=httpClient.execute(httpGet);
		
		if(response.getStatusLine().getStatusCode()==200){
			InputStream inputStream=response.getEntity().getContent();
			String result=IOUtils.toString(inputStream,"UTF-8");
			
			
			
		}else{
			throw new RuntimeException("·þÎñÆ÷Òì³£"+response.getStatusLine().getStatusCode());
		}*/
		
		
		
		
		
		
		
		
		
		
	}
}
