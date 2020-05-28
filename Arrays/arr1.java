import java.util.*;
public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,sum=0;
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+ (sum/n));
	}

}
