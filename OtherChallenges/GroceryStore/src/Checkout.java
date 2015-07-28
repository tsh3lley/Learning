import java.util.*;


public class Checkout {
	static ArrayList<Item> basket = new ArrayList<Item>();
	static ArrayList<Customer> customers = new ArrayList<Customer>();

	
	public static void main(String[] args) {
		Store giant215 = new Store();
		Scanner keyboard = new Scanner(System.in);
		String personInLine;
		boolean found = false;
		String name = "";
		boolean preferred = false;
		
		//Add employees, this would be done from another Class/method if the store were real
		Employee Bowen = new Employee("Bowen");
		Employee Teresa = new Employee("Teresa");
		
		//Find out which customer we are dealing with
		System.out.println("Who is in line?");
		personInLine = keyboard.next();
		
		for (int i=0;i<giant215.customers.size();i++){
			if (personInLine.toLowerCase() == giant215.customers.get(i).getName().toLowerCase()){
				Customer whichCustomer = new Customer(giant215.customers.get(i).getName(), giant215.customers.get(i).getPreferred());
				name = whichCustomer.getName();
				preferred = whichCustomer.getPreferred();
				found = true;
			}
		}
		//If we don't have a record of that customer, they must not be a preferred member
		if (found == true){
			if (preferred == true){
				System.out.println(name + " is a preferred member."); 
			}
			else{
				System.out.println(name + " is not a preferred member."); 
			}
		}
		else{
			Customer whichCustomer = new Customer("Unknown Shopper", false);
			name = whichCustomer.getName();
			preferred = whichCustomer.getPreferred();
			if (preferred == true){
				System.out.println(name + " is a preferred member."); 
			}
			else{
				System.out.println(name + "s can not be preferred members."); 
			}
		}
		
		basket = addToBasket();
		DiscountBill db = new DiscountBill(Bowen, preferred );
		
		//Inheritance means that I can use the "add()" method from GroceryBill without defining it in DiscountBill. This is because DiscountBill extends GroceryBill
		for (int i=0;i<basket.size();i++){
			db.add(basket.get(i));
		}
		//internalDiscount = db.getDiscountAmount();
		
		db.printReceipt();
		db.statsToString();
		
	}
	

	
	public static ArrayList<Item> addToBasket(){
		boolean done = false;
		Scanner keyboard = new Scanner(System.in);
		Store giant215 = new Store();
		String temp;
		
		System.out.println("What is in their basket? Type 'Done' if there are no more items.");
		
		while (done != true){
			temp = keyboard.next().toLowerCase();
			boolean found = false;
			if (temp.equals(("done"))){
				done = true;
				continue;
			}
			for (int i=0;i<giant215.itemsInStock.size();i++){
				if (temp == (giant215.itemsInStock.get(i)).toString()){
					basket.add(giant215.itemsInStock.get(i));
					found = true;
				}
			}
			if (found == false);{
				System.out.println("Item does not exist or is out of stock");
			}
		}
		return basket;
	}
}
