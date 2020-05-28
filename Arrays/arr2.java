import java.util.*;
public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Minimum is: "+ arr[0]);
		System.out.println("Maximum is: "+ arr[n-1]);
	}

}
