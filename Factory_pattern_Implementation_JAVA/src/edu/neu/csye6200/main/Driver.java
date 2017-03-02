package edu.neu.csye6200.main;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.factory.InventorySort;
import edu.neu.csye6200.pojo.Product;

public class Driver {

	public static void main(String[] args) {

		Product product = new Product();
		List<Product> productslist = new ArrayList<Product>();
		
		product.setProductName("iPhone 7");
		product.setProductId(2);
		product.setPrice((float) 399.99);
		product.setCount(1000);
		
		productslist.add(product);
		
		Product product2 = new Product();
		product2.setProductName("iPad Air");
		product2.setProductId(4);
		product2.setPrice((float) 799.99);
		product2.setCount(100);
		
		productslist.add(product2);
		
		Product product3 = new Product();
		product3.setProductName("iPadMini");
		product3.setProductId(1);
		product3.setPrice((float) 599.99);
		product3.setCount(300);
		
		productslist.add(product3);
		
		
		Product product4 = new Product();
		product4.setProductName("MacBook Air");
		product4.setProductId(3);
		product4.setPrice((float) 999.99);
		product4.setCount(10);
		
		productslist.add(product4);
		System.out.println("List of objects before sorting ");
		System.out.println("-----------------------------------------------");
		for(Product product5 :productslist)
		{
			System.out.println(product5.toString());
		}
		System.out.println("-----------------------------------------------");
		SortDemo demo = new SortDemo();
		
		        //Sorting List by Price
		
				InventorySort inventorySortprice =demo.sortDecision("price");
				inventorySortprice.Sort(productslist);  
				System.out.println(" Productlist after sorting by PRICE");
				System.out.println("------------------------------------------------");
				for(Product product5 :productslist)
				{
					System.out.println(product5.toString());
				}
		
				System.out.println("------------------------------------------------------------");
				//Sorting List by Count
				InventorySort inventorySortCount =demo.sortDecision("count");
				inventorySortCount.Sort(productslist);
				System.out.println(" productlist after sorting by COUNT");
				System.out.println("------------------------------------------------");
				for(Product product5 :productslist)
				{
					System.out.println(product5.toString());
				}
				System.out.println("------------------------------------------------");
				
				//Sorting List by Name
				InventorySort inventorySortName =demo.sortDecision("name");
				inventorySortName.Sort(productslist);
				System.out.println(" productlist after sorting by NAME");
				System.out.println("------------------------------------------------");
				for(Product product7 :productslist)
				{
					System.out.println(product7.toString());
				}
				System.out.println("------------------------------------------------");
				
		        //Sorting List by ProductId
				InventorySort inventorySortProductId =demo.sortDecision("productid");
				inventorySortProductId.Sort(productslist);
				System.out.println(" productlist after sorting by PRODUCT ID");
				System.out.println("------------------------------------------------");
				for(Product product6 :productslist)
				{
					System.out.println(product6.toString());
				}
				System.out.println("------------------------------------------------");
				
				//end of the program 
		
			}
}
