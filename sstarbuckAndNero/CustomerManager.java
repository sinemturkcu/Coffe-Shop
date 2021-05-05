package sstarbuckAndNero;

public class CustomerManager {
	ICustomerServices customerServices;
	public CustomerManager(ICustomerServices customerServices) {
		this.customerServices = customerServices;
	}
	
	public void add(Customer customer) {
		customerServices.add(customer);
	}
}
