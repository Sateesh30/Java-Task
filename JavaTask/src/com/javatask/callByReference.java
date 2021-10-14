package com.javatask;

public class callByReference {
	
	int data=50;  
	  
	 void change( callByReference op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 callByReference op=new  callByReference();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  

}
