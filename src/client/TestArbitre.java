package client;

import jeu.JeuDe;
import jeu.JeuShifumi;
import jeu.JeuSimple;

public class TestArbitre {

	public static void arbitrer(Joueur j1, Joueur j2, JeuSimple jeu)
	{
		String str1 = jeu.jouerUnTour();
		String str2 = jeu.jouerUnTour();
		System.out.println("J1 joue : " + str1);
		System.out.println("J2 joue : " + str2);
		jeu.arbitrer(str1, str2);
	}
}
