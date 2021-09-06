package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {                                // b)
			String poengTxt = showInputDialog("Poengsum? ");
			int poeng = Integer.parseInt(poengTxt);
			int ugyldig = 0;
						
			if ((poeng > 100) || (poeng < 0)) {
				ugyldig++;                                                                       //   c)
				System.out.println("Ugyldig poengsum. Må være fra 0 til 100. Les inn igjen");
				i = i - ugyldig;
			}
			else if (poeng < 40)
				System.out.println(" F ");
			else if (poeng < 50)
				System.out.println(" E ");	
			else if (poeng < 60)
				System.out.println(" D ");
			else if (poeng < 80)
				System.out.println(" C ");
			else if (poeng < 90)
				System.out.println(" B ");
			else
				System.out.println(" A ");
		}
	}
}
