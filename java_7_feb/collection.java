package java_7_feb;


import java.util.HashMap;


class person{
    String name;
    int age;
    int roll;
    person(String name , int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "Name-> "+this.name +"  age -> " + this.age +" roll->"+ this.roll +"\n";
    }
}


public class collection {
    public static void main(String[] args) {
        HashMap<Integer,person> hs = new HashMap<>();
        person p1 = new person("ritick", 22, 222);
        person p2 = new person("Deepak", 23, 782);
        person p3 = new person("Rohit", 21, 413);

        hs.put(1, p1);
        hs.put(2, p2);
        hs.put(3, p3);
        
        hs.remove(3);
        

        System.out.println(hs);
        // System.out.println(hs);
    }

}
