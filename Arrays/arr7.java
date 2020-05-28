import java.util.ArrayList;
import java.util.Arrays;

public class arr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,34,12,45,67,89};
		ArrayList<Integer> distinct = new ArrayList<>(); 
		for(int item:arr) {
			if(!distinct.contains(item)) {
				distinct.add(item);
			}
		}
		System.out.println(Arrays.toString(distinct.toArray()));
		
	}

}