package java_30_jan;

public class CountOfAlphabet {

   public static void main(String[] args) {
    
    String word = "*hello123*";

    int uppercase = 0;
    int lowercase = 0;
    int digit = 0;
    int special = 0;

    for(int i=0; i<word.length(); i++){

        int asci = word.charAt(i);

        if(asci >=65 && asci <=90){
            uppercase++;
        }else if (asci >=97 && asci <=122){
            lowercase++;
        }else if (asci >=48 && asci <=57){
            digit++;
        }else {
            special++;
        }
    }

        System.out.println("Capital Character: " + uppercase);
        System.out.println("Lower Character: " + lowercase);
        System.out.println("Special Character: " + special);
        System.out.println("Digit: " + digit);



   }
}
