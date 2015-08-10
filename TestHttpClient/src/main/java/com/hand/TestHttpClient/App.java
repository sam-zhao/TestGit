package com.hand.TestHttpClient;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Get get =new Get();
		get.start();
    }
}

class Get extends Thread
{
	/*
	 *创建标准的HttpClient
	 *注意：“=”号后面的HttpClient是有加s的 
	 */
	HttpClient client =HttpClients.createDefault();
	
	
	@Override
	public void run() {
		
		//注意：网页前面要加上http的头
		HttpGet get =new HttpGet("http://www.baidu.com");
		try {
			HttpResponse response=client.execute(get);
			//获取当前请求的结果
			HttpEntity entity = response.getEntity();
			//将entity返回成String类型的数据,并制定其编码
			String result = EntityUtils.toString(entity,"UTF-8");
			
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}