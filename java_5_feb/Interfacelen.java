package java_5_feb;

// interface is a class for a  blueprint
// all the field are public static final
// method are abstract means methods without body only name decleration 
// A class that implements an interface must implement all the methods declared in the interface. 
// using interface we can achieve multipe inheritance



interface  Mobile{
    int marks =100;
    boolean mybool = false;
    void fun();
    int gerResult();
}

class feature implements Mobile {

    @Override
    public void fun() {
        // TODO Auto-generated method stub
        System.out.println(mybool);
    
            // mybool = true; error final filed
    }
    @Override
    public int gerResult() {
        // TODO Auto-generated method stub
        System.out.println(marks);
        return 0;
    }
}


public class Interfacelen {
    public static void main(String[] args) {
        feature f1 = new feature();
        f1.fun();
        f1.gerResult();
    }
}
