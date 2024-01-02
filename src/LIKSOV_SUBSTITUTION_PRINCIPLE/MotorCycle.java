package LIKSOV_SUBSTITUTION_PRINCIPLE;

public class MotorCycle implements Bike {

	boolean isEngine;
	int speed;

	@Override
	public void turnOnEngine() {

		isEngine = true;
	}

	@Override
	public void accelarate() {

		speed = speed + 10;
	}

}
