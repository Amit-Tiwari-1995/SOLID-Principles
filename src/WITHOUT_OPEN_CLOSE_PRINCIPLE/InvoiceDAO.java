package WITHOUT_OPEN_CLOSE_PRINCIPLE;

public class InvoiceDAO {
 
	Invoice invoice;
	
	public InvoiceDAO(Invoice invoice)
	{
		this.invoice=invoice;
	}
	
	public void saveToDB() {
		// save invoice to DB
	}
	
	public void saveToFile()
	{
		// save invoice to FILE
	}
	
   
	
}
