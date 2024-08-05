package com.techlabs.Adapter.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
	List<IItems> itemList;

	public ShoppingCart() {
		super();
		this.itemList = new ArrayList<>();
	}

	public List<IItems> getItemList() {
		return itemList;
	}

	public void setItemList(List<IItems> itemList) {
		this.itemList = itemList;
	}
	
	public void addItemsToCart(List<IItems> itemList)
	{
		for(IItems item: itemList)
		this.itemList.add(item);
//		System.out.println(itemList);
	}
	
	public List<IItems> getCartItems()
	{
		return itemList;
	}
	
	public double getCartPrice()
	{
		return itemList.stream()
				.map(item->item.getItemPrice()).reduce(0d,(item1,item2)->item1+item2);
	}
	
	
	
}
