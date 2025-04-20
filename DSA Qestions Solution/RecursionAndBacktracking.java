import java.util.*;

public class RecursionAndBacktracking {

    public static void printNum(int num){
         if(num == 1){
            System.out.print(num + " \n");
            return;
        }
        System.out.print(num + " ");
        printNum(num-1);
    }
    
    public static void factorial(int num, int fact){
        if(num == 0){
            System.out.println("Factorial: "+fact);
            return;
        }
        fact *= num;
        factorial(num - 1, fact);
    }

    public static void Fibonacci(int idx, int num){
        if(idx == num - 1){
            return;
        }
        System.out.print(idx + " ");
        Fibonacci(idx+1, num);
    }

    public static void palindrome(int idx, String str){
        if(idx == str.length()/2){
            System.out.println("Its a palindrome");
            return;
        }
        if(str.charAt(idx) == str.charAt(str.length() - idx - 1)){
            palindrome(idx + 1, str);
        }else{
            System.out.println("Its not a palindrome");
            return;
        }
    }

    public static void TowerOfHanoi(int num, String src, String helper, String dest){
        if(num == 1){
            System.out.println("Transfer disk " + num + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(num-1, src, dest, helper);
        System.out.println("Transfer disk " + num + " from " + src + " to " + dest);
        TowerOfHanoi(num - 1, helper, src, dest);
    }

    public static void subsets(int idx, String str, String ans){
        if(idx == str.length()){
            return;
        }
        ans = "";
        for(int i = 0; i <=  idx; i++){
            ans += str.charAt(i);
        }
        System.out.println(ans);
        subsets(idx+1, str, ans);
    }

    public static void main(String[] args) {
        //Print numbers from N to 1 using recursion. 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        printNum(num);

        //Find factorial of a number using recursion. 
        factorial(num, 1);

        //Compute nth Fibonacci number using recursion.
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        Fibonacci(1, num);

        //Check if a string is a palindrome using recursion.
        System.out.print("\nEnter the String: ");
        String str = sc.next();
        palindrome(0, str);

        //Solve the Tower of Hanoi problem. 
        TowerOfHanoi(num, "S", "H", "D");

        //Generate all subsets of a given string.
        System.out.print("Enter Another String: ");
        String str1 = sc.next();
        String ans = "";
        subsets(0, str1, ans);
    }
}
