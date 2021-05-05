package sstarbuckAndNero;

public class StarbucksCustomerManager implements ICustomerServices{
	
	private ICustomerCheckServices cusomerCheckServices;
	
	public StarbucksCustomerManager(ICustomerCheckServices customerCheckServices) {
		this.cusomerCheckServices = customerCheckServices;
	}

	@Override
	public void add(Customer customer) {
		if(cusomerCheckServices.checkIfRealPerson(customer)) {
			System.out.println("Starbucks müşterisi veritabanına kaydedildi : " + customer.getFirstName());

		}
		else {
			System.out.println("Bilgiler Doğrulanmadı!!!");
		}
	}

}
