package nithi;
public class methods {
	String customerName;
	//METHOD IS BLOCK OF CODE WHICH ONLY RUNS WHEN IT IS CALLED
	static void welcome()  
	{
		System.out.println("Welcome to Shopping app");
	}
	//PARAMETERS
	static void customerdetails(String name,int age)
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
	}
	//ARBITARY ARGUMENTS/VARAGS
	static void showItems(String...items)
	{
		System.out.println("Items: ");
		for(String item:items)
		{
			System.out.println(item);
		}
	}
	//METHOD WITH RETURN VALUE
	static int calculateTotal(int price,int quantity)
	{
		return price*quantity;
	}
	//RECURSIVE METHOD
	static int factorial(int number)
	{
		if(number==0||number==1)
		{
			return 1;
		}
		return number*factorial(number-1);
	}
	//USING THIS KEYWORD
		void setcustomerName(String customerName)
		{
			this.customerName=customerName;
			System.out.println("Name using this: "+this.customerName);
		}
	public static void main(String[] args) 
	{
		welcome();
		customerdetails("Amar",25);
		showItems("Laptop","Mouse","Keyboard","CPU");
		int total=calculateTotal(2500,2);
		System.out.println("Total: "+total);
		int result=factorial(5);
		System.out.println("Recursive: "+result);
		methods m=new methods();
		m.setcustomerName("Anitha");
		
	}
	}
		