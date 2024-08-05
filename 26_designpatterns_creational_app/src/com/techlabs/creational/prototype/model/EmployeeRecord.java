package com.techlabs.creational.prototype.model;

public class EmployeeRecord implements IEmployee{
	
	private int id;  
	   private String name, designation;  
	   private double salary;  
	   private String address;  
	      
	   public EmployeeRecord(){  
	            System.out.println("   Employee Records of Oracle Corporation ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
	      
	}  
	  
	 public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.designation = designation;  
	        this.salary = salary;  
	        this.address = address;  
	    }  
	      
	  public void showRecord(){  
	          
	        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
	   }  
	  
	    @Override  
	    public IEmployee getClone() {  
	          
	        return new EmployeeRecord(id,name,designation,salary,address);  
	    }  

}
