package com.techlabs.model;

public class Transaction {
	
	private int transactionid;
	private String transactiontype;
	private long senderaccountnumber;
	private long receiveraccountnumber;
	private double amount;
	private String date;
	
	public Transaction(int transactionid, String transactiontype, long senderaccountnumber, long receiveraccountnumber,
			double amount, String date) {
		super();
		this.transactionid = transactionid;
		this.transactiontype = transactiontype;
		this.senderaccountnumber = senderaccountnumber;
		this.receiveraccountnumber = receiveraccountnumber;
		this.amount = amount;
		this.date = date;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public long getSenderaccountnumber() {
		return senderaccountnumber;
	}

	public void setSenderaccountnumber(long senderaccountnumber) {
		this.senderaccountnumber = senderaccountnumber;
	}

	public long getReceiveraccountnumber() {
		return receiveraccountnumber;
	}

	public void setReceiveraccountnumber(long receiveraccountnumber) {
		this.receiveraccountnumber = receiveraccountnumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
