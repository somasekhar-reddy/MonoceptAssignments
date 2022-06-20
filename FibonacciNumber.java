import java.util.Scanner;
public class FibonacciNumber {
   
	static void Fibonacci(int n)
	{
		int num1 = 0, num2 = 1;
        int i=0;
		for(i=1;i<=n;i++){
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		Fibonacci(input);
	}
}
