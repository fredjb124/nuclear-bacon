package data.java.base;
import data.java.base.Many_0;

public class SameDirBase { 
	private static String pri_stat = " pri_stat ";
	static String def_stat = " def_stat ";
	protected static String pro_stat = " pro_stat ";
	public static String pub_stat = " pub_stat ";

	private String pri_non_stat = " pri_non_stat ";
    protected String pro_non_stat = " pro_non_stat ";
	String def_non_stat = " def_non_stat ";
	public String pub_non_stat = " pub_non_stat ";
		
	public static void main(String args[]) {
		System.out.println("In SameDirBase...statics = "+pub_stat+pro_stat+pri_stat+def_stat);
		System.out.println("In SameDirBase...from Many statics = "+Many_0.pub_stat+Many_0.pro_stat+Many_0.def_stat);
		//System.out.println("In SameDirBase...non statics = "+pub_non_stat+pro_non_stat+pri_non_stat+def_non_stat);
		//above compiler error - non statics referenced from static context
		//System.out.println("In SameDirBase...non statics = "+(new SameDirBase()).pub_non_stat);
		SameDirBase s = new SameDirBase();
		System.out.println("In SameDirBase...non statics = "+s.pub_non_stat+s.pri_non_stat+s.pro_non_stat+s.def_non_stat);

		
	}//end main


}//end class