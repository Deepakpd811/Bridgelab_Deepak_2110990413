////https://www.geeksforgeeks.org/super-keyword/?ref=lbp
//
//
class vechile{
	int NumbeOfWheel = 2;
	
	vechile(int a){
		System.out.println("parent constructor");
	}
	
	void display() {
		System.out.println("vechile display");
	}
	
}

class car extends vechile{
	String color ;
	car(int a,String col){
		super(a);
		this.color = col;
		System.out.println("car child constructor\n");
	}
	
	void display() {
		System.out.println(this.NumbeOfWheel + " "+ this.color);
		super.display();
	}
}


class A{
	A(){
		System.out.println("A 1");
	}
}


class B extends A{
	B(){
		super();
		System.out.println("B 2");
	}
}



public class superlen  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bobj = new B();
		

	}

}
