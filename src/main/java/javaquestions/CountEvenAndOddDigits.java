package javaquestions;

import java.util.Scanner;

public class CountEvenAndOddDigits {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        int odd_count=0;
        int even_count=0;
        while (num>0){
            if (num%2==0){
                even_count++;
            }else
                odd_count++;
            num=num/10;
        }
        System.out.println("Number of even digit is: "+even_count);
        System.out.println("Number of odd digit is: "+odd_count);

    }
}
