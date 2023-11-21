package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String candidatoScelto,risposta;
		
		HashMap<String, Integer> candidati = new HashMap<String, Integer>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put("Luca",0);
				put("Giacomo",0);
				put("Enzo",0);
				put("Gabriele",0);
				put("Francesco",0);
			}
		};
		
		do {
			System.out.println("I candidati disponibili sono:");
			System.out.println();
			
			for(String candidato:candidati.keySet()) {
				System.out.println(candidato);
			}
			
			System.out.println();
			System.out.print("Quale candidato scegli? ");
			candidatoScelto = scanner.nextLine();
			
			if(candidati.containsKey(candidatoScelto)){
				candidati.put(candidatoScelto, candidati.get(candidatoScelto)+1);
			} else {
				System.out.println("Candidato inesistente.");
			}
			
			System.out.print("Vuoi inserire un altro voto? (s/n) ");
			risposta = scanner.nextLine();
		}while(risposta.equals("s"));
		
		System.out.println("Risultato votazioni:");
		System.out.println();
		
		for(String candidato:candidati.keySet()) {
			System.out.println(candidato+" - "+candidati.get(candidato));
		}
		
		scanner.close();
	}

}
