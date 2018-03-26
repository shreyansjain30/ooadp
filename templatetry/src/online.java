import java.util.Scanner;

public class online extends orderprocess {
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
		System.out.println("net banking success");
		
		// TODO Auto-generated method stub
		return "thanks";
	}

	@Override
	void dodelivery() {
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("delivery charger rs 30 for the address \n"+address);
		

	}

}
