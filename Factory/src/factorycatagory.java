
public class factorycatagory {
	public catagory getcatagory(String s)
	{
		if(s==null)
			return null;
		else if(s.equalsIgnoreCase("male"))
			return new male();
		else if(s.equalsIgnoreCase("female"))
			return new female();
		else if(s.equalsIgnoreCase("kids"))
			return new kids();
		else if(s.equalsIgnoreCase("teenage"))
			return new teenage();
		else if(s.equalsIgnoreCase("above20"))
			return new above20();
		return null;
		
	}
} 
