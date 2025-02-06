package java_6_feb.birdsentury;

interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

abstract class Bird {
    public String name;

    Bird(String name) {  //constructor
        this.name = name;
    }

    void fun (){
        System.out.println("hello");
    }

    abstract void display();
}

public class Duck extends Bird implements Swimable, Flyable {

    Duck(String name) { // constructor
        super(name);
    }

    @Override
    void display() {
        System.out.println(name + "duck");
    }

    @Override
    public void swim() {
        System.out.println(name + "can swim");
    }

    @Override
    public void fly() {
        System.out.println(name + "can fly");
    }

}

class Penguin extends Bird implements Swimable{

    Penguin(String name){
        super(name);
    }
    @Override
    void display() {
        System.out.println(name + " is a penguine");
    }
    
    @Override
    public void swim() {
        System.out.println(name + "can swim");
    }

}




