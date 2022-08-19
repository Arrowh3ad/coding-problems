import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("# of elements in array");
		int n=  scan.nextInt();
		
		ArrayList<Integer> array = new ArrayList<>();
		
		System.out.println("enter array items");
		for(int i = 0; i<n; i++)
		{ 
			array.add(scan.nextInt());
		
		}
		array.sort(null);
		System.out.println("find what number");
		int find = scan.nextInt();
		binary(array, find);
	}
	
	public static void binary(ArrayList<Integer> array, int find)
	{
		System.out.println("iterating");
		double middle = 0;
		if(array.size()>1)
		{
			if(array.size()%2 == 0)
			{
				middle = (array.get(array.size()/2) + array.get((array.size()/2)-1))/2.0;
			}
			else
			{
				middle = array.get(array.size()/2);
			}
		}
		
		while(array.size()>1)
		{
			if(find<middle)
			{
				for(int i=0; i<(array.size()/2)+1; i++)
				{
					array.remove(i+array.size()/2);
				}
				binary(array, find);
			}
			else if(find>middle)
			{
				for(int i=0; i<(array.size()/2)+1; i++)
				{
					array.remove(i);
				}
				binary(array, find);
			}
			else
			{
				System.out.println(array.get(array.size()/2) + " was found");
				System.exit(0);

			}
		}
		System.out.println("not found");
		
	}

}
