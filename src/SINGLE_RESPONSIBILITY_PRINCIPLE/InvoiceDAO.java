package SINGLE_RESPONSIBILITY_PRINCIPLE;

public class InvoiceDAO {
 
	Invoice invoice;
	
	public InvoiceDAO(Invoice invoice)
	{
		this.invoice=invoice;
	}
	
	public void saveToDB() {
		// save invoice to DB
	}
	
}
