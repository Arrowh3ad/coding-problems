package com.ruiyang.problem;

import java.util.Scanner;

public class ACSLland {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		char[] arr = new char[x];
		for(int i=0; i<x; i++)
		{
			arr[i] = scan.next().charAt(0);
		}
		
		
		char car = scan.next().charAt(0);
		
		char road = scan.next().charAt(0);
		
		double gas = scan.nextDouble();
		
		int[] cities = new int[] {450, 140, 120, 320, 250, 80};
		
		int n = 0;
		for(int i=0; i<x-1; i++)
		{
			n+=Math.abs(arr[i+1]-arr[i]);
		}
		
		int start = arr[0] - 'A';
		int distance = 0;
		for(int i=start; i<start+n; i++)
		{
			distance+=cities[i];
		}
		System.out.println(distance + " distance");
		
		
		int mpg;
		if(car == 'C')
			mpg = 28;
		else if(car == 'M')
			mpg = 25;
		else if(car == 'F')
			mpg = 22;
		else mpg = 20;
		System.out.println(mpg + " mpg");
		
		int speed;
		if(road == 'I')
			speed = 65;
		else if(road == 'H')
			speed = 60;
		else if(road == 'M')
			speed = 55;
		else speed = 45;
		System.out.println(speed + " speed");
		
		//gas cost = miles/mpg * cost
		double cost = (distance/(mpg *1.0))*gas;
		cost = Math.round(cost*100)/100.0;
		//time = distance / speed
		
		int temp = (int) Math.round((distance*60)/(speed*1.0));
		System.out.println(temp + " # of minutes");
		int hours = temp/60;
		int minutes = temp%60;
		
		String minuteZero = "";
		String hourZero = "";
		if(minutes<10) minuteZero = "0";
		if(hours<10) hourZero = "0";

		System.out.println(distance + ", " + hourZero + hours + ":" + minuteZero + minutes + ", $"+ cost);
		
	}
}
