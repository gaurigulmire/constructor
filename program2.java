package constructor;

public class program2 {
	double width;
	double height;
	double depth;
	program2()
	{
		System.out.println("constructor without parameter");
		width=10;
		height=10;
		depth=10;
	}
	program2(int a,int b,int c)
	{
	System.out.println("constructor with parameter");
	width=a;
	height=b;
	depth=c;
	}
	double volume()
	{
		return width=height*depth;
	}
	

}
