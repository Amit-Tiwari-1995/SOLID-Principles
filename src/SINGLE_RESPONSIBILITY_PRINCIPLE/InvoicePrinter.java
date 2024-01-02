package SINGLE_RESPONSIBILITY_PRINCIPLE;

public class InvoicePrinter {

	Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		// print invoice
	}

	public void saveToDB() {
		// save invoice to DB
	}

}
