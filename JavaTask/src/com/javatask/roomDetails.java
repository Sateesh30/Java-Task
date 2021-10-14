package com.javatask;

public class roomDetails {
	
	int roomNo;
	 String roomType;
	 float roomArea;
	 boolean acMachine;

	 void setData(int rno, String rt, float area, boolean ac)
	 {
	 roomNo = rno;
	 roomType = rt;
	 roomArea = area;
	 acMachine = ac;
	 }
	 void displayData()
	 {
	 System.out.println("The room #. Is " + roomNo);
	 System.out.println ("The room Type is " + roomType);
	 System.out.println ("The room area is " + roomArea);
	 String s = (acMachine) ? "yes " : "no ";
	 System.out.println ("The A/c Machine needed " + s);
	 }
	 public static void main(String arg[])
	{
	 roomDetails room1 = new roomDetails ( );
	 room1. setData (101, "Deluxe", 260.0f, true);
	 room1.displayData ( );
	 }
	} 



