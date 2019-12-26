package data.java.runtime;

import java.io.*;

public class Run_time_test {

	public static void main(String args[]) {
	String s;

	try {
		Process p = Runtime.getRuntime().exec("touch fred.txt");
		
		System.out.println("In run time process = "+p.waitFor());
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		BufferedReader be = new BufferedReader(new InputStreamReader(p.getErrorStream()));

		System.out.println("In run time process here is the output..");
		while ((s=br.readLine()) != null) {
			System.out.println(s);
		}

		System.out.println("In run time process here are the errors..");
		while ((s=be.readLine()) != null) {
			System.out.println(s);
		}

		System.exit(0);

	} catch(IOException ioe) {
		System.out.println("In run time test catch.."+ioe);
		ioe.printStackTrace();
		System.exit(-1);

	} catch(InterruptedException ie) {
		System.out.println("In run time test catch interrupted .."+ie);
	} finally {
		System.out.println("In run time test finally ..");
	}


	}//end main



}//end class
