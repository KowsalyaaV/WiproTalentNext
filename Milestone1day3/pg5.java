package Milestone13;
import java.util.*;
public class pg5 {
	public static int fun(int a, int b) {
		a%=10;
		b%=10;
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(fun(n1,n2));
		
	}

}