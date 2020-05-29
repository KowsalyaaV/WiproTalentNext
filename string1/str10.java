package string1;

import java.util.Scanner;

public class str10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int n1 = s1.length();
		int n2 = s2.length();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		if (n1 == n2) {
			for (int i = 0; i < n1; i++) {
				System.out.print(c1[i]);
				System.out.print(c2[i]);
			}
		} else if (n1 > n2) {
			for (int i = 0; i < n2; i++) {
				System.out.print(c1[i]);
				System.out.print(c2[i]);
			}
			System.out.println(s1.substring(n2));
		} else {
			for (int i = 0; i < n1; i++) {
				System.out.print(c1[i]);
				System.out.print(c2[i]);
			}
			System.out.println(s2.substring(n1));
		}

	}
}
