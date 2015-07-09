import java.util.List;


public class DiscountBill extends GroceryBill {
	
	private Employee clerk;
	private List<Item> receipt;
	private double total;
	private double internalDiscount;
	private double amount;
	private double percent;
	private boolean preferred;
	private int count;
	
	public DiscountBill(){
	}
	
	public DiscountBill(Employee clerk, boolean preferred){
		this.clerk = clerk;
		this.preferred = preferred;
	}
	
	public int getDiscountCount(){
		for(int i = 0; i < receipt.size(); i++) {
			if(receipt.get(i).getDiscount() != 0) {
				count ++;
			}
		}
		return count; 
	}
	
	public double getDiscountAmount(){
		for(int i = 0; i < receipt.size(); i++) {
			amount += receipt.get(i).getDiscount();
		}
		return amount;
	}
	
	public double getDiscountPercent(){
		total = getTotal();
		percent = (total - getDiscountAmount()) / total;
		return percent;
	}
	
	public String statsToString() {
		return "\nItems Discounted: " + getDiscountCount() + "\nPecent Saved: " + getDiscountPercent();
	}
}
