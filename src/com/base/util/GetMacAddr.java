package com.base.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class GetMacAddr {
	public String getMACAddr()
		throws SocketException, UnknownHostException {
		//获得ip
//		NetworkInterface netInterface =NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
		NetworkInterface netInterface =NetworkInterface.getByInetAddress(InetAddress.getByName(UrlUtil.getUrlUtil().getLocip()));
		// 获得Mac地址的byte数组
		byte[] macAddr = netInterface.getHardwareAddress();
		System.out.print("MAC Addr:\t");
		// 循环输出
		String arr="";
		for(int i=0 ; i<macAddr.length;i++){
			if(i==macAddr.length-1){
				arr+=toHexString(macAddr[i]);
			}else{
				arr+=toHexString(macAddr[i])+"-";
			}
		}
		return arr;
	}
	private static String toHexString(int integer) {
		// 将得来的int类型数字转化为十六进制数
		String str = Integer.toHexString((integer & 0xff));
		// 如果遇到单字符，前置0占位补满两格
		if (str.length() == 1) {
		str = "0" + str;
		}
		return str;
	}
	//根据licence.dat
	public String getlic(String path) {
		String line="";
		try {
			File file = new File(path+"licence");
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader reader = new BufferedReader(read);
			if((line = reader.readLine()) != null){
				return line;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return line;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return line;
		} catch (IOException e) {
			e.printStackTrace();
			return line;
		}
		return line;
	}
}
