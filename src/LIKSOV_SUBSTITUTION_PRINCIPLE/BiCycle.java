package LIKSOV_SUBSTITUTION_PRINCIPLE;

public class BiCycle implements Bike{

	@Override
	public void turnOnEngine()  {
		throw new AssertionError("There is no Engine!!!");
	}

	@Override
	public void accelarate() {
      // DO SOMETHING		
	}

}
