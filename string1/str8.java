package string1;

import java.util.*;

public class str8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a = sc.next().charAt(0);
		int in = sc.nextInt();
		System.out.print(s);
		for(int i=0; i<in-1; i++) {
			System.out.print(a+s);
		}
	}
}
