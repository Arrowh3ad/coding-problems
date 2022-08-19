package com.ruiyang.sussy;

import java.util.Scanner;

public class reverseInt {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("int: ");
		int num = scan.nextInt();
		System.out.println(reverse(num));
	}
	private static int reverse(int x)
	{
        boolean neg = false;
        int a = x;
        if(x==0)
        {
        	a=1;
        }
		if(x<0)
        {
          
            neg = true;
            if(x != Integer.MIN_VALUE)
            {
                x = Math.abs(x);
                a = x;
            }
            else
            {
            	x = 0;
            	a = 1;
            }
        }
		int[] arr = new int[(int) (Math.log10(a)/1)+1];

		String strNum = Integer.toString(x);

        for(int i=0; i<arr.length; i++)
	    {
		    arr[i] = Integer.valueOf((Character.toString(strNum.charAt(i))));
	    }
        
		
		for(int i = 0; i<arr.length/2; i++)
		{	
			int temp1 = arr[i];
			arr[i] = arr[(arr.length-1)-i];
			arr[(arr.length-1)-i] = temp1;
		}
		
		
		long temp1 = 0;
		int n = 0;
		for(int i=0; i<arr.length; i++)
		{
			temp1+= arr[i] * (Math.pow(10.0, arr.length-i-1.0));
		}
		if(temp1 > Integer.MAX_VALUE)
		{
			n = 0;
		}
		else
		{
            if(neg)
            {
                n = ((int) temp1) - 2*((int) temp1);
            }
            else
            {
                n = (int) temp1;
            }
		}
		return n;
	}
}
