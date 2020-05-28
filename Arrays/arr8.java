import java.util.HashMap;
import java.util.Map;
public class arr8 {
	public static void main(String[] args) {
		int[] array = {12, 34, 12, 45, 67, 89};	
		int max = getMostFrequent(array);	
		System.out.println(max);
	}
	public static int getMostFrequent(int[] array) {
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++)
			freqMap.put(array[i], 0);
		for (int i = 0; i < array.length; i++) {
			freqMap.put(array[i], freqMap.get(array[i]) + 1);
		}
		
		int maxKey = (int) freqMap.keySet().toArray()[0];	
		for (int key : freqMap.keySet()) {
			if (freqMap.get(key).intValue() > freqMap.get(maxKey).intValue())
				maxKey = key;
		}	
		return maxKey;
	}
}
