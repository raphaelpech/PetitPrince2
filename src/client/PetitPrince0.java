package client;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoyOLD;

public class PetitPrince0 implements Sujet {

	private String nom;
	private int argent;
	private ConsoleJavaBoyOLD console = new ConsoleJavaBoyOLD(this);
	private int cpt = 0;
	
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

}
