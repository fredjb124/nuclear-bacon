import java.lang.*;
import java.util.*;

public class General_test {

	public int sti=17;

	public General_test () {
		System.out.println("in General_test constructor\n sti="+sti);
	}

	public int getSTI() {return sti;}

	public class Inside {
        	public int in_pub=getSTI();

	public int getSTI_ins() {return sti;}
	
	public Inside () {
		System.out.println("in inside constructor\n int in_pub ="+in_pub);
	}

	}//end inside


	public static void main(String args[]) {

	System.out.println("in General_test class");
	General_test gt = new General_test();
	General_test.Inside gti = gt.new Inside();

	gt.sti++;
	System.out.println("in General_test class after incrementing the public static int sti\n sti="+gt.sti);
	gt.sti--;
	System.out.println("in General_test class after decrementing the public static int sti\n sti="+gt.sti);

	System.out.println("in General_test class inside class var in_pub="+gti.in_pub);
	
	//access to gt vars only from get method either in declaration or in main below error
	//System.out.println("in General_test class inside class var in_pub="+gti.sti);

	//value of gt var via declaration
	System.out.println("in General_test class inside class var in_pub="+gti.in_pub);
	//value by get method in Inside
	System.out.println("in General_test class inside class var in_pub="+gti.getSTI_ins());
	
		
	}//end main

}//end class

