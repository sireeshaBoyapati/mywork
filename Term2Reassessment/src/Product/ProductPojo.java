package Product;

public class ProductPojo 
{
	int P_ID;
	String P_Name;
	int Rate;
	int Quantity;
	String Supplier;
	
	public ProductPojo() {
		super();
	}

	public ProductPojo(int p_ID, String p_Name, int rate, int quantity, String supplier) {
		super();
		P_ID = p_ID;
		P_Name = p_Name;
		Rate = rate;
		Quantity = quantity;
		Supplier = supplier;
	}

	public int getP_ID() {
		return P_ID;
	}

	public void setP_ID(int p_ID) {
		P_ID = p_ID;
	}

	public String getP_Name() {
		return P_Name;
	}

	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getSupplier() {
		return Supplier;
	}

	public void setSupplier(String supplier) {
		Supplier = supplier;
	}

	@Override
	public String toString() {
		return "ProductPojo [P_ID=" + P_ID + ", P_Name=" + P_Name 
				+ ", Rate=" + Rate + ", Quantity=" + Quantity
				+ ", Supplier=" + Supplier + "]";
	}
	
	
}
