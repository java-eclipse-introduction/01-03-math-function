package org.example;

public class MySinusTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M4.01 Matematikai feladat megoldása sinus tétellel
		//       A feladat elérhetõsége: https://www.geogebra.org/m/TVa6MHE9

		// M4.02 Megadjuk az ismert adatokat
		int a=10;
		int b=8;
		int alfaDegrees=122;	

		// M4.03 Meghatározzuk, hgoy a 122 fok az mennyi radián. 
		double alfaRadian=Math.toRadians(alfaDegrees);		

		// M4.04 Alkalmazzuk a feladatban meghatározott képleteket (sin és asin is bennük).
		double sinbetaRadian=8*Math.sin(alfaRadian)/10;		
		double betaRadian=Math.asin(sinbetaRadian);			

		// M4.05 Az eredmény radiánban és fokban megadva.
		System.out.println("Beta:"+betaRadian+" radian.");
		double betaDegree=Math.toDegrees(betaRadian);
		System.out.println("Beta:"+betaDegree+" fok.");		

		// M4.06 Az eredmény két tizedes jegyre kerekítve.
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println("Beta:"+df.format(betaDegree)+" fok.");		
	
	}

}
