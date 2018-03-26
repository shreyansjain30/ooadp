public class fascade {
	item i;
	giftcard g;
	fascade(String name, int quantity,double price,boolean gf)
	{
		i=new item(name,quantity,price);
		g=new giftcard(gf,quantity,price);
		g.process();
	}
		void display()
		{
			System.out.println("\nName"+i.name);
			System.out.println("\nqty"+i.quantity);
			System.out.println("\nprice"+i.price);
		}
}
