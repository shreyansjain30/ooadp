
public class ParaGlidingDiffAbled extends OutDoorAdventure {
	OutDoorAdvProducts odap;
	public ParaGlidingDiffAbled() {
		odap = new PGDiffAbled();
	}

	@Override
	String getSportsName() {
		// TODO Auto-generated method stub
		return "ParaGliding - Differently Abled";

	}

	@Override
	void displayProducts() {
		// TODO Auto-generated method stub
		odap.displayProducts();

	}

}
