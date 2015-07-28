import java.util.ArrayList;


public class Store {
ArrayList<Item> itemsInStock = new ArrayList<Item>();
ArrayList<Customer> customers = new ArrayList<Customer>();

	public Store(){
		customersInStore();
		itemsInStore();
	}

	public ArrayList<Item> itemsInStore(){
		Item orange = new Item("Orange", 3.50, 0.25);
		itemsInStock.add(orange);
		Item apple = new Item("Apple", 1.75, 0.15);
		itemsInStock.add(apple);
		Item peach = new Item("Peach", 1.05, 0);
		itemsInStock.add(peach);
		Item pear = new Item("Pear", 1.25, 0.10);
		itemsInStock.add(pear);
		Item banana = new Item("Banana", 0.99, 0);
		itemsInStock.add(banana);
		Item pasta = new Item("Pasta", 2.55, .05);
		itemsInStock.add(pasta);
		Item hamburger = new Item("Hamburger", 5.49, 0);
		itemsInStock.add(hamburger);
		
		return itemsInStock;
	}
	
	
	public ArrayList<Customer> customersInStore(){
		
		Customer Mitchell = new Customer("Mitchell", false);
		customers.add(Mitchell);
		Customer Nathan = new Customer("Nathan", true);
		customers.add(Nathan);
		Customer Cameron = new Customer("Cameron", true);
		customers.add(Cameron);
		Customer Chris = new Customer("Chris", false);
		customers.add(Chris);
		
		
		return customers;
	}
	
	
	
	
	
	
}
