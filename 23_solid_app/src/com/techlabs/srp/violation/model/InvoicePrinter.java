package com.techlabs.srp.violation.model;

public class InvoicePrinter {
	
	private Invoice invoice;
	private TaxCalculator taxCalculator;
	
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}


	public void printInvoice()
	{
		System.out.println("PRODUCT ID: "+invoice.getId());
		System.out.println("DESCRIPTION: "+invoice.getDescription());
		System.out.println("AMOUNT: "+invoice.getAmount());
		System.out.println("TAX: "+taxCalculator.calculateTax());
		System.out.println("TOTAL: "+(taxCalculator.calculateTax()+invoice.getAmount()));
	}
}
