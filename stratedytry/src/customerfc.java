
public class customerfc extends customer {
	customerfc(String name,int id, double amount, discount d)
	{
		super(name,id,amount);
		this.d=d;
	}

	@Override
	void discounttype() {
		// TODO Auto-generated method stub
		System.out.println("FIRST CUSTOMER");
	}

}
