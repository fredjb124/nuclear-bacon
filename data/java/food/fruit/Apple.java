package data.java.food.fruit;
//import data.java.food.fruit.apple.Apple;
//name collision testing

class Apple extends Fruit {
//class Apple extends food.fruit.Fruit {

	private static String apple_pri_stat = "apple_pri_stat";
	static String apple_def_stat = "apple_def_stat";
	protected static String apple_pro_stat = "apple_pro_stat";
	public static String apple_pub_stat = "apple_pub_stat";

	private String apple_pri_non_stat = "apple_pri_non_stat";
	protected String apple_pro_non_stat = "apple_pro_non_stat";
	String apple_def_non_stat = "apple_def_non_stat";
	public String apple_pub_non_stat = "apple_pub_non_stat";

	public static void main(String args[]) {
	//below has private access to abstract class Fruit so you cannot access it....
	//System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_pri_stat = "+fruit_pri_stat);
	System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_def_stat = "+fruit_def_stat);
	System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_pro_stat = "+fruit_pro_stat);
	System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_pub_stat = "+fruit_pub_stat);
	
	Apple a = new Apple();
	//System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_pri_non_stat = "+a.fruit_pri_non_stat);
	System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_def_non_stat = "+a.fruit_def_non_stat);
	System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_pro_non_stat = "+a.fruit_pro_non_stat);
	System.out.println("In data.java.food.fruit.Apple...from Fruit fruit_pub_non_stat = "+a.fruit_pub_non_stat);

	}//end main
}//end class

