import java.util.*;

public class GroceryBill {
	private Employee clerk;
	private List<Item> receipt;
	private double total;
	private double internalDiscount;
	
	public GroceryBill(){
		
	}
	
	public GroceryBill(Employee clerk) {
		this.clerk = clerk;
		receipt = new ArrayList<Item>();
		total = 0.0;
		internalDiscount = 0.0;
	} 
	
	//Add items to bill
	public void add(Item i) {
		receipt.add(i);
		total += i.getPrice();
		internalDiscount += i.getDiscount();
	}
	
	
	public double getTotal() {
		return Math.rint(total * 100) / 100.0;
	}
	
	public Employee getClerk() {
		return clerk;
	}
	
	public void printReceipt() {
		System.out.println(this);
	}
	
	private String valueToString(double value) {
		value = Math.rint(value * 100) / 100.0;
		String result = "" + Math.abs(value);
		if(result.indexOf(".") == result.length() - 2) {
			result += "0";
		}
		result = "$" + result;
		return result;
	}
	
	public String receiptToString() {
		String build = "items:\n";
		for(int i = 0; i < receipt.size(); i++) {
			build += "   " + receipt.get(i);
			if(i != receipt.size() - 1) {
				build += "\n";
			}
		}
		return build;
	}
	
	public String toString() {
		return receiptToString() + "\ntotal: " + discountToString();
	}
	
	public String discountToString() {
		return receiptToString() + "\nsub-total: " + valueToString(total) + "\ndiscount: " + valueToString(internalDiscount) + "\ntotal: " + valueToString(total - internalDiscount);
	}
//	REPLACEME

}