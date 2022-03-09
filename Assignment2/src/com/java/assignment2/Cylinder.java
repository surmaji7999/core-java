package com.java.assignment2;
//This is cylinder class
import java.util.Scanner;

public class Cylinder extends Shape {

	double radius,area,volume, hieght;
	@Override
	public void getInput() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter radius:");
			radius=sc.nextDouble();
			System.out.println("Enter hieght:");
			hieght=sc.nextDouble();
		if(radius<=0 && hieght<=0) {
			System.out.println("Please Enter only positive values");
			getInput();
		}
		
	}
	@Override
	public void area() {
		area = (2*(Math.PI*radius*hieght));
		System.out.println("Area of cylinder "+area);
	}
	public void volume() {
		volume=((Math.PI)*Math.pow(radius,2)*hieght);
		System.out.println("volume of cylinder  = "+volume);

	}
}
