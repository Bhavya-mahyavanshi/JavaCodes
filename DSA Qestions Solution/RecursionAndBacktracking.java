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

    public static void subsets(String str, int len, int idx, int arr[]){
       if(idx == len){
           for(int i = 0; i < len; i++){
               if(arr[i] == 1){
                   System.out.print(str.charAt(i));
               }
           }
           System.out.println();
           return;
       }
       arr[idx] = 1;
       subsets(str, len, idx+ 1, arr);

       arr[idx] = 0;
       subsets(str, len, idx + 1, arr);
    }

    public static void NQueens(int[][] board, int row, int n){
        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; i < n; j++){
                    System.out.println(board[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(board, row, i, n)){
                board[row][i] = 1;
                NQueens(board, row+1, n);
                board[row][i] = 0; //Backtrack
            }
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int n){
        
        for(int i = 0; i < row; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        
        for(int i = row, j = col; i >=0 && j >= 0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
       
        for(int i = row, j = col; i >=0 && j < n; i--, j++){
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;
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
        int len = str1.length();
        int[] arr = new int[len];
        subsets(str1, len, 0, arr);

        //Solve N Queens problem using backtracking.
        System.out.println("Enter the Number of Queens: ");
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        System.out.println("N Queens Problem: ");
        NQueens(board,0, n);

        sc.close();
    }
}
