package java_30_jan;

public class CountOfVowel {
    public static void main(String[] args) {
        final String vowel = "AEIOUaeiou";
        String str = "Deepak prasad";

        int count =0;

        for(int i=0; i<str.length(); i++){
            
            if(vowel.indexOf(str.charAt(i)) !=-1){
                count++;
            }
        }

        System.out.println(count);



    }
}
