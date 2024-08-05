package com.techlabs.violation.model;

public class TaxCalculator {

	DBLogger dblogger;

	public DBLogger getDblogger() {
		return dblogger;
	}

	public void setDblogger(DBLogger dblogger) {
		this.dblogger = dblogger;
	}
	
	public int calculateTax(int amount,int rate)
	{
		int tax=0;
		try {
			tax=amount/rate;
//			System.out.println(tax);
		}
		catch(Exception e){
			new DBLogger().log("DIVIDING BY ZERO");
		}
		return tax;
	}
	
}
