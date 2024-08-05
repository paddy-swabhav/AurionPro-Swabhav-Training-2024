package com.techlabs.Adapter.test;

import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import com.techlabs.Adapter.Model.Biscuit;
import com.techlabs.Adapter.Model.Chocolate;
import com.techlabs.Adapter.Model.Hat;
import com.techlabs.Adapter.Model.HatAdapter;
import com.techlabs.Adapter.Model.IItems;
import com.techlabs.Adapter.Model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		
		List<IItems> list = Arrays.asList(new Biscuit("PARLE G",10.0),
				  new Chocolate("Cadbury",50.0),
				  new HatAdapter(new Hat("KAAN","TOPI",100.0,50.0)));
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		shoppingCart.addItemsToCart(list);

		shoppingCart.getCartItems().stream()
									.forEach((item)->System.out.println(item.getItemName()+"\t\t"+item.getItemPrice()));
		
		System.out.println("\n\nTOTAL: "+shoppingCart.getCartPrice());
	}
	
	

}
