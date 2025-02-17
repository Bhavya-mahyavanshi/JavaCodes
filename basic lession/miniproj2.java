import java.util.Array;
import java.util.Scanner;

class test
{
    public static void main (String[] args)
    {
        System.out.println("Calculator");
        System.out.println(" use\n1 for add\n2 for multiply\n3 for sub\n4 for division\n5 for reminder");
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the vale of first number:");
        a = sc.nextInt();
        System.out.println("Enter the vale of second number:");
        b = sc.nextInt();
        System.out.println("enter the number according to the function");
        int function = sc.nextInt();
        if (function==1) {
            int c = a + b;
            System.out.print(" The Answer is:");
            System.out.println(c);
        }
        else if(function==2){
            int c = a * b;
            System.out.print(" The Answer is:");
            System.out.println(c);
        }
        else if(function==3){
            int c = a - b;
            System.out.print(" The Answer is:");
            System.out.println(c);
        }
        else if(function==4){
            int c = a / b;
            System.out.print(" The Answer is:");
            System.out.println(c);
        }
        else {
            int c = a % b;
            System.out.print(" The Answer is:");
            System.out.println(c);
        }

    }
}