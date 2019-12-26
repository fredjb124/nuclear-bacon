package data.java.file_io;
import java.io.*;

class File_test_4 {
	public static void main (String []args) {
	// this class copies a file using a data line stream as opposed to a char stream;
	try {

    File in_file = new File("/Users/jamieburton/data/java/file_io/file_4_test_in.txt");
    File out_file = new File("/Users/jamieburton/data/java/file_io/file_4_test_out.txt");

	DataInputStream in = new DataInputStream(new FileInputStream(in_file));
	DataOutputStream out = new DataOutputStream(new FileOutputStream(out_file));

    String line;
//this does not quite work properly should look into it as there is an exception thrown 
//at the end of the run	
//do not use without changing the below while loop; should use buffered input / output
	//readLine is deprecated
    while( (line = in.readUTF()) !=null ) {
	out.writeChars(line);
	out.writeChar('\n');
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

