import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Driver {
	
	public static void main(String[] args) {
		
		double[] d = {-1, 3, -6, 12, -8, 4, -2, 1};
		System.out.println(findMax(d));
		System.out.println(findMedian(d));
		System.out.println(findMean(d));
		
	}
	
	public static double findMax(double... d) {

		//If it doesn't exist, return
		if (d == null || d.length == 0) {
			return 0;
		}
		
		//Set max to the highest number in the array
		double max = Double.NEGATIVE_INFINITY;
		for (double num: d) {
			if (max < num) {
				max = num;
			}
		}
		
		return max;
	}
	
	public static double findMin(double... d) {

		//If it doesn't exist, return
		if (d == null || d.length == 0) {
			return 0;
		}
		
		//Set min to the lowest number in the array
		double min = Double.POSITIVE_INFINITY;
		for (double num: d) {
			if (min > num) {
				min = num;
			}
		}
		
		return min;
	}
	
	public static double findMedian(double... d) {

		if (d == null || d.length == 0) {
			//If it doesn't exist, return
			return 0;
			
		} else {
			//If it does, sort it
			Arrays.sort(d);
		}

		if (d.length % 2 == 0) {
			//If our set has an even amount of elements, return the average of the middle two
			return (d[d.length / 2 - 1] + d[d.length / 2]) / 2.0;
			
		} else {
			//If it has an odd amount, return the middle element
			return d[d.length / 2];
		}
	}
	
	public static double findMean(double... d) {
		
		if (d == null || d.length == 0) {
			//If it doesn't exist, return
			return 0;
		}
		
		//Add all data together
		double sum = 0;
		for (double num: d) {
			sum += num;
		}
		
		//Divide sum by number of elements
		return sum / d.length;
	}
	
	public static double[] findMode(double... d) {
		
		if (d == null || d.length == 0) {
			//If it doesn't exist, return
			return null;
		}
		
		//Count the occurrences of each number
		HashMap<Double, Integer> hmMode = new HashMap<Double, Integer>();
		int max_val = 0, max_count = 0;
		for (double num: d) {
			int count;
			if ((count = hmMode.putIfAbsent(num, 1)) > 0) {
				//Insert if not found with count 1, if found increase count by 1
				hmMode.put(num, ++count);
			}
			if (count > max_val) {
				//Keep mode occurrences
				max_val = count;
				max_count = 1;
			} else if (count == max_val) {
				max_count++;
			}
		}
		
		//Find most occurring numbers and return and array of them
		double[] arrMode = new double[max_count];
		int index = 0;
		for (Entry<Double, Integer> e: hmMode.entrySet()) {
			if (e.getValue() == max_val) {
				arrMode[index] = e.getKey();
				index++;
			}
		}
		
		//Sort for testing purposes and easy lookup
		//Numbers are in no meaningful order
		Arrays.sort(arrMode);
		
		return arrMode;
	}
	
	public static boolean runInfiniteLoop() {
		boolean blnTrue = true;
		while(blnTrue) {
			//Simulating your for loop nests...
		}
		return true;
	}
	
	public static boolean runThrowException() throws Exception {
		throw new Exception();
	}
}
