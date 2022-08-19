import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("how many elements to sort");
		int n = scan.nextInt();
		System.out.println("elements to sort");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("range of elements");
		int range1 = scan.nextInt();
		int range2 = scan.nextInt();
		
		System.out.println(Arrays.toString(sort(arr, range1, range2)));
	}
	private static int[] sort(int[] arr, int range1, int range2)
	{
		int range = Math.abs(range2-range1);

		int[] counter = new int[range+1];
		for(int i=0; i<arr.length; i++) //set up counter
		{
			counter[arr[i]]+=1;
		}
		
		
		for(int i=0; i<counter.length-1; i++) //adding prev counts
		{
			counter[i+1] += counter[i];
		}
		
		int[] result = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			result[counter[arr[i]]-1] += arr[i];
			counter[arr[i]] -=1;
		}
		return result;
	}
}
