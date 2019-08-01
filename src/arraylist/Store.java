package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	/* Create a class Store.  
	Instance variables: name, address, list of Item, number of items. 
	Create a constructor that accepts name and address and set both values 
	to corresponding instance variables.  
	
	Create a method addItem. This method doesn’t return anything and it 
	accepts Item object as parameter. Simply add given Item to the list of 
	items and increment number of items by one. 
	
	Create a method seeInventory. This method doesn’t take or return anything. 
	It should simply print each and every single item information.  
	Note: You can use info method that Item class has.*/
	
	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	double totalSales; 
	Scanner input = new Scanner(System.in);
	
	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void addItem(Item item) {
		storeItems.add(item);
		numOfItems++;
		
	}
	
	public void seeInventory() {
		for(Item i: storeItems) {
			i.info();
			System.out.println();
		}
	}
	
	public void sell(String itemName) {
		for (int i = 0; i < storeItems.size(); i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is sold for " + storeItems.get(i).price);
				numOfItems--;
				totalSales+= storeItems.get(i).price;
				storeItems.remove(i);
				break;
			}
		}
	}
	
	public void refund(Item item) {
		storeItems.add(item);
		totalSales -= item.price;
		numOfItems++;
	}
	
	public boolean checkItem(String itemName) {
		for(Item item : storeItems) {
			if(item.name.equals(itemName)) {
				return true;
			}
		}
		return false;
	}
	public void exchange(Item itemReturn, Item itemTake ) {
		storeItems.add(itemReturn);
		storeItems.remove(itemTake);
		totalSales -= itemReturn.price - itemTake.price;
		
	}
	public void addItem(int num) {
		for(int i=0; i < num; i++) {
			System.out.println("Please enter item name " + (i + 1) + ":");
			String name = input.nextLine();
			System.out.println("Please enter item price " + (i + 1) + ":");
			double price = input.nextDouble();
			input.nextLine();
			Item item = new Item(name, price);
			storeItems.add(item);
			numOfItems++;
					
			
					
		}
	}
}
