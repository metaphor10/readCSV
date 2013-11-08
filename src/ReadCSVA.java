import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;
 
public class ReadCSVA {
 
  String csvFile;
  ArrayList<String> totalFile= new ArrayList<String>();
  Boolean isTopOfPage;
  public ReadCSVA(String inputFileLocation){
	  csvFile=inputFileLocation;
	  
  }
 
  public void run() {
 
	
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ";";
	
		
	try
	{
		
		FileWriter out= new FileWriter("/Users/borochov/Desktop/verify/computers.csv",true);
		
	    PrintWriter writeToFile = new PrintWriter(out); 
	    
 
	try {
 
		br = new BufferedReader(new FileReader(csvFile));
		System.out.print("nrg");
		while ((line = br.readLine()) != null) {
		//ComputerObj	temp = new ComputerObj();
		String temp1 = new String(line);
		totalFile.add(temp1);
		        // use comma as separator
			String[] computer = line.split(cvsSplitBy);
			
			//System.out.println("Country [code=" + blotter[8]+"@");
			//JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.INFORMATION_MESSAGE);
		
				//writeToFile.println(line);
				//writeToFile.flush();
				/*if (computer[7].equals("Phone"))
				{
					
					
					
				}*/
			
			
				
				
		}
		for (String temp:totalFile)
		{
			//temp+="; test";
			String[] computer = temp.split(cvsSplitBy);
			System.out.println(computer[16]);
			writeToFile.println(temp);
			
		}
		writeToFile.flush();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	writeToFile.close();
	out.close();
  }catch (IOException e) {
  }
		
	
	System.out.println("Done");

  }
 
}