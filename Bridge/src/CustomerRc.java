
public class CustomerRc extends Customer {
	Discount dis;
	CustomerRc(Discount dis)
	{
		this.dis=dis;
	}
	@Override
	float getdiscount(String name) {
		// TODO Auto-generated method stub
		return dis.slab(name);
	}

}
