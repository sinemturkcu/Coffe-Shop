package sstarbuckAndNero;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Sinem", "Türkçü",new Date(1999,03,19),"47113562415");
		
		CustomerManager customerManager1 = new CustomerManager(new StarbucksCustomerManager(new MernisServicesAdapter()));
		customerManager1.add(customer);
		
		CustomerManager customerManager2 = new CustomerManager(new NeroCustomerManager());
		customerManager2.add(customer);
	}

}
