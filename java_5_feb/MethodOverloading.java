package java_5_feb;

//method overloading can be done in same class
// methoad name is same, argument maybe different or no of arguments
// it is a compile time polymorphism 
// means that the compiler determine which method to called based on the method signiture

public class MethodOverloading {

    static int add(int a, int b) {

        return a+b;
    }

    static double add (double a, double b){
        return a+b;
    }

    static int add(int a, int b,int c) {

        return a+b+c;
    }


    public static void main(String[] args) {
        
    }
}
