import java.util.*;
class Calculator
{
	static int power(int x,int y)
	{
		int a;
		a=(int)Math.pow(x, y);
		return a;
		
	}
	
	static double powerd(double c,double d)
	{
		double b;
		b=Math.pow(c, d);
		return b;
	}
}
public class cl2 {
	public static void main(String[] args) {
		int in1,in2,in3;
		double d1,d2,d3;
		System.out.println("enter two integer ");
		Scanner sc=new Scanner(System.in);
		in1=sc.nextInt();
		in2=sc.nextInt();
		System.out.println("enter double integer ");
		d1=sc.nextDouble();
		d2=sc.nextDouble();
		in3=Calculator.power(in1, in2);
		d3=Calculator.powerd(d1, d2);
		System.out.println("Integer power "+in3);
		System.out.println("Double power "+d3);
		
		
	}
}