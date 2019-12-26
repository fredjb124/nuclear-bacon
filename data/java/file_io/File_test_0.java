package data.java.file_io;
import java.io.*;

class File_test_0 {
	public static void main (String []args) {
	try {

    BufferedReader br = new BufferedReader(new FileReader("/Users/jamieburton/data/java/file_io/test_read.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/jamieburton/data/java/file_io/test_write.txt"));
    String readFile;
	
    while( (readFile = br.readLine()) !=null ) {
    	System.out.println("reading file ...\n"+readFile);
    }	
   	br.close();

    /*
	java.util.Calendar c = java.util.Calendar.getInstance();
	System.out.println(" date is "+c);

	java.util.Date d = new java.util.Date();
	System.out.println(" date is "+d);
	//same as Calendar above;
	java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();
	System.out.println(" date is "+sdf.getCalendar());

	java.util.Calendar gc = new java.util.GregorianCalendar(java.util.TimeZone.getDefault());
	gc.setTime(new java.util.Date());
	System.out.println(" date is "+gc.get(Calendar.DATE));

	*/
	java.util.Date d = new java.util.Date();
	System.out.println(" date is "+d);



   	PrintWriter pw = new PrintWriter(new File("/Users/jamieburton/data/java/file_io/newFile.txt"));
   	pw.println("this is a newly created file \n");
   	pw.println("this prints stuff to the file\n");
	pw.flush();
	pw.close();
	
	} catch(FileNotFoundException fnf) {
		System.out.println("In File_test_0...catch "+fnf);	
	} catch(IOException ioe) {
		System.out.println("In File_test_0...catch "+ioe);	
	} finally {
		System.out.println("In File_test_0...finally ");
	}//end finally
	
	}//end main

}//end class

