//https://www.geeksforgeeks.org/this-reference-in-java/
public class thislen {
	int a;
	int b;
	
	// default constructor
	thislen(){
		this(10,20); // calling paremtrized constructor
		System.out.println("default constructor");
	}
	
	thislen(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("parameterized constructor "+ a + " " + b);
	}
	
	thislen get() {
		return this;     // return the current instance/object of class
	}
	
	public static void printLine () {
		System.out.println("printline");
	}
	
	void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

	public static void main(String[] args) {
		
		thislen obj = new thislen();
		obj.printLine();
		
//		System.out.println(obj.get());
		obj.get().display();

	}

}
