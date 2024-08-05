package com.techlabs.observer.test;

import com.techlabs.observer.model.Account;
import com.techlabs.observer.model.AppNotifier;
import com.techlabs.observer.model.EmailNotifier;
import com.techlabs.observer.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account(101,"Paddy",10000);
		
		account.addNotifiers(new SmsNotifier());
		account.addNotifiers(new EmailNotifier());
		account.addNotifiers(new AppNotifier());
		
		account.credit(1000);
		account.debit(1000);
	}

}
