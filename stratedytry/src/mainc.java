
public class mainc {
	public static void main(String args[])
	{
		customer c1=new customerfc("shrey",115,2000,new discountfc());
		c1.discounttype();
		c1.display();
		customer c2=new customerfc("mohit",64,1000,new discountrc());
		c2.discounttype();
		c2.display();
	}

}
