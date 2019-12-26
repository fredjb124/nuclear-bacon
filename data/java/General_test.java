package data.java;

import java.lang.*;
import java.util.*;
import java.sql.*;

public class General_test extends MyPrintAndList {

public General_test(){
 System.out.println("in constructor");
}//end contructor

public int i = 0;

public int getInt(boolean b) { System.out.println("boolean = "+b); return i;}

public boolean isValid(String str){

for(int i=0; i< str.length();i++) {
 char c = str.charAt(i);
 System.out.println("char = "+c);
 System.out.println("value = "+Character.digit(c,0));
}
 return true;
}//end getInt

public static String removeDuplicateSpaces(String source) {

StringTokenizer st = new StringTokenizer(source);
StringBuffer result = new StringBuffer();

 while (st.hasMoreElements()) {
 result.append(st.nextToken());

 if (st.hasMoreElements()) {
 result.append(" ");
 }
 }//end while

return result.toString();
}//end removeDuplicateSpaces

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
}//end cfte

public static void main(String args[]) throws SQLException {
 //System.out.println("In general = ");
 /*
 int j = 2;
 int k = 3;
 int m = 0;

 byte a = (byte) 1;
 byte b = (byte) 2;
 byte c = (byte) (a+b);
 byte d = (byte) (k+=j);
 m = 128;
 d = (byte) 128;

 //m=(byte)m;

 System.out.println("In general j = k = d = "+j+" "+k+" "+d+" ");
 System.out.println("In general m = "+m);

 General_test gt = new General_test();
 // _ = 95 @ = 64 . = 46 - = 45 , = 44
 // not allowed is above as first char

int iy=1; 
String ay="a";

 if ( (iy = gt.getInt( (ay.equals("a")) ? true:false)) == 0 ) {
 System.out.println("in if.... i does = 0");

 }else { System.out.println("in else... doesn't = 0"); }

 System.out.println("out if all ifs i = "+iy);

 String ax = ""; String bx = ""; String cx="";
 cx = ax.equals("") ? "true":"false";
 System.out.println("cx = "+cx);

 //String email_str="jamie.burton@cibc.com";
 String email_str="1234567890!@#$%^&*()";
 int i = '\'';
 char c = 'd';

 System.out.println("int = "+i);
 System.out.println("char = "+(int)c);
 if(i < (int)c) System.out.println("its less ");

 //System.out.println("is email valid = "+gt.isValid(email_str));
 //String a = "abc def";
 //System.out.println(removeDuplicateSpaces(a));
*/
 //java.util.Date d = new Date("1/1/2000");
 //System.out.println("date is "+d);
 /*String a = "a";
 String b = (String) a;
 System.out.println("b is "+b);
 */
 /*
 long y=1000; int x=0;
 for(int i=1;i<=65;i++) {
 y=Math.round(y*1.5)+x;
 System.out.println("after "+i+" years tot = "+y);

 }//end for
 */
 //String amount = "-262,83";

 //System.out.println("amount = "+cfte(amount));

 //for(int i=0; i<=10;System.out.println("year "+i+" = "+ i++%50));

 /*
 System.out.println("="+999 %10);
 int value = 114;
 String [] friendly_name = new String [] {"con", "is", "sbb", "visa", "invalid"};
 String str = friendly_name [ value!=-1 ? ( value==4 ? value %10 -1 : value %10 ) : 4] ;

another ternary ie below from r15 com/cibc/web/webapp/accounts/struts/form/UpdateAccountNicknameForm.java
this.nickname = nickname == null || "".equals(nickname.trim()) ?
                null : SPACE_COMPRESS.matcher(nickname.trim()).replaceAll(" ");

 System.out.println("str ="+str);
 //String a[] = new String [] {"a","b","c","d"};
 //System.out.println("0 ="+a[ (a.length == 4) ? 0:1]);
 //System.out.println("0 ="+a[0]);
 /*
 String s = null;

 if (s.equals("") || "null".equals(s)) {
System.out.println("s ="+s);
}
*/
//printAll(gt);

System.out.println("pension stuff....");


}//end main
}//end class

