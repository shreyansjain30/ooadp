import java.util.*;
public class giftcard {
	Scanner sc=new Scanner(System.in);
	boolean gf;
	int quantity,giftvalue;
	double amount;
	giftcard(boolean gf,int quantity,double amount)
	{
		this.gf=gf;
		this.quantity=quantity;
		this.amount=amount;
	}
	void process()
	{
		if(!gf)
		{
			System.out.println("NO GIFTCARD \n the amount to be paid is : "+amount);
		}
		else
		{
			if(quantity>1)
			{
				System.out.println("Giftcard cannot be applied on more than 1 item \n amount to be paid: "+amount);
			}
			else
			{
				System.out.println("GIFTCARD CAN BE USED \n ENTER THE VALUE OF THE GIFTCARD");
				giftvalue=sc.nextInt();
				if(amount<=giftvalue)
				{
					System.out.println("the amount is less than the giftcard the remaining amount to be paid is :"+0);
				}
				else if(amount>giftvalue)
				{
					System.out.println("the amount is greater than giftcard thus pay : "+(amount-giftvalue));
				}
				
			}
		}
	}
}
