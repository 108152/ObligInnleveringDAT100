package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
	public static void main(String[] args) {
		String lonnTxt = showInputDialog("Lønn?");
		int lonn = Integer.parseInt(lonnTxt);
		
		int skatt;
		// Tabellgrenser hentet fra   https://www.skatteetaten.no/satser/trinnskatt/?year=2021#rateShowYear
		if (lonn <= 184800 ) {
			System.out.println("Null skatt");
		}
		else if (lonn <= 260100) {
			skatt = (lonn / 10000) * 170;
			System.out.println("Med en lønn på " + lonn + " kr, blir skatten " + skatt + " kr.");
		}
		else if (lonn <= 651250) {
			skatt = (lonn / 10000) * 400;
			System.out.println("Med en lønn på " + lonn + " kr, blir skatten " + skatt + " kr.");
		}
		else if (lonn <= 1021550) {
			skatt = (lonn / 10000) * 1320;
			System.out.println("Med en lønn på " + lonn + " kr, blir skatten " + skatt + " kr.");
		}
		else if (lonn > 1021550) {
			skatt = (lonn / 10000) * 1620;
			System.out.println("Med en lønn på " + lonn + " kr, blir skatten " + skatt + " kr.");
		}
		else
			System.out.println("Ikke en godkjent sum. Prøv igjen med bare hele kr.");
	}
}
