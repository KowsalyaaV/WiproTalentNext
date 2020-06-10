package Milestone13;
import java.util.*;
public class pg2 {
	public static int fun(int a) {
		if(a%2!=0) {
			return 2;
		}
		else {
			return 1;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fun(n));
		
	}

}