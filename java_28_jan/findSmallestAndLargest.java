
package java_28_jan;

import java.util.Arrays;

public class findSmallestAndLargest {


    public static int[] findSmallestAndLargestt(int[] arr){
        int ans[] = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele:arr){
            if(ele>max) max=ele;
            if(ele<min) min = ele;
        }
        ans[0]=min;
        ans[1]= max;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,33,1,2,3};
        
        System.out.println(Arrays.toString(findSmallestAndLargestt(arr)));
        
    }
}
