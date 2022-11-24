package client;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoyOLD;

public class PetitPrince implements Sujet, Joueur {

	private String nom;
	private int argent;
	private ConsoleJavaBoyOLD console = new ConsoleJavaBoyOLD(this);
	private int cpt = 0;
	
	public PetitPrince(String nom)
	{
		this.nom = nom;
	}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public int getArgent() {
		// TODO Auto-generated method stub
		return argent;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		cpt++;
		console.parler("Compteur:" + cpt);
		console.parler("Hello");
		console.seDirigerVers(0);
		
	}

	@Override
	public void gagner(int argent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perdre(int argent) {
		// TODO Auto-generated method stub
		
	}

}
