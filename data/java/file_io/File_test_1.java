package data.java.file_io;
import java.io.*;

class File_test_1 {
	public static void main (String []args) {

	try {

	//FileReader fr = new FileReader("C:/data/java/file_io/test_read.txt");
	//FileWriter fw = new FileWriter("C:/data/java/file_io/test_write.txt");
	
	FileReader fr = new FileReader("/Users/jamieburton/data/java/file_io/test_read.txt");
	FileWriter fw = new FileWriter("/Users/jamieburton/data/java/file_io/test_write.txt");
	char [] in = new char [100];
	int i=0;
	char c;
	//fr.read(in); //read into char []
/*	for(char c : in ) {
		System.out.println("reading file from char [] "+c);
		// this will display the full 200 size of the [] including the garbage.
		// or chop it off if less
	}
*/
//or below
//	for(int i=0;i<in.length;i++) {
//		System.out.println("In in [] char c = "+in[i]);
		// this will display the full 200 size of the [] including the garbage
		// also as the length() is 200 as declared above
//	}

	while( (i=fr.read()) != -1 ) {
		c = (char)i;
		fw.write(c);
		/*
		if(c=='\n') {
			System.out.println("c==newline");//actually works
		} else if(c==' ') {
			System.out.println("c==space");//actually works
		}	
	*/	
	//System.out.println("reading file from fr "+c); // to view as char
	//System.out.println("reading file from fr "+i); // to view as int
	}
	
    fr.close();
	fw.flush();
	fw.close();

	} catch(FileNotFoundException fnf) {
		System.out.println("In File_test_1...catch "+fnf);	
	} catch(IOException ioe) {
		System.out.println("In File_test_1...catch "+ioe);	
	} finally {
		System.out.println("In File_test_1...finally ");
	}//end finally
	
	}//end main

}//end class

