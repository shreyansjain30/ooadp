import java.util.Scanner;

public class offline extends orderprocess {
	displaym m;
	Scanner sc=new Scanner(System.in);
	
	@Override
	item selectitem() {
		m=new displaym();
		m.displaymenu();
		System.out.println("enter your choice");
		int c=sc.nextInt();
		switch(c) {
		
		case 1:
			return m.a1.get(0);
		case 2:
			return m.a1.get(1);
		case 3:
			return m.a1.get(2);
		}
		return null;
}
	@Override
	String dopayment(item i) {
		System.out.println("You have selected "+i+"\n of the price "+i.price);
		System.out.println("enter 1 to pay buy card 2 to pay by cash");
		int x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("card payment successfull");
			break;
		case 2:
			System.out.println("cash payment success");
			break;
		}
		return "thanks";
	}

	@Override
	void dodelivery() {
		System.out.println("collect from counter");

	}

}
