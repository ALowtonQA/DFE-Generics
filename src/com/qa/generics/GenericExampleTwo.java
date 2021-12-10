package com.qa.generics;

public class GenericExampleTwo<T> {

	public T property;
	
	public T doSomething(T obj) {
		System.out.println(obj);
		return obj;
	}
	
	public static void main(String[] args) {
		
		GenericExampleTwo<String> myObjectWithString = new GenericExampleTwo<>();
		myObjectWithString.doSomething("Hello");
		
		GenericExampleTwo<Integer> myObjectWithInteger = new GenericExampleTwo<>();
		myObjectWithInteger.doSomething(1);
	}
}
