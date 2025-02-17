import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Array;

class test{
    //Function of Question 1
    /*public static int add(int a,int b, int c){
        int d= (a+b+c)/3;
        System.out.println("The avarage is:"+ d);
        return d;

    }*/

    //Function of Question 2
    /*public static void sumOdd(int n){
        int sum =0;
        for(int i=0; i<=n;i++){
            if (i%2 > 0){
                sum = sum + i;
            } else{
                continue;
            }
        }
        System.out.println("The sum is:"+ sum);
    }*/

    //Funcion of Question 3
    /*public static void greater(int a, int b){
        if(a > b){
            System.out.print("The greater number is:" +a);
        }else {
            System.out.print("The greater number is:" +b);
        }
    }*/

    //Function of Question 4
    /*public static void circle(int r){
        double cir = 2* 3.14 * r;
        DecimalFormat format = new DecimalFormat(".00");
        System.out.println("The circumference is: " +format.format(cir));
    }*/

    //Function of Question 5
    /*public static void age(int age){
        if(age > 18){
            System.out.println("Eligible to vote");
        }else if (age < 0){
            System.out.println("Invalid age");
        }else{
            System.out.println("NOT Eligible to vote");
        }
    }*/

    //Function of Question 6
    /*public static void loop(int n){
        do{
            System.out.print("*");
        }while(n>=0);
    }*/

    //Function of Question 7
    /*public static void saperator(int n){
        int P = 0,N = 0,Z = 0;
        for(int i=1;i<=n;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int a = sc.nextInt();
            if(a>0){
                P=P+1;
            }else if (a<0){
                N=N+1;
            }else{
                Z=Z+1;
            }
        }
        System.out.print("Positive = "+P);
        System.out.print(", Negative = "+N);
        System.out.print(", Zero = "+Z);
        
    }*/

    //Function of Question 8
    /*public static void power(int b, int p){
        int pwer=1;
        for(int i =1; i<=p; i++){
             pwer = pwer*b;
        }
        System.out.print("Answer is: "+pwer);
    }*/
    
    //Function of Question 10
    public static void fibo(int n){
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1);
        System.out.print(" "+n2);
        for (int i =3; i<=n ; i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        } 
    }



    public static void main(String[] args){
        //Question 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        fibo(n);

        //Question 8
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int b = sc.nextInt();
        System.out.print("\nEnter the power: ");
        int p = sc.nextInt();

        power(b, p);*/


        //Question 7
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number you want to enter: ");
        int n = sc.nextInt();

        saperator(n);*/

        
        //Question 6 (infinite loop)
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        loop(n);*/

        
        //Question 5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AGE: ");
        int age = sc.nextInt();

        age(age);*/


        //Question 4
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int r = sc.nextInt();
        
        circle(r);*/


        //Question 3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = sc.nextInt();
        System.out.println("Enter the First number:");
        int b = sc.nextInt();

        greater(a, b);*/
        

        //Question 2
        /*System.out.print("Enter the number till which you want the sum of odd numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumOdd(n);*/


        //Question 1
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First no: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second no: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third no: ");
        int c = sc.nextInt();

        add(a,b,c);*/

    }
    
}