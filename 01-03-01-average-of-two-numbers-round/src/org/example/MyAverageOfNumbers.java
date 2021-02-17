package org.example;

public class MyAverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M1.01 Adott három szám. Határozza meg átlagukat és írja ki a képernyõre az eredményt!
		int a=5;
		int b=4;
		int c=2;

		// M1.02 Az átlag képlete.
		// M1.04 Mivel az átlag valós szám, az osztás elõtt típuskényszerítést használunk!
		float average=((float)(a+b+c))/3;
		
		//  M1.05 Mostmár az eredmény pontos!	
		System.out.println(a+","+b+","+c+" számok átlaga: "+average);						
		}
	
}
