package javaquestions;

import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int num = sc.nextInt();


//        // method 1 - using algorithm
//        int rev1 = 0;
//        while (num != 0) {
//            rev1 = rev1 * 10 + num % 10;
//            num = num / 10;
//        }
//        System.out.println("The reverse number is: " + rev1);


        //method 2 - using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev2 = sb.reverse();
        System.out.println("The reverse number is: " + rev2);

        //method 3 - using StringBuilder
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev3=sbl.reverse();
        System.out.println("The reverse number is: " + rev3);
    }
}
