package java_30_jan;

public class AplghabetFrequency {
    public static void main(String[] args) {
        String word= "Hello world";
        int[] freqArray = new int[255];
        

        for(int i=0; i<word.length(); i++){
            freqArray[word.charAt(i)]++;
        }

        for(int i=0; i<freqArray.length; i++){
            if(freqArray[i]!=0){
                char ch = (char) i;
                System.out.println(ch +" "+ freqArray[i]);;
            }
        }

        // int n = word.charAt(0);
        // char ch =(char) n;
        // System.out.println(n);
        // System.out.println(ch);


    }
}
