package data.java.chap_1;

//import data.java.pack_a.*;
//import data.java.pack_a.pack_b.*;
//import data.java.pack_a.pack_b.pack_c.*;

public class Chap_1 {
	private static String pri_stat = "pri_stat";
	static String def_stat = "def_stat";
	protected static String pro_stat = "pro_stat";
	public static String pub_stat = "pub_stat";

	private String pri_non_stat = "pri_non_stat";
	protected String pro_non_stat = "pro_non_stat";
	String def_non_stat = "def_non_stat";
	public String pub_non_stat = "pub_non_stat";

	public static void main(String args[]) {
	//System.out.println("In Chap_1...pack_a long name = "+data.java.pack_a.Pack_a.pack_a_str);
	}
}//end class

//below not an inner class just another class compiled to same dir when Chap_1 is compiled;
class Chap_1_class {
	private static String pri_stat = "pri_stat";
	static String def_stat = "def_stat";
	protected static String pro_stat = "pro_stat";
	public static String pub_stat = "pub_stat";

	private String pri_non_stat = "pri_non_stat";
	protected String pro_non_stat = "pro_non_stat";
	String def_non_stat = "def_non_stat";
	public String pub_non_stat = "pub_non_stat";

	public static void main(String args[]) {
	//System.out.println("In Chap_1_class...");
	}
}
