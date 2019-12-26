package data.java;

public class MyFix {
	public static String removeSlash(String a) {
	System.out.println("a = "+a.substring(1,a.length()));
	return a.substring(1,a.length());
	}
	public static void main(String args[]) {
		try {
		
			//System.out.println("In My Fix before change "+args[0]);
			System.out.println("In My Fix after  change "+MyFix.removeSlash(args[0]));
		
		} catch(ArrayIndexOutOfBoundsException a) {
		  a.printStackTrace();	
		  System.out.println("In My Fix catch caught exception ending nicely "+a);
		}
	      finally {
		  System.out.println("In My Fix finally ending nicely... ");
	    }
    	System.out.println("In My Fix after change and after exception thrown ");
	}

}//end class