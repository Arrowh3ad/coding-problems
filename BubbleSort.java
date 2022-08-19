import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many elements to sort");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter elements for array");
		
		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(sort(arr)));
		
		
	}
	private static int[] sort(int[] arr)
	{
		int swap = 1;
		while(swap!=0)
		{
			swap = 0;
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i] > arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swap++;
				}
			}
		}
		return arr;
	}
}
