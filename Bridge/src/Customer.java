
public abstract class Customer {
	abstract float getdiscount(String name);
	public void purchase(String item,float price)
	{
		float d=getdiscount(item);
		float di=price*d;
		System.out.println("NAME:"+item);
		System.out.println("\nDiscount is:"+d);
		System.out.println("\nfinal amount is:"+(price-di));
		
		
		
	}

}
