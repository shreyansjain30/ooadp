
public class Mainbridge {
	public static void main(String args[])
	{
		Customer c1=new CustomerRc(new Discounts1());
		c1.purchase("Cycle",2500.0f);
		c1.purchase("racket",1000.0f);
		Customer c2=new CustomerRc(new Discounts2());
		c2.purchase("Cycle", 12500.0f);
		c2.purchase("racket",789.0f);
	}

}
