package data.java.scope;

class Scope_test {
	static int size = 7;
	static void changeIt(int size) {
		//size = size + 200;
		size++;
		System.out.println("In changeIt in Scope_test static size = "+Scope_test.size);
		System.out.println("In changeIt in Scope_test method size = "+size);
	}

	public static void main(String args[]) {
		Scope_test st = new Scope_test();
		System.out.println("In Scope_test before size = "+size);
		changeIt(size);
		System.out.println("In Scope_test after changeIt size = "+size);
		
		
	}//end main

}//end class
