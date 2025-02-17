import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Array;
import java.util.HashSet;
import java.util.Iterator;

class test{

    public static int fact(int i){
        if(i==0){
            return 1;
        }
        return i * fact(i-1);
    }

    public static void fibo(int a, int b, int n){
        int c = 0;
        if(n != 0){
           c= a + b;
           System.out.print(c+" ");
           fibo(b, c, n-1);
        }else{
            return;
        }
    }
    public static void main(String [] args){
        
        //Question 1: Determine even and odd;

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }*/

        //Question 2; Check for prime number;

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= 9; i++) {
            if(n%i==0){
                if(i!=n){
                System.out.println("its not a prime number");
                return;
                }
                
            }   
        }
        System.out.println("Its a prime Number");*/

        //Question 3: Validate the leap year

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int n = sc.nextInt();

        if (n%4==0) {
            System.out.println("Its a leap year");
        }else{
            System.out.println("Not a leap year");
        }*/

        //Question 4: Calcuating the Armstrong number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number: ");
        int n = sc.nextInt();
        int o = n;
        int rem, res = 0;

        while(o != 0){
           rem = o % 10;
           res = (int)(res + Math.pow(rem, 3));
           int x = (int)(o/10);
           o = (int) x;
        }
        if(res == n){
            System.out.println("Its an armstrong number");
        }else{
            System.out.println("not an armstrong nnumber");
        }*/

        //Question 5: Generate the Fibonacci Series

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i = 2 ; i<n; i++){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }*/

        //Question 6: indentifying the plaindromes

        /*Scanner sc = new Scanner(System.in);
        String s, rev="";
        System.out.print("Enetr the number or word: ");
        s = sc.nextLine();
        char c;

        for(int i=s.length()-1; i>=0; i--){
           c = s.charAt(i);
           rev = rev + c; 
        }
        System.out.println(rev);
        if(rev.equals(s)){
            System.out.println("Its plaindrome");
        }else{
            System.out.println("not a plaindrome");
        }*/

        //Question 7: crafting star pattern:

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the height: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }*/

        //Question 8: Finding the factorial of a number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 1;

        for(int i = 1; i <= n; i++){
            sum = sum*i;
        }
        System.out.println(sum);*/

        //Question 9: Summing the digits of a number 

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rem, sum = 0;

        while(n!=0){
            rem =(int)(n%10);
            sum = sum + rem;
            n = n/10;
        }
        System.out.println(sum);*/

        //Question 10: Find the Greatest common Divisor 

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int x = 0;

        for(int i = 1; i<=9; i++){
            if(a%i==0 && b%i==0){
                if(i > x){
                    x = i;
                }
            }
        }
        System.out.println(x);*/

        //Question 11: Finding the Least common Multiple 

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int LCM = 1;
        int x = 0;

        for(int i = 1; i<=9; i++){
            if(a%i==0 && b%i==0){
                if(i > x){
                    x = i;
                }
            }
        }
        LCM = a*(b/x);
        System.out.println(LCM);*/
        
        //Question 12: Vowels and Consonants in a string

        /*Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the String: ");
        str = sc.nextLine();
        String tri = str.replaceAll(" ","");
        int vow = 0, con = 0;

        for(int i = 0; i< tri.length(); i++){
        char c = tri.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            vow += 1;
        }else{
            con += 1;
        }
    }
        System.out.println("Vowels: "+vow+" consonants: "+con);*/

        //Question 13: Reverseing a String;

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String rev ="";

        for(int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            rev = rev + c;
        }
        System.out.println(rev);*/

        //Question 14: Find the Largest and the smallest number in the arry

        /*Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to enter: ");
        int num = sc.nextInt();
        System.out.print("Enter "+num+" values\n");
        int arr[] = new int[num];
        int lrg =0 , sml = 100;

        for(int i = 0; i < num ; i++){
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < num ; i++){
            if(arr[i]>lrg){
                lrg = arr[i];
            }
            else if(arr[i] < sml){
                sml = arr[i];
            }   
        }
        System.out.println("Largest: "+lrg+" Smallest: "+sml);*/

        //Question 15: Sorting the array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to enter: ");
        int num = sc.nextInt();
        System.out.print("Enter "+num+" values\n");
        int arr[] = new int[num];

        for(int i = 0; i < num ; i++){
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1; i++){ //n-1 iteration
            for(int j=0; j<arr.length-i-1; j++){ 
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }for(int i = 0; i<arr.length;i++){
        System.out.println(arr[i]);
        }*/

        //Question 16: Finding the sum of Elements in an array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("how many values you want to enter:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" values: ");
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The total sum is:"+sum);*/

        //Question 17: Checking for Armstrong Numbers in a Range

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Starting value of range: ");
        long ran1 = sc.nextInt();
        System.out.print("Ending value of range: ");
        long ran2 = sc.nextInt();
        

        for(long i = ran1; i <= ran2; i++){
            long org = i;
            int rem = 0, res = 0;
            while(org != 0){
                rem = (int)(org % 10);
                res = (int) (res+Math.pow(rem, 3));
                org = org/ 10;
            }
            if(res == i){
                System.out.print(res+" ");
            }   
        }*/

        //Question 18: Generating multiplication tables

        /*Scanner sc = new Scanner(System.in);
        System.out.print("\nnumber: ");
        int n = sc. nextInt();
        int res = 1;
        System.out.println();

        for(int i = 1; i <=10; i++){
            res = n * i;
            System.out.println(n +" * "+i+" = "+res );
        }*/

        //Question 19: Finding prime number in a range

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Starting value of range: ");
        int rag1= sc.nextInt();
        System.out.print("Ending value of range: ");
        int rag2 = sc.nextInt();
        

        for (int i = rag1; i<= rag2 ; i++){
            int flg = 0;
            for(int j = 2; j<i; j++){
                if(i%j==0){
                    if(i != j){
                    flg = 1;
                    }
                }
            }
            if(flg==0){
                System.out.println(i);
            }
        }*/

        //Question 20: Check for Perfect number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res = 0;

        for(int i = 1; i < n ; i++){
            if(n%i==0){
                res = res + i;
            }
        }
        if (res == n){
            System.out.println("Its a perfect number");
        }else{
            System.out.println("Not a perfect number");
        }*/

        //Question 21: Calculate the sum of Even number in a Range

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Stating point: ");
        int rag1 = sc.nextInt();
        System.out.print("Ending point: ");
        int rag2 = sc.nextInt();
        int sum = 0;

        for(int i = rag1; i <= rag2; i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);*/

        //Question 22: Calculate the sum of odd number:

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Starting point: ");
        int rag1 = sc.nextInt();
        System.out.print("Ending point: ");
        int rag2 = sc.nextInt();
        int sum = 0;

        for(int i = rag1; i <= rag2; i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);*/
        
        //Question 23: Find the Fibonacci at a specific position

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int a = 0, b = 1;

        for(int i = 2; i <= pos; i++){
            int c = a + b;
            a = b;
            b = c;
            if(i == pos){
            System.out.println(c);
            }
        }*/

        //Question 24: Printing prime number less than a given number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        

        for(int i = 2; i < num ; i++){
            int flg = 0;
            for(int j = 2; j <= i; j++){
                if(i%j==0){
                    if(i != j){ 
                       flg = 1;
                    }
                }
            }
            if(flg==0){
                System.out.print(i+" ");
            }
        }*/

        //Question 25: Finding the Number of Digits in a Number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int count = 0;

        while(num != 0){
            count = count + 1;
            num = num / 10;
        }
        System.out.println(count);*/

        //Question 26: Checking if a Number is a Narcissistic Number
        
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int count = 0, rem = 0, res = 0;
        int org = num;
        int main = num;

        while(org != 0){
            count = count + 1;
            org = org / 10;
        }
        while(main != 0){
            rem = main % 10;
            res = (int)(res+Math.pow(rem, count));
            main = main / 10;
        }
        if(res == num){
            System.out.println("Narcissistic Number");
        }else{
            System.out.println("Not Narcissistic Number");
        }*/

        //Question 27: Narcissistic Number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        int count = 1;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }*/

        //Question 28: Finding the sum of the Digits of the Factorial of a number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int fact = 1;
        int rem, res = 0;

        for(int i = num; i >= 1; i--){
            fact *= i;
        }
        while(fact != 0){
            rem = fact % 10;
            res = (int)(res+rem);
            fact = fact / 10;
        } 
        System.out.println(res);*/

        //Question 29: Finding the Largest Palindrome in a String

        /*Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();

        for(int i = 0; i < (str.length()-1); i++){
            char a = str.charAt(i);
            for (int j = i + 1; j < str.length()-1; j++){
                char b = str.charAt(j);
                if(a==b){
                    a = str.charAt(i+1);
                    b = str.charAt(j-1);
                    if(a == b){
                        System.out.println(str.substring(i,j+1));
                    }
                }
            }
        }*/

        //Question 30: Finding Missing Numbers in a Sequence

        /*Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of series: ");
        int leg = sc.nextInt();
        int [] arr = new int[leg];
        
        for(int i = 0; i < leg; i++){
            System.out.print("Enter "+i+1+" value: ");
            arr[i] = sc.nextInt();
        }
        int count = arr[0];
        for(int i = 0; i < leg; i++){
            if(arr[i]!=count){
                System.out.println(count);
                break;
            }
            count++;
        }*/

        //Question 31: Generating a Pascal’s Triangle

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int row = sc.nextInt();
        
        System.out.print("1\n");
        for (int i = 1; i <= row-1; i++){
            int a = fact(i);
            for(int j = 1; j <= i+1; j++){
                if(j==1){
                    System.out.print("1 ");
                }else{
                    int b = fact(j-1);
                    int c = fact(i-(j-1));
                    int sum = a / (b*c);
                    System.out.print(sum+" ");
                }
            }
            System.out.println();
        }*/

        //Question 32: Finding the Median of an Array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("enter the total values: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if( i == n/2){
                System.out.println(arr[i]);
            }
        }*/

        //Question 33: Calucate the power of the number:

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int bas = sc.nextInt();
        System.out.print("Enter the power: ");
        int pow = sc.nextInt();

        int total = (int) Math.pow(bas, pow);
        System.out.println(total);*/

        //Question 34: check for an anagram:

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String str1 = sc.next();
        System.out.print("Enter the string 2: ");
        String str2 = sc.next();
        int count = 0;

        for(int i = 0; i < str1.length(); i++){
            char ch1 = str1.charAt(i);
            for(int j = 0; j < str2.length(); j++){
                char ch2 = str2.charAt(j);
                if (ch1 == ch2){
                    count += 1;
                }
            }
        }if(count == str1.length()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/

        //Question 35: Finding the Sum of Prime Numbers in a Range

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting point: ");
        int ran1 = sc.nextInt();
        System.out.print("Enter the ending point: ");
        int ran2 = sc.nextInt();
        int sum = 0;
        

        for(int i = ran1+1; i < ran2; i++){
            int flg = 0;
            for(int j = 2; j <= i; j++){
                if(i%j == 0){
                    if(i != j){
                        flg = 1;
                    }
                }
            }
            if(flg == 0){
                sum += i;
            }
        }
        System.out.println(sum);*/

        //Question 36: Finding the N-th Triangular Number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N-th trem: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);*/

        //Question 37: Checking for Perfect Squares

        /*Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int num = sc.nextInt();
        
        int orgVal = (int) Math.sqrt(num);
        if ((orgVal * orgVal)==num){
            System.out.println("Its a perfect Square");
        }else{
            System.out.println("Its not a perfect Square");
        }*/

        //Question 38: Finding the Sum of Squares of Digits

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            int rem = num%10;
            sum = (int)(sum+Math.pow(rem, 2));
            num = num/10; 
        }
        System.out.println(sum);*/

        //Question 39: Generating a Square Matrix of a Given Size

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int siz = sc.nextInt();
        int count =1;

        for(int i = 1; i <= siz; i++){
            for(int j = 1; j <= siz; j++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }*/

        //Question 40: Calculating the Sum of Digits of a Number Until Single Digit

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int total = 0;

        do{
            int rem = num % 10;
            total = total + rem;
            num = num / 10;
            if(total > 9 && num == 0){
                num = total;
                total = 0;
            }
            
        }while(num != 0);
        System.out.println(total);*/

        //Question 41: Finding the Count of Specific Digits in a Number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        System.out.print("Digit:");
        int dig = sc.nextInt();
        int count = 0;

        while(num != 0){
            int rem = num % 10;
            if (rem == dig ){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);*/

        //Question 42: Generating a Fibonacci Sequence Using Recursion

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number:");
        int num = sc.nextInt();
        int a = 0, b = 1;

        System.out.print(a+" "+b+" ");

        fibo(a, b, num-2);*/

        //Question 43: Find all divisors of a number: 

        /*Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }*/

        //Question 44: Finding the Average of Numbers in an Array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("NUMBER OF DIGITS: ");
        int dig = sc.nextInt();
        int arr[] = new int[dig];
        int sum = 0,res;

        for(int i = 0; i < dig; i++){
            System.out.print("Enter number"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< dig; i++){
            sum = sum + arr[i];
        }
        res = sum / dig;
        System.out.println(res);*/

        //Question 45: Finding the Mode of Numbers in an Array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("NUMBER OF DIGITS: ");
        int dig = sc.nextInt();
        int arr[] = new int[dig];
        int num = 0, count = 0;

        for(int i = 0; i < dig; i++){
            System.out.print("Enter number"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < dig; i++){
            int temp = 0;
            for(int j = i+1; j < dig; j++){
                if(arr[i]==arr[j]){
                   temp = temp+1;
                   if(temp > count){
                    count = temp;
                    num = arr[j];
                   } 
                }
            }
        }
        System.out.println(num);*/

        //Question 46: Determining the Length of a String Without Using Built-In Functions

        /*Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("String: ");
        str = sc.nextLine();
        int length = 0;

        for (char i : str.toCharArray()){
            length++;
        }
        System.out.println(length);*/

        //Question 47: Generating a Number Pyramid

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();

        for(int i =1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //Question 48: Finding the Sum of Prime Factors of a Number

        /*Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int num = sc.nextInt();
        int sum = 0;

        System.out.print("Factorials are:");
        for(int i = 2; i <= num; i++){
            if(num%i == 0){
                int flg = 0;
                    for(int j = 2; j<i; j++){
                        if(i%j==0){
                            if(i != j){
                                flg = 1;
                            }
                        }
                    }
                if(flg==0){
                    sum = sum + i;
                }
            }
        }
        System.out.println("\n"+sum);*/

        //Question 49: Finding the Second Largest Number in an Array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("NO. OF ELEMENTS: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i =  0; i < num; i++){
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
            System.out.println(arr[arr.length-2]);*/

        //Question 50: Finding the Longest Substring Without Repeating Characters

        /*Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.next();
        String res = "";

        char ch1= str.charAt(0);
        res = res + ch1;
        for(int j = 1; j < str.length(); j++){
            char ch2 = str.charAt(j);
            if(ch1 == ch2){
                break;
            }else{
                res = res + ch2;
            }
        }
        System.out.println(res);*/

        //-----------mile-Stone of 50---------------//

        //Question 51: Finding the Sum of Digits of a Number Until Zero

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num = num /10;
        }
        System.out.println(sum);*/

        //Questiom 52: Generating a Multiplication Table for a Range

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            for(int j = start; j<=end; j++){
                System.out.print(j+" * "+i+" = "+(i*j)+"\t");
            }
            System.out.println();
        }*/

        //Question 53: Calculating the Sum of a Series (1 + 1/2 + 1/3 + ... + 1/n)

        /*Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        double n = sc.nextInt();
        double sum = 0;

        for(int i = 1; i <= n; i++){
            double temp = 1.00/i;
            sum += temp;
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(4);
        System.out.println(df.format(sum));*/

        //Question 54: Finding All Pairs of Elements in an Array that Add Up to a Given Sum

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Total Element in array: ");
        int ele = sc.nextInt();
        int arr[] = new int[ele];
        System.out.print("target: ");
        int tar = sc.nextInt();

        for(int i = 0; i < ele; i++){
            System.out.print("enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < ele; i++){
            for(int j = i+1; j < ele; j++){
                if((arr[i]+arr[j])==tar){
                    System.out.print("( "+arr[i]+","+arr[j]+" )");
                }
            }
        }*/

        //Question 55: Generating a Diamond Pattern of Stars

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();

        for(int i = 1; i <= (size/2)+1; i++){
            for(int j = 1; j <= size-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = (size/2); i >= 1; i--){
            for(int j = 1; j <= size-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Question 56: Counting the Number of Palindromic Substrings in a String

        /*Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.next();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(j);
                if(ch1 == ch2){
                    count += 1;
                }
            }
        }
        System.out.println(count);*/

        //Question 57: Generating a Matrix with Multiplication Table

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }*/

        //Question 58: Finding the GCD of Multiple Numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Total elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        HashSet<Integer> fact = new HashSet<>();
        int result = 1;

        for(int i = 0; i < size; i++){
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j <= arr[i]; j++){
                if(arr[i]%j==0){
                    if(fact.contains(j)==false){
                        fact.add(j);
                    }
                }
            }
        }
        Iterator<Integer> it = fact.iterator();
        while (it.hasNext()){
            result *= it.next();
        }
        System.out.println(result);
    }
}
