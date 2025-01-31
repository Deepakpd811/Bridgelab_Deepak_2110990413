package java_30_jan;

public class Pannagram {

    public static boolean checkPannagram(String str, int[] freqArray){
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            int asci = str.charAt(i);

            if (asci >=97 && asci <=122){
                freqArray[asci-97]++;
            }else if (str.charAt(i)==' '){
               continue;
            }else{
                return false;
            }
        }

        for(int i=0; i<freqArray.length; i++){
            if(freqArray[i]==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        // String str = "abcdEf";
        int[] freqArray = new int[26];
        boolean ans = checkPannagram(str,freqArray);
        
        if(ans){
            System.out.println("string is Pannagram");
        }else{
            System.out.println("string is not Pannagram");

        }
    }
}
