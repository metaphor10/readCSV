import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ComputerObj {
	String cvsSplitBy = ";";
	public void printToFile(){
		try
		{
			
			FileWriter out= new FileWriter("/Users/borochov/Desktop/verify/computers.csv",true);
			
		    PrintWriter writeToFile = new PrintWriter(out); 
		    for (String temp:RunReadCSV.totalFile)
			{
				//temp+="; test";
				String[] computer = temp.split(cvsSplitBy);
				System.out.println(computer[computer.length-1]);
				writeToFile.println(temp);
				
			}
		    writeToFile.close();
			out.close();
		  }catch (IOException e) {
		  }
	}
	

	

}
