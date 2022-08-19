package com.ruiyang.sussy;

import java.util.Scanner;

public class intToEnglish {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("num: ");
		num = scan.nextInt();
		System.out.println(intToEnglish(num));
	}
	public static String intToEnglish(int num)
	{
		String[] digits = {"One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
		String[] tens = {"Ten ", "Twenty ", "Thirty ", "Fourty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
		String[] teens = {"Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
		String temp = "";
		
		if(num/1000000000 >= 1)// billions
		{
			temp += digits[(num/1000000000)-1];
			temp += "Billion ";
			num -= (1000000000*(num/1000000000));
		}
		
		if(num/1000000 >= 100)// hundred millions
		{
			temp += digits[(num/100000000)-1];
			temp += "Hundred ";
			num -= (100000000*(num/100000000));
		}
		
		
		
		//NOTE NEED TO ADD TEEN FUNCTIONALITY AKA 12 MILLION 12 THOUSAND ETC
		
		
		
		
		if(num/1000000>= 10)// ten millions
		{
			temp += tens[(num/10000000)-1];
			num -= (10000000*(num/10000000));

		}
		if(num/1000000 >= 1)// millions
		{
			temp += digits[(num/1000000)-1];
			temp += "Million ";
			num -= (1000000*(num/1000000));
		}

		if(num/1000 >= 100)// hundred thousands
		{
			temp += digits[(num/100000)-1];
			temp += "Hundred ";
			num -= (100000*(num/100000));

		}
		if(num/1000>= 10)// ten thousands
		{
			temp += tens[(num/10000)-1];
			num -= (10000*(num/10000));

		}
		if(num/1000 >= 1)// thousands
		{
			temp += digits[(num/1000)-1];
			temp += "Thousand ";
			num -= (1000*(num/1000));
		}	
		
		if(num/100 >= 1)
		{
			temp+=digits[(num/100)-1];
			temp += "Hundred ";
			num -= (100*(num/100));
		}
		
		if(num/10 >=1)
		{
			temp += tens[(num/10)-1];
			num -= (10*(num/10));
		}
		
		if(num/1 >=1)
		{
			temp += digits[(num-1)];
		}
		
		if(num == 0)
		{
			temp = "0";
		}
		return temp;
	}
}
