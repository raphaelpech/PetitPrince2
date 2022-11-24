package main;

import client.Joueur;
import client.PetitPrince;
import client.PetitPrince0;
import client.TestArbitre;
import jeu.JeuDe;
import jeu.JeuShifumi;
import jeu.JeuSimple;

//import petitPrince.PetitPrince0;
//import petitPrince.PetitPrince;


public class Run3PetitsPrinces {
	
	private static void scenario0() {
		System.out.println("Creation Petit Princes 0 : \n");
		
		for (int i = 1; i <= 9; i++) {
//			new PetitPrince0();
		}
	}

	private static void scenario1() {
		System.out.println("Creation Petit Princes : \n");
		
		for (int i = 1; i <= 9; i++) {
//			new PetitPrince("PP" + i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("BEGIN : Petit Prince 2 \n");
		
		scenario0();

		PetitPrince pp1 = new PetitPrince("Franck");
		pp1.run();
		PetitPrince pp2 = new PetitPrince("");
		pp2.run();
		
		System.out.println("\nEND \n");
		
		TestArbitre ta = new TestArbitre();
		JeuDe jeu1 = new JeuDe();
		JeuShifumi jeu2 = new JeuShifumi();
		ta.arbitrer( pp1, pp2, jeu1);
		ta.arbitrer( pp1, pp2, jeu2);
	}

}
