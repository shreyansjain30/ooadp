import java.util.ArrayList;
import java.util.Iterator;

public class displaym implements menu {
	ArrayList<item> a1=new ArrayList<item>();
	
	
	@Override
	public void displaymenu() {
		// TODO Auto-generated method stub
		a1.add(new item(1,100,"cycle"));
		a1.add(new item(2,200,"bat"));
		a1.add(new item(3,300,"ball"));
		Iterator<item>il=a1.iterator();
		while(il.hasNext()){
			System.out.println(il.next());
		}
	}

}
