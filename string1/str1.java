package string1;

import java.util.*;


public class str1 {
	static boolean isPalin(String str) {
		
		int i=0; 
		int n= str.length()-1;
		
		while(i<n) {
			if(str.charAt(i)!= str.charAt(n)) {
				return false;
				}
			i++;
			n--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(isPalin(s)== true) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		

	}

}
