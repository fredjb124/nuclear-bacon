package data.java;
import java.lang.reflect.*;

public class MyPrintAndList {

	private static void getClassFieldNames(Object o) {
    	Class c = o.getClass();
   		Field [] f_array = c.getDeclaredFields();//just from Base
   		//Field [] f_array = c.getFields();//just public
       	if (f_array.length !=0) {
			printFields(f_array, c.getName());
       	} else {
       	System.out.println("Class "+c.getName()+" has no fields...");
   		}   
	}

	private static void getExtendedClassFieldNames(Object o) {
    	Class c = o.getClass().getSuperclass();
		if(! c.getName().equals("java.lang.Object")) {
    		Field [] f_array = c.getDeclaredFields();
        	if (f_array.length !=0) {
				printFields(f_array,c.getName());
        	} else {
        	System.out.println("Extended class "+c.getName()+" has no fields...");
       		}   
       	} else {
        	System.out.println("Class "+o.getClass().getName()+" does not extend any classes ...");
		}
	}

	private static void getInterfaceFieldNames(Object o) {
		Class [] i_array = o.getClass().getInterfaces();
		if (i_array.length !=0) {
			for(Class c: i_array) {
    			Field [] f_array = c.getDeclaredFields();
        		if (f_array.length !=0) {
					printFields(f_array, c.getName());
        		} else {
        		System.out.println("Interface "+c.getClass().getName()+" has no fields...");
       			}   
			}
       	} else {
        	System.out.println("Class "+o.getClass().getName()+" has no Interface...");
		}
	} 

	private static void getClassMethodNames(Object o) {
    	Class c = o.getClass();
		//Method [] m_array = o.getClass().getMethods();//just public
		Method [] m_array = o.getClass().getDeclaredMethods();
		if (m_array.length !=0) {
				printMethods(m_array, c.getName());
        } else {
        System.out.println("Methods "+c.getName()+" has no methods...");
       	}   
	} 


	public static void printAll(Object o) {
		getInterfaceFieldNames(o);		
		getExtendedClassFieldNames(o);		
		getClassFieldNames(o);		
		getClassMethodNames(o);		
	}

	private static void printFields(Field [] f_array, String s) {
	    for(Field f: f_array) 
	    	System.out.println("list of fields = "+f.getName()+" from "+s);
	    	System.out.println("");
	}

	private static void printMethods(Method [] m_array, String s) {
	    for(Method m: m_array) 
	    	System.out.println("list of methods = "+m.getName()+" from "+s+"\n");
	    	//System.out.println("");
	}

}//end class
