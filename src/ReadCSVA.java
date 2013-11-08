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
  String cvsSplitBy = ";";
  Boolean[] hasBeenModified;
  
  
  public ReadCSVA(String inputFileLocation){
	  csvFile=inputFileLocation;
	  
  }
 
  public void run() {
 
	
	BufferedReader br = null;
	String line = "";
	
	
		
	/*try
	{
		
		FileWriter out= new FileWriter("/Users/borochov/Desktop/verify/computers.csv",true);
		
	    PrintWriter writeToFile = new PrintWriter(out); */
	    
 
	try {
 
		br = new BufferedReader(new FileReader(csvFile));
		System.out.print("nrg");
		while ((line = br.readLine()) != null) {
		//ComputerObj	temp = new ComputerObj();
		String temp1 = new String(line);
		RunReadCSV.totalFile.add(temp1);
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
		hasBeenModified = new Boolean[RunReadCSV.totalFile.size()];
		/*for (String temp:RunReadCSV.totalFile)
		{
			//temp+="; test";
			String[] computer = temp.split(cvsSplitBy);
			System.out.println(computer[16]);
			writeToFile.println(temp);
			
		}
		writeToFile.flush();*/
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
	/*
	writeToFile.close();
	out.close();
  }catch (IOException e) {
  }*/
		
	
	System.out.println("Done");

  }
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
  public void searchFile(String toSearch)
  {
	  Boolean NeedsToBeReplaced=false;
	  
	  for (int y=0;y<RunReadCSV.totalFile.size();y++)
	  {
		  String[] computer = RunReadCSV.totalFile.get(y).split(cvsSplitBy);
		  for (int i=0;i<computer.length;i++)
		  {
			  if(computer[i].equals(toSearch))
			  {
				  String temp=RunReadCSV.totalFile.get(y).replace("No", "Yes");
				  RunReadCSV.totalFile.set(y, temp);
				  
			  }
		  }
		  
	  }
  }
 
}