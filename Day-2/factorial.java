import java.util.*;


public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int n = sc.nextInt();
		if(n==0) {
			System.out.println("0");
		}
		else {
		for(int i= 1; i<=n; i++) {
			fact = fact*i;
		}
		}
		System.out.println(fact);
	}
}
