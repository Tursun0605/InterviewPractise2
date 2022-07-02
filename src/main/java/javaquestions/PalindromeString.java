package javaquestions;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.next();
        String org_str=str;
        String rev="";
        int len=str.length();
        for (int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if (rev.equals(org_str)){
            System.out.println(org_str+" is palindrome string");
        }else
            System.out.println(org_str+" is not palindrome string, after reversed, it's like: "+rev);
    }
}
