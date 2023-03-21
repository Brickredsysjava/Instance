package com.brickred.typecasting;

public class in {

	
	public static void main(String[] args) {
		try {
		System.out.println("1st try-catch");
		int[] a = new int[10];
			
			 a[8] = 30 / 0;
			   try {
				   System.out.println("2nd try-catch");  
				   String name = null;
				   name.length();
			   } catch(Exception e)
				   {
					e.printStackTrace();
					System.out.println("2nd try-catch end");
					
				   }
			  
			  }
			   		catch (Exception e) {
			   			e.getMessage();
			   			e.printStackTrace();
			   			System.out.println("1st try-catch end");
			}
			
	   
			
		}
		
	    	  
    	 
		
		
	}


