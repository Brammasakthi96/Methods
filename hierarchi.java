//HIERARCHICAL INHERITANCE ONE PARENT MULTIPLE CHILDREN
package sarath;
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class cat extends Animal
{
	void cat() 
	{
		System.out.println("Cat sounds meow");
	}
}
class dog extends Animal
{
	void dog()
	{
		System.out.println("Dog is barking");
	}
}
public class hierarchi 
{
	public static void main(String[] args) 
	{
		dog d=new dog();
		d.eat();
		d.dog();
		
		cat c= new cat();
		c.eat();
		c.cat();

	}

}
