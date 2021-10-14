package com.javatask;

public class unitTwoConditions {

	public static void main(String[] args) {
		int x = 2;
		 int y = 8;
		 if (x > y )
		{
		 System.out.println ("x is greater than y" );
		 }
		 else {
		 System.out.println ("X is lesser than y");
		 } 

		 char ch = 'A';
		 switch (ch)
		 {
		 case 'A':
		 System.out.println ("Value is A");
		 break;
		 case 'B':
		 System.out.println ("Value is B");
		 break;
		 default:
		 System.out.println ("Unknown Value");
		 } 
		 //for loop
		 int i= 0;
		 
		 for( i = 0; i <= 10; i++)
		 
		 System.out.println ( i );
		 
		 //while
		 int s=1;
		 while (s<=5)
		{
		 System.out.println ("s =" + s);
		 s++;
		 } 
		 
		 //do while
		 int q= 0;
		 do {
		 System.out.println ("I’m stuck !" ) ;
		 q++;
		 if (q > 5)
		 break;
		 } while (true);
	}

}
