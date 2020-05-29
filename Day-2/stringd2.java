import java.util.*;

public class stringd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "malayalam";
		char[] str = s.toCharArray();
		int n = s.length();
		int index = 0; 
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) 
			{
				if(str[i]==str[j])
				{
					break;
				}
			}
			if(j==i) {
				str[index++] = str[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
				
	}
}


