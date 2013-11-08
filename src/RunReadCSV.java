import java.util.ArrayList;

import javax.swing.JOptionPane;


public class RunReadCSV {

	public static ArrayList<ComputerObj> computersInTheDepatment = new ArrayList<ComputerObj>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog(null, "Enter some text : ", 
				"Roseindia.net", 1);
		System.out.println(str.charAt(0));
		switch(str.charAt(0))
		{
			case '1':
			{
				//init the array
				ReadCSVA first= new ReadCSVA("/Users/borochov/Desktop/verify/PublicSafety.csv");
				first.run();
			}break;
			case '2':
			{
				System.out.println(computersInTheDepatment.get(0).toString());
			}
			default:
			{
				
			}
		}
		
	}

}
