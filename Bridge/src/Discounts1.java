
public class Discounts1 implements Discount {

	@Override
	public float slab(String item) {
		// TODO Auto-generated method stub
		return Slabs1_2018.returnslab(item);
	}

}
