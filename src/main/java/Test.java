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
		
		
		
		
		
		
		
		
		
		
		
		/*����һ����վ�ϵ�ͼƬ��ַ���Զ��洢���Լ�������
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
			System.out.println("������쳣");
		}
		httpClient.close();
		*/
		
		

		
		
		
		
		/*//1.����һ���ͻ���
		CloseableHttpClient httpClient=HttpClients.createDefault();
		//2.��������ʽ������ĵ�ַ
		HttpGet httpGet=new HttpGet("http://www.kaishengit.com");
		//3.��������ͽ�����Ӧ��ֵ
		HttpResponse response=httpClient.execute(httpGet);
		//4.��ȡHTTP��Ӧ��״̬��
		int statusCode=response.getStatusLine().getStatusCode();
		
			if(statusCode==200){
				//��ȡ������
				InputStream inputStream=response.getEntity().getContent();
				//��������ת��Ϊ�ַ���
				String result=IOUtils.toString(inputStream,"UTF-8");
				inputStream.close();
				
				System.out.println(result);
				
			}else{
				System.out.println("�������쳣"+statusCode);
			}
			httpClient.close();*/
		
	}
}
