import java.util.*;

public class fc17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int rem=0;
		while(n!=0) {
			rem = rem * 10;
	        rem = rem + n%10;
	        n = n/10;
		}
		System.out.println(rem);
		}
}
