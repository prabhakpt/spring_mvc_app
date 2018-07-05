package com.tss.services.services;

import java.net.InetAddress;
import java.net.Socket;

public class ServerStatusService {
	public void servetConnectionTest() {
	      try {
	         InetAddress addr;
	         Socket sock = new Socket("", );
	         addr = sock.getInetAddress();
	         System.out.println("Connected to " + addr);
	         sock.close();
	      } catch (java.io.IOException e) {
	         //System.out.println("Can't connect to " + args[0]);
	         System.out.println(e);
	      }
	   }
}
