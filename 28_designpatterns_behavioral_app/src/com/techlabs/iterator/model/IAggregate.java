package com.techlabs.iterator.model;

public interface IAggregate<T> {

	IIterator<T> createIterator();

}
