package com.java.assignment2;

import java.util.Scanner;

public class Sphare extends Shape{

	
	double radius,area,volume;
	@Override
	public void getInput() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter radius:");
			radius=sc.nextDouble();
		
		if(radius<=0) {
			System.out.println("Please Enter Radius");
			getInput();
			
		}
	}
	@Override
	public void area() {
		area=(Math.PI*radius*radius*4);
		System.out.println("Area of sphare = "+area);
	}
	public void volume() {
		volume=((4*(Math.PI)*Math.pow(radius,3))/3);
		System.out.println("volume of sphare = "+volume);

	}
}
