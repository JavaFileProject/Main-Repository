package FinalApplication;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Score {

	public static void main() throws FileNotFoundException {
		f(null);
	}
	
	public static void f(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		for(int score =0 ; score != 22 ; score++ )
		{
		try(PrintWriter out = new PrintWriter("New.txt")) {
		out.print(score); 
		}
		
		
		
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
	}
}
