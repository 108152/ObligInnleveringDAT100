package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	public static void main(String[] args) {
		
		String aTxt = showInputDialog("Hva er heltallverdien? ");
		int n = Integer.parseInt(aTxt);
		
		if (n <= 0) System.out.println("For lav verdi. Minimum verdien er 1.    Prøv igjen");
		else {
			int sum = 1;
			for (int i = 1; i <= n; i++) {
				sum *= i;
				}
			System.out.println(sum);
			}
		}
}
