package sstarbuckAndNero;

public class NeroCustomerManager implements ICustomerServices{

	@Override
	public void add(Customer customer) {
		System.out.println("Nero müşterisi veritabanına kaydedildi : " + customer.getFirstName());
	}

}
