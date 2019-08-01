package arraylist;

public class Mall {
	
	public static void main(String[] args) {
		Store myStore = new Store("James", "123 Main St");

		Item i1 = new Item("Orange", 2.99);
		Item i2 = new Item("Apple", 1.99);
		Item i3 = new Item("Kiwi", 3.99);

		System.out.println("---------------------");
		System.out.println("Add items");
		System.out.println("---------------------");
		myStore.seeInventory();
		myStore.addItem(i1);
		myStore.addItem(i2);
		myStore.addItem(i3);
		myStore.seeInventory();

		System.out.println("---------------------");
		System.out.println("Sell Orange");
		System.out.println("---------------------");
		myStore.sell("Orange");
		System.out.println();
		myStore.seeInventory();
		System.out.println("Number of Items: " + myStore.numOfItems);
		System.out.println("Total Sales: " + myStore.totalSales);
		System.out.println();

		System.out.println("---------------------");
		System.out.println("Refund Orange");
		System.out.println("---------------------");
		myStore.refund(i1);
		myStore.seeInventory();
		System.out.println("Number of Items: " + myStore.numOfItems);
		System.out.println("Total Sales: " + myStore.totalSales);
		System.out.println();

		System.out.println("---------------------");
		System.out.println("Check Orange");
		System.out.println("---------------------");
		System.out.println(myStore.checkItem("Orange"));
		System.out.println();

		System.out.println("---------------------");
		System.out.println("Sell Orange");
		System.out.println("---------------------");
		myStore.sell("Orange");
		System.out.println();
		myStore.seeInventory();
		System.out.println("Number of Items: " + myStore.numOfItems);
		System.out.println("Total Sales: " + myStore.totalSales);
		System.out.println();

		System.out.println("---------------------------");
		System.out.println("Exchange Orange to Apple");
		System.out.println("---------------------------");
		myStore.exchange(i1, i2);
		myStore.seeInventory();
		System.out.println("Number of Items: " + myStore.numOfItems);
		System.out.println("Total Sales: " + myStore.totalSales);
		System.out.println();

		System.out.println("---------------------");
		System.out.println("Ask user to add items");
		System.out.println("---------------------");
		myStore.addItem(2);
		System.out.println();
		myStore.seeInventory();
	}
}
