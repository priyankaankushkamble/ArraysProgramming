package ArraysProgram;
import java.util.*;
public class PairArraySum 
{
	public static void main(String[] args) 
	{
	        int[] arr = {1, 4, 5, 3, 2};
		        int target = 6;

		        System.out.println("Input array: " + Arrays.toString(arr));
		        System.out.println("Target sum: " + target);

		        List<String> result = findPairs(arr, target);
		        System.out.println("Output pairs: " + result);
		    }

		    public static List<String> findPairs(int[] arr, int target) {
		        Set<Integer> seen = new HashSet<>();
		        Set<String> output = new HashSet<>();

		        for (int num : arr) {
		            int complement = target - num;
		            if (seen.contains(complement)) {
		                // Sort the pair before adding to avoid duplicates like (2,4) and (4,2)
		                int min = Math.min(num, complement);
		                int max = Math.max(num, complement);
		                output.add("(" + max + ", " + min + ")");
		            }
		            seen.add(num);
		        }

		        return new ArrayList<>(output);
		    }
}


