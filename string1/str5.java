package string1;

import java.util.*;

public class str5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		s = s.substring(1,n-1);
		System.out.println(s);
	}
}
