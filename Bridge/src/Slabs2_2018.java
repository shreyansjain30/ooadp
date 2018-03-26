
public class Slabs2_2018 {
	static float returnslab(String item)
	{
		if(item.equals("Cycle"))
			return 0.3f;
		else if(item.equals("racket"))
			return 0.4f;
		else if(item.equals("tread-mill"))
			return 0.5f;
		else 
			return 0.15f;
	}

}
