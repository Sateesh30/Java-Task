package com.javatask;

public class primeNum {
	
	public static void main (String args [ ])
	 {
	 int i, j, n, lastn;
	 double a;
	 boolean flag;
	 for (i=0;i<10;i++)
	 {
	 a = i;
	 a = Math.sqrt (a);
	 lastn = (int)a;
	 flag =true;
	 for (j=2;j<=lastn; j++)
	 {
	 if(i != j)
	 {
	 if(i % j ==0)
	 {
	 flag = false;
	 break;
	 }
	 }
	 }
	 if (flag) System.out.println ("\n" + i );
	 }
	 } 

}
