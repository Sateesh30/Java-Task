package com.javatask;

public class thisope {
	
	int rollno;  
	String name;  
	float fee;  
	thisope(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	}  
	  
	class TestThis2{  
	public static void main(String args[]){  
	thisope s1=new thisope(111,"ankit",5000f);  
	thisope s2=new thisope(112,"sumit",6000f);  
	s1.display();  
	s2.display(); 

}
	}
