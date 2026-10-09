//ONE PARENT CLASS TWO CHILD CLASS HIERARCHICAL USING THIS KEYWORD
package sarath;
class numbers
{
	int a=10;
	int b=20;
}
class addition extends numbers//1.CHILD CLASS USING PARENT CLASS
{
	void add()
	{
	   System.out.println("Addition of a and b:"+(this.a+this.b));
	}
}
class minus extends numbers//2.CHILD CLASS USING PARENT CLASS
{
	void sub()
	{
		System.out.println("Subtraction of a and b: "+(this.a-this.b));
	}
}
public class single {
	public static void main(String[] args) 
	{
		addition a=new addition();
		a.add();
		minus s=new minus();
		s.sub();
				
	}

}