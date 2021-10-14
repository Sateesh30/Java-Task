package com.javatask;


  
 // use the object 
 public class ToTestInt 
  { 
  public static void main(String a[]) 
  { 
  System.out.println("calling from ToTestInt class main method"); 
  Test t = new Arithmetics(); 
  System.out.println("=============================="); 
  System.out.println("created object of test interface – reference Arithmetic class "); 
  System.out.println("Hence Arithmetic class method square called"); 
  System.out.println("This object cannot call armeth method of  Arithmetic class"); 
  System.out.println("================================="); 
  t.square(10); 
  System.out.println("================================="); 
  } 
 } 
	 
 
