package javaquestions;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if (org_num!=rev){
            System.out.println(org_num+" is not Palindrome number and after reversed it's like: "+rev);
        }else
            System.out.println(org_num+ " is Palindrome Number, don't need to reverse");
    }
}
