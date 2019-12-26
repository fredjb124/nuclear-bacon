package data.java;

import java.lang.*;
import java.util.*;
import java.sql.*;
//import oracle.jdbc.driver.*;


public class General_test_1 {

	public General_test_1(){
 		System.out.println("in constructor");
	}

	public int i = 0;

	public int getInt(boolean b) { System.out.println("boolean = "+b); return i;}

	public boolean isValid(String str){

		for(int i=0; i< str.length();i++) {
 			char c = str.charAt(i);
			System.out.println("char = "+c);
			 System.out.println("value = "+Character.digit(c,0));
		}
	return true;
	}


	public static String removeDuplicateSpaces(String source) {

		StringTokenizer st = new StringTokenizer(source);
		StringBuffer result = new StringBuffer();

		 while (st.hasMoreElements()) {
			 result.append(st.nextToken());
			 if (st.hasMoreElements()) {
 				result.append(" ");
			 }
		}

	return result.toString();
	}


	public static String cfte(String aAmount) {

		int fromIndex = aAmount.indexOf(",");

		if (fromIndex >= 0) {
			aAmount = aAmount.replace(',', '.');
		}

		fromIndex = aAmount.indexOf("-");

		if (fromIndex >= 0) {
			String negativeSign = "-";
			aAmount = negativeSign + aAmount.substring(0, fromIndex);
		}

	return aAmount;
	}


	public static void main(String args[]) throws SQLException {
		System.out.println("In general = ");
		int j = 2;
 		int k = 3;
 		int m = 0;

 		byte ab = (byte) 1;
 		byte bb = (byte) 2;
 		byte cb = (byte) (ab+bb);
 		byte db = (byte) (k+=j);
 		m = 128;
 		db = (byte) 128;
 		//m=(byte)m;

 		System.out.println("In general j = k = db = "+j+" "+k+" "+db+" ");
	 	System.out.println("In general m = "+m);

 		General_test_1 gt = new General_test_1();

 		// _ = 95 @ = 64 . = 46 - = 45 , = 44
 		// not allowed is above as first char

 		int i=1; 
		String a="a";
 		if ( (i = gt.getInt( (a.equals("a")) ? true:false)) == 0 ) {
 			System.out.println("i does = 0");
 			}
			else 
			{ 
			System.out.println("i doesn't = 0"); 
		}
 		System.out.println("i = "+i);

 		//a = "abc"; String b= ""; String c = b;
		// test null exception
 		a = null; String b = ""; String c = "";
		
		try 
		{
 			c = (a.equals("")) ? "true" : "false:";
			System.out.println("from ternery operator c = "+c);
		} 
		catch (NullPointerException e)
		{
			System.out.println("null excepton caught..."+e.getMessage());
		}


 		String email_str="jamie.burton@cibc.com";
 		String email_str1="1234567890!@#$%^&*()";

 		int ia = '\'';
 		char cc = 'd';

 		System.out.println("int = "+ia);
 		System.out.println("char = "+(int)cc);

 		if(ia < (int)cc) System.out.println("its less ");

 		//System.out.println("is email valid = "+gt.isValid(email_str));
 		//String a = "abc def";
 		//System.out.println(removeDuplicateSpaces(a));

		//recompile depreciation warning below using date
 		//java.util.Date d = new java.util.Date("1/1/2000");
 		//System.out.println("date is "+d);

 		String aa = "a";
 		String bbb = (String) aa;
	 	System.out.println("b is "+bbb);
 

 		long y=1000; int x=0;
		//p value changed to 5 for brevity
	 	for(int p=1;p<=5;p++) {
 			y=Math.round(y*1.5)+x;
 			System.out.println("after "+p+" years tot = "+y);
 		}
 
 		//String amount = "-262,83";

 		//System.out.println("amount = "+cfte(amount));

 		//for(int i=0; i<=10;System.out.println("year "+i+" = "+ i++%50));
 
 		System.out.println("="+999 %10);
 		int value = 114;
 		String [] friendly_name = new String [] {"con", "is", "sbb", "visa", "invalid"};

 		String str = friendly_name [ value!=-1 ? ( value==4 ? value %10 -1 : value %10 ) : 4] ;

 		System.out.println("str ="+str);
 
 		String ar[] = new String [] {"a","b","c","d"};
 		System.out.println("0 ="+ar[ (aa.length() == 4) ? 0:1]);
 		System.out.println("0 ="+ar[0]);

 		String s = null;
		try {
 			if (s.equals("") || "null".equals(s)) {
			System.out.println("s ="+s);
			}
		}
		catch (NullPointerException e) {	
			System.out.println("in catch null pointer message = "+e.getMessage());
		}

	}//end main
}//end class


