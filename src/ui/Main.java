package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		readInput();
		
	}
	
	public static void readInput()throws IOException{
		String space = "";
		
		int numBooks = 0;
		int[] prices = null;
		int peterMoney;
		
		while (!space.equalsIgnoreCase("EOF")) {
			// Lee la cantidad de libros disponibles.
			numBooks = Integer.parseInt(br.readLine());
			
			prices = new int[numBooks];
			
			for (int i = 0; i < prices.length; i++) {
				// Lee el precio de cada libro.
				prices[i] = Integer.parseInt(br.readLine());
				
			}
			
			peterMoney = Integer.parseInt(br.readLine());
			space = br.readLine();
			
		}
		

		Arrays.sort(prices);
		
		System.out.println(Arrays.toString(prices));
	}

}
