
public abstract class customer {
	String name;
	int id;
	double amount;
	discount d;
	customer(String name,int id,double amount)
	{
		this.name=name;
		this.id=id;
		this.amount=amount;
	}
	abstract void discounttype();
	void display()
	{
		double dis=d.calcdiscount(amount);
		double bill=amount-dis;
		System.out.println("Actual price:"+amount);
		System.out.println("Discount:"+dis);
		System.out.println("Bill Amount:"+bill);
		
	}
}
