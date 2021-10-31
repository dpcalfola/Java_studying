package multiplication;

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class TableWindowAsk {

	public static void main(String[] args) throws IOException {

		String popupInput = JOptionPane.showInputDialog("Enter the table number");

		int tableNum = Integer.parseInt(popupInput);

		PrintWriter textOut = new PrintWriter("TableWindowAskResult.txt");

		for (int i = 1; i < 10; i++) {
			System.out.println(tableNum * i);
			textOut.write(tableNum * i + "\n");
		}
		textOut.close();

	}

}
