package com.techlabs.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getSuperclass());
		
		Method stringMethods[]=stringClass.getMethods();
		
		for(Method method : stringMethods)
		{
			System.out.println(method.getName()+"\t"+method.getParameterCount());
		}
		
		Constructor stringConstructors[]= stringClass.getConstructors();
		for(Constructor constructor : stringConstructors)
		{
			Parameter parameters[] = constructor.getParameters();
			for(Parameter parameter : parameters )
				System.out.println(constructor.getName()+"\t with parameters: \t"+parameter.getName());
		}
		
	}

}
