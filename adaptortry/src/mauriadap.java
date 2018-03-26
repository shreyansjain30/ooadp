
public class mauriadap implements calctax {
	mauritax m=new mauritax();
	@Override
	public double taxamount(int quantity, double price) {
		double tax=m.calctax(price);
		return tax*quantity;
		// TODO Auto-generated method stub
		
	}

}
