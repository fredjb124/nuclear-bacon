package data.java.file_io;
import java.io.*;

class File_test_3 {
	public static void main (String []args) {
	// this class copies a file using a line stream as opposed to a char stream;
	try {

    File in_file = new File("/Users/jamieburton/data/java/file_io/file_3_test_in.txt");
    File out_file = new File("/Users/jamieburton/data/java/file_io/file_3_test_out.txt");

	BufferedReader in = new BufferedReader(new FileReader(in_file));
	BufferedWriter out = new BufferedWriter(new FileWriter(out_file));

    String line;
	
    while( (line = in.readLine()) !=null ) {
	out.write(line);
	out.newLine();
    }	

   	in.close();
   	out.close();

	} catch(FileNotFoundException fnf) {
		System.out.println("In File_test_0...catch "+fnf);	
	} catch(IOException ioe) {
		System.out.println("In File_test_0...catch "+ioe);	
	} finally {
		System.out.println("In File_test_0...finally ");
	}//end finally
	
	}//end main

}//end class

