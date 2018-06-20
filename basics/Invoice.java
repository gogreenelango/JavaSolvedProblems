package com.based;

public class Invoice {
       
	String pathNumber;
	String partDescription;
	int quantity;
	double price;
	double value;

	
	String getPathNumber() {
		return pathNumber;
	}
	public void setPathNumber(String pathNumber) {
		this.pathNumber = pathNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		
		if(quantity<0) {
			this.quantity = 0;
		}
		else
		{
			this.quantity = (int) 0.0;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
	if(price<0) {
		this.price = 0;
	}
	else {
		this.price = price;
	}
	}
	
	
	
	public double getInvoiceMethod() {
		value=quantity*price;
		return value;
		
		
	}
	
	
	
	
	
	
}
