import java.util.Scanner;
public class PrimeNumber {
	static boolean isPrime(int n)
	{

        if(n<2)
          return false;

        if(n==2)
             return true;

		for (int i = 2; i <= Math.sqrt(n)+1; i++)
		{
			if (n % i == 0)
				return false;
		
		}

	   return true;
	}

	public static void main(String[] args)
	{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int input=scan.nextInt();

	if (isPrime(input)){
		System.out.println(input +" is a Prime Number.");
        }else
		 System.out.println(input+" is not a Prime Number.");
	      
    }
}

