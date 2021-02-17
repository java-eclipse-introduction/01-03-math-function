package org.example;

import java.text.DecimalFormat;

public class MyAverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M1.01 Adott h�rom sz�m. Hat�rozza meg �tlagukat �s �rja ki a k�perny�re az eredm�nyt!
		int a=5;
		int b=4;
		int c=2;

		// M1.02 Az �tlag k�plete.
		// M1.04 Mivel az �tlag val�s sz�m, az oszt�s el�tt t�pusk�nyszer�t�st haszn�lunk!
		float average=((float)(a+b+c))/3;
		
		//  M1.05 Mostm�r az eredm�ny pontos!	
		System.out.println(a+","+b+","+c+" sz�mok �tlaga: "+average);		
		
		// M1.06 Kerek�ts�k a sz�mot k�t tizedes jegyre! A Math oszt�lyt haszn�ljuk!
		float roundedAverage =Math.round(average*100)/(float)100;		
		
		// M1.07 A kerek�tett �tlag tizedes ponttal jelenik meg!
		System.out.println(a+","+b+","+c+" sz�mok kerek�tett �tlaga: "+roundedAverage );				

	    // M1.08 Az eredm�ny k�t tizedes jegy form�tumban ki�rva
		DecimalFormat df=new DecimalFormat("##.00");
		System.out.println("Az eredm�ny k�t tizedes jegyen megjelen�tve: "+df.format(average));					
	}	
}
