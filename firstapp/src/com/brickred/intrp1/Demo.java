package com.brickred.intrp1;

public class Demo {

	
	
	public static Hotel provideFood(int amount) {
		
		if(amount > 500) {
			System.out.println("inside block =- 500");
			return new TajHotel();
		}
		else if(amount > 200 && amount <=500) {
			System.out.println("inside block =- 200");
			return new RoadSideHotel();
		}
			
		else
			return null;
		
	}
	
	
	
		
		
	
	public static void main(String[] args) {
		
		
	Hotel hotelinstancevariable=Demo.provideFood(100);

	

		if(hotelinstancevariable != null) {
		
		hotelinstancevariable.chickenBiryani();
		hotelinstancevariable.masalaDosa();
		
		
		if(hotelinstancevariable instanceof TajHotel) {
		
		TajHotel taj= (TajHotel)hotelinstancevariable;
		taj.butterRoti();
		// System.out.println("");
		}else if (hotelinstancevariable instanceof RoadSideHotel) {
			RoadSideHotel rHotel=(RoadSideHotel)hotelinstancevariable;
			rHotel.cola();
		}
		
		}
		else
			System.out.println("Amount should be greater than 200.");
		
	}
	
	
	
	
	
	
	
	
	
	
}
