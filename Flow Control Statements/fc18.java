import java.util.Scanner;

public class fc18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int s=n;
		int rem=0;
		while(n!=0) {
			rem = rem * 10;
	        rem = rem + n%10;
	        n = n/10;
		}
		if(s==n) {
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome");
		}
		}
}
