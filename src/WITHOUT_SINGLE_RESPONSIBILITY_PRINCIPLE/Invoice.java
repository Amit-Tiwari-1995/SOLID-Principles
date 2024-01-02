package WITHOUT_SINGLE_RESPONSIBILITY_PRINCIPLE;

public class Invoice {

	Marker marker;
	int quantity;

	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		int totalPrice = (marker.price) * (quantity);
		return totalPrice;
	}

	public void printInvoice() {
		// print invoice
	}

	public void saveToDB() {
		// save invoice to DB
	}

}
