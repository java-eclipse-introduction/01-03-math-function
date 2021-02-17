package org.example;

public class MyTemperatureChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// M2.01 A hõmérséklet 0 fokról -8 fokra változott. 
		//       Mekkora hõmérsékletváltozásról van szó? 

		// M2.02 Eltároljuk a hõmérséklet értékeket!
		int startingTemperature=0;
		int finalyTemperature=8;

		// M2.03 Meghatározzuk a hõmérséklet változást! 	
		System.out.println("A hõmérséklet "+startingTemperature+" °C-ról "+finalyTemperature+" °C-re változott!");
		int wrongTemperatureChange=startingTemperature-finalyTemperature;
		
		// M2 04 Ez az eredmény kifejezi, a változás irányát is, mivel a szám negatív!		
		System.out.println("A hõmérséklet változás iránya és mérétéke "+wrongTemperatureChange+" °C.");		
		
		// M2.05 Ha csak a hõmérsékletváltozás értékére van szükségünk,
		// 		 akkor a változás abszolút értékét számoljuk ki!
		int temperatureChange=Math.abs(startingTemperature-finalyTemperature);	

		// M2.07 Írjuk ki az eredményt!		
		System.out.println("A hõmérséklet változás mértéke "+temperatureChange+" °C."); 
	}
}
