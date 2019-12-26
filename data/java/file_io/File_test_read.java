package data.java.file_io;
import java.io.*;

class File_test_read {
	public static void main (String []args) {

	try {

	FileReader fileReader = new FileReader(new File("/Users/dads_mac/data/java/file_io/env_test.response"));
	FileReader fr_env_test1 = new FileReader(new File("/Users/dads_mac/data/java/file_io/env_test_1.response"));

	BufferedReader bufferedReader = new BufferedReader(fileReader);
	BufferedReader br_env_test1 = new BufferedReader(fr_env_test1);
	
	StringBuilder stringBuilder = new StringBuilder();
	StringBuilder the_lot = new StringBuilder();

   	String line="";
   	String same="LOCATION";
	
//read in all env_test_1 file to StringBuilder the_lot
	
        while((line = br_env_test1.readLine()) !=null) {
			//if is needed to avoid index out of bounds exception (-2) although value is -1
			if(!line.startsWith("#"))  {
				if(line.indexOf("=") > 0)  {
					line=line.substring(0,line.indexOf("=")+1);
					//System.out.println(line);	
					the_lot.append(line);
					the_lot.append("\n");
				}
			}
    	 }	
   	 fr_env_test1.close();

	 System.out.println(the_lot.toString());	

//read in all env_test file to StringBuilder stringBuilder
	
        while((line = bufferedReader.readLine()) !=null) {
			//if is needed to avoid index out of bounds exception (-2) although value is -1
			if(!line.startsWith("#"))  {
				if(line.indexOf("=") > 0)  {
					line=line.substring(0,line.indexOf("=")+1);
					//System.out.println(line);	
					stringBuilder.append(line);
					stringBuilder.append("\n");
					if(the_lot.indexOf(line) < 0)	{
						System.out.println("\nThis value ("+line+") was not found in env_test_1... \n");	
					}
				}
			}
    	 }	
	 fileReader.close();

	 System.out.println(stringBuilder.toString());	

	} catch(IOException ioe) {
		ioe.printStackTrace();	
	}
	
	}//end main

}//end class

