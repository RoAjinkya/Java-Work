package edu.neu.csye6200;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import edu.neu.csye6200.pojo.Stock;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		java.util.List<Stock> sList = new ArrayList<>();
		java.util.List<Stock> sListday1 = new ArrayList<>();
		java.util.List<Stock> sListday2 = new ArrayList<>();
		java.util.List<Stock> sListday3 = new ArrayList<>();
		
		sList = service.getData();
		System.out.println("Input file for day 1");
		
		Comparator<Stock> byname =
				(Stock o1, Stock o2)->o1.getName().compareTo(o2.getName());
				
				System.out.println(" by name "+byname.toString());
		
				
		Runnable list3sort =()->{
			java.util.List<Stock> sList1;
			sList1 = service.getData();
			System.out.println("Input file for day 1");
			System.out.println("start thread method");
			service.Compare(sList1);
			System.out.println("inide thread method");
		};
		
		new Thread(list3sort).start();
	

		//sList.sort((Stock o1, Stock o2)->o1.getName()-o2.getName());

		
		sListday1 = service.dayOneSimulation(sList);
		System.out.println("After day 1");
		service.Compare(sListday1);
		
		sListday2 = service.daytwoSimulation(sList);
		System.out.println("After day 2");
		service.Compare(sListday2);
		
		
		
		sListday3 = service.daythreeSimulation(sList);
		System.out.println("After day 3");
		service.Compare(sListday2);
		

	}
	
	

}
