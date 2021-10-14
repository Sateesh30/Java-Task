package com.javatask;

	class House 
	 { 
	 roomDetails r; 
	 void createHouse() 
	 { 
	 r = new  roomDetails (); 
	 } 
	void displayHouse() 
	 { 
	 r.displayData(); 
	 } 
	public static void main (String args[]) 
	 { 
	 House h = new House(); 
	 h.createHouse(); 
	 h.displayHouse(); 
	 } 
	} 


