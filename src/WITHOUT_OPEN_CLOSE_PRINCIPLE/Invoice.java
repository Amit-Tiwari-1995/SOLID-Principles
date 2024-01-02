package WITHOUT_OPEN_CLOSE_PRINCIPLE;

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

}
