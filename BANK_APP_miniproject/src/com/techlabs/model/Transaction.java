package com.techlabs.model;

public class Transaction {
	
	private int transactionid;
	private int transactiontypeid;
	private long senderaccountnumber;
	private long receiveraccountnumber;
	private double amount;
	private String date;
	
	public Transaction(int transactionid, int transactiontypeid, long senderaccountnumber, long receiveraccountnumber,
			double amount, String date) {
		super();
		this.transactionid = transactionid;
		this.transactiontypeid = transactiontypeid;
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

	public int getTransactiontypeid() {
		return transactiontypeid;
	}

	public void setTransactiontypeid(int transactiontypeid) {
		this.transactiontypeid = transactiontypeid;
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
