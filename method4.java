package nithi;
public class method4 {
	//11.CALCULATE THE AREA OF A CIRCLE FORMULA PI=31.4 r*r
	static void circle(double radius)
	{
		double pi=Math.PI;
		double circle=pi*radius*radius;
		System.out.println("Area of a circle: "+circle);
	}
	//12.PRINTS A MULTIPLICATION TABLE
	void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int multi=num*i;
		System.out.println(num+" * "+i+" = "+multi);
		}
	}
	//13.FIND THE LARGEST ELEMENT IN AN ARRAY
	void array(int[]num)
	{
		int largest=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
		}
		System.out.println("largest element: "+largest);
	}
	//14.COUNT THE VOWELS IN THE STRING
	void vowels(String word)
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			char letter=Character.toLowerCase(word.charAt(i));
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
			{
				count++;
			}
		}
		System.out.println(word+" Vowels in the statement: "+count);
	}
	//15.REVERSE THE STRING
	void revstring(String text)
	{
		String reverse="";
		for(int i=text.length()-1;i>=0;i--)
		{
			reverse= reverse + text.charAt(i);
		}
		System.out.println(text+" Reversed String "+reverse);
	}
	public static void main(String[] args) 
	{
		method4 m= new method4();
		circle(12);
		m.table(5);
		int[]num= {10,20,30,40};
		m.array(num);
		m.vowels("HaiHello");
		m.revstring("naresh");
	}
}
