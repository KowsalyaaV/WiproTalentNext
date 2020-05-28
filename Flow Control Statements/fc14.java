import java.util.Scanner;

public class fc14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
			if(n==0||n==1) {
				System.out.println(n+" is neither prime nor composite");
			}
			else {
				for(int i=2;i<n/2; i++) {
					if(n%i==0) {
						System.out.println(n+" is not a prime number");
						flag = 1;
						break;
					}
			}
		}
			if(flag==0) {
				System.out.println(n+" is Prime number");
			}
	}
}
	