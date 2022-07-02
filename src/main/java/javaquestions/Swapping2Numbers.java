package javaquestions;

public class Swapping2Numbers {

    public static void main(String[] args) {

        int a=10, b=20;
        System.out.println("before swapping, values are: "+a+" and "+b);

        //Logic 1 - third variable
        int t=a;
        a=b;
        b=t;
        System.out.println("after swapping, values are: "+a+" and "+b);

        //Logic 2 - use "+" and "-", whitout using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping, values are: "+a+" and "+b);

        //Logic 3 - use "*" and "/", without using third variable
        // here a & b should not be Zero
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("after swapping, values are: "+a+" and "+b);

        //Logic 4 - use bitwise XOR("^") operator

        //Logic 5 - use single statement
        a=a+b-(b=a);
        System.out.println("after swapping, values are: "+a+" and "+b);
    }
}
