package Milestone12;
import java.util.*;

public class pg1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
	}

}