package com.javatask;

public interface Test 
{ 
 public int square(int a); 
 } 
// Implements 
class Arithmetics implements Test 
 { 
 int s = 0; 
 public int square(int b) 
 { 
System.out.println("Inside arithmetic class – implemented method square"); 
 System.out.println("Square of “ + “ is "+s); 
 return s; 
 } 
 void armeth() 
 {
	 System.out.println("Inside method of class Arithmetic"); 
 } 
 } 