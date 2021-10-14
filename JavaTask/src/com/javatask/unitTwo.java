package com.javatask;

public class unitTwo {

	public static void main(String[] args) {
		int x = 5, y = 10;
		 System.out.println ("x =" + x);
		 System.out.println ("y =" +y);
		 System.out.println ("++x =" + ++x);
		 System.out.println ("y++ =" + y++);
		 System.out.println ("x =" + x);
		 System.out.println ("y =" + y);
		 
		 //BitwiseComplement operators
		 
		 int a = 8;
		 System.out.println ("a =" + a);
		 int b = ~x;
		 System.out.println ("b =" + b);
		 
		 //Arithmetic operators
		 float c = 23.5f, d = 7.3f;
		 System.out.println ("c =" + c);
		 System.out.println ("d =" + d);
		 System.out.println ("c + d =" + ( c + d) ) ;
		 System.out.println ("c - d =" + (c - d) ) ;
		 System.out.println (" c * d =" +( c* d) );
		 System.out.println (" c / d =" + ( c / d ) );
		 System.out.println (" c % d =" + ( c % d ) ); 
		 
		 //Relational operators
		 int z = 0;
		 System.out.println (" x=" + x);
		 System.out.println ("y =" + y);
		 System.out.println ("x < y =" + ( x < y ) );
		 System.out.println (" x > z =" + (x > z) );
		 System.out.println (" x <= z =" + (y <= z) );
		 System.out.println (" x >= y =" + (x >= y ) );
		 System.out.println ( " y == z =" + (y ==z) );
		 System.out.println (" x != z =" + (x != z) );
		 
		 //Bitwise operators
		 
		 System.out.println (" x =" +x);
		 System.out.println (" y =" + y );
		 System.out.println (" x & y =" + ( x & y) ) ;
		 System.out.println (" x | y =" + ( x | y ) );
		 System.out.println (" x ^ y =" +( x ^ y) );
		 
		 //Conditional operators
		 int e = 0;
		 boolean isEven = false;
		 System.out.println ("e =" + e);
		 e = isEven ? 4: 7;
		 System.out.println ("e =" + e);
	}

}
