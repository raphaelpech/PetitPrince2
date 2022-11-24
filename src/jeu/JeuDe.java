package jeu;

import java.util.Random;

public class JeuDe extends JeuSimple {

	private Random rand = new Random();
	
	public JeuDe()
	{
		
	}
	
	@Override
	public int arbitrer(String c1, String c2) {
		int d1 = Integer.parseInt(c1);
		int d2 = Integer.parseInt(c2);
		if(d1 > d2)
		{
			System.out.print("J1 gagne!");
			return -1;
		}else if (d2 > d1)
		{
			System.out.print("J2 gagne!");
			return 1;
		}else 
		{
			System.out.print("Egalite...");
			return 0;
		}
	}

	@Override
	public String jouerUnTour() {
		int r = rand.nextInt(1, 7);
		String str = ""+ r;
		return str;
	}

}
