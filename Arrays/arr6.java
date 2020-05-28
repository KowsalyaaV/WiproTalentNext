import java.util.Arrays;
import java.util.Scanner;
public class arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}