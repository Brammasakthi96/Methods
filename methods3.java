package nithi;
public class methods3 {
	//7.CALCULATE FACTORIAL OF A NUMBER
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	//8.REVERSE A NUMBER
	int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
	//9.CHECK NUMBER IS A PALINDROME OR NOT
	void palindrome(int num)
	{
		int numbers=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		if(numbers==reverse)
		{
			System.out.println(numbers+" is a Palindrome");
		}
		else
		{
			System.out.println(numbers+" is not a Palindrome");
		}
	}
	//10.CHECK WHETHER A NUMBER IS PRIME
	void checkprime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is a prime number");
		}else
		{
			System.out.println(num+" is not a prime number");
		}
	}
	public static void main(String[] args) 
	{ 
		
		int facto=factorial(5);
		System.out.println("Calculate factorial of a number "+facto);
		
		methods3 m=new methods3();
		int revnum=m.reverse(12345);
		System.out.println("Reverse number "+revnum);
		
		m.palindrome(1234);
		m.palindrome(121);
		
		m.checkprime(17);
		m.checkprime(20);
	}
}
