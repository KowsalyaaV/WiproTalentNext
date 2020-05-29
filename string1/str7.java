package string1;

import java.util.*;

public class str7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int n = s1.length();
		
		if(s1.charAt(0)==s1.charAt(n-1)) {
			String s = s1.substring(1,n-1);
			System.out.println(s);			
		}
		else {
			System.out.println(s1);
		}
	}
}