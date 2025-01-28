
package java_28_jan;

import java.util.Arrays;

public class valueRefrence {

    static int myval = 04;

    public static void fun(int[] arr) {
        arr[1] = 12313;  // change the original array i.e refrence
    }

    public static void numFun(int n){
         n = 1000;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int num =10;

        
        System.out.println(Arrays.toString(arr)); 
        fun(arr);// pass by ref
        System.out.println(Arrays.toString(arr));

        System.out.println(myval);

        System.out.println(num); //10 
        numFun(num);// pass by value
        System.out.println(num);//10 
        

    }
}

