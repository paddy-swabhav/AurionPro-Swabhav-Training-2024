package com.techlabs.observer.model;

public interface INotifier {

	public void notify(Account account,String operation,double amount);
}
