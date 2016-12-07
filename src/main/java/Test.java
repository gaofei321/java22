import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.kaishengit.entity.Users;

public class Test {

	public static void main (String [] args)throws IOException{
		
		
		Users user1=new Users(1,"tom","beijing");
		Users user2=new Users(1,"rose","shanghai");
		Users user3=new Users(1,"jack","guangdong");
		
		List<Users> userList=Arrays.asList(user1,user2,user3);
		
		Gson gson=new Gson();
		String json=gson.toJson(userList);
		System.out.println(json);
		
		
		
		
		
		/*CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpPost httpPost=new HttpPost("http://xxxxx");
		
		List<NameValuePair> param=new ArrayList<NameValuePair>();
		
		param.add(new BasicNameValuePair("name", "tom"));
		param.add(new BasicNameValuePair("address", "beijing"));
		
		httpPost.setEntity(new UrlEncodedFormEntity(param));
		
		for(int i=0;i<5;i++){
		httpclient.execute(httpPost);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		/*请求一个网站上的图片地址并自动存储到自己电脑中
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpGet=new HttpGet("http://f.hiphotos.baidu.com/image/pic/item/a8014c086e061d9507500dd67ff40ad163d9cacd.jpg");
		HttpResponse response=httpClient.execute(httpGet);
		
		if(response.getStatusLine().getStatusCode()==200){
			InputStream inputStream=response.getEntity().getContent();
			OutputStream output=new FileOutputStream("F:/1.jpg");
			IOUtils.copy(inputStream, output);
			
			output.flush();
			output.close();
			inputStream.close();
		}else{
			System.out.println("服务端异常");
		}
		httpClient.close();
		*/
		
		

		
		
		
		
		/*//1.创建一个客户端
		CloseableHttpClient httpClient=HttpClients.createDefault();
		//2.设置请求方式和请求的地址
		HttpGet httpGet=new HttpGet("http://www.kaishengit.com");
		//3.发送请求和接受响应的值
		HttpResponse response=httpClient.execute(httpGet);
		//4.获取HTTP响应的状态码
		int statusCode=response.getStatusLine().getStatusCode();
		
			if(statusCode==200){
				//获取输入流
				InputStream inputStream=response.getEntity().getContent();
				//把输入流转换为字符串
				String result=IOUtils.toString(inputStream,"UTF-8");
				inputStream.close();
				
				System.out.println(result);
				
			}else{
				System.out.println("服务器异常"+statusCode);
			}
			httpClient.close();*/
		
	}
}
