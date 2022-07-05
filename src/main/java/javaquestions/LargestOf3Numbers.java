package javaquestions;

import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Method 1 - simple logic
        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }

        //Method 2 - Ternary operator
        int lagrest=a>b?a:b;
        lagrest=c>lagrest?c:lagrest;
//        lagrest=c>(a>b?a:b)?c:(a>b?a:b);  //this is one line expression
//        int max1 = a > b ? a : b;
//        int max2 = c > max1 ? c : max1;
//        System.out.println("The largest number is: " + max2);
        System.out.println("The largest number is: " + lagrest);

    }
}
