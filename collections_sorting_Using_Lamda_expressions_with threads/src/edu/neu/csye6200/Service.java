package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.table.TableColumn;

import edu.neu.csye6200.pojo.Stock;

public class Service {
	public java.util.List<Stock> getData(){
		
		  String  thisLine = null;
		  java.util.List<Stock> list = new ArrayList<>();
	      try{
	         // open input stream test.csv for reading purpose.
	       	  FileReader file1 = new FileReader("test.csv");
	         BufferedReader br = new BufferedReader(file1);
	         //Reading file line by line using  bufferreader 
	         while ((thisLine = br.readLine()) != null) {
	            //Split the string using .split with , separates 
	        	 String[] Tokens = thisLine.split(",");
	           
	        	 //Set the tokens to local variables
	            String name = Tokens[0];
	            Double price = (double) Float.parseFloat(Tokens[1]);
	            Float target = Float.parseFloat(Tokens[2]);
	            Float stoploss = Float.parseFloat(Tokens[3]);
	            String advice = Tokens[4];
	           
	            
	            //instantiated the Stock object with parameterize constructor 
	            Stock Stock = new Stock(name,price,target,stoploss,advice);
	            //Add the emloyee object to arraylist of type Stock
	          list.add(Stock);
	            
	         } 
	         //Close the bufferReader 
	         br.close();
	         //Close the File which was open before
	         file1.close();
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	      //Return the list of Stock objects read form file 
	      return list;
	      
	   
	}
	
	void Compare(List<Stock> slist){
		/*
		Stock stock = new Stock("IBM", (float)143.5, (float)144.3, (float)140.4,"buy"); 
		Stock stock1 = new Stock("Apple", (float)133.5, (float)156.3, (float)130.4,"sell"); 
		Stock stock2 = new Stock("Dell", (float)122.5, (float)110.3, (float)120.4,"buy"); 
				*/
		//java.util.List<Stock> stockList = new ArrayList<>();
		/*stockList.add(stock);
		stockList.add(stock1);
		stockList.add(stock2);*/
		
		
		/*Collections.sort(slist, new Comparator<Stock>() {

			@Override
			public int compare(Stock o1, Stock o2) {
				// TODO Auto-generated method stub
				
				return o1.getStockPrice().compareTo(o2.getStockPrice());
			}
		});
*/		
		slist.sort((Stock o1, Stock o2)->Double.compare(o1.getStockPrice(), o2.getStockPrice()) );

			
		System.out.println("        ----------------------------OUTPUT FILE---------------------------------");
		System.out.format("%15s%30s%30s%15s%15s","Name","Stock Price","Target","Stop Loss","Advice");
		System.out.println();
		System.out.println("        -------------------------------------------------------------------------");
		final Object[][] table = new String[10][];
		int i = 0;
		for(Stock s: slist)
		{
			if(s.getStokeTarget()>s.getStoploss())
			{
				s.setAdvice("BUY");
			}
			if(s.getStokeTarget()<s.getStoploss()){
				s.setAdvice("SELL");	
			}
			
			if(i<10)
						table [i] =  new String[]{ s.getName(), s.getStockPrice().toString(), s.getStokeTarget().toString(),s.getStoploss().toString() ,s.getAdvice()};
			i++;
			
		}
		for (final Object[] row : table) {
		    System.out.format("%15s%30s%30s%15s%15s\n", row);
		}
	}

	public List<Stock> dayOneSimulation(List<Stock> sList) {
		for(Stock s : sList)
		{
			s.setStockPrice(s.getStockPrice()+10);
		}
		return sList;
		// TODO Auto-generated method stub
		
		
		
	}

	public List<Stock> daytwoSimulation(List<Stock> sList) {
		// TODO Auto-generated method stub
		
		for(int i=0;i< sList.size();i++)
		{
			
			
			if((i % 2)==0)
			{
				sList.get(i).setStockPrice(sList.get(i).getStockPrice()+20);
			}
			else
			{
				sList.get(i).setStockPrice(sList.get(i).getStockPrice()+40);	
			}
			
		}
		return sList;
	}

	public List<Stock> daythreeSimulation(List<Stock> sList) {
		// TODO Auto-generated method stub
		for(int i=0;i< sList.size();i++)
		{
			
			
			if((i % 3)==0)
			{
				sList.get(i).setStockPrice(sList.get(i).getStockPrice()+30);
			}
			else
			{
				sList.get(i).setStockPrice(sList.get(i).getStockPrice()+60);	
			}
			
		}
		return sList;
	}
	
	
	
	
	

}
