package org.example;

import java.text.DecimalFormat;

public class MyGeometricMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M3.01 Határozzuk meg két szám mértani közepét
		int a=5;
		int b=3;	

		// M3.02 Határozzuk meg a három szám mértani közepét gyökvonással!
		double geometricMean=Math.sqrt(a*b);

		// M3.03 Az eredmény
		System.out.println(a+","+b+" számok mértani közepe: "+geometricMean);			

	    // M3.04 Az eredmény két tizedes jegy formátumban kiírva
		DecimalFormat df=new DecimalFormat("##.00");
		System.out.println("Kerekítve: "+df.format(geometricMean));						
	}
}
