
public class GST implements calctax {

	@Override
	public double taxamount(int quantity, double price) {
		// TODO Auto-generated method stub
		double tax=quantity*price*0.18;
		return tax;
	}

}
