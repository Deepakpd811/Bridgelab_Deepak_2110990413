//https://www.geeksforgeeks.org/instanceof-keyword-in-java/

class parent{
	
}
class child extends parent{
	
}

public class InstanceOflen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child cobj = new child();
		if(cobj instanceof child ) {
			System.out.println("cobj is instance of child");
		}else {
			System.out.println("cobj is NOT instance of child");
		}
		if(cobj instanceof parent ) {
			System.out.println("cobj is instance of parent");
		}else {
			System.out.println("cobj is NOT instance of parent");
		}
		if(cobj instanceof Object ) {
			System.out.println("cobj is instance of object");
		}else {
			System.out.println("cobj is NOT instance of object");
		}
		
		
		
		
	}

}
