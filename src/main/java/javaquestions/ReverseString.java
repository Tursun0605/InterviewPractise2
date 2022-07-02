package javaquestions;

public class ReverseString {

    public static void main(String[] args) {

        //method 1 - using + (string concatenation) operator
        String str="ABCDKGLF";
        String rev="";

        int len=str.length();

        for (int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("the reversed string is: "+rev);


        //method 2 - just simply print out
        String str2="YUHJHFDWE";
        String rev2=null;

        int len2=str2.length();

        for (int i=len2-1; i>=0; i--){
            Character s=str2.charAt(i);
            System.out.print(s);
        }
        System.out.println();

        //method 3 - using character array
        String str3="hhdieksh";
        String rev3="";
        char a[]=str3.toCharArray();
        int len3=a.length;
        for (int i=len3-1; i>=0; i--){
            rev3=rev3+a[i];
        }
        System.out.println("the reversed string is: "+rev3);


        //method 4 - StringBuffer class
        StringBuffer str4=new StringBuffer("sdfiekjfkbn");
        System.out.println("the reversed string is: "+ str4.reverse());

        //method 5 - StringBuilder Class
        StringBuilder str5=new StringBuilder("uuidnfer");
        System.out.println("the revised string is: "+str5.reverse());
    }
}
