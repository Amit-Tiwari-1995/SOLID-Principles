package INTERFACE_SEGREGATION_PRINCIPLE;

public class Waiter implements WaiterInterface {

	@Override
	public void takeOrders() {
		// WAITER WILL TAKE ORDERS FROM CUSTOMERS
		System.out.println("Taking Orders");
		
	}

	@Override
	public void serveCustomers() {
		// WAITER WILL SERVE FOOD TO CUSTOMERS
		System.out.println("Serve Food");
		
	}

	
}
