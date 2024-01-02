package WITHOUT_INTERFACE_SEGREGATION_PRINCIPLE;

public class Waiter implements RestaurantEmployee {

	@Override
	public void washDishes() {
       //NOT MY JOB		
	}

	@Override
	public void serveFood() {
		//WILL SERVE FOOD
		System.out.println("Will be serving food");
	}

	@Override
	public void cookFood() {
		//NOT MY JOB		
	}

}
