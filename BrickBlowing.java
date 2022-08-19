
public class BrickBlowing {

	
	
	private static void blow(int[] houses)
	{
		for(int i=0; i< houses.length-1; i++)
		{
			int count = 1;
			while(count + i <houses.length)
			{
				if(houses[i+count]<houses[i])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.println("from house " + (i+1) + ", the number of houses blown down will be " + count);
			
		}
		System.out.println("from house " + houses.length + ", the number of houses blown down will be " + 1);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] houses = {34,57,70,19,48,2,94,7,63,75};
		blow(houses);
	}

}
