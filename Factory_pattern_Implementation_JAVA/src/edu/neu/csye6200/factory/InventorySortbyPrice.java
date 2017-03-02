package edu.neu.csye6200.factory;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.neu.csye6200.pojo.Product;

public class InventorySortbyPrice implements InventorySort {

	@Override
	public void Sort(List<Product> productslist) {
		// TODO Auto-generated method stub
		
		Collections.sort(productslist, new Comparator<Product>() {

					@Override
					public int compare(Product p1, Product p2) {
						// TODO Auto-generated method stub
						return p1.getPrice().compareTo(p2.getPrice());
					}
		});
	}
}
