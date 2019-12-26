package data.java.base;

public interface Basic_inter {
	//private static String base_in_pri_stat = "base_in_pri_stat";
		//interface so cannot have private fields
	static String base_in_def_stat = "base_in_def_stat";
	//protected static String base_in_pro_stat = "base_in_pro_stat";
		//interface so cannot have protected fields
	public static String base_in_pub_stat = "base_in_pub_stat";

	//private String base_in_pri_non_stat = "base_in_pri_non_stat";
		//interface so cannot have private fields
	String base_in_def_non_stat = "base_in_def_non_stat";
	//protected String base_in_pro_non_stat = "base_in_pro_non_stat";
		//interface so cannot have protected fields
	public String base_in_pub_non_stat = "base_in_pub_non_stat";

	//both lines compile but both Strings are public static final regardless of how they are declared
	//cuz its an interface;
	String printFromInherited(String s);
	//above declared as default but is implicidly public and abstract no matter how they are defined;
	//so if you declare above the same way in another class (i.e. Base) the error will be cuz you
	//are declaring it default access in base and public here therefore changing access from def to public;
	public abstract String printFromInterface(String s);
	
	
}//end interface
