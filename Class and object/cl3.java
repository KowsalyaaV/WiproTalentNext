import java.util.Scanner;

class BMI
{
	
	static double bmi(double w,double h)
	{
		double bmi;
		bmi=(w/(h*h))*703;
		return bmi;
	}
}
public class cl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("weight and height: ");
		double weight=sc.nextInt();
		double height=sc.nextInt();
		double bmi=BMI.bmi(weight, height);
		System.out.println("BMI of " +name+ " is " +bmi);
		

	}

}