package java_30_jan;

public class RotateStrin {
    public static void main(String[] args) {
        String a = "hello";
        // String check = "ohell";
        String check = "hoell";
        
        StringBuilder sb = new StringBuilder();
       
        int n = a.length();
        boolean isRotate = false;
        
        for(int k=0; k<n; k++){
            int i=0;
            int j =n-1+k;

            // sb.replace(0,sb.length(),"");
            while(i<n){
                sb.append(a.charAt(j%n));
                j++;    
                i++;
            }

            if(check.equals(sb.toString())){
                isRotate = true;
            }
            // System.out.println(sb);
        }

        if(isRotate){
            System.out.println(check+" is rotate of " + a);
        }else{
            System.out.println(check+" is not rotate of " + a); 
        }

        
        

    }
}
