package com.tss.services.services;

import java.net.HttpURLConnection;
import java.net.URL;

public class ServerStatusService2 {
	private static int sendGet() throws Exception {
		  URL obj = new URL("");
		  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		  // optional default is GET
		  con.setRequestMethod("GET");
		  System.out.println(con.getInputStream());
		  int responseCode = con.getResponseCode();
		  System.out.println("Response Code : " + responseCode);
		  return responseCode;
		}
	
	public static void main(String[] args) {
		try {
			System.out.println(sendGet());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
