package DEPENDENCY_INVERSION_PRINCIPLE;

public class MacPro {

	private Keyboard keyboard;
	private Mouse mouse;
	
	public MacPro(Keyboard keyboard, Mouse mouse)
	{
		this.keyboard =keyboard;
		this.mouse=mouse;
		
	}
}
