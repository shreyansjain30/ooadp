public class item {
	int id;
	int price;
	String name;
	item(int id,int price,String name)
	{
		this.id=id;
		this.price=price;
		this.name=name;
	}
	public String toString()
	{
		String pid="ID :"+id+"\n";
		String pprice="PRICE :"+price+"\n";
		String pname="NAME :"+name+"\n";
		return(pid+pprice+pname);
	}
}
