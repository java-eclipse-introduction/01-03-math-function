package org.example;

public class MySinusTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M4.01 Matematikai feladat megold�sa sinus t�tellel
		//       A feladat el�rhet�s�ge: https://www.geogebra.org/m/TVa6MHE9

		// M4.02 Megadjuk az ismert adatokat
		int a=10;
		int b=8;
		int alfaDegrees=122;	

		// M4.03 Meghat�rozzuk, hgoy a 122 fok az mennyi radi�n. 
		double alfaRadian=Math.toRadians(alfaDegrees);		

		// M4.04 Alkalmazzuk a feladatban meghat�rozott k�pleteket (sin �s asin is benn�k).
		double sinbetaRadian=8*Math.sin(alfaRadian)/10;		
		double betaRadian=Math.asin(sinbetaRadian);			
	}

}
