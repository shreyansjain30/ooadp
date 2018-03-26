
public class customerrc extends customer {
	customerrc(String name,int id, double amount, discount d)
	{
		super(name,id,amount);
		this.d=d;
	}
	@Override
	void discounttype() {
		// TODO Auto-generated method stub
		System.out.println("REGULAR CUSTOMER");
	}

}
