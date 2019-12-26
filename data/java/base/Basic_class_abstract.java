package data.java.base;

abstract class Basic_class_abstract {
	//private static String base_ab_pri_stat = "base_ab_pri_stat";
	static String base_ab_def_stat = "base_ab_def_stat";
	//protected static String base_ab_pro_stat = "base_ab_pro_stat";
	public static String base_ab_pub_stat = "base_ab_pub_stat";

	//private String base_ab_pri_non_stat = "base_ab_pri_non_stat";
	String base_ab_def_non_stat = "base_ab_def_non_stat";
	//protected String base_ab_pro_non_stat = "base_ab_pro_non_stat";
	public String base_ab_pub_non_stat = "base_ab_pub_non_stat";

	public abstract String printFromInherited(String s);
	// cuz this is an abstract class the above needs to be declared abstract or not
	// above not defined as public so it will have access limitations;
	
	public abstract String printFromClassAbstract(String s);
	// cuz this is an abstract class the above needs to be declared abstract or not
	//so this is very similar to Basic_inter defined in the same dir	

		
}//end class
