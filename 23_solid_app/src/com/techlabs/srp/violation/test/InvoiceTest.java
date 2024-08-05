package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.model.Invoice;
import com.techlabs.srp.violation.model.InvoicePrinter;
import com.techlabs.srp.violation.model.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice= new Invoice("1","Book",2000,18);
		TaxCalculator taxCalculator= new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice,taxCalculator);
		
		invoicePrinter.printInvoice();
	}

}
