import java.util.Scanner;

class test {

    public static void main(String[] args)
    {
        System.out.println("The guess the number game begins");
        System.out.println("you have to guess the correct number generated by the PC");
        System.out.println("you have unlimited guesses");
        int redno = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int num =0;
        do
        {
           System.out.println("Enter the guessed number:");
           num = sc.nextInt();
           if(num>redno)
           {
            System.out.println("incorrect");
            System.out.println("guess a lower number");
           }
           else if(num<redno)
           {
            System.out.println("incorrect");
            System.out.println("guess a higher number");
           }
           else 
           {
            System.out.println("correct");
            break;
           }
        }while(num>=0);
        System.out.println("my number was :");
        System.out.println(redno);


    }
}