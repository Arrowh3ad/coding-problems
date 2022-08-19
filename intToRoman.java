package com.ruiyang.sussy;

import java.util.Scanner;

public class intToRoman {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("num: ");
		num = scan.nextInt();
		System.out.println(intToRoman(num));
	}
	public static String intToRoman(int num) 
	{
		String temp = "";
        while(num >= 1000)
        {
        	temp += "M";
        	num -= 1000;
        }
        if(num>=900)
        {
        	temp += "CM";
        	num -= 900;
        }
        
        
		while(num >= 500)
		{
			temp+= "D";
			num-=500;
		}
		if(num>=400)
        {
        	temp += "CD";
        	num -= 400;
        }
		
		
		while(num >= 100)
		{
			temp+= "C";
			num-=100;
		}
		if(num>=90)
        {
        	temp += "XC";
        	num -= 90;
        }
		
		while(num >= 50)
		{
			temp+= "L";
			num-=50;
		}
		if(num>=40)
        {
        	temp += "XL";
        	num -= 40;
        }
		
		while(num >= 10)
		{
			temp+= "X";
			num-=10;
		}
		if(num>=9)
        {
        	temp += "IX";
        	num -= 9;
        }
		
		while(num >= 5)
		{
			temp+= "V";
			num-=5;
		}
		if(num>=4)
        {
        	temp += "IV";
        	num -= 4;
        }
		
		while(num !=0)
		{
			temp+= "I";
			num -=1;
		}
		return temp;
    }
	
	
}
