package string1;

import java.util.*;

public class str12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		int l = str1.length();
		int n = sc.nextInt();
		str1 = str1.substring(l-n);
		for(int i=0;i<n;i++) {
			System.out.print(str1);
		}
		}
}
