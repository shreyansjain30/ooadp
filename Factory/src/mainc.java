
public class mainc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorycatagory f=new factorycatagory();
		catagory c1 =f.getcatagory("male");
		c1.display();
		catagory c2 =f.getcatagory("female");
		c2.display();
		catagory c3 =f.getcatagory("above20");
		c3.display();
	}

}
