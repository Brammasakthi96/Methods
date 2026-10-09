//MULTILEVEL INHHERITANCE ONE BASE CLASS  ONE PARENT CLASS AND ONE DERIVED CLASS
package sarath;
class fruits//GRANDPARENT CLASS
{
	void basket1()
	{
		System.out.println("I am having \n1.pine apple\n2.apple");
	}
}
class fru extends fruits//PARENT CLASS
{
	void basket2()
	{
		System.out.println(" I am having \n3.Grapes\n4.Papaya");
	}
}
class fruit extends fru //CHILD CLASS
{
	void basket3()
	{
		System.out.println("I am having \n5.Rassberries");
	}
	
}

public class multi {
	public static void main(String[] args) 
	{
		fruit f=new fruit();//OBJECT CREATION FOR CHILD CLASS
		f.basket1();//ACCESS FROM CHILD CLASS
		f.basket2();
		f.basket3();
		
	}

}
