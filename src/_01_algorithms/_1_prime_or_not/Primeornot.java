package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Primeornot {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Enter a number.#");
		int numbers = Integer.parseInt(number);
		if(numbers % 2 == 1) {
			JOptionPane.showMessageDialog(null, "It is a prime number.");
		}
		else {
			JOptionPane.showMessageDialog(null, "It is not a prime number.");
		}
		
		
		
		
		
		
	}
}
