package nithi;
public class method2 {
	//1.PRINTS WELCOME TO JAVA
	static void print()
	{
		System.out.println("Welcome to Java");
	}
	//2.ACCEPT TWO NUMBERS AND PRINTS THEIR SUM
	static void addition(int a,int b)
	{
		System.out.println("sum= "+(a+b));
	}
	//3.ACCEPT TWO NUMBERS AND RETURNS THEIR PRODUCT
	static int multiple(int a,int b)
	{
		return a*b;
	}
	//4.EVEN OR ODD
	static void evenodd(int num)
	{
		if(num % 2==0)
		{
			System.out.println(num+" Number is even ");
		}
		else
		{
			System.out.println(num+" Number is odd ");
		}
	}
	//5.FIND THE LARRGEST OF TWO NUMBERS
	static void largest(int x,int y)
	{
		if(x>y)
		{
			System.out.println(x+ "is larger than "+y);
		}
		else
		{
			System.out.println(y+ "is larger than "+x);
		}
	}
	//6.FIND THE SMALLEST OF TWO NUMBERS
	static void smallest(int x,int y)
	{
		if(x<y)
		{
			System.out.println(x+" is smaller than "+y);
		}
		else
		{
			System.out.println(y+" is smaller than "+x);
		}
	}
	public static void main(String[] args) 
	{
		print();
		addition(10,20);
		int multi=multiple(10,20);
		System.out.println("Multplication of two numbers: "+multi);
		evenodd(10);
		largest(20,10);
		smallest(20,10);
	}
}
