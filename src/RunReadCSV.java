import java.util.ArrayList;

import javax.swing.JOptionPane;


public class RunReadCSV {

	public static ArrayList<String> totalFile = new ArrayList<String>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean running=true;
		// TODO Auto-generated method stub
		String str ;
		ReadCSVA first= new ReadCSVA("/Users/borochov/Desktop/verify/PublicSafety.csv");
		while (running)
		{
			str = JOptionPane.showInputDialog(null, "Enter some text : ", 1);
			switch(str.charAt(0))
			{
				case '1':
				{
					//init the array
					
					first.run();
				}break;
				case '2':
				{
					
					first.printToFile();
				}break;
				case '3':
				{
					running = false;
				}break;
				case '4':
				{
					
					first.searchFile(JOptionPane.showInputDialog(null, "term to search : ", 1));
				}break;
				default:
				{
					
				}
			}
			
		}
		
		
	}
	

}

