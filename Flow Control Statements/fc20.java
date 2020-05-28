import java.util.*;
public class fc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op1,op2;
		System.out.println("1.ADD \n2.SUB");
		int ch = sc.nextInt();
		if(ch==1) {
			System.out.println("Enter first operand:");
			op1 = sc.nextInt();
			System.out.println("Enter second operand:");
			op2 = sc.nextInt();
			int res = op1+op2;
			System.out.println("Result: "+res);
		}
		else{
			System.out.println("Enter first operand:");
			op1 = sc.nextInt();
			System.out.println("Enter second operand:");
			op2 = sc.nextInt();
			int res = op1-op2;
			System.out.println("Result: "+res);
		}
		System.out.println("Do you want to continue? Y/N ");
		sc.nextLine();
		char choice = sc.nextLine().charAt(0);
		if(choice=="y"||choice=="Y") {
			main(args);
		}
		sc.close();
	}

}
