import java.util.Scanner;

public class mainc {
	public static void main(String args[])
	{
		item i;
		Scanner in=new Scanner(System.in);
		System.out.println("Order Mode:-\n1:Online\n2:Offline");
		System.out.print("Enter Your Choice:");
		int c=in.nextInt();
		
		switch(c) {
		case 1:
			online on=new online();
			i=on.selectitem();
			on.dopayment(i);
			on.dodelivery();
			break;
			case 2:
				offline of=new offline();
				i=of.selectitem();
				of.dopayment(i);
				of.dodelivery();
				break;
				
			default:
				System.out.println("Invalid Choice!Exiting...");
				
				
		}
	}
}
