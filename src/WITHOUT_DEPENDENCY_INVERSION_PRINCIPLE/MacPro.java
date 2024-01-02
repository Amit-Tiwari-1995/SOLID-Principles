package WITHOUT_DEPENDENCY_INVERSION_PRINCIPLE;

public class MacPro {

	private WiredKeyboard keyboard;
	private WiredMouse mouse;
	
	public MacPro()
	{
		this.keyboard=new WiredKeyboard();
		this.mouse=new WiredMouse();
	}
}
