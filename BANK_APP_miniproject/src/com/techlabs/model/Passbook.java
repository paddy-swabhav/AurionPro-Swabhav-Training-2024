package com.techlabs.model;

public class Passbook {
	
//	T.transactionid, T.receiveraccountnumber, TY.transactiontype, T.amount, T.transactiondate, A.balance
	private int transactionid;
	private long receiveraccountnumber;
	private String transactiontype;
	private double amount;
	private String transactiondate;
	private Double balance;
	
	public Passbook(int transactionid, long receiveraccountnumber, String transactiontype, double amount,
			String transactiondate, Double balance) {
		super();
		this.transactionid = transactionid;
		this.receiveraccountnumber = receiveraccountnumber;
		this.transactiontype = transactiontype;
		this.amount = amount;
		this.transactiondate = transactiondate;
		this.balance = balance;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public long getReceiveraccountnumber() {
		return receiveraccountnumber;
	}

	public void setReceiveraccountnumber(long receiveraccountnumber) {
		this.receiveraccountnumber = receiveraccountnumber;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
}
