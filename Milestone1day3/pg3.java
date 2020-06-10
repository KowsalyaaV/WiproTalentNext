package Milestone13;
import java.util.*;
public class pg3 {
	public static int fun(int a) {
		
		return a%10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fun(n));
		
	}

}