package org.example;

import java.text.DecimalFormat;

public class MyGeometricMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M3.01 Hat�rozzuk meg k�t sz�m m�rtani k�zep�t
		int a=5;
		int b=3;	

		// M3.02 Hat�rozzuk meg a h�rom sz�m m�rtani k�zep�t gy�kvon�ssal!
		double geometricMean=Math.sqrt(a*b);

		// M3.03 Az eredm�ny
		System.out.println(a+","+b+" sz�mok m�rtani k�zepe: "+geometricMean);			

	    // M3.04 Az eredm�ny k�t tizedes jegy form�tumban ki�rva
		DecimalFormat df=new DecimalFormat("##.00");
		System.out.println("Kerek�tve: "+df.format(geometricMean));						
	}
}
