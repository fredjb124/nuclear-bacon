package data.java.net;

import java.net.*;
import java.io.*;

public class Net_ie {

	public static void main(String args[]) {
	int c;
	try {
	InetAddress ia = InetAddress.getLocalHost();
	//InetSocketAddress isa = new InetSocketAddress(ia,22);
	//Socket s = new Socket(ia,22);
	System.out.println("in Net_ie InetAddres..."+ia);
	//does not work ssh not supported in std java

	InputStream in = s.getInputStream();
	OutputStream out = s.getOutputStream();
	String str = "";
	byte b [] = str.getBytes();

	out.write(b);

	while ((c=in.read()) != -1) {
		System.out.print((char) c);
	}
	s.close();

	} catch(UnknownHostException ukh) {
		System.out.println("In Net_ie catch of Ukh..."+ukh);	
	} catch(IOException ioe) {
		System.out.println("In Net_ie catch of ioe..."+ioe);	
	} finally {
		System.out.println("In Net_ie finally.....");	
	}//end finally

	}//end main

}//end class
