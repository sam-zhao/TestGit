package com.hand;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner;

	public static void main( String[] args )
    {
    	String s1="",s2="",s3="",s4="";
    	int sum[]=new int[50];
    	int a1=0,a2=0;
    	int str1[] = new int[50],str2[] = new int[50];
    	for(int i=0;i<50;i++){
//    		Random rand=new Random();
//    		sum[i]=rand.nextInt(100);
    		sum[i]=(int)(Math.random() * 100);
    	}
    	System.out.println("输入50个小于100的整数，分别为：");
    	for(int j=0;j<sum.length;j++){
    		if(j==49){
    	    System.out.println(sum[j]+" ");
    		}else{
    		System.out.print(sum[j]+" ");}
    	}
    	System.out.println("MAP中的数据为：");
    	for(int k=0;k<50;k++){
    		int m=(int) Math.floor(sum[k]/10);
    		switch (m) {
			case 1:
				str1[a1]=sum[k];
				a1++;
				break;
			case 2:
				str2[a2]=sum[k];
				a2++;
				break;
			default:
				break;
			} 
    	}
    	Map<String,String> map=new HashMap<String,String>();
    	for(int l=0;l<a1;l++){
    	s1=s1+str1[l]+" ";
    	}
    	for(int b=0;b<a2;b++){
        	s2=s2+str2[b]+" ";
        	}
    	map.put("1",s1);
    	map.put("2",s2);
		System.out.println("1=>"+map.get("1"));
		System.out.println("2=>"+map.get("2"));
		System.out.println("排列后Map中的数据为：");
		for(int h=0;h<a1;h++){
			for(int h1=0;h1<a1-1;h1++){
				if(str1[h1+1]<str1[h1]){
					int temp = str1[h1+1];
					str1[h1+1] = str1[h1];
					str1[h1] = temp;
				}
			}
		}
		for(int g=0;g<a2;g++){
			for(int g1=0;g1<a2-1;g1++){
				if(str2[g1+1]<str2[g1]){
					int temp1 = str2[g1+1];
					str2[g1+1] = str2[g1];
					str2[g1] = temp1;
				}
			}
		}
		Map<String,String> map1=new HashMap<String,String>();
		for(int l=0;l<a1;l++){
	    	s3=s3+str1[l]+" ";
	    	}
	    	for(int b=0;b<a2;b++){
	        	s4=s4+str2[b]+" ";
	        	}
	    	map1.put("1",s3);
	    	map1.put("2",s4);
			System.out.println("1=>"+map1.get("1"));
			System.out.println("2=>"+map1.get("2"));
    }
}
