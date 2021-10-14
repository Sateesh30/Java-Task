package com.javatask;
	
	class Animal{  
		String color="white";  
		}  
		class cat extends Animal{  
		String color="black";  
		void printColor(){  
		System.out.println(color);//prints color of cat class  
		System.out.println(super.color);//prints color of Animal class  
		}  
		}  
		class superTest{  
		public static void main(String args[]){  
		cat d=new cat();  
		d.printColor();  
		}}  

