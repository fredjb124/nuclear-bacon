package data.java.base;
import data.java.MyPrintAndList;

//public class Base { 
public class Base extends Basic_class_abstract implements Basic_inter { 
	private static String base_pri_stat = "base_pri_stat";
	static String base_def_stat = "base_def_stat";
	protected static String base_pro_stat = "base_pro_stat";
	public static String base_pub_stat = "base_pub_stat";

	private String base_pri_non_stat = "base_pri_non_stat";
	String base_def_non_stat = "base_def_non_stat";
	protected String base_pro_non_stat = "base_pro_non_stat";
	public String base_pub_non_stat = "base_pub_non_stat";

	public String printFromInherited(String s) {
		String any = "";
		//if(s.equals("in")) any = base_in_pub_non_stat;
		//else if(s.equals("ab")) any = base_ab_pub_non_stat;
		return any;
	}
  
	public String printFromInterface(String s) {
		//return base_in_pub_non_stat;
		return s;
	}
  
	public String printFromClassAbstract(String s) {
		return base_ab_pub_non_stat;
		//return s;
	}

	public static void main(String args[]) {
		Base b = new Base();
		//b.base_in_pub_non_stat = "z";
		//above produces compiler error as field is final (interface)
		//below does not however as it is from an abstract class;
		//b.base_ab_pub_non_stat = "z";

		MyPrintAndList.printAll(b);
/*
		System.out.println("In Base...in from printFromInherited() "+b.printFromInherited("in"));
        System.out.println("In Base...ab from printFromInherited() "+b.printFromInherited("ab"));
        System.out.println("In Base...from printFromInterface() "+b.printFromInterface("in"));
        System.out.println("In Base...from printFromClassAbstract() "+b.printFromClassAbstract("ca"));

        System.out.println("In Base...accessing static var via class..."+Base.base_pri_stat);
        System.out.println("In Base...accessing static var via class..."+Base.base_pro_stat);
        System.out.println("In Base...accessing static var via class..."+Base.base_def_stat);
        System.out.println("In Base...accessing static var via class..."+Base.base_pub_stat);

        System.out.println("In Base...accessing static var via obj ref..."+b.base_pub_stat);

        System.out.println("In Base...base_pri_non_stat "+b.base_pri_non_stat);
        System.out.println("In Base...base_def_non_stat "+b.base_def_non_stat);
        System.out.println("In Base...base_pro_non_stat "+b.base_pro_non_stat);
        System.out.println("In Base...base_pub_non_stat "+b.base_pub_non_stat);

        System.out.println("In Base...base_in_def_non_stat "+b.base_in_def_non_stat);
        System.out.println("In Base...base_in_pub_non_stat "+b.base_in_pub_non_stat);

        System.out.println("In Base...base_ab_def_non_stat "+b.base_ab_def_non_stat);
        System.out.println("In Base...base_ab_pro_non_stat "+b.base_ab_pro_non_stat);
        System.out.println("In Base...base_ab_pub_non_stat "+b.base_ab_pub_non_stat);

		System.out.println("In Base...base_in from printFromInherited() "+b.printFromInherited("in"));
		System.out.println("In Base...base_ab from printFromInherited() "+b.printFromInherited("ab"));

		System.out.println("In Base...b.getClass().."+b.getClass());
		System.out.println("In Base...b.getClass.getSuperclass().."+b.getClass().getSuperclass());
		System.out.println("In Base...b.getClass.getCanonicalName().."+b.getClass().getCanonicalName());
		System.out.println("In Base...b.getClass.getDeclaredClasses()"+b.getClass().getDeclaredClasses());
		System.out.println("In Base...b.getDeclaringClass()..."+b.getClass().getDeclaringClass()); 
		System.out.println("In Base...b.getEnclosingClass()..."+b.getClass().getEnclosingClass()); 
		System.out.println("In Base...b.getClassLoader()..."+b.getClass().getClassLoader()); 

*/
/*		
		System.out.println("...");
		for (java.lang.reflect.Field f: b.getClass().getSuperclass().getDeclaredFields()) {
			System.out.println("In Base..list of b.getClass().getSuperclass().getDeclaredFields()= "+f);
		}

		System.out.println("...");
		for (java.lang.reflect.Field f: b.getClass().getSuperclass().getFields()) {
			System.out.println("In Base...b.getClass().getSuperclass().getFields()= "+f);
		}

		System.out.println("...");
		for (java.lang.reflect.Field f: b.getClass().getDeclaredFields()) {
			System.out.println("In Base...list of b.getClass().getDeclaredFields()= "+f);
		}

		System.out.println("...");
		for (java.lang.reflect.Field f: b.getClass().getFields()) {
			System.out.println("In Base...b.getClass().getFields()= "+f);
		}

		System.out.println("...");
		for (java.lang.Class c: b.getClass().getSuperclass().getClasses()) {
			System.out.println("In Base...list of b.getClass().getSuoerclass().getClasses()= "+c);
		}

		System.out.println("In getClasses...");
		for (java.lang.Class c: b.getClass().getClasses()) {
			System.out.println("In Base...list of b.getClass().getClasses()= "+c);
		}

		System.out.println("In getInterfaces...");
		for (java.lang.Class c: b.getClass().getInterfaces()) {
			System.out.println("In Base...b.getClass().getInterfaces()= "+c);
		}

		System.out.println("List the superclass field names.......");
		java.lang.reflect.Field [] field_array = b.getClass().getSuperclass().getDeclaredFields();
		if (field_array != null) {
			for (java.lang.reflect.Field field: field_array) 
			System.out.println("In Base..list of b.getClass().getSuperclass().getDeclaredFields()= "+field.getName());
		} else {
			System.out.println("field_array is null...");
		}

		System.out.println("List the interface field names.......");
		java.lang.Class [] inter_array = b.getClass().getInterfaces();
		if (inter_array != null) {
			//assuming just 1 interface use [0];
			for (java.lang.reflect.Field inter_field:  inter_array[0].getDeclaredFields()) 
			System.out.println("In Base..list of b.getClass().getInterfaces().getDeclaredFields= "+inter_field.getName());
		} else {
			System.out.println("inter_field_array is null...");
		}

		System.out.println("List the main class field names...");
		for (java.lang.reflect.Field f: b.getClass().getDeclaredFields()) {
			System.out.println("In Base...list of b.getClass().getDeclaredFields()= "+f.getName());
		}

*/

	}//end main
}//end class

