package com.ruiyang.amogus;

import java.util.ArrayList;
import java.util.Scanner;

public class digitReassembly {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();
		int j = 0;
		String splitInt = null;
		for(int i=0; i<5; i++)//input 
		{
			String number = scan.next();
			String n = scan.next();	
			inputs.add(number);
			inputs.add(n);
		}
		for(int i=0; i<5; i++)//looping through the test cases
		{
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(inputs.get(j));
			temp.add(inputs.get(j+1));
			j += 2;
			//split arraylist into new arraylist with just the 2 integers
			//split integer every n places
			int count = 0;
			Long m = (long) 0;
			Long p = (long) 0;
			String nTemp = temp.get(1).toString();
			int nInt = Integer.parseInt(nTemp);
		
			while(count+nInt<=temp.get(0).length()) //looping through the substrings and adding them
			{
				splitInt = temp.get(0).substring(count, count+nInt);
				m = Long.valueOf(splitInt);
				p = p+m;
				count++;
			}
			System.out.println(p);
		}
	}	
}








/*
first input the integers
read long int into arraylist
find where to split the integers by counting up by n spaces every time
reconstruct those integers (as string)
convert those string integers into int integers and add


*/