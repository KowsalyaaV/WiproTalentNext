import java.util.*;

public class fc13 {
	public static void main(String[] args) {
		int i=0;
		int flag = 1;
		for(i=10; i<99; i++) {	
			for(int j=2;j<i/2; j++) {
				if(i%j==0) {
					flag = 0;
					break;
				}
			}	
		
				if(flag==1) {
					System.out.println(i);
				}
			
		}
}
}
			
		