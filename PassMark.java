package java_28_jan;

import java.util.Scanner;

public class PassMark {

    public static String calulateMark(double n) {
        if (n >= 75) {
            return "Distition";
        } else if (n >= 40 && n < 75) {
            return "pass";
        } else {
            return "Fail";
        }
    }

    public static void printMarkSheet(int[][] sheet, String[] Name, String[] subject ){
        int total =0;
        for (int i = 0; i < sheet.length; i++) {
            System.out.print(Name[i] + "--> ");
            total =0;
            for (int j = 0; j < sheet.length; j++) {
                total +=sheet[i][j];

                System.out.print(subject[j] + "--> " + sheet[i][j] + " ");
                
            }
            Double percent = ((double)total/300 * 100);
            System.out.println();
            System.out.println("Total Marks: " + total);
            System.out.println("percentage: "+ percent);
            System.out.println("Result: "+ calulateMark(percent) );
            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subject = { "English", "Physics", "Math" };
        String[] Name = new String[3];

        int[][] sheet = new int[3][3];

        for (int i = 0; i < sheet.length; i++) {
            System.out.println("enter Name");

            Name[i] = sc.next();

            for (int j = 0; j < sheet.length; j++) {

                System.out.println(subject[j] + " marks for " + Name[i]);
                sheet[i][j] = sc.nextInt();
            }
        }

        printMarkSheet(sheet, Name, subject);      

    }
}
