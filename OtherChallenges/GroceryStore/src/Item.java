public class Item {
		private String name;
		private double price;
		private double discount;
		
		public Item(String name, double price, double discount) {
			this.name = name;
			this.price = price;
			this.discount = discount;
		}
		
		public double getPrice() {
			return price;
		}
		
		public double getDiscount() {
			return discount;
		}
		
		private String valueToString(double value) {
			String result = "" + Math.abs(value);
			if(result.indexOf(".") == result.length() - 2) {
				result += "0";
			}
			result = "$" + result;
			return result;
		}
		
		public String toString() {
			return name + " " + valueToString(price) + " (-" + valueToString(discount) + ")";
		}
		
		
	}