package Milestone13;
import java.util.*;
public class pg4 {
	public static int fun(int a) {
		if(a/10==0) {
			return -1;
		}
		else {
		return (a%100)/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fun(n));
		
	}

}