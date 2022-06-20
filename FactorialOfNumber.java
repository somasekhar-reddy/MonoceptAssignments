import java.util.Scanner;
public class FactorialOfNumber {

    static long factorial(int n)
    {
         if (n == 0)
              return 1;
         return n*factorial(n-1);
    }
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num =scan.nextInt();
        System.out.println("Factorial of "+ num + " is " + factorial(5));
    }
  }  
