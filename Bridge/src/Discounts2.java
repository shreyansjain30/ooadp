
public class Discounts2 implements Discount {

	@Override
	public float slab(String item) {
		// TODO Auto-generated method stub
		return Slabs2_2018.returnslab(item);
	}

}
