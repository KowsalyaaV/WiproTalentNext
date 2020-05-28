import java.util.*;
public class arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,search;
		search = sc.nextInt();
		
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(arr[i]==search) {
				System.out.println(i+1);
			}
			else {
				System.out.println("-1");
			}
		}

	}

}
