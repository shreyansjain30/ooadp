
public class item {
	String name;
	int quantity;
	double price,amount,tax;
	calctax ct;
	item(String n,int q,double p,calctax c)
	{
		name=n;
		quantity=q;
		price=p;
		ct=c;
	}
	
	void display()
	{
		tax=ct.taxamount(quantity,price);
		amount=price*quantity+tax;
		System.out.println("NAME : " +name + "\n PRICE : " +price+ "\n QUANTITY : "+quantity+ "\n TAX : "+tax +"\n AMOUNT : "+amount);
	}
}
