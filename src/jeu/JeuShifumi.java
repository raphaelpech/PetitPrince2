package jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple {

	private Random rand = new Random();
	@Override
	public int arbitrer(String c1, String c2) {
		if(Shifumi.valueOf(c1).compareTo(Shifumi.valueOf(c2)) < 0)
		{
			System.out.print("J2 gagne!");
			return -1;
		}else if(Shifumi.valueOf(c1).compareTo(Shifumi.valueOf(c2)) > 0)
		{
			System.out.print("J1 gagne!");
			return 1;
		}
		else
		{
			System.out.print("Egalite...");
			return 0;
		}
	}

	@Override
	public String jouerUnTour() {
		int r = rand.nextInt(1,4);
		String str = null;
		switch(r)
		{
			case 1:
				str = Shifumi.PIERRE.toString();
				break;
			case 2:
				str = Shifumi.FEUILLE.toString();
				break;
			case 3:
				str = Shifumi.CISEAUX.toString();
				break;
		}
		return str;
	}
	
	private enum Shifumi {PIERRE, FEUILLE, CISEAUX};
	
}
