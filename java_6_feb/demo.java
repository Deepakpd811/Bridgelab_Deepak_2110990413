package java_6_feb;

public class demo {

    demo(String name, int price) {
        this(price);
        System.out.println("name" + name);
    }

    demo(int price) {
        this("honda");
        System.out.println("Price" + price);
    }

    demo(String brand) {

        System.out.println("Price" + brand);
    }

    public static void main(String[] args) {

    }
}

class Truck extends demo{
    Truck(int price){
        super(price);
        System.out.println("truck price" + price);
    }
    
    Truck(double speed){
        this(900);
        System.out.println("truck name" + speed);
    }
    Truck(String name,int price){
        super(price);
       
        System.out.println("truck name" + name);
    }

}
