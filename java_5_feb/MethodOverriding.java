package java_5_feb;

// method overridding required two classes where one class inherit other
// method name and return type should be same, but not arguments may differ
// it is a runtime polymorphsim 
// where the method that gets called is determined by the actual object type at runtime, not the reference type.

class Animal{

    void talk(){
        System.out.println("animal is talking");
        
    }
}

class cat extends Animal{
    void talk(){  // overring the method of superclass
        System.out.println("cat is meow");
    }
}





public class MethodOverriding {
    public static void main(String[] args) {
            Animal cat = new cat();
            cat.talk();
    }
}
