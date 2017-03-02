package edu.neu.csye6200.main;

import java.util.List;

import edu.neu.csye6200.factory.InventorySort;
import edu.neu.csye6200.factory.InventorySortbyCount;
import edu.neu.csye6200.factory.InventorySortbyName;
import edu.neu.csye6200.factory.InventorySortbyPrice;
import edu.neu.csye6200.factory.InventorySortbyProductId;
import edu.neu.csye6200.pojo.Product;

public class SortDemo {

	public InventorySort sortDecision(String sorting){
		

		if(sorting==null)
		return null;
		
		if(sorting.equals("price"))
		return new InventorySortbyPrice();
		
		if(sorting.equals("count"))
			return new InventorySortbyCount();
		
		if(sorting.equals("name"))
		return new InventorySortbyName();
		
		if(sorting.equals("productid"))
		return new InventorySortbyProductId();
		
		return null;
		
		
	}
	
}
