//SINGLE INHERITANCE
package sarath;
class parent
{
	void displayName(String name) 
	{
		System.out.println("My name is "+name);
		
	}
}
class child extends parent
{
	void age(int age)
	{
		System.out.println("My age is "+age);
	}
}
public class single {
	public static void main(String[] args) 
	{
       child c=new child();  //child class access the parent method and its own method
       c.displayName("Amar");
       c.age(29);
  	}
}
