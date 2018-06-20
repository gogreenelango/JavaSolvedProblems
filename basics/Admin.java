package com.based;

public class Admin {
	public static void main(String[] args) {
		
		Invoice Invoice1=new Invoice();
		Invoice1.setQuantity(5);
		Invoice1.setPrice(-100);
		Invoice1.setPartDescription("Bold");
		System.out.println(Invoice1.getQuantity());
		System.out.println(Invoice1.getInvoiceMethod());
		System.out.println(Invoice1.getPartDescription());
	}


}
