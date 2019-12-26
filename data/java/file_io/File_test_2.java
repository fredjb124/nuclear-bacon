package data.java.file_io;
import java.io.*;

class File_test_2 {
	public static void main (String []args) {
	String [] listOfFiles = new String [10];
	
	try {
		File f1 = new File("Users/dads_mac/data/java/file_io/File_2_nav_0.txt");	
		File fd = new File("/Users/dads_mac/data/java/file_io/File_test");	
 		File homeDir = new File("/Users/dads_mac/data/java/file_io");
 		
		listOfFiles = homeDir.list();
		for(String s : listOfFiles) {
			System.out.println("In for loop of files..."+s);
			// if the param given is a file not a dir a nullpointer is thrown
		}
		
		System.out.println("In File_test_2 does the file exist... "+f1.exists());
		System.out.println("and can it read... "+f1.canRead());
		System.out.println("and can it write... "+f1.canWrite());
		System.out.println("and how about a dir... "+fd.exists());
		System.out.println("and Canonical path for file... "+f1.getCanonicalPath());
		System.out.println("and Canonical path for dir... "+fd.getCanonicalPath());

				
	} catch(IllegalArgumentException ie) {
			System.out.println("In Illegal arg catch... "+ie);
	} catch(NullPointerException npe) {
			System.out.println("In null pointer catch... "+npe);
	} catch(IOException ioe) {
			System.out.println("In IO exception... "+ioe);
	} finally {
			System.out.println("In finally... ");
	}
	System.out.println("After try catch finally... ");
	}//end main

}//end class

