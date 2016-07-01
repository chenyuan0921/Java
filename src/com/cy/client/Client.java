package com.cy.client;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			InetAddress address = InetAddress.getLocalHost();
			
			Socket socket = new Socket(address, 30000);
			OutputStream os = socket.getOutputStream();
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
			writer.write("this is a test"+"\r\n");
			writer.write("this is a test"+"\r\n");
			
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
