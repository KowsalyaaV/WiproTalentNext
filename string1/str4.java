package string1;
import java.util.*;

public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int z = n/2;
		if(n%2==0) {
			String s1 = s.substring(0,z);
			System.out.println(s1);
		}
		else {
			System.out.println("null");
		}

	}

}
