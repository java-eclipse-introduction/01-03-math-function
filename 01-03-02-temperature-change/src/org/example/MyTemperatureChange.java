package org.example;

public class MyTemperatureChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M2.01 A h�m�rs�klet 0 fokr�l -8 fokra v�ltozott. 
		//       Mekkora h�m�rs�kletv�ltoz�sr�l van sz�? 

		// M2.02 Elt�roljuk a h�m�rs�klet �rt�keket!
		int startingTemperature=0;
		int finalyTemperature=8;

		// M2.03 Meghat�rozzuk a h�m�rs�klet v�ltoz�st! 	
		System.out.println("A h�m�rs�klet "+startingTemperature+" �C-r�l "+finalyTemperature+" �C-re v�ltozott!");
		int wrongTemperatureChange=startingTemperature-finalyTemperature;
		
		// M2 04 Ez az eredm�ny kifejezi, a v�ltoz�s ir�ny�t is, mivel a sz�m negat�v!		
		System.out.println("A h�m�rs�klet v�ltoz�s ir�nya �s m�r�t�ke "+wrongTemperatureChange+" �C.");		
		
		// M2.05 Ha csak a h�m�rs�kletv�ltoz�s �rt�k�re van sz�ks�g�nk,
		// 		 akkor a v�ltoz�s abszol�t �rt�k�t sz�moljuk ki!
		int temperatureChange=Math.abs(startingTemperature-finalyTemperature);	

		// M2.07 �rjuk ki az eredm�nyt!		
		System.out.println("A h�m�rs�klet v�ltoz�s m�rt�ke "+temperatureChange+" �C."); 
	}
}
