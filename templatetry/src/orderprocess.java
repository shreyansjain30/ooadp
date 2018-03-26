public abstract class orderprocess {
	abstract item selectitem();
	abstract String dopayment(item i);
	abstract void dodelivery();
	
}
